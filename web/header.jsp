<%@page import="dal.SearchDAO"%>
<%@page import="java.util.List"%>
<%@page import="javax.enterprise.context.RequestScoped"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<header class="header-section">
     <c:set var="acc" value="${sessionScope.account}"/>
      <div class="container">
        <div class="header-wrapper">
          <div class="logo">
            <a href="index.jsp">
              <img src="assets/images/logo/logo.png" alt="logo" />
            </a>
          </div>
          <ul class="menu">
            <li>
                <!--class="active"-->
              <a href="home" >Home</a>
            </li>
            <li>
              <a href="films">movies</a>
            </li>
            <li>
              <a href="event">events</a>
            </li>

            <li>
              <a href="#0">pages</a>
              <ul class="submenu">
                <li>
                  <a href="about">About Us</a>
                </li>
                <li>
                  <a href="app-download">Apps Download</a>
                </li>
                
                  <c:if test="${acc!=null}">
                      <li>
                          <a href="logout">Log out</a>
                      </li>
                      <li>
                          <a href="edit-profile">Edit profile</a>
                      </li>
                      <li>
                          <a href="order-history">History</a>
                      </li>
                      
                </c:if>
              </ul>
            </li>
            <li>
              <a href="blog">blog</a>
            </li>
            <li>
              <a href="contact">contact</a>
            </li>
            <li class="header-button pr-0">
               
                <c:if test="${acc==null}">
                    <a href="sign-up">join us</a>
                </c:if>
                <c:if test="${acc!=null}">
                    <p>Hello, ${fn:substringBefore(acc.email,"@")}</p>
                </c:if>
            </li>
          </ul>
          <div class="header-bar d-lg-none">
            <span></span>
            <span></span>
            <span></span>
          </div>
        </div>
      </div>
</header>
