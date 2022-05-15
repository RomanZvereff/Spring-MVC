<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 15.05.2022
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Second Page</title>
    <meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Flex:opsz,wght@8..144,100;8..144,300;8..144,500;8..144,700;8..144,900;8..144,1000&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto Flex', sans-serif;
        }

        .main-container {
            margin: 5rem;
            padding: 2rem;
            text-align: center;
        }

        .main-container h1 {
            font-weight: 100;
            font-size: 2rem;
        }

        .next-page {
            text-align: center;
            color: green;
        }

    </style>
</head>
<body>

    <main>
        <div class="main-container">
            <div class="title">
                <h1>Hello ${userName}</h1>
            </div>
            <div>
                <img src="https://e7.pngegg.com/pngimages/103/923/png-clipart-captain-america-captain-america.png">
            </div>
        </div>

        <div class="next-page">
            <a href="third-page">third page</a>
        </div>
    </main>

</body>
</html>
