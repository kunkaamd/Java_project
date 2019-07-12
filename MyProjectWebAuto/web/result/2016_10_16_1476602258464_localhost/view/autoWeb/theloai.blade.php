@extends('autoWeb.masterpage.masterpage')
<!doctype html>
<html lang="en" class="no-js" ng-app="theloaiApp" ng-controller="theloaiController">
@section('head')
	<title>theloai</title>
	<script src="{{ asset('resources/assets/angularjs/autoWeb/theloaiApp.js') }}"></script>
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/owl.carousel.css') }}" media="screen">
        <link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/owl.theme.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/jquery.bxslider.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/magnific-popup.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/font-awesome.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/animate.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/settings.css') }}" media="screen" />
@stop
@section('content')
		<!-- content 
			================================================== -->
		<div id="content">
			<!-- page-banner 
				================================================== -->
			<div class="section-content page-banner portfolio-page-banner">
				<div class="container">
					<h1>Category</h1>
				</div>
			</div>
			<!-- portfolio-section 
				================================================== -->
			<div class="section-content portfolio-section">
				<div class="title-section white">
					<div class="container triggerAnimation animated" data-animate="bounceIn">
						<h1>Portfolio three columns</h1>
						<p>Cras iaculis ultricies nulla.</p>
					</div>
				</div>
				<div class="portfolio-box">
					<ul class="filter triggerAnimation animated" data-animate="bounceIn">
						<li><a href="#" class="active" data-filter="*">All</a></li>
						<li><a href="#" data-filter=".web-design">Web Design</a></li>
						<li><a href="#" data-filter=".photography">Photography</a></li>
						<li><a href="#" data-filter=".illustration">Illustration</a></li>
						<li><a href="#" data-filter=".branding">Branding</a></li>
					</ul>

					<div class="masonry four-col triggerAnimation animated" data-animate="bounceIn">
						<div class="project-post web-design branding" style="display: inline-block;" ng-repeat="item in theloai">
							<div class="project-gal">
								<div class="hover-box">
									<a class="zoom" href=""><i class="fa fa-search-plus"></i></a>
									<a class="link" href="sanpham?id=@{{item.id}}"><i class="fa fa-link"></i></a>
								</div>
							</div>
							<div class="project-content">
								<h2>@{{item.name}}</h2>
								<p>@{{item.name}}</p>
							</div>
						</div>

						<div class="project-post web-design branding">
							<div class="project-gal">
								<img alt="" src="http://placehold.it/400x250">
								<div class="hover-box">
									<a class="zoom" href="http://placehold.it/400x250"><i class="fa fa-search-plus"></i></a>
									<a class="link" href="#"><i class="fa fa-link"></i></a>
								</div>
							</div>
							<div class="project-content">
								<h2>Aliquam tincidunt mauris eu risus.</h2>
								<p>Vestibulum auctor dapibus neque.</p>
							</div>
						</div>
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
