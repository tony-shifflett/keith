<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/include/header.jsp" %>

<div class="hero position-relative text-center text-white">
    <img src="${pageContext.request.contextPath}/static/images/img.png" alt="Hero Background" class="img-fluid w-100">
    <div class="overlay position-absolute top-0 w-100 h-100 d-flex flex-column align-items-center justify-content-center">
        <h1 class="display-4 fw-bold">Welcome to Rodeo Electric</h1>
        <p class="lead">Trusted Electrical Services for Homes & Businesses</p>
        <div class="mt-4">
            <a href="${pageContext.request.contextPath}/contact.jsp" class="btn btn-primary btn-lg mx-2">Get a Quote</a>
            <a href="${pageContext.request.contextPath}/services.jsp" class="btn btn-outline-light btn-lg mx-2">Learn More</a>
        </div>
    </div>
</div>


<section class="services-section bg-light2 py-5">
    <div class="container">
        <h2 class="text-center text-primary mb-4">Our Services</h2>
        <div class="row">
            <div class="col-md-4 mb-3">
                <div class="p-3 border rounded bg-white">
                    <h3 class="text-primary">Residential</h3>
                    <p>Reliable and safe electrical solutions for your home.</p>
                </div>
            </div>
            <div class="col-md-4 mb-3">
                <div class="p-3 border rounded bg-white">
                    <h3 class="text-primary">Commercial</h3>
                    <p>Efficient and scalable solutions for businesses.</p>
                </div>
            </div>
            <div class="col-md-4 mb-3">
                <div class="p-3 border rounded bg-white">
                    <h3 class="text-primary">Industrial</h3>
                    <p>High-performance electrical installations and repairs.</p>
                </div>
            </div>
        </div>
    </div>
</section>

<div class="bg-light1 text-center py-5">
    <h2 class="text-primary">Why Choose Us?</h2>
    <p class="text-secondary">Experienced professionals, reliable service, and guaranteed satisfaction.</p>
    <a href="${pageContext.request.contextPath}/about.jsp" class="btn btn-primary mt-3">Learn More</a><!-- IDK-->
</div>

<%@ include file="/WEB-INF/jsp/include/footer.jsp" %>
