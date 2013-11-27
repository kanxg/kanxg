package kxg.searchaf.gae;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Timer;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchAfServletGae extends HttpServlet {
	/**
	 * 
	 */

	private static final long serialVersionUID = 2318481992318348161L;
	private static final Logger log = Logger.getLogger(SearchAfServlet.class
			.getName());

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		log.info("start searchAfServlet...");
		String serverName = req.getServerName();

		// if (af == null) {
		// af = new SearchAfGae();
		// }
		// PrintWriter out = resp.getWriter();
		// out.println(serverName);
		// SearchAf af = SearchAfFactory.getInstance();
		// af.getnewMenproduct();

		KeepAws keepAws = KeepAws.getInstance();
		keepAws.keppalive();

		KeepHeroku keepHeroku = KeepHeroku.getInstance();
		keepHeroku.keppalive();
		
		KeepCloudbees keepCloudbees = KeepCloudbees.getInstance();
		keepCloudbees.keppalive();


		// KeepOpenshift keepOpenshift = KeepOpenshift.getInstance();
		// keepOpenshift.keppalive();

		// KeepCloudfoundry keepCloudfoundry = KeepCloudfoundry.getInstance();
		// keepCloudfoundry.keppalive();

		// if ("kanxgsearchaf01.appspot.com".equalsIgnoreCase(serverName)) {
		// log.info("start af men Servlet...");
		// SearchAf af = SearchAfFactory.getInstance();
		// af.getnewMenproduct();
		// // af.getdiscountproduct();
		// }
		// if ("kanxgsearchaf02.appspot.com".equalsIgnoreCase(serverName)) {
		// log.info("start af women Servlet...");
		// SearchAf af = SearchAfFactory.getInstance();
		// af.getnewWomenproduct();
		// // af.getdiscountproduct();
		// }
		// if ("kanxgsearchaf03.appspot.com".equalsIgnoreCase(serverName)) {
		// log.info("start Hollisterco men Servlet...");
		// SearchHollisterco af = SearchHollisterFactory.getInstance();
		// af.getnewMenproduct();
		// // af.getdiscountproduct();
		// }
		// if ("kanxgsearchaf04.appspot.com".equalsIgnoreCase(serverName)) {
		// log.info("start Hollisterco women Servlet...");
		// SearchHollisterco af = SearchHollisterFactory.getInstance();
		// af.getnewWomenproduct();
		// // af.getdiscountproduct();
		// }

	}
}