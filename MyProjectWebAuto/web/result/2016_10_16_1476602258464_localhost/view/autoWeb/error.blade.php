@extends('autoWeb.masterpage.masterpage')
<!doctype html>
<html lang="en" class="no-js">
@section('head')
	<title>404 Errors</title>
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/owl.carousel.css') }}" media="screen">
    <link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/owl.theme.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/flexslider.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/magnific-popup.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/font-awesome.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/animate.css') }}" media="screen">
@stop
@section('content')
			<!-- page-banner 
				================================================== -->
			<div class="section-content page-banner error-page-banner">
				<div class="container">
					<h1>Page not found</h1>
				</div>
			</div>

			<!-- contact section 
				================================================== -->
			<div class="section-content error-section">
				<div class="error">
					<div class="container triggerAnimation animated" data-animate="tada">
						<span>404</span>
					</div>
				</div>
				<div class="error-content triggerAnimation animated" data-animate="bounceIn">
					<div class="container">
						<h1>The page you were looking for doesn't exist...</h1>
						<p>Vestibulum commodo felis quis tortor. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede. Donec odio. Quisque volutpat mattis eros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede.</p>
						<a href="index.html" class="button-third">Back to Home</a>						
					</div>
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
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.isotope.min.js') }}"></script>
@stop
