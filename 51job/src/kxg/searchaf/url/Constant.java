package kxg.searchaf.url;

import java.net.URLEncoder;

public class Constant {

	public static String ip = "127.0.0.1";
	public static String port = "8087";

	public static String ENCODE = "UTF-8";

	public static boolean sendwarningmail = true;

	public static long sleeptime = 10L; // minutes

	public static long sendMailsleeptime = 10L; // seconds

	public static long inventoryCheckingInterval = 60L; // minutes

	public static int connect_timeout = 1000 * 10; // set timeout to 5 seconds

	public static int maxMailCCcount = 20;

	public static String serverName;

	public static String viglinkTag = "http://redirect.viglink.com/?key=1fd42f1d7997ed7abc43c8b7486548c4&out=";

	public static String mergeViglink(String url) {
		return viglinkTag + URLEncoder.encode(url);
	}

	public static void main(String[] args) throws Exception {
		String url = "http://www.sephora.com/dp/B000HZEQSU/ref=as_li_ss_til?tag=helmut-20";

		System.out.println(Constant.mergeViglink(url));
	}
}
