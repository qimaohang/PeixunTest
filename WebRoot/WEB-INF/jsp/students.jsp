<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'students.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="js/jquery-1.11.1-min.js"></script>
  </head>
  <body>
  
  	<h1>学生列表</h1>
  	  <ul id="list">
  	  </ul>
  	<script type="text/javascript">
  		//请求控制器数据，使用js拼接到页面
  		$.get("stu/students.do",function(students){
  			for(var i = 0; i < students.length;i++){
  				$("#list").append("<li>"+students[i]["name"]+"</li>")
  			}
  		})
  		
  	</script>
  </body>
</html>
