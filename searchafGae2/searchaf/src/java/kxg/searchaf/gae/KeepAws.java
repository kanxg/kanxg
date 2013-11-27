package kxg.searchaf.gae;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import kxg.searchaf.url.Constant;

public class KeepAws {
	private static KeepAws keepAws;

	public static void main(String[] args) {
		KeepAws keepAws = new KeepAws();
		keepAws.keppalive();
	}

	public static KeepAws getInstance() {
		if (keepAws == null) {
			keepAws = new KeepAws();
		}
		return keepAws;
	}

	public void keppalive() {
		try {

			URL url = new URL(
					"http://searchaf.elasticbeanstalk.com/searchAfTask");
			// URL url = new URL(
			// "http://default-environment-6mupqptgpr.elasticbeanstalk.com");
			HttpURLConnection urlConnection = (HttpURLConnection) url
					.openConnection();

			urlConnection.connect();

			InputStream is = urlConnection.getInputStream();

			// BufferedReader reader = new BufferedReader(
			// new InputStreamReader(is));
			//
			// String s;
			// StringBuilder result = new StringBuilder();
			// while (((s = reader.readLine()) != null)) {
			// result.append(s);
			// }

			// System.out.println("result= " + result.toString());

			is.close();

		} catch (Exception e) {
			System.out
					.println("error when visit http://searchaf.elasticbeanstalk.com/");
			e.printStackTrace();
		}
	}

}
