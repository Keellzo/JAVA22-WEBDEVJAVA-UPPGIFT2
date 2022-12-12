<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<p>${error}</p>


<form action="<%=request.getContextPath()%>/LogInServlet" method="post">
    <label for="uname"><b>Username</b></label>
    <input type="text" id="uname" placeholder="Enter Username" name="username"> <br>


    <label for="psw"><b>Password</b></label>
    <input type="password" id="psw" placeholder="Enter Password" name="password"> <br>

    <button type="submit">Login</button>
</form>


</body>
</html>