<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Failed</title>
</head>
<body>
<h1><marquee>User registration failed</marquee></h1>
<h1><%=(String)session.getAttribute("name")%> is already registered</h1>
</body>
</html>