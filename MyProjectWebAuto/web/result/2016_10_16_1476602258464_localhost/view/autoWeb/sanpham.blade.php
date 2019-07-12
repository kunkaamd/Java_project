@extends('autoWeb.masterpage.masterpage')
<!doctype html>
<html lang="en" class="no-js" ng-app="sanphamApp" ng-controller="sanphamController">
@section('head')
	<title>@{{sanpham.name}}</title>
	<script src="{{ asset('resources/assets/angularjs/autoWeb/sanphamApp.js') }}"></script>
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/flexslider.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/font-awesome.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/animate.css') }}" media="screen">
@stop
@section('content')

		<!-- content 
			================================================== -->
		<div id="content">

			<!-- page-banner 
				================================================== -->
			<div class="section-content page-banner blog-page-banner">
				<div class="container">
					<h1>Product</h1>
				</div>
			</div>

			<!-- blog-section 
				================================================== -->
			<div class="section-content blog-section with-sidebar">
				<div class="container">
          			<div class="blog-box">
          				<div class="row">
          					<div class="col-md-3">
          						<div class="sidebar triggerAnimation animated" data-animate="slideInUp">
          							<div class="search-widget widget">
										<form>
											<input type="search" placeholder="Search:"/>
											<button type="submit">
												<i class="fa fa-search"></i>
											</button>
										</form>
									</div>
          							<div class="category-widget widget">
										<h3>Category</h3>
										<ul class="category-list">
											<li><a href="#">Design</a></li>
											<li><a href="#">Photos</a></li>
											<li><a href="#">Videos</a></li>
											<li><a href="#">Lifestyle</a></li>
											<li><a href="#">Technology</a></li>
										</ul>
									</div>
          							<div class="popular-widget widget">
										<h3>Popular Post</h3>
										<ul class="popular-list">
											<li>
												<img alt="" src="http://placehold.it/60x60">
												<div class="side-content">
													<h2><a href="single-post.html">Alius est amet cons tanter finis </a></h2>
													<p>April 27, 2014</p>
												</div>
											</li>
											<li>
												<img alt="" src="http://placehold.it/60x60">
												<div class="side-content">
													<h2><a href="single-post.html">Probo artium studiose rosa </a></h2>
													<p>April 27, 2014</p>
												</div>
											</li>
											<li>
												<img alt="" src="http://placehold.it/60x60">
												<div class="side-content">
													<h2><a href="single-post.html">Alius est amet cons tanter finis </a></h2>
													<p>April 27, 2014</p>
												</div>
											</li>
										</ul>
									</div>
          							<div class="text-widget widget">
										<h3>Text Widget</h3>
										<p>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. </p>
									</div>
          							<div class="category-widget widget">
										<h3>Archives</h3>
										<ul class="category-list">
											<li><a href="#">April 2013</a></li>
											<li><a href="#">December 2013</a></li>
											<li><a href="#">Octomber 2012</a></li>
											<li><a href="#">November 2012</a></li>
											<li><a href="#">March 2014</a></li>
										</ul>
									</div>
          							<div class="tags-widget widget">
										<h3>Tags</h3>
										<ul class="tags-list">
											<li><a href="#">business</a></li>
											<li><a href="#">design</a></li>
											<li><a href="#">art</a></li>
											<li><a href="#">html5</a></li>
											<li><a href="#">photoshop</a></li>
											<li><a href="#">audio</a></li>
											<li><a href="#">development</a></li>
											<li><a href="#">service</a></li>
										</ul>
									</div>
          						</div>
          					</div>
          					<div class="col-md-9">
          						<div class="blog-post triggerAnimation animated" data-animate="slideInUp" ng-repeat="item in sanpham">
								<img alt="" src="public/uploads/@{{item.hinhanh}}">

									<div class="post-content">
										<div class="post-date">
											<p><span>22</span>apr</p>
										</div>
										<div class="content-data">
											<h2><a href="sanphamdetail?id=@{{item.id}}">@{{item.name}}</a></h2>
											<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
										</div>
										<p>@{{item.name}}</p>
										<a class="button-third" href="sanphamdetail?id=@{{item.id}}">Read More</a>
									</div>
								</div>
          						<div class="blog-post triggerAnimation animated" data-animate="slideInUp">
									<img alt="" src="http://placehold.it/640x310">
									<div class="post-content">
										<div class="post-date">
											<p><span>22</span>apr</p>
										</div>
										<div class="content-data">
											<h2><a href="single-post.html">Aliquam tincidunt mauris eu risus.</a></h2>
											<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
										</div>
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattis eros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede.</p>
										<a class="button-third" href="#">Read More</a>
									</div>
								</div>
          						<div class="blog-post triggerAnimation animated" data-animate="slideInUp">
									<div class="flexslider">
										<ul class="slides">
											<li>
												<img alt="" src="http://placehold.it/640x310" />
											</li>
											<li>
												<img alt="" src="http://placehold.it/640x310" />
											</li>
											<li>
												<img alt="" src="http://placehold.it/640x310" />
											</li>
										</ul>
									</div>
									<div class="post-content">
										<div class="post-date">
											<p><span>22</span>apr</p>
										</div>
										<div class="content-data">
											<h2><a href="single-post.html">Aliquam tincidunt mauris eu risus.</a></h2>
											<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
										</div>
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattis eros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede.</p>
										<a class="button-third" href="#">Read More</a>
									</div>
								</div>
								
          						<div class="blog-post triggerAnimation animated" data-animate="slideInUp">
									<!-- Vimeo -->
									<iframe class="videoembed" src="http://player.vimeo.com/video/22884674?title=0&amp;byline=0&amp;portrait=0" frameborder="0" webkitallowfullscreen="" mozallowfullscreen="" allowfullscreen=""></iframe>
									<!-- End Vimeo -->
									<div class="post-content">
										<div class="post-date">
											<p><span>22</span>apr</p>
										</div>
										<div class="content-data">
											<h2><a href="single-post.html">Aliquam tincidunt mauris eu risus.</a></h2>
											<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
										</div>
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattis eros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede.</p>
										<a class="button-third" href="#">Read More</a>
									</div>
								</div>
          						<div class="blog-post triggerAnimation animated" data-animate="slideInUp">
									<div class="post-content">
										<div class="post-date">
											<p><span>22</span>apr</p>
										</div>
										<div class="content-data">
											<h2><a href="single-post.html">Aliquam tincidunt mauris eu risus.</a></h2>
											<p>By: <a href="#">Admin</a> | <a href="#">05 Comments</a></p>
										</div>
										<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec odio. Quisque volutpat mattis eros. Nullam malesuada erat ut turpis. Suspendisse urna nibh, viverra non, semper suscipit, posuere a, pede.</p>
										<a class="button-third" href="#">Read More</a>
									</div>
								</div>
								<div class="pagination-box">
									<a class="button-third prev" href="#">Prev</a>
									<a class="button-third next" href="#">Next</a>
								</div>
          					</div>
          				</div>
					 
					</div>
          		</div>
          		<a class="go-top" href="#"><i class="fa fa-arrow-circle-o-up"></i></a>
			</div>


		</div>
		<!-- End content -->
@stop
@section('javascript')

	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.migrate.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.magnific-popup.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.bxslider.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.flexslider.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.appear.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.stellar.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/bootstrap.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.imagesloaded.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/jquery.isotope.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/retina-1.1.0.min.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/plugins-scroll.js') }}"></script>
	<script type="text/javascript" src="{{ asset('resources/assets/js/waypoint.min.js') }}"></script>
@stop
