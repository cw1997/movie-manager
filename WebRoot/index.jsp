<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<s:debug></s:debug>
	<h1>搜索</h1>
	<form action="search.action" method="get">
		名字： <input type="text" name="movie.name"> <br> 类型：
		<c:forEach var="v" varStatus="i" items="${typeList }">
			${v.name }<input type="checkbox" name="movie.type" value="${v.id }">
		</c:forEach>
		<br> <input type="submit">
	</form>
	<hr>
	<h1>显示</h1>
	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>name</th>
				<th>type</th>
				<th>delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="v" varStatus="i" items="${movieList }">
				<tr>
					<td>${v.id }</td>
					<td>${v.name }</td>
					<td>${v.type.name }</td>
					<td><a href="delete.action?movie.id=${v.id }">删除</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
	<h1>添加</h1>
	<form action="add.action" method="post">
		名字： <input type="text" name="movie.name"> <br> 类型： <select
			name="movie.type">
			<c:forEach var="v" varStatus="i" items="${typeList }">
				<option value="${v.id }">${v.name }</option>
			</c:forEach>
		</select> <br> <input type="submit">
	</form>
</body>
</html>
