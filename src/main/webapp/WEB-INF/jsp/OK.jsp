<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>数据库添加成功....</h1>
	<h1>从 数据库中查询出来....</h1>
		<form action="">
			<table align="center" width="80">
				<tr>
					<td>name</td>
					<td>id</td>
				</tr>
				<c:forEach items="${list}" var="Goodinfo">
					<tr>
						<td>${Goodinfo.cat_name}</td>
						<td>${Goodinfo.cat_id }</td>
					</tr>
				</c:forEach>
			</table>
		</form>
</body>
</body>
</html>