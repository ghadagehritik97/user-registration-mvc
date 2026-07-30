<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
</head>
<body>
<h1><marquee>User Registered Successfully</marquee></h1>
<h1><%=(String)session.getAttribute("name") %> you are registered successfully</h1>
</body>
</html>