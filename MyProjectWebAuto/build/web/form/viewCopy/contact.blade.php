@extends('autoWeb.masterpage.masterpage')
<!doctype html>
<html lang="en" class="no-js">
@section('head')
	<link rel="stylesheet" type="text/css" href="{{ asset('css/owl.carousel.css') }}" media="screen">
    <link rel="stylesheet" type="text/css" href="{{ asset('css/owl.theme.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('css/flexslider.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('css/magnific-popup.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('css/font-awesome.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('css/animate.css') }}" media="screen">
	<title>Contact</title>
@stop
@section('content')
		<!-- content 
			================================================== -->
		<div id="content">

			<!-- page-banner 
				================================================== -->
			<div class="section-content page-banner contact-page-banner">
				<div class="container">
					<h1>Contact</h1>
				</div>
			</div>

			<!-- contact section 
				================================================== -->
			<div class="section-content contact-section">
				<div class="title-section">
					<div class="container triggerAnimation animated" data-animate="bounceIn">
						<h1>Get in Touch</h1>
						<p>Vestibulum commodo felis quis tortor.</p>
					</div>
				</div>
				<div class="map triggerAnimation animated" data-animate="slideInLeft">
					<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3834.7606810563625!2d108.20955972417177!3d16.025968875544102!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3142198cbe7c426f%3A0xa5e532ad7a4fef82!2zVHLhu4tuaCDEkMOsbmggVGjhuqNvLCBLaHXDqiBUcnVuZywgQ-G6qW0gTOG7hywgxJDDoCBO4bq1bmcsIFZp4buHdCBOYW0!5e0!3m2!1svi!2s!4v1466485949591" width="1354" height="330" frameborder="0" style="border:0" allowfullscreen></iframe>
				</div>
				<div class="contact-info triggerAnimation animated" data-animate="flipInX">
					<div class="container">
						<div class="row">
							<div class="col-md-4">
								<a href="#"><i class="fa fa-map-marker"></i></a>
								<h2>Address</h2>
								<p>
									<span>795 Fake Ave, Door 6</span>
									<span>Wonderland, CA 94107, USA</span>
								</p>
							</div>
							<div class="col-md-4">
								<a href="#"><i class="fa fa-phone"></i></a>
								<h2>Telephone</h2>
								<p>
									<span>Phone: +351123456789</span>
									<span>Fax: +351987654321</span>
								</p>
							</div>
							<div class="col-md-4">
								<a href="#"><i class="fa fa-envelope-o"></i></a>
								<h2>Email</h2>
								<p>
									<span>info@marble.com</span>
									<span>support@marble.com</span>
								</p>
							</div>
						</div>
					</div>
				</div>
				<div class="contact-area">
					<div class="title-section">
						<div class="container triggerAnimation animated" data-animate="bounceIn">
							<h1>Send a message</h1>
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.</p>
						</div>
					</div>
					<form id="contact-form">
						<div class="container triggerAnimation animated" data-animate="rollIn">
							<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattis eros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede.</p>
							<div class="row">
								<div class="col-md-4">
									<input name="name" id="name" type="text" placeholder="Name (required)">
								</div>
								<div class="col-md-4">
									<input name="mail" id="mail" type="text" placeholder="Email (required)">
								</div>
								<div class="col-md-4">
									<input name="website" id="website" type="text" placeholder="Website">
								</div>
							</div>
							<textarea name="comment" id="comment" placeholder="Your Message (required)"></textarea>
							<div class="submit-area">
								<input type="submit" id="submit_contact" value="Submit">
								<div id="msg" class="message"></div>								
							</div>
						</div>
					</form>
				</div>

			</div>

		</div>
		<!-- End content -->
@stop
@section('javascript')
	<script type="text/javascript" src="{{ asset('js/jquery.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/jquery.migrate.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/owl.carousel.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/jquery.magnific-popup.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/jquery.bxslider.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/jquery.appear.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/jquery.countTo.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/bootstrap.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/jquery.imagesloaded.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/retina-1.1.0.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/plugins-scroll.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/waypoint.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/jquery.stellar.min.js') }}"></script>
	
    <!-- SLIDER REVOLUTION 4.x SCRIPTS  -->
    <script type="text/javascript" src="{{ asset('js/jquery.themepunch.plugins.min.js') }}"></script>
    <script type="text/javascript" src="{{ asset('js/jquery.themepunch.revolution.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('js/jquery.isotope.min.js') }}"></script>
@stop
