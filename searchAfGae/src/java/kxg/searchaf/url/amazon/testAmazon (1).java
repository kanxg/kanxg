package kxg.searchaf.url.amazon;

public class testAmazon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AmazonPage oldpage = new AmazonPage();
		oldpage.instock = true;
		oldpage.expectPirce = 120.1f;
		oldpage.price = 131.123f;

		AmazonPage page = new AmazonPage();
		page.instock = true;
		page.expectPirce = 130.122f;
		page.price = 131.113f;

		if (page.instock) {
			if (!oldpage.instock && page.expectPirce >= page.price) {
				System.out.println("meet stock!");
			} else {
				if (oldpage.price > page.price
						&& page.expectPirce >= page.price)
					System.out.println("meet price!");

			}
		}

	}
}
