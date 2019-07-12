@extends('autoWeb.masterpage.masterpage')
<!doctype html>
<html lang="en" class="no-js" ng-app="sanphamDetailApp" ng-controller="sanphamDetailController">
@section('head')
	<title>@{{sanpham.name}}</title>
	<script src="{{ asset('resources/assets/angularjs/autoWeb/sanphamDetailApp.js') }}"></script>
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/owl.carousel.css') }}" media="screen">
        <link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/owl.theme.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/flexslider.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/magnific-popup.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/font-awesome.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/animate.css') }}" media="screen">
@stop
@section('content')
		<!-- content 
			================================================== -->
		<div id="content">

			<!-- page-banner 
				================================================== -->
			<div class="section-content page-banner portfolio-page-banner">
				<div class="container">
					<h1>Portfolio</h1>
				</div>
			</div>

			<!-- single project -section 
				================================================== -->
			<div class="single-project">
				<div class="title-section white">
					<div class="container triggerAnimation animated" data-animate="bounceIn">
						<h1>Single Project</h1>
						<p>Vivamus molestie gravida turpis</p>
					</div>
				</div>
				<div class="container">
					<div class="row">
						<div class="col-md-8">
							<div class="project-block triggerAnimation animated" data-animate="slideInLeft">
				<div class="flexslider">
									<ul class="slides">
										<li>
								<img alt="" src="public/uploads/@{{sanpham.hinhanh}}">

										</li>
										<li>
											<img alt="" src="http://placehold.it/450x250" />
										</li>
										<li>
											<img alt="" src="http://placehold.it/450x250" />
										</li>
									</ul>
								</div>
								<div class="single-project-content">
									<h1>sanpham.name</h1>
									@{{sanpham.gia}}
<img alt="" src="public/uploads/@{{sanpham.hinhanh}}" />
@{{sanpham.mota}}
@{{sanpham.soluong}}

								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="project-sidebar triggerAnimation animated" data-animate="slideInRight">
								<ul class="project-photos">
									<li>
										<img alt="" src="http://placehold.it/150x160">
										<a class="hover" href="#"></a>
									</li>
									<li>
										<img alt="" src="http://placehold.it/150x160">
										<a class="hover" href="#"></a>
									</li>
									<li>
										<img alt="" src="http://placehold.it/150x160">
										<a class="hover" href="#"></a>
									</li>
									<li>
										<img alt="" src="http://placehold.it/150x160">
										<a class="hover" href="#"></a>
									</li>
								</ul>
								<h1>Project details</h1>
								<h3>Quisque volutpat mattis eros. </h3>
								<p>Categories: <span>illustration,</span> <span>Branding</span></p>
								<p>Client:  <span>John Doe</span></p>
								<p>Link: <a href="#">http://marble.com</a></p>
								<a href="#" class="button-third">View Project</a>
							</div>
						</div>
					</div>					
				</div>
			</div>

			<!-- portfolio-section 
				================================================== -->
			<div class="section-content portfolio-section">
				<div class="title-section">
					<div class="container triggerAnimation animated" data-animate="bounceIn">
						<h1>Related projects</h1>
						<p>Vivamus molestie gravida turpis</p>
					</div>
				</div>
				<div class="portfolio-box triggerAnimation animated" data-animate="bounceIn">
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

		</div>
		<!-- End content -->
@stop
@section('javascript')
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.migrate.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/owl.carousel.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.flexslider.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.magnific-popup.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.appear.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/bootstrap.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.imagesloaded.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/retina-1.1.0.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/plugins-scroll.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/waypoint.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/script.js') }}"></script>
@stop
