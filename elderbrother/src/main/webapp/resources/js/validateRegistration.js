$(document).ready(function(){
	$("#signup").validate({
	rules:{
		firstname:{
			required:true,
			minlength:2	
		},
		lastname:{
			required:true,
			minlength:2
		},
		username:{
			required:true,
			email:true
		},
		password:{
			required:true,
			minlength:6
		},
		matchpassword:{
			required:true,
			minlength:6,
			equalTo:"#password"
			
		},currentclass:{
			required:true,
			minlength:2
		},school:{
			required:true,
			minlength:2
		},affiliation:{
			required:true,
			minlength:2
		},city:{
			required:true,
			minlength:2
		}
		
	},
	errorClass:"errorTxt",
	errorElement: 'div',
   
   
	
	
	});
	$("#username").hover(function(){
        $("#servererror").hide(1000);
    });
	
});