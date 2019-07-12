@extends('autoWeb.masterpage.masterpage')
<!doctype html>
<html lang="en" class="no-js">
@section('head')
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/owl.carousel.css') }}" media="screen">
    <link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/owl.theme.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/jquery.bxslider.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/magnific-popup.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/font-awesome.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/animate.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/settings.css') }}" media="screen" />
@stop
@section('content')
	<!-- slider 
			================================================== -->
		<div id="slider" class="slider1">
			<!--
			#################################
				- THEMEPUNCH BANNER -
			#################################
			-->
			<div class="tp-banner-container">
				<div class="tp-banner" >
					<ul>	<!-- SLIDE  -->
						<li data-transition="3dcurtain-horizontal" data-slotamount="7" data-masterspeed="500" >
							<!-- MAIN IMAGE -->
							<img src="{{ asset('resources/assets/images/background1.jpg') }}"  alt="slidebg1"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">
							<!-- LAYERS -->

							<!-- LAYER NR. 1 -->
							<div class="tp-caption large_bold_white skewfromrightshort customout"
								data-x="250"
								data-y="274"
								data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
								data-speed="500"
								data-start="1200"
								data-easing="Back.easeOut"
								data-endspeed="500"
								data-endeasing="Power4.easeIn"
								data-captionhidden="on"
								style="z-index: 4">welcome to our agency
							</div>
							
							<!-- LAYER NR. 2 -->
							<div class="tp-caption medium_thin_white customin ltl"
								data-x="170"
								data-y="340"
								data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;"
								data-speed="1000"
								data-start="1500"
								data-easing="Back.easeInOut"
								data-endspeed="400"
								data-endeasing="Back.easeIn"
								style="z-index: 14">Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattis eros. 
							</div>
							
							<!-- LAYER NR. 3 -->
							<div class="tp-caption medium_thin_white customin ltl"
								data-x="470"
								data-y="400"
								data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;"
								data-speed="1000"
								data-start="2000"
								data-easing="Back.easeInOut"
								data-endspeed="400"
								data-endeasing="Back.easeIn"
								style="z-index: 14"><a class="button-large" href="#">get started</a>
							</div>
						</li>
						<!-- SLIDE  -->
						<li data-transition="zoomout" data-slotamount="7" data-masterspeed="1000" >
							<!-- MAIN IMAGE -->
							<img src="{{ asset('resources/assets/images/background2.jpg') }}"  alt="darkblurbg"  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">
							<!-- LAYERS -->
							<!-- LAYER NR. 1 -->
							<div class="tp-caption large_bold_white skewfromrightshort customout"
								data-x="350"
								data-y="274"
								data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
								data-speed="500"
								data-start="1200"
								data-easing="Back.easeOut"
								data-endspeed="500"
								data-endeasing="Power4.easeIn"
								data-captionhidden="on"
								style="z-index: 4">clean &amp; Modern
							</div>
							
							<!-- LAYER NR. 2 -->
							<div class="tp-caption medium_thin_white customin ltl"
								data-x="170"
								data-y="340"
								data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;"
								data-speed="1000"
								data-start="1500"
								data-easing="Back.easeInOut"
								data-endspeed="400"
								data-endeasing="Back.easeIn"
								style="z-index: 14">Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattis eros. 
							</div>
							
							<!-- LAYER NR. 3 -->
							<div class="tp-caption medium_thin_white customin ltl"
								data-x="390"
								data-y="400"
								data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;"
								data-speed="1000"
								data-start="2000"
								data-easing="Back.easeInOut"
								data-endspeed="400"
								data-endeasing="Back.easeIn"
								style="z-index: 14"><a class="button-large" href="#">more info</a><a class="button-large" href="#">get started</a>
							</div>
						</li>
						<!-- SLIDE  -->
						<li data-transition="curtain-1" data-slotamount="7" data-masterspeed="600" >
							<!-- MAIN IMAGE -->
							<img src="{{ asset('resources/assets/images/background3.jpg') }}" style='background-color:#b2c4cc' alt=""  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">
							<!-- LAYERS -->
							<!-- LAYER NR. 1 -->
							<div class="tp-caption large_bold_white skewfromrightshort customout"
								data-x="15"
								data-y="200"
								data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
								data-speed="500"
								data-start="1200"
								data-easing="Back.easeOut"
								data-endspeed="500"
								data-endeasing="Power4.easeIn"
								data-captionhidden="on"
								style="z-index: 4">Marble is clean <br> and well commented
							</div>
							
							<!-- LAYER NR. 2 -->
							<div class="tp-caption medium_thin_white customin ltl"
								data-x="15"
								data-y="350"
								data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;"
								data-speed="1000"
								data-start="1500"
								data-easing="Back.easeInOut"
								data-endspeed="400"
								data-endeasing="Back.easeIn"
								style="z-index: 14">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.  <br> Donec odio. Quisque volutpat mattis eros 
							</div>
							
							<!-- LAYER NR. 3 -->
							<div class="tp-caption medium_thin_white customin ltl"
								data-x="5"
								data-y="450"
								data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;"
								data-speed="1000"
								data-start="1800"
								data-easing="Back.easeInOut"
								data-endspeed="400"
								data-endeasing="Back.easeIn"
								style="z-index: 14"><a class="button-large" href="#">more info</a><a class="button-large" href="#">get started</a>
							</div>

							<!-- LAYER NR. 4 -->
							<div class="tp-caption skewfromrightshort customout"
								data-x="750"
								data-y="50"
								data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
								data-speed="500"
								data-start="2500"
								data-easing="Back.easeOut"
								data-endspeed="500"
								data-endeasing="Power4.easeIn"
								data-captionhidden="on"
								style="z-index: 9"><img src="{{ asset('resources/assets/images/dev4.png') }}" alt="">
							</div>
						</li>
						<!-- SLIDE  -->
						<li data-transition="flyin" data-slotamount="7" data-masterspeed="800" >
							<!-- MAIN IMAGE -->
							<img src="{{ asset('resources/assets/images/background4.jpg') }}" style='background-color:#b2c4cc' alt=""  data-bgfit="cover" data-bgposition="left top" data-bgrepeat="no-repeat">
							<!-- LAYERS -->

							<!-- LAYER NR. 1 -->
							<div class="tp-caption skewfromrightshort customout"
								data-x="0"
								data-y="50"
								data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
								data-speed="500"
								data-start="1200"
								data-easing="Back.easeOut"
								data-endspeed="500"
								data-endeasing="Power4.easeIn"
								data-captionhidden="on"
								style="z-index: 9"><img src="{{ asset('resources/assets/images/dev3.png') }}" alt="">
							</div>

							<!-- LAYER NR. 2 -->
							<div class="tp-caption large_bold_white skewfromrightshort customout"
								data-x="500"
								data-y="200"
								data-customout="x:0;y:0;z:0;rotationX:0;rotationY:0;rotationZ:0;scaleX:0.75;scaleY:0.75;skewX:0;skewY:0;opacity:0;transformPerspective:600;transformOrigin:50% 50%;"
								data-speed="500"
								data-start="1800"
								data-easing="Back.easeOut"
								data-endspeed="500"
								data-endeasing="Power4.easeIn"
								data-captionhidden="on"
								style="z-index: 4">we offer 24/7 support <br> Praesent placerat risus
							</div>
							
							<!-- LAYER NR. 3 -->
							<div class="tp-caption medium_thin_white customin ltl"
								data-x="500"
								data-y="350"
								data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;"
								data-speed="1000"
								data-start="2100"
								data-easing="Back.easeInOut"
								data-endspeed="400"
								data-endeasing="Back.easeIn"
								style="z-index: 14">Lorem ipsum dolor sit amet, consectetuer adipiscing elit.  <br> Donec odio. Quisque volutpat mattis eros 
							</div>
							
							<!-- LAYER NR. 4 -->
							<div class="tp-caption medium_thin_white customin ltl"
								data-x="490"
								data-y="450"
								data-customin="x:0;y:0;z:0;rotationX:90;rotationY:0;rotationZ:0;scaleX:1;scaleY:1;skewX:0;skewY:0;opacity:0;transformPerspective:200;transformOrigin:50% 0%;"
								data-speed="1000"
								data-start="2500"
								data-easing="Back.easeInOut"
								data-endspeed="400"
								data-endeasing="Back.easeIn"
								style="z-index: 14"><a class="button-large" href="#">get started</a>
							</div>
						</li>
					</ul>
					<div class="tp-bannertimer"></div>
				</div>
			</div>
			<div class="banner-thumbs">
				<div class="container triggerAnimation animated" data-animate="slideInUp">
					<!-- slide-buttons -->
					<ul class="slider-thumbnails">
						<li class="active">
							<a href="#" class="btn slide-thumbs" id="slidethumb1" data-slide="1">
								<span>1</span>
								<h2>We are trendy</h2>
								<p>Aliquam tincidunt mauris</p>
							</a>
						</li>
						<li>
							<a href="#" class="btn slide-thumbs" id="slidethumb2" data-slide="2">
								<span>2</span>
								<h2>Planning</h2>
								<p>Vestibulum auctor dapibus</p>
							</a>
						</li>
						<li>
							<a href="#" class="btn slide-thumbs" id="slidethumb3" data-slide="3">
								<span>3</span>
								<h2>Development</h2>
								<p>Cras ornare tristique</p>
							</a>
						</li>
						<li>
							<a href="#" class="btn slide-thumbs" id="slidethumb4" data-slide="4">
								<span>4</span>
								<h2>24/7 Support</h2>
								<p>Praesent placerat risus</p>
							</a>
						</li>
					</ul>
					
				</div>
			</div>
		</div>
		<!-- End slider -->

		<!-- content 
			================================================== -->
		<div id="content">

			<!-- sevices-section section
				================================================== -->
			<div class="section-content services-section">
				<div class="title-section">
					<div class="container triggerAnimation animated" data-animate="bounceIn">
						<h1>Top reasons to work with us</h1>
						<p>Vestibulum commodo felis quis tortor.</p>
					</div>
				</div>
				<div class="services-box parallax" data-stellar-background-ratio="0">
					<div class="container">
						<div class="row">
							<div class="col-sm-3">
								<div class="services-post triggerAnimation animated" data-animate="flipInY">
									<div class="services-head">
										<a href="#" class="icon"><i class="fa fa-thumbs-o-up"></i></a>
										<h2>High Quality</h2>
										<span>Vestibulum auctor dapibus neque.</span>
									</div>
									<p>Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede. Donec nec justo eget felis facilisis  </p>
									<a href="#" class="button-one">Read More</a>
								</div>
							</div>
							<div class="col-sm-3">
								<div class="services-post triggerAnimation animated" data-animate="flipInY">
									<div class="services-head">
										<a href="#" class="icon"><i class="fa fa-tablet"></i></a>
										<h2>Responsive Design</h2>
										<span>Etetur adipiscing elit. </span>
									</div>
									<p>Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede. Donec nec justo eget felis facilisis  </p>
									<a href="#" class="button-one">Read More</a>
								</div>
							</div>
							<div class="col-sm-3">
								<div class="services-post triggerAnimation animated" data-animate="flipInY">
									<div class="services-head">
										<a href="#" class="icon"><i class="fa fa-eye"></i></a>
										<h2>Retina Ready</h2>
										<span>Cum sociis natoque penatibus et </span>
									</div>
									<p>Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede. Donec nec justo eget felis facilisis  </p>
									<a href="#" class="button-one">Read More</a>
								</div>
							</div>
							<div class="col-sm-3">
								<div class="services-post triggerAnimation animated" data-animate="flipInY">
									<div class="services-head">
										<a href="#" class="icon"><i class="fa fa-stethoscope"></i></a>
										<h2>Sales &amp; Support</h2>
										<span>Integer posuere erat a ante</span>
									</div>
									<p>Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede. Donec nec justo eget felis facilisis  </p>
									<a href="#" class="button-one">Read More</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- banner-section 
				================================================== -->
			<div class="section-content banner-section">
				<div class="container triggerAnimation animated" data-animate="bounceIn">
					<h1>Top reasons to work with us</h1>
					<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattis eros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede.</p>
					<a class="button-two" href="#"><span>Buy it now</span><i class="fa fa-angle-right"></i></a>
				</div>
			</div>

			<!-- portfolio-section 
				================================================== -->
			<div class="section-content portfolio-section">
				<div class="title-section">
					<div class="container triggerAnimation animated" data-animate="bounceIn">
						<h1>Our latest work</h1>
						<p>Vivamus molestie gravida turpis</p>
					</div>
				</div>
				<div class="portfolio-box triggerAnimation animated" data-animate="pulse">
					<div id="owl-demo" class="owl-carousel owl-theme">
          
						<div class="item project-post">
							<div class="project-gal">
								<img alt="" src="http://placehold.it/450x250">
								<div class="hover-box">
									<a class="zoom" href="http://placehold.it/450x250"><i class="fa fa-search-plus"></i></a>
									<a class="link" href="single-project.html"><i class="fa fa-link"></i></a>
								</div>
							</div>
							<div class="project-content">
								<h2>Aliquam tincidunt mauris eu risus.</h2>
								<p>Vestibulum auctor dapibus neque.</p>
							</div>
						</div>
          
						<div class="item project-post">
							<div class="project-gal">
								<img alt="" src="http://placehold.it/450x250">
								<div class="hover-box">
									<a class="zoom" href="http://placehold.it/450x250"><i class="fa fa-search-plus"></i></a>
									<a class="link" href="single-project.html"><i class="fa fa-link"></i></a>
								</div>
							</div>
							<div class="project-content">
								<h2>Aliquam tincidunt mauris eu risus.</h2>
								<p>Vestibulum auctor dapibus neque.</p>
							</div>
						</div>
          
						<div class="item project-post">
							<div class="project-gal">
								<img alt="" src="http://placehold.it/450x250">
								<div class="hover-box">
									<a class="zoom" href="http://placehold.it/450x250"><i class="fa fa-search-plus"></i></a>
									<a class="link" href="single-project.html"><i class="fa fa-link"></i></a>
								</div>
							</div>
							<div class="project-content">
								<h2>Aliquam tincidunt mauris eu risus.</h2>
								<p>Vestibulum auctor dapibus neque.</p>
							</div>
						</div>
          
						<div class="item project-post ">
							<div class="project-gal">
								<img alt="" src="http://placehold.it/450x250">
								<div class="hover-box">
									<a class="zoom" href="http://placehold.it/450x250"><i class="fa fa-search-plus"></i></a>
									<a class="link" href="single-project.html"><i class="fa fa-link"></i></a>
								</div>
							</div>
							<div class="project-content">
								<h2>Aliquam tincidunt mauris eu risus.</h2>
								<p>Vestibulum auctor dapibus neque.</p>
							</div>
						</div>
          
						<div class="item project-post">
							<div class="project-gal">
								<img alt="" src="http://placehold.it/450x250">
								<div class="hover-box">
									<a class="zoom" href="http://placehold.it/450x250"><i class="fa fa-search-plus"></i></a>
									<a class="link" href="single-project.html"><i class="fa fa-link"></i></a>
								</div>
							</div>
							<div class="project-content">
								<h2>Aliquam tincidunt mauris eu risus.</h2>
								<p>Vestibulum auctor dapibus neque.</p>
							</div>
						</div>
          
						<div class="item project-post">
							<div class="project-gal">
								<img alt="" src="http://placehold.it/450x250">
								<div class="hover-box">
									<a class="zoom" href="http://placehold.it/450x250"><i class="fa fa-search-plus"></i></a>
									<a class="link" href="single-project.html"><i class="fa fa-link"></i></a>
								</div>
							</div>
							<div class="project-content">
								<h2>Aliquam tincidunt mauris eu risus.</h2>
								<p>Vestibulum auctor dapibus neque.</p>
							</div>
						</div>
          
						<div class="item project-post">
							<div class="project-gal">
								<img alt="" src="http://placehold.it/450x250">
								<div class="hover-box">
									<a class="zoom" href="http://placehold.it/450x250"><i class="fa fa-search-plus"></i></a>
									<a class="link" href="single-project.html"><i class="fa fa-link"></i></a>
								</div>
							</div>
							<div class="project-content">
								<h2>Aliquam tincidunt mauris eu risus.</h2>
								<p>Vestibulum auctor dapibus neque.</p>
							</div>
						</div>
					 
					</div>
					<div class="buttons">
						<a class="owl-prev button-third" href="#"><i class="fa fa-angle-left"></i></a>
						<a class="button-third" href="#">See All work</a>
						<a class="owl-next button-third" href="#"><i class="fa fa-angle-right"></i></a>
					</div>
				</div>
			</div>

			<!-- features-section 
				================================================== -->
			<div class="section-content features-section parallax" data-stellar-background-ratio="0">
				<div class="container">
					<div class="features-head triggerAnimation animated" data-animate="bounceIn">
						<h1>We are committed towards our goal of delivering the best services</h1>
						<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattis eros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede.</p>
						<a class="button-two" href="#"><span>Meet the Creative Team</span></a>						
					</div>
					
					<div class="row">
						<div class="col-md-4">
							<ul class="feature-list triggerAnimation animated" data-animate="slideInLeft">
								<li>
									<span><i class="fa fa-leaf"></i></span>
									<div class="list-cont">
										<h3>Email Marketing</h3>
										<p>Donec nec justo eget felis facilisis fermentum. Aliquam porttitor mauris </p>
									</div>
								</li>
								<li>
									<span><i class="fa fa-bar-chart-o"></i></span>
									<div class="list-cont">
										<h3>Business</h3>
										<p>Donec nec justo eget felis facilisis fermentum. Aliquam porttitor mauris </p>
									</div>
								</li>
								<li>
									<span><i class="fa fa-coffee"></i></span>
									<div class="list-cont">
										<h3>Premium Design</h3>
										<p>Donec nec justo eget felis facilisis fermentum. Aliquam porttitor mauris </p>
									</div>
								</li>
							</ul>
						</div>
						<div class="col-md-4">
							<div class="image-place triggerAnimation animated" data-animate="slideInUp">
								<img src="{{ asset('resources/assets/images/dev1.png') }}" alt="">
							</div>
						</div>
						<div class="col-md-4">
							<ul class="feature-list triggerAnimation animated" data-animate="slideInRight">
								<li>
									<span><i class="fa fa-heart"></i></span>
									<div class="list-cont">
										<h3>Made with Love</h3>
										<p>Donec nec justo eget felis facilisis fermentum. Aliquam porttitor mauris </p>
									</div>
								</li>
								<li>
									<span><i class="fa fa-cog"></i></span>
									<div class="list-cont">
										<h3>Clean Design</h3>
										<p>Donec nec justo eget felis facilisis fermentum. Aliquam porttitor mauris </p>
									</div>
								</li>
								<li>
									<span><i class="fa fa-trophy"></i></span>
									<div class="list-cont">
										<h3>Psd Theme</h3>
										<p>Donec nec justo eget felis facilisis fermentum. Aliquam porttitor mauris </p>
									</div>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>

			<!-- statistic-section 
				================================================== -->
			<div class="section-content statistic-section parallax" data-stellar-background-ratio="0">
				<div class="container">
					<div class="statistic-box triggerAnimation animated" data-animate="shake">
						<div class="row">
							<div class="col-md-3 col-sm-6">
								<div class="statistic-post">
									<div class="statistic-counter">
										<i class="fa fa-heart-o"></i>
										<p><span class="timer" data-from="0" data-to="500"></span></p>
										<p>Finished Projects</p>
									</div>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="statistic-post">
									<div class="statistic-counter">
										<i class="fa fa-bell-o"></i>
										<p><span class="timer" data-from="0" data-to="68"></span></p>
										<p>Awards Won</p>
									</div>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="statistic-post">
									<div class="statistic-counter">
										<i class="fa fa-star-o"></i>
										<p><span class="timer" data-from="0" data-to="450"></span></p>
										<p>Happy Customers</p>
									</div>
								</div>
							</div>
							<div class="col-md-3 col-sm-6">
								<div class="statistic-post">
									<div class="statistic-counter">
										<i class="fa fa-moon-o"></i>
										<p><span class="timer" data-from="0" data-to="840"></span></p>
										<p>Design Ideas</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>

			<!-- blog-section 
				================================================== -->
			<div class="section-content blog-section">
				<div class="title-section">
					<div class="container triggerAnimation animated" data-animate="bounceIn">
						<h1>Latest Post</h1>
						<p>Vivamus molestie gravida turpis</p>
					</div>
				</div>
				<div class="container triggerAnimation animated" data-animate="fadeInUp">
					<div id="owl-demo2" class="owl-carousel owl-theme">
          
						<div class="item blog-post">
							<img alt="" src="http://placehold.it/300x250">
							<div class="post-content">
								<div class="post-date">
									<p><span>22</span>apr</p>
								</div>
								<div class="content-data">
									<h2><a href="single-post.html">Aliquam tincidunt mauris eu risus.</a></h2>
									<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
								</div>
							</div>
						</div>
          
						<div class="item blog-post">
							<img alt="" src="http://placehold.it/300x250">
							<div class="post-content">
								<div class="post-date">
									<p><span>18</span>apr</p>
								</div>
								<div class="content-data">
									<h2><a href="single-post.html">Vestibulum auctor dapibus neque</a></h2>
									<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
								</div>
							</div>
						</div>
          
						<div class="item blog-post">
							<img alt="" src="http://placehold.it/300x250">
							<div class="post-content">
								<div class="post-date">
									<p><span>05</span>apr</p>
								</div>
								<div class="content-data">
									<h2><a href="single-post.html">Cras ornare tristique elit</a></h2>
									<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
								</div>
							</div>
						</div>
          
						<div class="item blog-post">
							<img alt="" src="http://placehold.it/300x250">
							<div class="post-content">
								<div class="post-date">
									<p><span>17</span>apr</p>
								</div>
								<div class="content-data">
									<h2><a href="single-post.html">Aliquam tincidunt mauris eu risus.</a></h2>
									<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
								</div>
							</div>
						</div>
          
						<div class="item blog-post">
							<img alt="" src="http://placehold.it/300x250">
							<div class="post-content">
								<div class="post-date">
									<p><span>29</span>apr</p>
								</div>
								<div class="content-data">
									<h2><a href="single-post.html">Aliquam tincidunt mauris eu risus.</a></h2>
									<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
								</div>
							</div>
						</div>
          
						<div class="item blog-post">
							<img alt="" src="http://placehold.it/300x250">
							<div class="post-content">
								<div class="post-date">
									<p><span>06</span>apr</p>
								</div>
								<div class="content-data">
									<h2><a href="single-post.html">Aliquam tincidunt mauris eu risus.</a></h2>
									<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
								</div>
							</div>
						</div>
					 
					</div>
					<div class="buttons">
						<a class="owl-prev button-third" href="#"><i class="fa fa-angle-left"></i></a>
						<a class="button-third" href="#">See All Posts</a>
						<a class="owl-next button-third" href="#"><i class="fa fa-angle-right"></i></a>
					</div>
				</div>
			</div>

			<!-- client-section 
				================================================== -->
			<div class="section-content client-section">
				<div class="title-section">
					<div class="container triggerAnimation animated" data-animate="bounceIn">
						<h1>Our Prestigious clients</h1>
						<p>Praesent placerat risus quis eros.</p>
					</div>
				</div>
				<div class="container triggerAnimation animated" data-animate="shake">
					<ul class="bxslider">
						<li>
							<ul class="client-list">
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client1.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client2.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client3.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client4.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client5.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client6.png') }}"></a></li>
							</ul>
						</li>
						<li>
							<ul class="client-list">
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client1.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client2.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client3.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client4.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client5.png') }}"></a></li>
								<li><a href="#"><img alt="" src="{{ asset('resources/assets/images/client6.png') }}"></a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>

		</div>
		<!-- End content -->
@stop

@section('javascript')
	
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.migrate.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/owl.carousel.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.magnific-popup.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.bxslider.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.appear.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.countTo.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/bootstrap.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.imagesloaded.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/retina-1.1.0.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/plugins-scroll.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/waypoint.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.stellar.min.js') }}"></script>

    <!-- SLIDER REVOLUTION 4.x SCRIPTS  -->
    <script type="text/javascript" src="{{ asset('resources/assets/js/jquery.themepunch.plugins.min.js') }}"></script>
    <script type="text/javascript" src="{{ asset('resources/assets/js/jquery.themepunch.revolution.min.js') }}"></script>
@stop
