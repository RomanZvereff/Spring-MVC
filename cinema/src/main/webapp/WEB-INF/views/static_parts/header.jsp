<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 09.05.2022
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cinema Pro - best in your world</title>
    <meta charset="UTF-8">
    <meta name="author" content="Roman Zvieriev">
    <meta name="description" content="As the cinema experience continues to improve with technological advancements in Imax, 3D and fully immersive sound">
    <meta name="keywords" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="icon" type="image/x-icon" href="static/images/favicon-ticket.png">
    <link rel="stylesheet" type="text/css" href="static/css/style.css">

</head>
<body>

<header>
    <nav class="navbar navbar-expand-xxl navbar-light bg-light fixed-top">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <span class="brand-start">Cinema</span>
                <span class="brand-end">Pro</span>
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Movies</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Coming soon</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                           data-bs-toggle="dropdown" aria-expanded="false">Our theaters</a>
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
                        <button type="button" class="nav-link sign-in" data-bs-toggle="modal"
                                data-bs-target="#signInModal" data-backdrop="static" data-keyboard="false">
                            <span>Sign In</span>
                        </button>
                    </li>
                    <li class="nav-item">
                        <button type="button" class="nav-link sign-up" data-bs-toggle="modal"
                                data-bs-target="#signUpModal">
                            <span>Sign Up</span>
                        </button>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>

<div class="modal fade" id="signInModal" tabindex="-1" aria-labelledby="signInModelLabel" aria-hidden="true" data-bs-backdrop="static" data-bs-keyboard="false">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="signInModelLabel">Sign in to
                    <span class="brand-start">Cinema</span>
                    <span class="brand-end">Pro</span>
                </h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div class="sign-in-form">
                    <form method="post">
                        <div class="mb-3">
                            <label for="email-address-sign-in" class="form-label">Email address</label>
                            <input type="email" class="form-control" id="email-address-sign-in"
                                   placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="password-sign-in" class="form-label">Password</label>
                            <input type="password" class="form-control" id="password-sign-in">
                        </div>
                    </form>
                </div>
            </div>
            <div class="modal-footer">
                <button type="submit" class="btn btn-success">Sign in</button>
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

<div class="modal fade" id="signUpModal" tabindex="-1" aria-labelledby="signUnModelLabel" aria-hidden="true" data-bs-backdrop="static" data-bs-keyboard="false">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="signUnModelLabel">Sign up to
                    <span class="brand-start">Cinema</span>
                    <span class="brand-end">Pro</span>
                </h5>
                <button type="button" class="btn-close sign-up-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form action="signUp" method="post">
                <div class="modal-body">
                    <div class="sign-up-form">
                        <div class="mb-3">
                            <label for="first-name-sign-up" class="form-label">First name</label>
                            <input type="text" class="form-control" id="first-name-sign-up" name="firstName" required>
                        </div>
                        <div class="mb-3">
                            <label for="last-name-sign-up" class="form-label">Last name</label>
                            <input type="text" class="form-control" id="last-name-sign-up" name="lastName" required>
                        </div>
                        <div class="mb-3">
                            <label for="email-address-sign-up" class="form-label">Email address</label>
                            <input type="email" class="form-control" id="email-address-sign-up"
                                   placeholder="name@example.com" name="email" required>
                        </div>
                        <div class="mb-3">
                            <label for="password-sign-up" class="form-label">Password</label>
                            <input type="password" class="form-control" id="password-sign-up" name="pass" required>
                        </div>
                        <div class="mb-3">
                            <label for="confirm-pass-sign-up" class="form-label">Confirm password</label>
                            <input type="password" class="form-control" id="confirm-pass-sign-up" required>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="submit" class="btn btn-success">Sign up</button>
                    <button type="button" class="btn btn-secondary sign-up-close" data-bs-dismiss="modal">Close</button>
                </div>
            </form>
        </div>
    </div>
</div>