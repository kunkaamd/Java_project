<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<script type="text/javascript" src="{{ asset('resources/assets/angularjs/angular.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/angularjs/angular-sanitize.min.js') }}"></script>
	@yield('head')
	<link href='http://fonts.googleapis.com/css?family=Raleway:400,500,600,700,300,100,200' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/bootstrap.css') }}" media="screen">	
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/style.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/login.css') }}">
</head>
<body>

	<!-- Container -->
	<div id="container">
		<!-- Header
		    ================================================== -->
		<header class="clearfix">
			<!-- Static navbar -->
			<div class="navbar navbar-default navbar-fixed-top">			
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="{{url('home')}}"><img alt="" src="{{ asset('resources/assets/images/logo.png') }}"></a>
					</div>
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav navbar-right">
							<li class="drop"><a class="active" href="{{url('home')}}">Home</a>
							</li>
							<li class="drop"><a href="#">Features</a>
								<ul class="drop-down">
									<li><a href="about.html">About us</a></li>
									<li><a href="services.html">Services</a></li>
									<li><a href="testimonials.html">Testimonials</a></li>
									<li><a href="faqs.html">Faqs</a></li>
									<li><a href="error.html">404 Error</a></li>
									<li class="drop"><a href="#">Go Level 3</a>
										<ul class="drop-down level3">
											<li><a href="#">Level 3</a></li>
											<li><a href="#">Level 3</a></li>
											<li><a href="#">Level 3</a></li>
											<li><a href="#">Level 3</a></li>
										</ul>
									</li>
								</ul>
							</li>

							<li><a href="<?php echo $nametable ?>"><?php echo $nametable ?></a>
							</li>
							<li><a href="portfolio.html">Portfolio</a>
								<ul class="drop-down">
									<li><a href="portfolio.html">3 Colums</a></li>
									<li><a href="portfolio-4col.html">4 Colums</a></li>
									<li><a href="portfolio-4col-vers2.html">4 Colums - vers2</a></li>
									<li><a href="portfolio-5col.html">5 Colums</a></li>
									<li><a href="single-project.html">Single Project</a></li>
								</ul>
							</li>
							
							@if(Auth::check())
								<li><a href="#">{{Auth::user()->name}}</a>
									<ul class="drop-down">
										<li><a href="{{url('signout')}}">Logout</a></li>
									</ul>
								</li>
							@else
								<li><a href="#" data-toggle="modal" data-target="#login-modal">Sign In</a></li>
							@endif
							<li><a href="contact">Contact</a></li>
							<li class="drop"><a href="#" class="open-search"><i class="fa fa-search"></i></a>
								<form class="form-search" action="Search" method="get">
									<input type="search" name="search" placeholder="Search:"/>
									<button type="submit">
										<i class="fa fa-search"></i>
									</button>
								</form>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</header>
		
		<!-- End Header -->
		@yield('content')
		<!-- footer 
			================================================== -->
		<footer>
			<div class="social-section">
				<ul class="social-icons triggerAnimation animated" data-animate="tada">
					<li><a class="facebook" href="#"><i class="fa fa-facebook"></i></a></li>
					<li><a class="twitter" href="#"><i class="fa fa-twitter"></i></a></li>
					<li><a class="rss" href="#"><i class="fa fa-rss"></i></a></li>
					<li><a class="google" href="#"><i class="fa fa-google-plus"></i></a></li>
					<li><a class="linkedin" href="#"><i class="fa fa-linkedin"></i></a></li>
					<li><a class="pinterest" href="#"><i class="fa fa-pinterest"></i></a></li>
				</ul>
			</div>
			<div class="up-footer">
				<div class="container">
					<div class="row">

						<div class="col-md-3">
							<div class="widget footer-widget text-widget">
								<h1>About</h1>
								<p>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. </p>
								<p>Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. </p>
								<img src="{{ asset('resources/assets/images/footer-logo.png') }}" alt="">
							</div>
						</div>

						<div class="col-md-3">
							<div class="widget footer-widget tweets-widget">
								<h1>Recent Tweets</h1>
								<ul>
									<li>
										<i class="fa fa-twitter"></i>
										<p>Photoshop to CSS3 magic - CSS Hat - <a href="#">http://t.co/ad2CggDN</a> </p>
										<span>15 June 2012</span>
									</li>
									<li>
										<i class="fa fa-twitter"></i>
										<p>CrossFit Advanced - another well done website, featured on CSSLuxury -  <a href="#">http://t.co/ad2CggDN</a> </p>
										<span>15 June 2012</span>
									</li>
								</ul>
							</div>
						</div>

						<div class="col-md-3">
							<div class="widget footer-widget flickr-widget">
								<h1>Flickr Stream</h1>
								<ul class="flickr">
									<li><a href="#"><img alt="" src="http://placehold.it/70x70"></a></li>
									<li><a href="#"><img alt="" src="http://placehold.it/70x70"></a></li>
									<li><a href="#"><img alt="" src="http://placehold.it/70x70"></a></li>
									<li><a href="#"><img alt="" src="http://placehold.it/70x70"></a></li>
									<li><a href="#"><img alt="" src="http://placehold.it/70x70"></a></li>
									<li><a href="#"><img alt="" src="http://placehold.it/70x70"></a></li>
									<li><a href="#"><img alt="" src="http://placehold.it/70x70"></a></li>
									<li><a href="#"><img alt="" src="http://placehold.it/70x70"></a></li>
									<li><a href="#"><img alt="" src="http://placehold.it/70x70"></a></li>
								</ul>
							</div>							
						</div>

						<div class="col-md-3">
							<div class="widget footer-widget subscribe-widget">
								<h1>Subscribe</h1>
								<p>Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. </p>
								<form class="subscribe-form">
									<input type="text" id="e-mail" name="e-mail" placeholder="Email Address"/>
									<input type="submit" id="submit" value="submit"/>
								</form>
							</div>							
						</div>

					</div>
					<div class="footer-line">
						<p>Copyright 2016. Autoweb All rights reserved.</p>
					</div>
				</div>
			</div>

		</footer>
		<!-- End footer -->
		
		@include('autoWeb.include.login_register_model')

	</div>
	<!-- End Container -->

	
    @yield('javascript')
	<script type="text/javascript" src="{{ asset('resources/assets/js/script.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/login.js') }}"></script>

	<!-- THE SCRIPT INITIALISATION -->
	<!-- LOOK THE DOCUMENTATION FOR MORE INFORMATIONS -->
	@if(count($errors)>0)
    	<script type="text/javascript">
    		$('#login-modal').modal('show');
    	</script>
    @endif
	<script type="text/javascript">

		var revapi;

		jQuery(document).ready(function() {

			   revapi = jQuery('.tp-banner').revolution(
				{
					delay:9000,
					startwidth:1170,
					startheight:738,
					hideThumbs:10,
					fullWidth:"on",
					forceFullWidth:"on",
					navigationType:"none",
					navigationArrows:"none",
					onHoverStop:"off"
				});

			   var slideThumb = $('.slide-thumbs');

				slideThumb.on('click', function(){
					var btn = $(this);
					revapi.revshowslide(btn.data('slide'));

				});
				revapi.bind("revolution.slide.onchange", function (e,data) {
					slideThumb.parent('li').removeClass('active');
					$('#slidethumb' + data.slideIndex).parent('li').addClass('active');
				});

		});	//ready

	</script>

	<!-- END REVOLUTION SLIDER -->
	
</body>
</html>