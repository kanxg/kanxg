package kxg.searchaf.url.gnc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import kxg.searchaf.url.Constant;
import kxg.searchaf.url.gnc.ParserGncPage;
import kxg.searchaf.url.gnc.GncPage;
import kxg.searchaf.util.ProxyUtli;

import org.htmlparser.Node;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.AndFilter;
import org.htmlparser.filters.HasAttributeFilter;
import org.htmlparser.filters.NodeClassFilter;
import org.htmlparser.filters.OrFilter;
import org.htmlparser.filters.TagNameFilter;
import org.htmlparser.tags.Div;
import org.htmlparser.tags.LinkTag;
import org.htmlparser.tags.Span;
import org.htmlparser.tags.TitleTag;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.SimpleNodeIterator;

public class ParserGncPage {
	public GncPage page;

	public ParserGncPage(GncPage page) {
		this.page = page;
	};

	public void checkprice() throws Exception {
		// System.out.println("checking gnc url:" + page.getUrl());

		String cookies = ""; // GncLogin.getCookies();

		URL url = new URL(page.getUrl());
		HttpURLConnection urlConnection = (HttpURLConnection) url
				.openConnection();
		urlConnection.setConnectTimeout(Constant.connect_timeout);
		urlConnection.setRequestProperty("User-Agent",
				"Mozilla/5.0 (compatible; MSIE 6.0; Windows NT)");
		urlConnection.setRequestProperty("Content-Type",
				"application/x-www-form-urlencoded");

		urlConnection.setRequestProperty("Cookie", cookies);

		urlConnection.connect();
		// InputStream is = urlConnection.getInputStream();
		//
		// BufferedReader reader = new BufferedReader(new
		// InputStreamReader(is));
		//
		// String s;
		// StringBuilder result = new StringBuilder();
		// while (((s = reader.readLine()) != null)) {
		// result.append(s);
		// }
		//
		// System.out.println("result= " + result.toString());
		//
		// is.close();

		Parser parser = new Parser(urlConnection);

		parser.setEncoding(Constant.ENCODE);

		NodeFilter name_filter3 = new AndFilter(
				new NodeClassFilter(Span.class), new HasAttributeFilter(
						"class", "priceNow"));
		NodeFilter name_filter4 = new AndFilter(
				new NodeClassFilter(Span.class), new HasAttributeFilter(
						"class", "textbold"));

		OrFilter lastFilter = new OrFilter();
		lastFilter.setPredicates(new NodeFilter[] {
				new NodeClassFilter(TitleTag.class),

				name_filter3, name_filter4 });

		NodeList list = parser.extractAllNodesThatMatch(lastFilter);
		for (int i = 0; i < list.size(); i++) {
			Node tag = list.elementAt(i);
			if (tag instanceof TitleTag) {
				TitleTag d = (TitleTag) tag;
				page.title = d.getTitle().replaceAll("- GNC", "").trim();
			} else if (tag instanceof Span) {
				Span d = (Span) tag;

				if ("priceNow".equalsIgnoreCase(d.getAttribute("class"))) {
					String sStr = d.getStringText();
					// System.out.println(sStr);
					page.price = getPrice(sStr);

				} else if ("textbold".equalsIgnoreCase(d.getAttribute("class"))) {
					String sStr = d.getParent().toPlainTextString();
					// System.out.println(sStr);
					if (sStr.indexOf("In Stock") >= 0
							|| sStr.indexOf("In stock") >= 0) {
						page.instock = true;
					}
				}
				// System.out.println(d.getStringText());
				// getinStock(d);
			}
		}

	}

	private String processHTML(Node node) {
		String html = node.toHtml();
		// String html = node.getChildren().elementAt(3).toHtml();
		// html = html + node.getChildren().elementAt(5).toHtml();
		// html = html + node.getChildren().elementAt(9).toHtml();
		// html = html
		// .replaceAll("ProductDisplay",
		// "http://www.abercrombie.com/webapp/wcs/stores/servlet/ProductDisplay");
		// html = html.replace("//anf", "http://anf");
		return html;
	}

	private void getinStock(Node node) throws Exception {
		NodeList childList = node.getChildren();
		List<String> productvalue = new ArrayList<String>();
		processNodeList(childList, productvalue);
		System.out.println(productvalue);
	}

	private float getPrice(String priceStr) throws Exception {
		priceStr = priceStr.replaceAll("Price:", "").trim();
		// System.out.println("priceStr:" + priceStr);
		return getprice(priceStr);
	}

	private float getprice(String priceStr) throws Exception {
		// System.out.println("priceStr:" + priceStr);
		float returnvalue = 0;
		try {
			// listprice= $80
			returnvalue = Float.parseFloat(priceStr.substring(1));
		} catch (NumberFormatException ex) {
			// listprice= $80-$90
			returnvalue = Float.parseFloat(priceStr.substring(1,
					priceStr.indexOf("-")));
		}
		return returnvalue;
	}

	private void processNodeList(NodeList list, List<String> valueList) {
		// 迭代开始
		SimpleNodeIterator iterator = list.elements();
		while (iterator.hasMoreNodes()) {
			Node node = iterator.nextNode();
			// 得到该节点的子节点列表
			NodeList childList = node.getChildren();
			// 孩子节点为空，说明是值节点
			if (null == childList) {
				// 得到值节点的值
				String result = node.toPlainTextString().trim();
				// 若包含关键字，则简单打印出来文本
				// System.out.println(result);
				if (result != null && !"".equals(result))
					valueList.add(result);
			} // end if
				// 孩子节点不为空，继续迭代该孩子节点
			else {
				processNodeList(childList, valueList);
			}// end else
		}// end wile
	}

	public static void main(String[] args) throws Exception {
		ProxyUtli.setProxy(true);
		GncPage gncPage = new GncPage();
		gncPage.url = "http://www.gnc.com/product/index.jsp?productId=12925155";
		ParserGncPage parserGncPage = new ParserGncPage(gncPage);
		parserGncPage.checkprice();
		System.out.println(gncPage);
	}
}
