package kxg.searchaf.url.af;

import java.util.*;

import kxg.searchaf.util.ProxyUtli;

public class SearchAfJSP {

	public HashMap<Integer, AfProduct> allnewprolist = new HashMap<Integer, AfProduct>();

	public List<AfProduct> matchprolist = new ArrayList<AfProduct>();

	public static void main(String[] args) throws Exception {
		ProxyUtli.setProxy(true);

		SearchAfJSP af = new SearchAfJSP();
		// af.getwomendiscountproductforJsp("0.9", "", "");
		af.getmendiscountproductforJsp("0.9", "", "");
		for (int i = 0; i < af.matchprolist.size(); i++) {
			AfProduct product = af.matchprolist.get(i);
			System.out.println(product);
		}

	}

	private float parsrDiscount(String discountStr) {
		if (discountStr != null) {
			try {
				return Float.parseFloat(discountStr);
			} catch (NumberFormatException e) {

			}
		}
		return AfConstant.warningdiscount;
	}

	public List<AfProduct> getcustomerdiscountproductforJsp(String searchurl,
			String discountStr, String email, String searchtext) {
		boolean haslicense = AfMailList.HasLicense(email);
		float discount = parsrDiscount(discountStr);
		// if (haslicense) {
		// discount = parsrDiscount(discountStr);
		// } else {
		// discount = AfConstant.warningdiscount;
		// }

		getcustomerdiscountproductforJsp(searchurl, discount, haslicense,
				searchtext.trim());

		Collections.sort(matchprolist);
		return matchprolist;
	}

	public List<AfProduct> getmendiscountproductforJsp(String discountStr,
			String email, String searchtext) {
		boolean haslicense = AfMailList.HasLicense(email);
		float discount = parsrDiscount(discountStr);
		// if (haslicense) {
		// discount = parsrDiscount(discountStr);
		// } else {
		// discount = AfConstant.warningdiscount;
		// }

		checkMendiscountproduct(discount, haslicense, searchtext.trim());

		Collections.sort(matchprolist);
		return matchprolist;
	}

	public List<AfProduct> getwomendiscountproductforJsp(String discountStr,
			String email, String searchtext) {
		boolean haslicense = AfMailList.HasLicense(email);
		float discount = parsrDiscount(discountStr);
		// if (haslicense) {
		// discount = parsrDiscount(discountStr);
		// } else {
		// discount = AfConstant.warningdiscount;
		// }
		checkWoMendiscountproduct(discount, haslicense, searchtext.trim());
		Collections.sort(matchprolist);
		return matchprolist;
	}

	private void checkMendiscountproduct(Float discount, boolean hasLicense,
			String searchtext) {

		List<AfPage> urllist = AfPage.getMenclearanceBySinglePageInstance(); // getClearanceInstance();getclearanceBySinglePageInstance
		for (int i = 0; i < urllist.size(); i++) {
			AfPage afpage = urllist.get(i);
			ParserAfPage parserAfpage = new ParserAfPage(afpage, allnewprolist);
			try {
				parserAfpage.checkprice();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		urllist = AfPage.getMenSaleBySinglePageInstance(); // getSaleInstance();getSaleBySinglePageInstance
		for (int i = 0; i < urllist.size(); i++) {
			AfPage afpage = urllist.get(i);
			ParserAfPage parserAfpage = new ParserAfPage(afpage, allnewprolist);
			try {
				parserAfpage.checkprice();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		urllist = AfPage.getMenSecretInstance();
		for (int i = 0; i < urllist.size(); i++) {
			AfPage afpage = urllist.get(i);
			ParserAfPage parserAfpage = new ParserAfPage(afpage, allnewprolist);
			try {
				parserAfpage.checkprice();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("found all of products:" + allnewprolist.size());

		Iterator<Integer> entryKeyIterator = allnewprolist.keySet().iterator();
		while (entryKeyIterator.hasNext()) {
			Integer key = entryKeyIterator.next();
			AfProduct product = allnewprolist.get(key);
			if (product.realdiscount <= discount)
				if (searchtext == null
						|| searchtext.equals("")
						|| product.name.toLowerCase().indexOf(
								searchtext.toLowerCase()) >= 0) {
					if (hasLicense)
						checkInventory(product, false);
					// check ignore product
					matchprolist.add(product);
				}
		}
		System.out.println("found meet price products:" + matchprolist.size());

	}

	private void getcustomerdiscountproductforJsp(String searchurl,
			Float discount, boolean hasLicense, String searchtext) {

		AfPage afpage = new AfPage(searchurl);
		ParserAfPage parserAfpage = new ParserAfPage(afpage, allnewprolist);
		try {
			parserAfpage.checkprice();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("found all of products:" + allnewprolist.size());

		Iterator<Integer> entryKeyIterator = allnewprolist.keySet().iterator();
		while (entryKeyIterator.hasNext()) {
			Integer key = entryKeyIterator.next();
			AfProduct product = allnewprolist.get(key);
			if (product.realdiscount <= discount)
				if (searchtext == null
						|| searchtext.equals("")
						|| product.name.toLowerCase().indexOf(
								searchtext.toLowerCase()) >= 0) {
					if (hasLicense)
						checkInventory(product, false);
					// check ignore product
					matchprolist.add(product);
				}
		}
		System.out.println("found meet price products:" + matchprolist.size());

	}

	private void checkWoMendiscountproduct(Float discount, boolean hasLicense,
			String searchtext) {

		List<AfPage> urllist = AfPage.getWomenclearanceBySinglePageInstance(); // getClearanceInstance();getclearanceBySinglePageInstance
		for (int i = 0; i < urllist.size(); i++) {
			AfPage afpage = urllist.get(i);
			ParserAfPage parserAfpage = new ParserAfPage(afpage, allnewprolist);
			try {
				parserAfpage.checkprice();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// if (hasLicense) {
		urllist = AfPage.getWomenSaleBySinglePageInstance(); // getSaleInstance();getSaleBySinglePageInstance
		for (int i = 0; i < urllist.size(); i++) {
			AfPage afpage = urllist.get(i);
			ParserAfPage parserAfpage = new ParserAfPage(afpage, allnewprolist);
			try {
				parserAfpage.checkprice();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		urllist = AfPage.getWomenSecretInstance();
		for (int i = 0; i < urllist.size(); i++) {
			AfPage afpage = urllist.get(i);
			ParserAfPage parserAfpage = new ParserAfPage(afpage, allnewprolist);
			try {
				parserAfpage.checkprice();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// }

		System.out.println("found all of products:" + allnewprolist.size());

		Iterator<Integer> entryKeyIterator = allnewprolist.keySet().iterator();
		while (entryKeyIterator.hasNext()) {
			Integer key = entryKeyIterator.next();
			AfProduct product = allnewprolist.get(key);
			if (product.realdiscount <= discount)
				if (searchtext == null
						|| searchtext.equals("")
						|| product.name.toLowerCase().indexOf(
								searchtext.toLowerCase()) >= 0) {
					if (hasLicense)
						checkInventory(product, false);
					// check ignore product
					matchprolist.add(product);
				}
		}
		System.out.println("found meet price products:" + matchprolist.size());

	}

	// TODO not finish
	private void checkInventory(AfProduct product, boolean realtime) {
		realtime = true;
		if (realtime) {
			ParserAfProduct ParserAfProduct = new ParserAfProduct(product);
			ParserAfProduct.checkColorItemInventory(true);
		} else {

		}
	}
}
