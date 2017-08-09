<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JSP!</h1>
<hr/>
<form action="MyServlet">
	<input type="submit" value="Send"/>
</form>
<%
//А тут можно писать Java-код

String s = "All power to robots!";
for(int i=0; i<10; i++)
{
 out.println(s);
 out.println("<br>");
}

%>
</body>
</html>