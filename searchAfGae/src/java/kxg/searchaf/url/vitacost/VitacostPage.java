package kxg.searchaf.url.vitacost;

import kxg.searchaf.url.Constant;

public class VitacostPage {
	public String prodname;
	public String url;
	public float expectPirce;

	public float price;
	public String title;
	public String mailaddress;
	public String tagcontext;

	public boolean instock = false;

	public VitacostPage() {
	}

	public VitacostPage(String url, String mailaddress) {
		this.mailaddress = mailaddress;
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public String getJspUrl() {
		return addSalesTag(getUrl());
	}

	private String addSalesTag(String url) {
		return Constant.mergeViglink(url);
	}

	public String parseHTML() {
		String html = "您观望的产品<" + this.prodname + ">已经到达您预期的价格:" + "<br/>";
		html = html + "产品名称:" + this.title + "<br/>";
		html = html + "期望价格:" + expectPirce + "<br/>";
		html = html + "当前价格:" + price + "<br/>";
		html = html + "去买咯：" + "<br/>";
		html = html + "<a href='" + addSalesTag(getUrl()) + "'>" + "点我购买"
				+ "</a>";
		html = html + "<br/><br/><br/><br/><br/>";
		html = html
				+ "<a href='http://www.ebuybot.com/jsp/vitacost/addmaillist.jsp'>"
				+ "不想再接到这个提醒了！" + "</a>";
		return html;
	}

	@Override
	public String toString() {
		return "VitacostPage [  expectPirce=" + expectPirce + ", price="
				+ price + ", title=" + title + ", mailaddress=" + mailaddress
				+ ", tagcontext=" + tagcontext + ", instock=" + instock + "]";
	}

	public static void main(String[] args) throws Exception {
		String url = "http://www.vitacost.com/dp/B000HZEQSU/ref=as_li_ss_til?tag=helmut-20";
		VitacostPage page = new VitacostPage();
		System.out.println(page.addSalesTag(url));
		page.price = 0l;
		if (page.price == 0) {
			// 没有取得数据
			System.out.println("is 0!");
		}

	}
}
