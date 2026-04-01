<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="update" modelAttribute="student" method="post">
     Id:<form:input path="id" readonly="true" /><br>
     Name:<form:input path="name" /><br>
     Section:<form:input path="section" /><br>
     Gender:
     <form:radiobutton path="gender" value="male" /> Male
     <form:radiobutton path="gender" value="female" />Female<br>
		<button>Update</button>
		<button type="reset">Cancel</button>
	</form:form>
	<script type="text/javascript">
	window.onload=function()
	{
		if(performance.navigation.type==1)
			{
			window.location.href="errorpage.jsp";
			}
	}
	</script>
</body>
</html>