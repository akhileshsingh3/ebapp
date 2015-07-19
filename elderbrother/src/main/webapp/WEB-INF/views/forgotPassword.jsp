<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html class="no-js en all">
<head><meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script> 
<script src="<c:url value="/resources/mytheme/js/validateForgotPassword.js"/>"></script>

<title>Elder Brother-Forgot Password</title>
</head>
<link rel="stylesheet" href="<c:url value="/resources/mytheme/css/maincss"/>" type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/resources/mytheme/css/photobanner"/>" type="text/css" media="all" />
<body class="">

<div class="stage stage-bg--1" >
	
	<header id="header" class="color-span">
	<div class="row"><div class="large-12 columns"><div class="row">
	
		<!-- <a type="submit"  value ="Register" class="right stage-text stage--login" href="Register">Register</a> 
		<a type="submit"  value ="Home" class="right stage-text stage--login" href="/in">| Home</a> -->
		<a class="right stage-text stage--login" href="LogIn">Login</a>
		<a class="right stage-text stage--login" href="/in">| Home</a>
		
</div></div></div></header>

	<div class="row stage-text stage--header">
	<h1 class="text-center text--bold margin-top-small-0 margin-bottom-small-0" style="color: #ff7519; font-family:cursive; font-size: 750%; ">ElderBrother</h1>
	<h3 class="text-right text--bold margin-top-small-0 margin-bottom-small-1" style="text-align:left; color: #CCCC00; font-family:cursive;padding-right: 10%">Mentoring & Beyond</h3> 
	
	<!-- <h1 class="text-center text--bold margin-top-small-0 margin-bottom-small-0 ">
	<img src="images/LogoEB.png">  </h1> -->
	</div>
	
	<div class="row padding-bottom-small-0">
			<div class="small-12 large-10 large-centered columns"><div class="row">
			<div class="custom-width-for-medium small-12 medium-6 columns text-center stage-text margin-bottom-small-1 
				hide-for-small margin-top-medium-1 margin-top-large-3">
					<div class="panel--opacity clearfix"><div class="row"></div></div> 
			</div></div></div>
				
			<div class="custom-width-for-medium small-12 medium-6 columns margin-bottom-medium-3 no-padding-for-small">
			<div class="panel--light margin-bottom-small-0"><div class="form-wrap">
			<h4 class="margin-bottom-small-0 text--bold text--no-break" style="color: green;">Forgot Password</h4>
					<form id="forgotPasswordForm" action="ForgotPassword" method="post" class="form-wrap--step1">
						
						<div class="row"><div class="small-12 columns margin-top-small-1"><div class="row collapse">
								<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left">
								
								<input id="username" type="email" name="username" placeholder="Registered Email"/>
								<div class="icon-">&#9656;</div></div>
								
						</div></div></div>
						<div  class="errorTxt"></div>
						<c:if test="${not empty error}">
								<div id="servererror" class="errorTxt">${error}</div>
						</c:if>
						
						
						
								<div class="button-wrap button--blue">
								<input id="submitbtn" type="submit" class="button medium-12" value="Reset Password"/>
								<input class="text" id="sid" type="hidden" name="sid" value="" /></div>
					</form> 
					
			</div></div></div>						
	</div>
</div>
</body></html>