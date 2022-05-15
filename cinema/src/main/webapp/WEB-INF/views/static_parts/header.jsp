<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 09.05.2022
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cinema Pro - best in your world</title>
    <meta charset="UTF-8">
    <meta name="author" content="Roman Zvieriev">
    <meta name="description" content="As the cinema experience continues to improve with technological advancements in Imax, 3D and fully immersive sound">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>">
</head>
<body>

    <header>
        <nav class="navbar navbar-expand-xxl navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">
                    <span class="start">Cinema</span>
                    <span class="end">Pro</span>
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Movies</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Coming soon</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">Our theaters</a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#">AMC Empire 25</a></li>
                                <li><a class="dropdown-item" href="#">ARegal E-Walk 4DX & RPX</a></li>
                                <li><a class="dropdown-item" href="#">Cinema Village</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Food & drinks</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Promotions</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Contacts</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link sign-in" href="#">Sign In</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link sign-up" href="#">Sign Up</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

