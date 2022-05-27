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

    <section id="most-anticipated">
        <div class="container-fluid most-anticipated-film">
            <div class="row">
                <div class="col-12">
                    <div class="most-anticipated-text">
                        <div class="most-anticipated-title">
                            <p class="most-anticipated-sub-title">The Most Anticipated Movie <span>2022</span></p>
                            <p>Killers of the Flower Moon</p>
                        </div>
                        <div class="most-anticipated-btn">
                            <button type="button">
                                <img src="static/images/icons/play.png" alt="most anticipated trailer button">
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    
<%@include file="static_parts/footer.jsp"%>
