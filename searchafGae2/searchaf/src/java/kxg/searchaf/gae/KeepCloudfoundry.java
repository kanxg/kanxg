package kxg.searchaf.gae;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import kxg.searchaf.url.Constant;

public class KeepCloudfoundry {
	private static KeepCloudfoundry keepCloudfoundry;

	public static void main(String[] args) {

		KeepCloudfoundry keepCloudfoundry = new KeepCloudfoundry();
		keepCloudfoundry.keppalive();

	}

	public static KeepCloudfoundry getInstance() {
		if (keepCloudfoundry == null) {
			keepCloudfoundry = new KeepCloudfoundry();
		}
		return keepCloudfoundry;
	}

	public void keppalive() {
		try {
			// URL url = new URL("http://searchaf.herokuapp.com/searchAfTask");
			URL url = new URL("http://searchaf.cfapps.io");
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
			System.out.println("error when visit http://searchaf.cfapps.io");
			e.printStackTrace();
		}
	}

}
