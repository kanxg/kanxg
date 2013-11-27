package kxg.searchaf.gae;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import kxg.searchaf.url.Constant;

public class KeepOpenshift {
	private static KeepOpenshift keepOpenshift;

	public static void main(String[] args) {

		KeepOpenshift keepOpenshift = new KeepOpenshift();
		keepOpenshift.keppalive();

	}

	public static KeepOpenshift getInstance() {
		if (keepOpenshift == null) {
			keepOpenshift = new KeepOpenshift();
		}
		return keepOpenshift;
	}

	public void keppalive() {
		try {
			// URL url = new URL("http://searchaf.herokuapp.com/searchAfTask");
			URL url = new URL("http://searchaf-kanxg.rhcloud.com");
			HttpURLConnection urlConnection = (HttpURLConnection) url
					.openConnection();

			urlConnection.connect();
			InputStream is = urlConnection.getInputStream();

			BufferedReader reader = new BufferedReader(
					new InputStreamReader(is));

			String s;
			StringBuilder result = new StringBuilder();
			while (((s = reader.readLine()) != null)) {
				result.append(s);
			}

			// System.out.println("result= " + result.toString());

			is.close();

		} catch (Exception e) {
			System.out
					.println("error when visit http://searchaf-kanxg.rhcloud.com/");
			e.printStackTrace();
		}
	}

}
