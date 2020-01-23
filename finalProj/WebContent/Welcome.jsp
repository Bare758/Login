<%@ page import="com.login.MyBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%
MyBean obj=(MyBean)request.getAttribute("bean");
String message = ("message");
out.print("You made it to my page" + obj.getName());

%>

<p>Welcome.......</p>


</body>
</html>