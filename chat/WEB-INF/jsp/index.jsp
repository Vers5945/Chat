<%@page pageEncoding="UTF-8" isErrorPage="true" contentType="text/html" %>
<html>
<%-- <% @include file="../WEB-INF/scr/IncludeFileToJsp" %> --%>
<head><title>Chat interface</title></head>
<body>
<%-- 	<% IncludeFileToJsp jvInclude = new IncludeFileToJsp(); %>
	<%= jvInclude.get_Name();%>
	<%= jvInclude.get_Etat();%>
 --%>  <%
    double num = Math.random();
    if (num > 0.95) {
  %>
      <h2>You'll have a luck day!</h2><p>(<%= num %>)</p>
  <%
    } else {
  %>
      <h2>Well, life goes on ... </h2><p>(<%= num %>)</p>
  <%
    }
  %>
  <a href="<%= request.getRequestURI() %>"><h3>Try Again</h3></a>
</body>
</html>