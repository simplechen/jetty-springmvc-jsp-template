<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Hello world!</h1>

<P>The time on the server is ${serverTime}.</P>

<p>Here are some items:</p>
<ul>
    <c:forEach var="item" items="${someItems}">
        <li>${item}</li>
    </c:forEach>
</ul>

<p>Is our echo service echoing:</p>
<c:if test="${empty echoService}">
    <p>No, we don't have an echo service.</p>
</c:if>
<c:if test="${not empty echoService}">
    <p>Yes: ${echoService.echo("echo")}</p>
</c:if>

<p><a href="metrics">Yammer Metrics</a></p>

<p><a href="admin">Admin (admin/password)</a></p>

</body>
</html>
