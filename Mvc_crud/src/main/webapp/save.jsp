<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
form {
	border: 2px solid red;
}
</style>
</head>
<body>
	<form:form action="save" method="post" modelAttribute="studentdata">
		<label for="id">Id : </label>
		<input type="number" name="id" id="id">
				<br>
		<label for="name">Name : </label>
		<input type="text" name="name" id="name">
		<br>
		<label for="section">Section : </label>
		<input type="text" name="section" id="section">
		<br>
	    Gender : 
		Male : <input type="radio" name="gender" value="male">
		Female : <input type="radio" name="gender" value="female">
		<br>
		<button>Save</button>
		<button type="reset">Cancel</button> 
	</form:form>
	<script type="text/javascript">
		window.onload = function() {
			if (performance.navigation.type == 1) {
				window.location.href = "errorpage.jsp";
			}
		}
	</script>
</body>
</html>