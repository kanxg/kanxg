package kxg.searchaf.gae;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kxg.searchaf.url.Constant;
import kxg.searchaf.url.SearchTask;

public class SearchAfServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2318481992318348161L;
	private static final Logger log = Logger.getLogger(SearchAfServlet.class
			.getName());

	private static boolean init = false;

	public static SearchTask searchTask = new SearchTask();

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		log.info("start searchAfServlet...");
		String _serverName = req.getServerName();
		Constant.serverName = _serverName;

		// if (!init) {
		// Timer timer = new Timer();
		// timer.schedule(new SearchTask(), 1000L,
		// 1000L * 60L * Constant.sleeptime);
		// // 在1秒后执行此任务,每次间隔2秒,如果传递一个Data参数,就可以在某个固定的时间执行这个任务.
		// init = true;
		// }

		searchTask.run();

		PrintWriter out = resp.getWriter();
		out.println("start SearchTask in " + _serverName);
	}
}