package kxg.searchaf.url.job;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class searchjob {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		searchjob job=new searchjob();
		JobMysqlDao dao = new JobMysqlDao();
		dao.getConnection("job");

		// java 上海
		String url = "http://search.51job.com/jobsearch/search_result.php?fromJs=1&jobarea=020000%2C00&district=000000&funtype=0000&industrytype=00&issuedate=9&providesalary=99&keyword=java&keywordtype=2&lang=c&stype=2&postchannel=0000&workyear=99&cotype=99&degreefrom=99&jobterm=01&lonlat=0%2C0&radius=-1&ord_field=1&list_type=0&fromType=14";
		String tablename = "company_20131118";
		int pagenum = 320;
		job.searchonejob(dao, url, tablename, pagenum);
		
		url = "http://search.51job.com/jobsearch/search_result.php?fromJs=1&jobarea=020000%2C00&funtype=0000&industrytype=32&keyword=java&keywordtype=2&lang=c&stype=2&postchannel=0000&fromType=1";
		tablename = "company_net_20131118";
		pagenum = 83;
		job.searchonejob(dao, url, tablename, pagenum);
		
	  
		try {
			dao.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchonejob(JobMysqlDao dao, String url, String tablename,
			int pagenum) {
		dao.tablename = tablename;

		for (int i = 1; i < pagenum + 1; i++) {
			System.out.println("page:" + i);
			String urlt = url + "&curr_page=" + i;
			HashMap<String, Company> clist = new HashMap<String, Company>();
			Parser51jobPage parse = new Parser51jobPage();
			try {
				parse.checkprice(urlt, clist);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<Company> list = new ArrayList<Company>(clist.values());
			System.out.println("found:" + list.size());
			for (int j = 0; j < list.size(); j++) {
				Company c = list.get(j);
				Company cdao = dao.find(c.name);
				if (cdao == null) {
					dao.save(c);
//					System.out.println("found:" + c);
				} else if (!cdao.equals(c)) {
					dao.update(c);
//					System.out.println("update:" + c);
				}
			}
		}
	}

}
