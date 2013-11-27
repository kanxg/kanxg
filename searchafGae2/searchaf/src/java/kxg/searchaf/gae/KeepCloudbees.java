package kxg.searchaf.gae;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;

import kxg.searchaf.url.Constant;

public class KeepCloudbees {
	private static KeepCloudbees keepCloudbees;

	public static void main(String[] args) {
		KeepCloudbees keepCloudbees = new KeepCloudbees();
		keepCloudbees.keppalive();
	}

	public static KeepCloudbees getInstance() {
		if (keepCloudbees == null) {
			keepCloudbees = new KeepCloudbees();
		}
		return keepCloudbees;
	}

	public void keppalive() {
		try {

			// URL url = new URL(
			// "http://searchaf.kanxg.cloudbees.net/searchAfTask");
			URL url = new URL("http://searchaf.kanxg.cloudbees.net");
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
					.println("error when visit http://searchaf.kanxg.cloudbees.net");
			e.printStackTrace();
		}
	}

}
