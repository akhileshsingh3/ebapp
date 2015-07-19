$(document).ready(function(){
	$("#signin").validate({
	rules:{
		
		username:{
			required:true,
			email:true
		},
		password:{
            required: function(element) {
               // return $("#username").val() == 'akhilesh@gmail';
            	 return ($("#username").is(':filled') &&
            			 $("#username").is(':valid'));
       	},minlength: 6
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
        $("#servererror2").hide(1000);
    });
	$("#password").hover(function(){
        $("#servererror").hide(1000);
        $("#servererror2").hide(1000);
    });
	
	
});
