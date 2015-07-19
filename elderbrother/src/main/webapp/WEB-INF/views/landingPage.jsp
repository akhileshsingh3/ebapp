<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<!--
	Striped by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>

		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<meta http-equiv="Pragma" content="no-cache">
    	<meta http-equiv="Cache-Control" content="no-cache">
    	<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
	
		<script src="<c:url value="/resources/js/jquery.min.js"/>" ></script>
		<script src="<c:url value="/resources/js/skel.min.js"/>"></script>
		<script src="<c:url value="/resources/js/skel-layers.min.js"/>"></script>
		<script src="<c:url value="/resources/js/init.js"/>"></script>
		<script src="<c:url value="/resources/js/custom2.js"/>"></script>
		<title>Elder Brother Home</title>
		 <noscript> 
		<link rel="stylesheet" href="<c:url value="/resources/css/skel.css" />" type="text/css" media="all"/>
		<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" type="text/css" media="all" />
		<link rel="stylesheet" href="<c:url value="/resources/css/style-desktop.css"/>" type="text/css" media="all" />
		<link rel="stylesheet" href="<c:url value="/resources/css/style-wide.css" />" type="text/css" media="all"/> 		
		 </noscript>	  	
 	</head>   
 		 
			
			
		
	 
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
	
	
	<!--
		Note: Set the body element's class to "left-sidebar" to position the sidebar on the left.
		Set it to "right-sidebar" to, you guessed it, position it on the right.
	-->
	<body class="left-sidebar" onload="loadPage('landingPage');" >
	
		<!-- Wrapper -->
			<div id="wrapper">
				<!-- Content -->
					<div id="content">
						<div class="inner" style="background-image:images/Chalkboard3.png ">
							<!-- Post -->
								<article id="ProgressReport" class="box post post-excerpt">
									<header>
									
										<!--
											Note: Titles and subtitles will wrap automatically when necessary, so don't worry
											if they get too long. You can also remove the <p> entirely if you don't
											need a subtitle.
										-->
										<h2><a href="#">Welcome [User]</a></h2>
										<p>Your progress report as of now.</p>
									</header>
									<div class="info">
										<!--
											Note: The date should be formatted exactly as it's shown below. In particular, the
											"least significant" characters of the month should be encapsulated in a <span>
											element to denote what gets dropped in 1200px mode (eg. the "uary" in "January").
											Oh, and if you don't need a date for a particular page or post you can simply delete
											the entire "date" element.
											
										-->
										<span class="date"><span class="month">Jul<span>y</span></span> <span class="day">14</span><span class="year">, 2014</span></span>
										<!--
											Note: You can change the number of list items in "stats" to whatever you want.
										-->
										<ul class="stats">
											<li><a style="color: red" href="<c:url value='/j_spring_security_logout'/>">logout</a></li>
											<!-- <li><a href="#" class="icon fa-comment">16</a></li>
											<li><a href="#" class="icon fa-heart">32</a></li>
											<li><a href="#" class="icon fa-twitter">64</a></li>
											<li><a href="#" class="icon fa-facebook">128</a></li> -->
										</ul>
									</div>
									<a href="#" class="image featured"><img src="<c:url value="/resources/images/pic01.jpg" />" alt="" /></a>
									<p>
										<strong>Hello!</strong> You're looking at <strong>Striped</strong>, a fully responsive HTML5 site template designed by <a href="http://n33.co">AJ</a>
										for <a href="http://html5up.net">HTML5 UP</a> It features a clean, minimalistic design, styling for all basic page elements (including blockquotes, tables and lists), a
										repositionable sidebar (left or right), and HTML5/CSS3 code designed for quick and easy customization (see code comments for details).
									</p>
									<p>
										Striped is released for free under the <a href="http://html5up.net/license">Creative Commons Attribution license</a> so feel free to use it for personal projects
										or even commercial ones &ndash; just be sure to credit <a href="http://html5up.net">HTML5 UP</a> for the design. If you like what you see here, be sure to check out
										<a href="http://html5up.net">HTML5 UP</a> for more cool designs or follow me on <a href="http://twitter.com/n33co">Twitter</a> for new releases and updates.
									</p>
								</article>

								<!-- Replace above article and show this article when Maethematics is clicked. -->
								<article id="Mathematics" class="box post post-excerpt" style="display: none;" >
									<header>
										<!--
											Note: Titles and subtitles will wrap automatically when necessary, so don't worry
											if they get too long. You can also remove the <p> entirely if you don't
											need a subtitle.
										-->
										<h2><a href="#">Welcome [User]</a></h2>
										<p>Your progress report as of now.</p>
									</header>
									<div class="info">
										<!--
											Note: The date should be formatted exactly as it's shown below. In particular, the
											"least significant" characters of the month should be encapsulated in a <span>
											element to denote what gets dropped in 1200px mode (eg. the "uary" in "January").
											Oh, and if you don't need a date for a particular page or post you can simply delete
											the entire "date" element.
											
										-->
										<span class="date"><span class="month">Jul<span>y</span></span> <span class="day">14</span><span class="year">, 2014</span></span>
										<!--
											Note: You can change the number of list items in "stats" to whatever you want.
										-->
										<ul class="stats">
											<li><a href="#" class="icon fa-comment">16</a></li>
											<li><a href="#" class="icon fa-heart">32</a></li>
											<li><a href="#" class="icon fa-twitter">64</a></li>
											<li><a href="#" class="icon fa-facebook">128</a></li>
										</ul>
									</div>
									<a href="#" class="image featured"><img src="<c:url value="/resources/images/pic01.jpg" />" alt="" /></a>
									<p>
										<strong>Hello!</strong> You're looking at <strong>Striped</strong>, a fully responsive HTML5 site template designed by <a href="http://n33.co">AJ</a>
										for <a href="http://html5up.net">HTML5 UP</a> It features a clean, minimalistic design, styling for all basic page elements (including blockquotes, tables and lists), a
										repositionable sidebar (left or right), and HTML5/CSS3 code designed for quick and easy customization (see code comments for details).
									</p>
									<p>
										Striped is released for free under the <a href="http://html5up.net/license">Creative Commons Attribution license</a> so feel free to use it for personal projects
										or even commercial ones &ndash; just be sure to credit <a href="http://html5up.net">HTML5 UP</a> for the design. If you like what you see here, be sure to check out
										<a href="http://html5up.net">HTML5 UP</a> for more cool designs or follow me on <a href="http://twitter.com/n33co">Twitter</a> for new releases and updates.
									</p>
								</article>
						</div>
					</div>
				<!-- Sidebar -->
					<div id="sidebar">
						<!-- Logo -->
							<h1 id="logo"><a href="#">Elder Brother</a></h1>
						<!-- Nav -->
							<nav id="nav">
								<!-- <ul id="nav">
									 <li id="li_Home" class="current"><a href="landingPage.jsp">Progress Report</a></li>
									<li id="li_Math"><a href="TableOfContent.jsp?Content=Class8-Mathematics">Mathematics</a></li>
									<li id="li_Science"><a href="TableOfContent.jsp?Content=Class8-Science">Science</a></li>
									<li id="li_Support"><a href="Support.jsp?Content=Support">Support</a></li> 
								</ul> -->
							</nav>
						<!-- Search -->
							<section class="box search">
								<form method="post" action="#">
									<input type="text" class="text" name="search" placeholder="Search" />
								</form>
							</section>					
						<!-- Calendar -->
							<section class="box calendar">
								<div class="inner">
									<table>
										<caption>July 2014</caption>
										<thead>
											<tr>
												<th scope="col" title="Monday">M</th>
												<th scope="col" title="Tuesday">T</th>
												<th scope="col" title="Wednesday">W</th>
												<th scope="col" title="Thursday">T</th>
												<th scope="col" title="Friday">F</th>
												<th scope="col" title="Saturday">S</th>
												<th scope="col" title="Sunday">S</th>
											</tr>
										</thead>
										<tbody>
											<tr>
												<td colspan="4" class="pad"><span>&nbsp;</span></td>
												<td><span>1</span></td>
												<td><span>2</span></td>
												<td><span>3</span></td>
											</tr>
											<tr>
												<td><span>4</span></td>
												<td><span>5</span></td>
												<td><a href="#">6</a></td>
												<td><span>7</span></td>
												<td><span>8</span></td>
												<td><span>9</span></td>
												<td><a href="#">10</a></td>
											</tr>
											<tr>
												<td><span>11</span></td>
												<td><span>12</span></td>
												<td><span>13</span></td>
												<td class="today"><a href="#">14</a></td>
												<td><span>15</span></td>
												<td><span>16</span></td>
												<td><span>17</span></td>
											</tr>
											<tr>
												<td><span>18</span></td>
												<td><span>19</span></td>
												<td><span>20</span></td>
												<td><span>21</span></td>
												<td><span>22</span></td>
												<td><a href="#">23</a></td>
												<td><span>24</span></td>
											</tr>
											<tr>
												<td><a href="#">25</a></td>
												<td><span>26</span></td>
												<td><span>27</span></td>
												<td><span>28</span></td>
												<td class="pad" colspan="3"><span>&nbsp;</span></td>
											</tr>
										</tbody>
									</table>
								</div>
							</section>

						<!-- Copyright -->
							<ul id="copyright">
								<li>&copy; Untitled.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
							</ul>

					</div>

			</div>
	</body>
</html>