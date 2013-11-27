package kxg.searchaf.url.keepa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import kxg.searchaf.util.ProxyUtli;

public class SearchKeepaJSP {

	public List<AmazonProduct> getUsAllBestSellersProduct(String URL,
			String howlong) {
		List<AmazonProduct> productlist = new ArrayList<AmazonProduct>();
		Map<String, AmazonProduct> productMap = new HashMap<String, AmazonProduct>();

		AmazonBestSellers page = new AmazonBestSellers(URL);
		ParserAmazonBestSellerPage parserAmazonBestSellerPage = new ParserAmazonBestSellerPage(
				page, productMap);
		try {
			parserAmazonBestSellerPage.checkprice();
		} catch (Exception e) {
			e.printStackTrace();

		}

		System.out.println("found amazon products:" + productMap.size());

		Iterator<String> entryKeyIterator = productMap.keySet().iterator();
		while (entryKeyIterator.hasNext()) {
			String key = entryKeyIterator.next();
			AmazonProduct product = productMap.get(key);
			ParserDeepa parserDeepa = new ParserDeepa(product);
			parserDeepa.checkAmazonPriceList();

			if (product.isMinPrice(Integer.valueOf(howlong))) {
				System.out.println("product " + product.name
						+ "  min price in three month:ASIN:" + product.ASIN);
				productlist.add(product);

			}
		}
		return productlist;

	}

	public static void main(String[] args) throws Exception {
		ProxyUtli.setProxy(true);
		SearchKeepaJSP jsp = new SearchKeepaJSP();
		List<AmazonProduct> productlist = jsp
				.getUsAllBestSellersProduct(
						"http://www.amazon.cn/s/ref=amb_link_30552132_1?ie=UTF8&bbn=665002051&page=1&rh=n%3A665002051%2Cp_89%3AApple%2Cn%3A664978051%2Cn%3A!2016117051%2Cn%3A2016116051&sort=-launch-date&pf_rd_m=A1AJ19PSB66TGU&pf_rd_s=left-5&pf_rd_r=09F2MSM2YJ437F9WX530&pf_rd_t=101&pf_rd_p=89976472&pf_rd_i=664978051",
						"30");
		for (AmazonProduct product : productlist) {
			// System.out.println(product);
		}
	}
}
