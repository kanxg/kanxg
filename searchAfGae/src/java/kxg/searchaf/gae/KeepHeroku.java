package kxg.searchaf.gae;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import kxg.searchaf.url.Constant;

public class KeepHeroku {
	private static KeepHeroku keepHeroku;

	public static void main(String[] args) {

		KeepHeroku keepHeroku = new KeepHeroku();
		keepHeroku.keppalive();

	}

	public static KeepHeroku getInstance() {
		if (keepHeroku == null) {
			keepHeroku = new KeepHeroku();
		}
		return keepHeroku;
	}

	public void keppalive() {
		try {
//			URL url = new URL("http://searchaf.herokuapp.com/searchAfTask");
			 URL url = new URL("http://searchaf.herokuapp.com");
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
					.println("error when visit http://searchaf.herokuapp.com");
			e.printStackTrace();
		}
	}

}
