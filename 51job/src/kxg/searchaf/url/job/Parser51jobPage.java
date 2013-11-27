package kxg.searchaf.url.job;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import kxg.searchaf.url.Constant;
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
import org.htmlparser.tags.TitleTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.util.SimpleNodeIterator;

public class Parser51jobPage {

	Company c;

	public Parser51jobPage() {
	};

	public void checkprice(String urlStr, HashMap<String, Company> clist)
			throws Exception {

		// System.out.println("checking 51job url [" + page.url + "]");
		URL url = new URL(urlStr);
		HttpURLConnection urlConnection = (HttpURLConnection) url
				.openConnection();
		urlConnection.setConnectTimeout(Constant.connect_timeout);

		urlConnection.connect();

		Parser parser = new Parser(urlConnection);

		parser.setEncoding(Constant.ENCODE);

		NodeFilter input_filter = new AndFilter(new TagNameFilter("td"),
				new HasAttributeFilter("class", "td2"));

		NodeFilter input_filter2 = new AndFilter(new TagNameFilter("td"),
				new HasAttributeFilter("class", "td3"));

		NodeFilter input_filter3 = new AndFilter(new TagNameFilter("td"),
				new HasAttributeFilter("class", "td1234"));

		OrFilter filters = new OrFilter();
		filters.setPredicates(new NodeFilter[] { input_filter, input_filter2,
				input_filter3 });

		NodeList list = parser.extractAllNodesThatMatch(filters);

		for (int i = 0; i < list.size(); i++) {
			Node tag = list.elementAt(i);
			String tagname = tag.getText();
			String tagText = tag.toPlainTextString();
			if ("公司名称".equalsIgnoreCase(tagText)
					|| "工作地点".equalsIgnoreCase(tagText))
				continue;
			if (tagname.indexOf("td2") > 0) {
				// System.out.println("name:" + tagText);
				c = new Company();
				c.name = tagText;
				if (clist.get(tagText) == null) {
					clist.put(tagText, c);
				}
			} else if (tagname.indexOf("td3") > 0) {
				// System.out.println("location:" + tagText);
				c.location = tagText;
			} else if (tagname.indexOf("td1234") > 0) {
				if ("&nbsp;".equals(tagText))
					continue;
				// System.out.println("other:" + tagText);
				if (tagText.indexOf("外资(非欧美)") > 0) {
					c.type = "外资(非欧美)";
				} else if (tagText.indexOf("外资(欧美)") > 0) {
					c.type = "外资(欧美)";
				} else if (tagText.indexOf("合资(欧美)") > 0) {
					c.type = "合资(欧美)";
				} else if (tagText.indexOf("合资(非欧美)") > 0) {
					c.type = "合资(非欧美)";
				} else if (tagText.indexOf("国企") > 0) {
					c.type = "国企";
				} else if (tagText.indexOf("民营公司") > 0) {
					c.type = "民营公司";
				} else if (tagText.indexOf("外企代表处") > 0) {
					c.type = "外企代表处";
				} else if (tagText.indexOf("政府机关") > 0) {
					c.type = "政府机关";
				} else if (tagText.indexOf("事业单位") > 0) {
					c.type = "事业单位";
				} else if (tagText.indexOf("非盈利机构") > 0) {
					c.type = "非盈利机构";
				} else if (tagText.indexOf("其他性质") > 0) {
					c.type = "其他性质";
				} else {
					c.type = "未知类型";
					//System.out.println("未知类型" + c.name + "/" + tagText);
				}

				if (tagText.indexOf("150-500人") > 0) {
					c.guimo = "150-500人";
				} else if (tagText.indexOf("500-1000人") > 0) {
					c.guimo = "500-1000人";
				} else if (tagText.indexOf("少于50人") > 0) {
					c.guimo = "少于50人";
				} else if (tagText.indexOf("50-150人") > 0) {
					c.guimo = "50-150人";
				} else if (tagText.indexOf("1000-5000人") > 0) {
					c.guimo = "1000-5000人";
				} else if (tagText.indexOf("5000-10000人") > 0) {
					c.guimo = "5000-10000人";
				} else if (tagText.indexOf("10000人以上") > 0) {
					c.guimo = "10000人以上";
				} else {
					c.guimo = "未知规模";
					//System.out.println("未知规模" + c.name + "/" + tagText);
				}

			}

		}

	}

	private void getPriceList(Node node) throws Exception {
		NodeList childList = node.getChildren();
		List<String> productvalue = new ArrayList<String>();
		processNodeList(childList, productvalue);
		// System.out.println(productvalue);
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
		String urlt = "http://search.51job.com/jobsearch/search_result.php?fromJs=1&jobarea=020000%2C00&funtype=0000&industrytype=00&keyword=java%20%E6%B5%B7%E4%BA%AE%E9%9B%86%E5%9B%A2%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8&keywordtype=2&lang=c&stype=2&postchannel=0000&fromType=1";
		HashMap<String, Company> clist = new HashMap<String, Company>();
		Parser51jobPage parse = new Parser51jobPage();
		parse.checkprice(urlt, clist);
	}
}
