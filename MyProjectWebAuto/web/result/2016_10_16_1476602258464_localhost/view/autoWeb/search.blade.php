@extends('autoWeb.masterpage.masterpage')
<!doctype html>
<html lang="en" class="no-js" ng-app="SearchApp" ng-controller="SearchController">
@section('head')
	<title></title>
	<script src="{{ asset('resources/assets/angularjs/autoWeb/SearchApp.js') }}"></script>
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/flexslider.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/font-awesome.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/animate.css') }}" media="screen">
	<link rel="stylesheet" type="text/css" href="{{ asset('resources/assets/css/my-search.css') }}" media="screen">
@stop
@section('content')
		<!-- content 
			================================================== -->
		<div id="content">
			<!-- page-banner 
				================================================== -->
			<div class="section-content page-banner blog-page-banner">
				<div class="container">
					<h1>Search</h1>
				</div>
			</div>
			<div class="container">
			    <hgroup class="mb20">
                                <h2 class="lead"><strong class="text-danger">3</strong> results were found for the search for <strong class="text-danger">Lorem</strong></h2>								
                            </hgroup>
			    <section class="col-xs-12 col-sm-6 col-md-12">
<article class="search-result row" ng-repeat="item in theloai">
                                        <div class="col-xs-12 col-sm-12 col-md-3">
                                            <a href="#" title="Lorem ipsum" class="thumbnail"></a>
                                        </div>
                                        <div class="col-xs-12 col-sm-12 col-md-2">
                                            <ul class="meta-search">
                                                <li><i class="fa fa-calendar"></i> <span>02/15/2014</span></li>
                                                <li><i class="fa fa-clock-o"></i> <span>4:28 pm</span></li>
                                                <li><i class="fa fa-tags"></i> <span>People</span></li>
                                            </ul>
                                        </div>
                                        <div class="col-xs-12 col-sm-12 col-md-7 excerpet">
                                            <h3><a href="#" title="">@{{item.name}}</a></h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem, exercitationem, suscipit, distinctio, qui sapiente aspernatur molestiae non corporis magni sit sequi iusto debitis delectus doloremque.</p>						
                                            <span class="plus"><a href="#" title="Lorem ipsum"><i class="glyphicon glyphicon-plus"></i></a></span>
                                        </div>
                                        <span class="clearfix borda"></span>
                                   </article><article class="search-result row" ng-repeat="item in theloai">
                                        <div class="col-xs-12 col-sm-12 col-md-3">
                                            <a href="#" title="Lorem ipsum" class="thumbnail">								<img alt="" src="public/uploads/@{{sanpham.hinhanh}}">
</a>
                                        </div>
                                        <div class="col-xs-12 col-sm-12 col-md-2">
                                            <ul class="meta-search">
                                                <li><i class="fa fa-calendar"></i> <span>02/15/2014</span></li>
                                                <li><i class="fa fa-clock-o"></i> <span>4:28 pm</span></li>
                                                <li><i class="fa fa-tags"></i> <span>People</span></li>
                                            </ul>
                                        </div>
                                        <div class="col-xs-12 col-sm-12 col-md-7 excerpet">
                                            <h3><a href="#" title="">@{{item.name}}</a></h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem, exercitationem, suscipit, distinctio, qui sapiente aspernatur molestiae non corporis magni sit sequi iusto debitis delectus doloremque.</p>						
                                <span class="plus"><a href="#" title="Lorem ipsum"><i class="glyphicon glyphicon-plus"></i></a></span>
                                        </div>
                                        <span class="clearfix borda"></span>
                                </article>
                                <article class="search-result row" ng-repeat="item in Lophoc">
                                        <div class="col-xs-12 col-sm-12 col-md-3">
                                            <a href="#" title="Lorem ipsum" class="thumbnail"><img src="http://lorempixel.com/250/140/people" alt="Lorem ipsum" /></a>
                                        </div>
                                        <div class="col-xs-12 col-sm-12 col-md-2">
                                            <ul class="meta-search">
                                                <li><i class="fa fa-calendar"></i> <span>02/15/2014</span></li>
                                                <li><i class="fa fa-clock-o"></i> <span>4:28 pm</span></li>
                                                <li><i class="fa fa-tags"></i> <span>People</span></li>
                                            </ul>
                                        </div>
                                        <div class="col-xs-12 col-sm-12 col-md-7 excerpet">
                                            <h3><a href="#" title="">Voluptatem, exercitationem, suscipit, distinctio</a></h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Voluptatem, exercitationem, suscipit, distinctio, qui sapiente aspernatur molestiae non corporis magni sit sequi iusto debitis delectus doloremque.</p>						
                                <span class="plus"><a href="#" title="Lorem ipsum"><i class="glyphicon glyphicon-plus"></i></a></span>
                                        </div>
                                        <span class="clearfix borda"></span>
                                </article>
                            </section>
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
