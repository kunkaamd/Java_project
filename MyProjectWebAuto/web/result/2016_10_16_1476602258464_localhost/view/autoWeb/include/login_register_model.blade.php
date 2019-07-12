<div class="modal fade" id="login-modal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: none;">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<div class="panel-heading">
                    <h3 class="panel-title"><i class="fa fa-lock" aria-hidden="true"></i>Your Site</h3>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close" style="margin-top:-21px;">
						<span class="fa fa-times" aria-hidden="true"></span>
					</button>
				</div>
			</div>
            <!-- Begin # DIV Form -->
            <div id="div-forms">
            
                <!-- Begin # Login Form -->
                <form id="login-form" action="{{url('/signin')}}" method="POST">
                <input type="hidden" name="_token" value="{{ csrf_token() }}">
	                <div class="modal-body">
			    		<div id="div-login-msg">
                            <div id="icon-login-msg" class="fa fa-chevron-right" aria-hidden="true"></div>
                            <span id="text-login-msg">Type your username and password.</span>
                        </div>
			    		<input id="login_username" class="form-control" type="text" placeholder="Username (type ERROR for error effect)" name="email" required>
			    		<input id="login_password" class="form-control" type="password" name="password" placeholder="Password" required>
                        <div class="checkbox">
                            <label>
                                <input name="remember" type="checkbox"> Remember me
                            </label>
                        </div>
    		    	</div>
			        <div class="modal-footer">
                        <div>
                            <button type="submit" class="btn btn-primary btn-lg btn-block">Login</button>
                        </div>
			    	    <div>
                            <button id="login_lost_btn" type="button" class="btn btn-link">Lost Password?</button>
                            <button id="login_register_btn" type="button" class="btn btn-link">Register</button>
                        </div>
			        </div>
                </form>
                <!-- End # Login Form -->
                
                <!-- Begin | Lost Password Form -->
                <form id="lost-form" style="display:none;">
	    		    <div class="modal-body">
	    				<div id="div-lost-msg">
                            <div id="icon-lost-msg" class="fa fa-envelope" aria-hidden="true"></div>
                            <span id="text-lost-msg">Type your e-mail.</span>
                        </div>
	    				<input id="lost_email" class="form-control" type="text" placeholder="E-Mail (type ERROR for error effect)" required>
        			</div>
	    		    <div class="modal-footer">
                        <div>
                            <button type="submit" class="btn btn-primary btn-lg btn-block">Send</button>
                        </div>
                        <div>
                            <button id="lost_login_btn" type="button" class="btn btn-link">Log In</button>
                            <button id="lost_register_btn" type="button" class="btn btn-link">Register</button>
                        </div>
	    		    </div>
                </form>
                <!-- End | Lost Password Form -->
                
                <!-- Begin | Register Form -->
                <form id="register-form" style="display:none;" action="{{url('/registeruser')}}" method="POST">
                <input type="hidden" name="_token" value="{{ csrf_token() }}">
        		    <div class="modal-body">
                            @if(count($errors)>0)
                                <div id="div-register-msg" class="alert-danger">
                                <div id="icon-register-msg" class="fa fa-chevron-right" aria-hidden="true"></div>
                                <span id="text-register-msg">
                                    {{$errors->first()}}
                                </span>
                                </div>
                            @else
                                <div id="div-register-msg">
                                <div id="icon-register-msg" class="fa fa-chevron-right" aria-hidden="true"></div>
                                <span id="text-register-msg">Register an account.</span>
                                </div>
                            @endif
	    				<input id="register_username" class="form-control" type="text" placeholder="Name (type ERROR for error effect)" required name="name">
                        <input id="register_email" class="form-control" type="text" placeholder="E-Mail" required name="email">
                        <input id="register_password" class="form-control" type="password" placeholder="Password" required name="password">
                        <input id="register_password" class="form-control" type="password" placeholder="Password Confirmation" required name="password_confirmation">
        			</div>
	    		    <div class="modal-footer">
                        <div>
                            <button type="submit" class="btn btn-primary btn-lg btn-block">Register</button>
                        </div>
                        <div>
                            <button id="register_login_btn" type="button" class="btn btn-link">Log In</button>
                            <button id="register_lost_btn" type="button" class="btn btn-link">Lost Password?</button>
                        </div>
	    		    </div>
                </form>
                <!-- End | Register Form -->
                
            </div>
            <!-- End # DIV Form -->
            
		</div>
	</div>
</div>