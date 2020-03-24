<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/3/10
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/hello/save" method="post">
        ID:<input type="text" name="id"/><br>
        Name:<input type="text" name="name"/><br>
        Age:<input type="text" name="age"/><br>
        <input type="submit" value="提交"/><br>
    </form>

</body>
</html>
