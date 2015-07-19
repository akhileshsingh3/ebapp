/**
 * 
 */
		var XMLHttpRequestObject = false; 
	     if (window.XMLHttpRequest) {
	       XMLHttpRequestObject = new XMLHttpRequest();
	     } else if (window.ActiveXObject) {
	       XMLHttpRequestObject = new ActiveXObject("Microsoft.XMLHTTP");
	     }
	     
	    
function changeContent(changeTo) { 
				
				alert(changeTo.toString())
				
			 if(changeTo == "Progress Report"){
				
				 				
				 
			 }else if(changeTo== 'Math'.toString()){
				 
			 }else if(changeTo == 'Science'.toString()){
				 
			 }else if(changeTo == 'Support'.toString()){
			 
			 
			}else{
				alert(document.getElementById('content'));
				document.getElementById('content').style.dispaly.none;
			}
			 changeTo="";
			}

function readChapters(ClassNSub){ 
	 
	//createNavigationLiks();
	alert("hi");
	  var j=1;  var i=0;
	  var Chapters = [ ];
	  if(XMLHttpRequestObject) {
	          XMLHttpRequestObject.open("GET", "Files/Chapters6.txt"); 
	          XMLHttpRequestObject.onreadystatechange = function(){
		        	  if (XMLHttpRequestObject.readyState == 4 && 
		            		XMLHttpRequestObject.status == 200) { 
		            	alert(XMLHttpRequestObject.responseText); 
		            	Chapters=XMLHttpRequestObject.responseText.split(".");
		            	//alert (Chapters[0]); alert(Chapters[1]);alert(Chapters[2]);alert(Chapters[3]);
		            	
		            	Chapters= getThisFromFile(Chapters,ClassNSub)
		            	
		                 
		                 var table = document.getElementById('chatperTable');       
		                 for(j;j<= Chapters.length;j++){
		                  	 var row = table.insertRow(j);
		                    row.insertCell(0).innerHTML =Chapters[j-1];
		                    row.insertCell(1).innerHTML ="Download";
		                    row.insertCell(2).innerHTML ="Download";
		                    row.insertCell(3).innerHTML ="Watch";
		                 }
		            	
		        	  } 
	          } 
	          alert("llllloooo");
	          XMLHttpRequestObject.send(null); 
	        }
	 //alert("helllll");
     //alert(Chapters[0]); alert(Chapters[1]);alert(Chapters[2]);alert(Chapters[3]);   
        
            
            //alert(Chapters[0]); alert(Chapters[1]);alert(Chapters[2]);alert(Chapters[3]);alert(Chapters[4]);
          
             /*if(ClassNSub.localeCompare("Class8-Mathematics")==0){
        	  document.getElementById('li_Mathematics').className="current";
          }else if(ClassNSub.localeCompare("Class8-Science")==0){
        	  document.getElementById('li_Science').className="current";
          }else if(ClassNSub.localeCompare("Support")==0){
        	  document.getElementById('li_Support').className="current";
          }else{
        	  document.getElementById('li_Home').className="current";
        	  
          } */     
}

/*function createNavigationLiks(){
	alert("CreateingNav")
	var j=0; var navLinks  = null;
	navLinks= getThisFromFile("Class8-NavLinks"); 
	var nav= document.getElementById('navlinks');
	  for(j;j<= navLinks.length;j++){		  
		  var link= document.createElement('li');
		  var anchor= document.createElement('a');
		  	if(navLinks[j].localeCompare("Home")){
				anchor.href="landingPage.jsp";	
			}else if(navLinks[j].localeCompare("Support")){
				anchor.href="Support.jsp?Content=support";
			}else{
				anchor.href="TableOfContent.jsp?Content=Class8-"+navLinks[j];	
			}
		anchor.innerText= navLinks[j];
		link.id="li_"+navLinks[j];
		link.appendChild(anchor);
		nav.appendChild(link);
		}
}*/
function getThisFromFile(Chapters,ClassNSubOrNav){
	var i=0;
	for(i;i< Chapters.length;i++){
		            		alert(Chapters.length);
		                  	 if(Chapters[i].indexOf(ClassNSubOrNav)===0 || Chapters[i].indexOf(ClassNSubOrNav)===1){
		                  		Chapters=Chapters[i].split(":");
		                  		 alert(i);
		                  		 break;
		                  		 }
		                   }
		                   return Chapters[1].split(",");
	
}
/*function readFile(){
	alert("readingfile");
	
}*/

