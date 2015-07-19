$(document).ready(function(){
	$("#forgotPasswordForm").validate({
	rules:{
		
		username:{
			required:true,
			email:true
		}
	
	},
	
	/*errorPlacement: function(error, element) {
	     error.appendTo('#errordiv');
	   }*/
	
	errorClass:"errorTxt",
	errorElement: 'div'
   
	
	
	});
	//alert( "Valid: " + $( "#signin" ).valid() );
	$("#username").hover(function(){
        $("#servererror").hide(1000);
    });
	
	
	
});
