/**
 * 
 */
var XMLHttpRequestObject = false; 
if (window.XMLHttpRequest) {
	XMLHttpRequestObject = new XMLHttpRequest();
} else if (window.ActiveXObject) {
	XMLHttpRequestObject = new ActiveXObject("Microsoft.XMLHTTP");
}
var LandingPageNavLinkSelected="TableOfContent.jsp?Content="; 

function loadPage(page,ClassNSub){ 
	//alert("loadPage");
	var fileContent=[];
	var Chapters = [ ];
	if(XMLHttpRequestObject){
		XMLHttpRequestObject.open("GET", "Files/Chapters7.txt"); 
		// Rename filename if any changes done on the file and then restart server to run.
		XMLHttpRequestObject.onreadystatechange = function(){
			if (XMLHttpRequestObject.readyState == 4 && 
				XMLHttpRequestObject.status == 200) { 			 
					fileContent=XMLHttpRequestObject.responseText.split(".");				
					if(page.trim().localeCompare("tableOfContent")==0){
						Chapters= getThisFromFile(fileContent,ClassNSub);
						createTabOfContent(Chapters,ClassNSub);
					}					
					createNavigationLiks(fileContent);
			} 
		} 
		XMLHttpRequestObject.send(null); 
	  } 
}
function createNavigationLiks(Chapters){
	//alert("Create:Nav")
	var j=0; var navLinks  = null;
	navLinks= getThisFromFile(Chapters,"Class8-NavLinks"); 
	 
	var nav= document.getElementById('nav');
	var ul= document.createElement('ul');
	  for(j;j< navLinks.length;j++){		  
		  var link= document.createElement('li');
		  var anchor= document.createElement('a');
		  if(navLinks[j].trim().localeCompare("Home")===0){
			  anchor.href="landingPage.jsp?Content=Class8-Home";
			  anchor.innerText= navLinks[j].trim();
			  link.id="li_"+navLinks[j].trim();	  		
		  }
		  else if(navLinks[j].trim().localeCompare("Support")==0){	
				anchor.href="Support.jsp?Content=Class8-Support";
				anchor.innerText= navLinks[j].trim();
				link.id="li_"+navLinks[j].trim(); 	
			}else{	
				//alert(j+"here")
				anchor.href="TableOfContent.jsp?Content=Class8-"+navLinks[j].trim();
				anchor.innerText= navLinks[j].trim();
				link.id="li_"+navLinks[j].trim();  		
			}
		  	
		  	link.appendChild(anchor);
		 	ul.appendChild(link);
		 	nav.appendChild(ul);
			}
	  		highlightNavLink();
}
function getThisFromFile(Chapters,ClassNSubOrNav){
	//alert("getThisFromFile");
	var i=0;
	for(i;i< Chapters.length;i++){
		//alert(Chapters.length);
      	 if(Chapters[i].indexOf(ClassNSubOrNav)===0 || Chapters[i].indexOf(ClassNSubOrNav)===1){
      		Chapters=Chapters[i].split(":");
      		// alert(i);
      		 break;
      		 }
       }
	return Chapters[1].split(",");
}
function createTabOfContent(Chapters,ClassNSub){
	//alert("createTabOfContent");
	var j=1;
	var table = document.getElementById('chatperTable');       
    for(j;j<= Chapters.length;j++){
      	 var row = table.insertRow(j);
      	 var notesFileLocation="Files/Class8_Mathematics_Notes/Chap1.docx";
        row.insertCell(0).innerHTML ="<h1>"+Chapters[j-1]+"</h1>";
        
        row.insertCell(1).innerHTML ="<a href="+notesFileLocation+">Download";
        row.insertCell(2).innerHTML ="<a href=#>Download";
        //alert(Chapters[j-1].trim().replace(/\s/g,"%20"));
        row.insertCell(3).innerHTML ="<a href=tutorial.jsp?Tutorial="+ClassNSub+":"+Chapters[j-1].trim().replace(/\s/g,"%20")+">Watch";
     }
}
function highlightNavLink(){
	var url=location.search.split('Content=')[1];
	
 	if(url !=null){
 		url=url.split("-");
 		document.getElementById("li_"+url[1].trim()).className="current";	
 	}else{
 		document.getElementById("li_Home").className="current";		
 	}
}