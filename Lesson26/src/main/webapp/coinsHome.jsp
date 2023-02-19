<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<title>Crypto coins</title>
</head>
<body>
<div class="container">
    <nav class="navbar bg-body-tertiary bg-success-subtle">
        <div class="container-fluid">
            <span class="navbar-brand mb-0 h1">Coins Base</span>
        </div>
    </nav>

    <form method="get" action="search">
        <input type="text" name="id" placeholder="Enter coin's id..." />
        <input class="btn" type="submit" value="Search">
    </form>
    <form method="post" action="delete">
        <input type="text" name="id" placeholder="Enter coin's id..." />
        <input class="btn" name ="delete" type="submit" value="Delete coin">
    </form>
    <form method="post" action="create">
        <input type="text" name="id" placeholder="Enter coin's id"/>
        <input type="text" name="name" placeholder="Enter coin's name"/>
        <input type="text" name="price" placeholder="Enter coin's price"/>
        <input class="btn" type="submit" value="Create coin">
    </form>
</div>
</body>
</html>