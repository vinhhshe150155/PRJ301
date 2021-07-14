<%@page import="dal.SearchDAO"%>
<%@page import="java.util.List"%>
<%@page import="javax.enterprise.context.RequestScoped"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<footer class="footer-section">
        <c:set var="acc" value="${sessionScope.account}"/>

    <c:if test="${acc==null}">
        <div class="newslater-section padding-bottom">
        <div class="container">
          <div
            class="newslater-container bg_img"
            data-background="assets/images/newslater/newslater-bg01.jpg"
          >
            <div class="newslater-wrapper">
              <h5 class="cate">subscribe to Boleto</h5>
              <h3 class="title">to get exclusive benifits</h3>
              <form class="newslater-form">
                <input type="text" placeholder="Your Email Address" />
                <button type="submit">subscribe</button>
              </form>
              <p>We respect your privacy, so we never share your info</p>
            </div>
          </div>
        </div>
      </div>
    </c:if>
      
      <div class="container">
        <div class="footer-top">
          <div class="logo">
            <a href="index-1.html">
              <img src="assets/images/footer/footer-logo.png" alt="footer" />
            </a>
          </div>
          <ul class="social-icons">
            <li>
              <a href="#0">
                <i class="fab fa-facebook-f"></i>
              </a>
            </li>
            <li>
              <a href="#0" class="active">
                <i class="fab fa-twitter"></i>
              </a>
            </li>
            <li>
              <a href="#0">
                <i class="fab fa-pinterest-p"></i>
              </a>
            </li>
            <li>
              <a href="#0">
                <i class="fab fa-google"></i>
              </a>
            </li>
            <li>
              <a href="#0">
                <i class="fab fa-instagram"></i>
              </a>
            </li>
          </ul>
        </div>
        <div class="footer-bottom">
          <div class="footer-bottom-area">
            <div class="left">
              <p>
                Copyright © 2020. All Rights Reserved By <a href="#0">Boleto </a>
              </p>
            </div>
            <ul class="links">
              <li>
                <a href="#0">About</a>
              </li>
              <li>
                <a href="#0">Terms Of Use</a>
              </li>
              <li>
                <a href="#0">Privacy Policy</a>
              </li>
              <li>
                <a href="#0">FAQ</a>
              </li>
              <li>
                <a href="#0">Feedback</a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </footer>