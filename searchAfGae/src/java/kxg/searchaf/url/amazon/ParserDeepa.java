package kxg.searchaf.url.amazon;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Properties;
import java.util.zip.GZIPInputStream;

import org.json.JSONArray;
import org.json.JSONObject;

import kxg.searchaf.url.Constant;
import kxg.searchaf.url.af.Inventory;
import kxg.searchaf.util.ProxyUtli;

public class ParserDeepa {
	private String rooturl = "http://dyn.keepa.com/";
	private String url = "";
	private String ASIN;
	private String amazonZone;

	public String[] pricelist;

	public ParserDeepa(String amazonZone, String ASIN) {
		this.amazonZone = amazonZone;
		this.ASIN = ASIN;
	}

	public void checkAmazonPriceList() {
		if (amazonZone.indexOf("amazon.cn") > 0) {
			this.url = rooturl + "170" + ASIN;

		} else {
			this.url = rooturl + "110" + ASIN;

		}
		getInventory();
	}

	public void getInventory() {

		System.out.println("checking inventory, url:" + this.url);
		try {

			URL url = new URL(this.url);
			HttpURLConnection urlConnection = (HttpURLConnection) url
					.openConnection();
			urlConnection.setConnectTimeout(Constant.connect_timeout);
			// urlConnection.setRequestProperty("Charset", "UTF-8");// 字符集编码
			// urlConnection.setRequestProperty("User-Agent",
			// "Mozilla/5.0 (compatible; MSIE 6.0; Windows NT)");
			// urlConnection.setRequestProperty("Content-Type",
			// "application/x-www-form-urlencoded");
			// urlConnection.setRequestProperty("contentType", "UTF-8");

			urlConnection.setRequestProperty("Accept-Charset", "UTF-8");
			urlConnection.setRequestMethod("POST");
			urlConnection.setRequestProperty("Content-Type",
					"application/json; charset=utf-8");
			urlConnection.setRequestProperty("Accept-Encoding", "gzip,deflate");

			urlConnection.connect();

			InputStream urlStream = new GZIPInputStream(
					urlConnection.getInputStream());
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					urlStream, "UTF-8"));
			String line = "";
			StringBuilder result = new StringBuilder();

			while ((line = reader.readLine()) != null) {
				result.append(line);
				// System.out.println(line);
			}
			reader.close();
			urlStream.close();
			// System.out.println("result= " + result.toString());

			// InputStream is = urlConnection.getInputStream();
			//
			// BufferedReader reader = new BufferedReader(
			// new InputStreamReader(is));
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
			//
			parseInventory(result.toString());

		} catch (Exception e) {
			System.out.println("Exception when get keepa price list:ASIN is"
					+ this.ASIN);
			e.printStackTrace();
		}
	}

	public void parseInventory(String jsonStr) throws Exception {
		if (jsonStr.startsWith("(")) {
			jsonStr = jsonStr.substring(1, jsonStr.length() - 2);
		}
		// System.out.println("jsonStr" + jsonStr);

		JSONObject jsonObj = new JSONObject(jsonStr);
		JSONObject product = jsonObj.getJSONObject("product");
		String AMAZON = product.getString("AMAZON");
		System.out.println("AMAZON:" + AMAZON);
		AMAZON = AMAZON.substring(1, AMAZON.length() - 1);
		pricelist = AMAZON.split(",");
		// for (String s : pricelist) {
		// System.out.println("pricelist:" + s);
		// }
		// for (int i = 0; i < jsons.length(); ++i) {
		// JSONObject tempJson = jsons.getJSONObject(i);
		// // String inventory = tempJson.getString("AMAZON");
		// // String itemseq = tempJson.getString("seq");
		// System.out.println("tempJson:" + tempJson);
		//
		// }

	}

	public static void main(String[] args) throws Exception {
		ParserDeepa parse = new ParserDeepa("amazon.com", "B004ND3CIC");
		parse.checkAmazonPriceList();
		// System.out.println(product);
	}
}
