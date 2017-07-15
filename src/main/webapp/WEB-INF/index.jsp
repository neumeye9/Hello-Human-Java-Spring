<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Hello.... <c:out value = "${user}" /></title>
	</head>
	<body>
		<h1>Hello <c:out value = "${user}" />!</h1>
		<p>Welcome to Spring Boot!</p>
	</body>
</html>