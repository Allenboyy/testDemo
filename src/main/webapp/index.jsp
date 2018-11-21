<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- <h1>hello ,world!</h1> -->
		
		 <a href="${pageContext.request.contextPath }/test/user"><h1>跳转至添加页面...</h1></a> 
		 <a href="${pageContext.request.contextPath }/pingdd/list"><h1>展示分类列表</h1></a> 
		 <a href="${pageContext.request.contextPath }/pingdd/add"><h1>添加分类列表到数据库</h1></a> 
		 <a href="${pageContext.request.contextPath }/pingdd/getTime"><h1>获取拼多多系统时间</h1></a> 
</body>
</html>