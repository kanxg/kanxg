package kxg.searchaf.url.keepa;

import java.util.Arrays;
import java.util.Date;

import kxg.searchaf.util.KeepaUtil;

public class AmazonProduct {
	private static String keepaurl = "http://dyn.keepa.com/";

	public String amazonZone;
	public String name;
	public String ASIN;
	public String[] pricelist;
	public String url;
	public float currentprice;
	public String category;
	
	public String getKeepaUrl() {
		if (this.amazonZone.indexOf("amazon.cn") >= 0) {
			this.url = keepaurl + "170" + this.ASIN;
		} else {
			this.url = keepaurl + "110" + this.ASIN;
		}
		return url;
	}

	public String getAmazonUrl() {
		if (this.amazonZone.indexOf("amazon.cn") >= 0) {
			this.url = "http://amazon.cn/dp/" + this.ASIN;
		} else {
			this.url = "http://amazon.com/dp/" + this.ASIN;
		}
		return url;
	}

	public boolean isMinPrice(int howlong) {
		Date today = new Date();
		// long todayline = KeepaUtil.getTimeLine(today);
		Date beginDate = KeepaUtil.getDateBefore(today, howlong);
		long beginline = KeepaUtil.getTimeLine(beginDate);
		return KeepaUtil.isMinPirce(beginline, this.pricelist, currentprice);
	}

	@Override
	public String toString() {
		return "AmazonProduct [amazonZone=" + amazonZone + ", name=" + name
				+ ", ASIN=" + ASIN + ", pricelist="
				+ Arrays.toString(pricelist) + ", url=" + url
				+ ", currentprice=" + currentprice + "]";
	}

}
