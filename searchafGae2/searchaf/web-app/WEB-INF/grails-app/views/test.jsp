<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="kxg.searchaf.mail.Mail" %>

<%
	Mail m = new Mail();
		try {
			m.sendMail();
		} catch (Exception e) {
			e.printStackTrace();
		}
%>