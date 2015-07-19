
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
<script src="<c:url value="/resources/js/validateRegistration.js"/>"></script> 

<title>Elder Brother- Registration</title>
</head>
<link rel="stylesheet" href="<c:url value="/resources/css/Home3.css" />" type="text/css" media="all" />
<link rel="stylesheet" href="<c:url value="/resources/css/homeResize.css" />" type="text/css" media="all" />
<body class="">
<div class="stage stage-bg--1" >
	<header id="header" class="color-span">
	<div class="row"><div class="large-12 columns"><div class="row">
	
	
		<a class="right stage-text stage--login" href="/in">| Home</a>
		<a class="right stage-text stage--login" href="LandingPage">Login</a>
	</div></div></div></header>
	
	<div class="row stage-text stage--header">
	<h1 class="text-center text--bold margin-top-small-0 margin-bottom-small-0" style="color: #ff7519; font-family:cursive; font-size: 750%; ">ElderBrother</h1>
	<h3 class="text-right text--bold margin-top-small-0 margin-bottom-small-1" style="text-align:left; color: #CCCC00; font-family:cursive;padding-right: 10%">Mentoring & Beyond</h3> 
	</div>
	
	<div class="row padding-bottom-small-0"><div class="small-12 large-10 large-centered columns"><div class="row">
		<div class="custom-width-for-medium small-12 medium-6 columns text-center stage-text margin-bottom-small-1 
		hide-for-small margin-top-medium-1 margin-top-large-3">
		<div class="panel--opacity clearfix"><div class="row">
		<div class="small-12"><div class="icon-card warning-icon"></div> </div>
		 </div></div></div>
		
		<div class="custom-width-for-medium small-12 medium-6 columns margin-bottom-medium-3 no-padding-for-small">
			<div class="panel--light margin-bottom-small-0"><div class="form-wrap">
			<h4 class="margin-bottom-small-0 text--bold text--no-break">Create Your Account</h4><h5 class="margin-top-small-0 text--no-break">Sign up to gain access.</h5>	
			<form:form  id="signup" action="Registering" method="POST" commandName="registeringuser" class="form-wrap--step1" >
<%-- 				<form:form  id="signup" action="Registering" method="POST" modelAttribute="registeringuser" class="form-wrap--step1" > --%>
				<div class="row"><div class="small-12 columns margin-top-small-1"><div class="row collapse">	
					<table>
 						<tr><td>
	 						<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left">
	 						<form:input path="firstname" id="firstname" name="firstname" type="text"  placeholder="First Name"/>
	 						<form:errors path="firstname" class="errorTxt"/><div class="errorTxt"></div><div class="icon-">&#9656;</div></div> 
						</td><td>
							<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left">
							<form:input path="lastname" id="lastname" type="text" name="lastname" placeholder="Last Name"/>
							<form:errors path="lastname" class="errorTxt"/><div class="errorTxt"></div><div class="icon-">&#9656;</div></div>
						</td></tr>
						<tr><td colspan="2">
							<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left"> 
							<form:input path="username" id="username" type="email" name="username" placeholder="Email"/>
							<form:errors path="username" class="errorTxt"/><div class="errorTxt">
							
							
								<div id="servererror" class="errorTxt">${error}</div>
						
							
							</div><div class="icon-">&#9656;</div></div>
						<td></tr>
						<tr><td colspan="2">
							<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left">
							<form:input path="password" id="password" type="password" name="password" placeholder="Password (+6 Characters)"/>
							<form:errors path="password" class="errorTxt"/><div class="errorTxt"></div><div class="icon-">&#9656;</div></div>
						</td></tr>
						<tr><td colspan="2">
							<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left">
							<form:input path="matchpassword" id="matchpassword" type="password" name="matchpassword" placeholder="Confirm Password"/>
							<form:errors path="matchpassword" class="errorTxt"/><div class="errorTxt"></div><div class="icon-">&#9656;</div></div>
						</td></tr>
						<tr><td colspan="2">
							<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left">
							<form:input path="currentclass" id="currentclass" type="text" name="currentclass" placeholder="Current Class/Semester"/>
							<form:errors path="currentclass" class="errorTxt"/><div class="errorTxt"></div><div class="icon-">&#9656;</div></div>
							</td></tr>
						<tr><td colspan="2">
							<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left">
							<form:input path="school" id="school" type="text" name="school" placeholder="School/College"/>
							<form:errors path="school" class="errorTxt" /><div class="errorTxt"></div><div class="icon-">&#9656;</div></div>
						</td></tr>
						<tr><td colspan="2">
							<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left">
							<form:input path="affiliation" id="affiliation" type="text" name="affiliation" placeholder="Board/Univeristy"/>
							<form:errors path="affiliation" class="errorTxt"/><div class="errorTxt"></div><div class="icon-">&#9656;</div></div>
						</td></tr>
						<tr><td colspan="2">
							<div class="small-12 columns collapse input-wrap input-wrap-icon input-wrap-icon--left">
							<form:input path="city" id="city" type="text" name="city" placeholder="City"/>
							<form:errors path="city" class="errorTxt" /><div class="errorTxt"></div><div class="icon-">&#9656;</div></div>
						</td></tr>
					</table>
					</div></div></div>
					<div class="button-wrap button--blue">
							<input type="submit" class="button" name="action" value="Submit"/>
							<input class="text" id="sid" type="hidden" name="sid" value="" />
						</div>
				</form:form> 
			</div></div>
		</div>	
	</div></div></div>
</div>
</body>
</html>