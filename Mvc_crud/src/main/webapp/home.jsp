<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Student data</h1>
	<a href="load"><button>Insert</button></a>
	<a href="fetch"><button>Fetch</button></a> 
	
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