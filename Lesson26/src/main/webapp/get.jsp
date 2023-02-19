<%@ page import="com.tms.Coin" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Get coins</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<table class="table table-success table-striped">
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
    </tr>
    <tbody>
    <%
        List<Coin> coins = (List<Coin>)request.getAttribute("coins");
        if (coins != null && !coins.isEmpty()) {
            for (Coin coin : coins) {
                out.println("<tr><td>" + coin.getID() + "</td>");
                out.println("<td>" + coin.getName() + "</td>");
                out.println("<td>" + coin.getPrice() + "</td></tr>");
            }
        }
    %>
    </tbody>
</table>
<a href="coinsHome.jsp" style="font-size: 30px;">Home</a>
</body>
</html>
