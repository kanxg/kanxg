 <%@ page contentType="text/html;charset=utf-8" language="java" %>
 
 
 <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
    	  <a class="brand" href="<%=request.getContextPath()%>">首页</a>
           <a class="brand">Abercrombie.com</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
     			 <li><a href="<%=request.getContextPath()%>/af/afmen">男装在线查询</a></li>
      			 <li><a href="<%=request.getContextPath()%>/af/afwomen">女装在线查询</a></li>
      			 <li><a href="<%=request.getContextPath()%>/af/updatemaillist">注册用户配置</a></li>
        		 <li><a href="<%=request.getContextPath()%>/af/addmaillist">我要试用</a></li>
        		 <li><a href="<%=request.getContextPath()%>/af/howto">设置说明</a></li>
            </ul>
            <!--
            <form class="navbar-form pull-right">
              <input class="span2" type="text" placeholder="Email">
              <input class="span2" type="password" placeholder="Password">
              <button type="submit" class="btn">Sign in</button>
            </form>
             -->
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>