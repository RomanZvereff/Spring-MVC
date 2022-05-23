<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 07.05.2022
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>

<%@include file="static_parts/header.jsp"%>

    <main class="posters-block">
        
        <div class="container-fluid">
            <div class="row">
                <c:forEach var="film" items="${films}">
                    <div class="col-3 poster-col">
                        <div class="poster">
                            <div class="poster-item">
                                <img src="${film.filmPoster}" class="film-poster" alt="${film.filmName}">
                            </div>
                        </div>
                        <div class="poster-text">
                            <div class="poster-title">
                                <p>NOW PLAYING</p>
                            </div>
                            <div class="film-name">
                                <p>${film.filmName}</p>
                            </div>
                            <div class="get-ticket-btn">
                                <a class="buy-ticket-btn" href="/buy-ticket">Get Ticket</a>
                                <a class="poster-trailer" href="${film.filmTrailer}" target="_blank">Watch trailer</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        
    </main>

    <section id="movies-block">

    </section>

    
<%@include file="static_parts/footer.jsp"%>
