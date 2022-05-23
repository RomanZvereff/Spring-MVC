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
                                <img src="${film.filmPoster}" class="film-poster">
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
        <!-- Button trigger modal -->
        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">
            Launch demo modal
        </button>

        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        Hello Spring MVC
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary">Save changes</button>
                    </div>
                </div>
            </div>
        </div>

    </section>

    
<%@include file="static_parts/footer.jsp"%>
