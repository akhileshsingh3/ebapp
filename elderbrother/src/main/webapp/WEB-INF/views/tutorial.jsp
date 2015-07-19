
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE HTML>
<!--
	Striped by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
	<head>
		<title>Elder Brother Home</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		    
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="<c:url value="/resources/js/jquery.min.js"/>" ></script>
		<script src="<c:url value="/resources/js/skel.min.js"/>"></script>
		<script src="<c:url value="/resources/js/skel-layers.min.js"/>"></script>
		<script src="<c:url value="/resources/js/init.js"/>"></script>
		<script src="<c:url value="/resources/js/custom2.js"/>"></script>
		<script src="<c:url value="/resources/js/customTutorial.js"/>"></script>
		 <noscript> 
			<link rel="stylesheet" href="<c:url value="/resources/css/skel.css" />" />
			<link rel="stylesheet" href="<c:url value="/resources/css/style.css" />" />
			<link rel="stylesheet" href="<c:url value="/resources/css/style-desktop.css"/>" />
			<link rel="stylesheet" href="<c:url value="/resources/css/style-wide.css" />" />
		</noscript> 
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
	</head>
	<!--
		Note: Set the body element's class to "left-sidebar" to position the sidebar on the left.
		Set it to "right-sidebar" to, you guessed it, position it on the right.
	-->
	<%String tutorial=request.getParameter("Tutorial");
	tutorial= tutorial.replaceAll("%20", "");
	String [] arrtutorial= tutorial.split(":");%>
	
	<body class="left-sidebar" onload="loadTutorialPage('tutorial','<%=tutorial%>');">
		<!-- Wrapper -->
			<div id="wrapper">
				<!-- Content -->
					<div id="content">
						<div class="inner">
							<!-- Post -->
								<article id="TableofContent" class="box post post-excerpt">
									<header>
<%-- 										<h2><a href="#" style="color:#364050"><%=tutorial.replaceAll("%20", "")%></a></h2> --%>
										<h2><a href="#" style="color:#449C06;text-shadow: 1px 0px 10px #FFFEEE;"><%=arrtutorial[1]%></a></h2>	
									</header>
									<div class="info">
										<span class="date"><span class="month">Jul<span>y</span></span> <span class="day">14</span><span class="year">, 2014</span></span>
									</div>
									<div>	
									<table id="chatperTable"><tr><td>
									<video id ="videoPlayer" class ="video featured"  controls>
  											<source id="mp4Source"  type="video/mp4">
  											<source id="movSource"  type="video/mov">
  											Your browser does not support the video tag.
  									</video>

								</td>	</tr>
									</table>
									
									</div>
									
									<div><span>Downlaod the question for the topics covered in the above video.</span>
									<a  href="#" style="color:#449C06;text-shadow: 1px 0px 10px #FFFEEE;">Downlaod Questions</a></div>
								</article>

								
						</div>
					</div>
				<!-- Sidebar -->
					<div id="sidebar">
						<!-- Logo -->
							<h1 id="logo"><a style= "background-color: #449C06;" href="#">Elder Brother</a></h1>
							
						<!-- Nav -->
							<nav id="nav">
								<!-- <ul class="VideoLinks">
									<li><a href="landingPage.jsp">Progress Report</a></li>
									<li class="currentVideo"><a href="MathematicsTOC.jsp">Mathematics</a></li>
									<li><a href="Science.jsp">Science</a></li>
									<li><a href="Support.jsp">Support</a></li>
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