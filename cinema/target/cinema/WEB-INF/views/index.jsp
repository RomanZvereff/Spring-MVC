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
                <c:forEach var="filmPoster" items="${film}">
                    <div class="col-3">
                        <div class="poster">
                            <div class="poster-item">
                                <img src="${filmPoster.filmPoster}" class="film-poster">
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
        
    </main>
    
<%@include file="static_parts/footer.jsp"%>
