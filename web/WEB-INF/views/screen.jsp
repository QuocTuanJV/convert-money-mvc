<%--
  Created by IntelliJ IDEA.
  User: TUANLQ
  Date: 11/12/2019
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Screen Convert</title>
</head>
<body>
<form action="result" method="post">
    <table>
        <tr>
        <td>USD</td>
        <td><input type="number" name="money"></td>
        </tr>
        <tr>
            <td>Rate</td>
            <td><input type="number" name="rate" value="23000" readonly></td>
        </tr>
        <tr>
            <td><input type="submit" value="convert"></td>
        </tr>
    </table>

</form>
</body>
</html>
