package kxg.searchaf.url.gymboree;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import kxg.searchaf.mail.SystemMail;
import kxg.searchaf.url.gymboree.GymboreeMailList;
import kxg.searchaf.url.gymboree.GymboreeMailListMongoDao;

public class GymboreeMailList implements Comparable<Object> {
	private static List<GymboreeMailList> maillist;

	public static String mail_subject = "Gymboree  监视系统提醒";

	public static String mailto_women = "watch_gymboree@163.com";

	public String mailaddress;
	public Date valideTime;
	public String userType;
	public boolean warningMen;
	public float mencheckingSaleDiscount;
	
	public boolean warningWomen;
	public float womencheckingSaleDiscount;

	public boolean warningBoy;
	public float boycheckingSaleDiscount;
	
	public boolean warningGirl;
	public float girlcheckingSaleDiscount;
	
	public GymboreeMailList() {

	}

	public GymboreeMailList(String mailaddress, Date valideTime) {
		this.mailaddress = mailaddress;
		this.valideTime = valideTime;

	}

	public static void sync() {
		try {
			GymboreeMailListMongoDao dao = new GymboreeMailListMongoDao();
			maillist = dao.findAll();
			Collections.sort(maillist);
		} catch (Exception e) {
			SystemMail.sendSystemMail("error when get mongdb,err:"
					+ e.getMessage());
		}

	}

	public static List<GymboreeMailList> getinstance() {
		if (maillist == null || maillist.size() == 0) {
			// maillist = getinstanceFromText();
			sync();
		}
		return maillist;
	}

	public static boolean HasLicense(String validateEmail) {
		if (validateEmail == null || "".equals(validateEmail))
			return false;

		Date currentDate = new Date();
		List<GymboreeMailList> gymboreemailist = GymboreeMailList
				.getinstance();
		for (int i = 0; i < gymboreemailist.size(); i++) {
			GymboreeMailList amail = gymboreemailist.get(i);
			if (validateEmail.equalsIgnoreCase(amail.mailaddress)) {
				if (amail.valideTime.after(currentDate)) {
					return true;
				}
			}

		}
		return false;
	}

	public int getSendingMailRetryTimes() {
		if ("buyer".equalsIgnoreCase(this.userType))
			return 1; // retry 3 times
		return 1; // not try
	}
	
	@Override
	public int compareTo(Object o) {
		GymboreeMailList comp = (GymboreeMailList) o;
		int flag = 0;
		flag = this.userType.compareTo(comp.userType);
		if (flag != 0)
			return flag;
		flag = comp.valideTime.compareTo(this.valideTime);
		if (flag != 0)
			return flag;
		return 0;
	}
}
