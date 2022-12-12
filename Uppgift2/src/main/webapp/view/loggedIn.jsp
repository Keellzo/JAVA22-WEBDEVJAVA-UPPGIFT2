<%--  Created by IntelliJ IDEA.
  User: kelly
  Date: 2022-12-06
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>You have successfully logged in!</p>

<h1>Welcome, ${loggedin.getUsername()}</h1>

<p>${snacks}</p>


<form action="<%=request.getContextPath()%>SnackServlet" method="get">
    <label for="snacks"><b>Favorite snack: </b></label>
    <input type="text" id="snacks" placeholder="Write a snack.." name="snack">

    <button type="submit">send</button>
</form>

<p>Press this button to log out</p>
<form action="LogOutServlet" method="post">
    <input type="submit" value="Logout" />
</form>

</body>
</html>
