<%--
  Created by IntelliJ IDEA.
  User: Lamb
  Date: 12/18/2024
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.

  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

--%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rodeo Electric</title>
    <link rel="stylesheet" href="<c:url value='/static/css/global.css' />">
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>

</head>
<body>
<header class="bg-header">
    <div class="container text-center">
        <!-- Centered Header Content -->
        <h1 class="site-title">Rodeo Electric</h1>
        <nav class="mt-2">
            <a href="${pageContext.request.contextPath}/about" class="nav-link d-inline-block">About</a>
            <a href="${pageContext.request.contextPath}/services" class="nav-link d-inline-block">Services</a>
            <a href="${pageContext.request.contextPath}/contact" class="nav-link d-inline-block">Contact</a>
            <a href="${pageContext.request.contextPath}/login" class="nav-link d-inline-block">Login</a>
            <a href="${pageContext.request.contextPath}/signup" class="nav-link d-inline-block">SignUp</a>
        </nav>
    </div>
</header>
</body>
</html>



