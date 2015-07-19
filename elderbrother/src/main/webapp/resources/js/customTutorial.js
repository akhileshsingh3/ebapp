/**
 * 
 */
var XMLHttpRequestObject = false; 
if (window.XMLHttpRequest) {
	XMLHttpRequestObject = new XMLHttpRequest();
} else if (window.ActiveXObject) {
	XMLHttpRequestObject = new ActiveXObject("Microsoft.XMLHTTP");
}    
var videosOfClassNSubList=[];
var noOfVideos;
var previousPage;
function loadTutorialPage(page,ClassNSub){ 
	var fileContent=[];
	previousPage=ClassNSub.split(":");
	previousPage=LandingPageNavLinkSelected+previousPage[0];
	//alert(previousPage);
	
	if(XMLHttpRequestObject){
		XMLHttpRequestObject.open("GET", "resources/Files/VideoNames3.txt"); 
		// Rename filename if any changes done on the file and then restart server to run.
		XMLHttpRequestObject.onreadystatechange = function(){
			if (XMLHttpRequestObject.readyState == 4 && 
				XMLHttpRequestObject.status == 200) { 			 
					fileContent=XMLHttpRequestObject.responseText.split(";");
					if(page.trim().localeCompare("tutorial")==0){
						videosOfClassNSubList= getVideoListFile(fileContent,ClassNSub);
						createVideoNavigationLiks(videosOfClassNSubList);
					}					
			} 
		} 
		XMLHttpRequestObject.send(null); 
	  } 
}
function createVideoNavigationLiks(videoListNSrc){
	var j=0; 
	var nav= document.getElementById('nav');
	var ul= document.createElement('ul');
	
	
	 var link= document.createElement('li');
	  var anchor= document.createElement('a');
	  anchor.href=previousPage;
	  anchor.innerText= "<<Back";
	  anchor.id="back";
	  
	  link.id="li_Back";
	  
	  link.appendChild(anchor);
	  ul.appendChild(link);
	  nav.appendChild(ul);
	  
	
	  for(j;j< videoListNSrc.length;j++){	
		  var link1= document.createElement('li');
		  var anchor1= document.createElement('a');
		  var videoLink= videoListNSrc[j].split("(");
			  anchor1.href="#";
			  anchor1.innerText= videoLink[0].trim();
			  anchor1.id=videoLink[0].trim();
			  
			  link1.id="li_"+j;
			  
			  anchor1.onclick= function(){
				  var an=$(this);
				  var liId=an.closest("li").attr("id");
				  loadVideoOnClick(this.id);
				 
				  highlightVideoLink(liId);
				 
			  }
			  link1.appendChild(anchor1);
			  ul.appendChild(link1);
			  nav.appendChild(ul);
			  noOfVideos=j+1;
			
		}
	  	var firstVideoLink= videoListNSrc[0].split("(");
	  	firstVideoLink=firstVideoLink[1];
	  	firstVideoLink=firstVideoLink.split(")");
	  	document.getElementById("li_0").className="current";
	  	loadVideo(firstVideoLink[0]);
}
function getVideoListFile(videoList,ClassNSub){
	ClassNSub=ClassNSub.split(":");
	var i=0;var l=0;
	for(i;i< videoList.length;i++){
      	 if(videoList[i].trim().indexOf(ClassNSub[0].trim())===0 || 
      			 videoList[i].trim().indexOf(ClassNSub[0].trim())===1){
      		 videoList=videoList[i].split(":");
      		 for(l;l<videoList.length;l++){
      			if(videoList[l].trim().indexOf(ClassNSub[1].trim())===0 || 
      					videoList[l].trim().indexOf(ClassNSub[1].trim())===1){
      				videoList=videoList[l].split("-");
      				break;
      			}
      		 }
      		 break;
      		 }
       }
	return videoList[1].split(",");
}
function loadVideo(VideoLink){
	
	var videoType=VideoLink.split(".");
	videoType=videoType[1];
	var player= document.getElementById("videoPlayer");
		var mp4Vid= document.getElementById("mp4Source");
		var movVid=document.getElementById("mp4Source");
		player.pause();
		if(videoType.trim().indexOf("mp4")===0 || 
				videoType.trim().indexOf("mp4")===1)
		$(mp4Vid).attr('src',VideoLink);
		else if(videoType.trim().indexOf("mov")===0 || 
				videoType.trim().indexOf("mov")===1)
			$(movVid).attr('src',VideoLink);
		player.load();
}
function loadVideoOnClick(linkClickedId){

	var m=0;
	var vid = videosOfClassNSubList;
	for(m;m<vid.length;m++){
		if(vid[m].trim().indexOf(linkClickedId.trim())===0 || 
				vid[m].trim().indexOf(linkClickedId.trim())===1){
			vid=vid[m].split("(");
			vid=vid[1].split(")")
			vid=vid[0];	
		break;
		}
	}
	
	loadVideo(vid);
	
}
function highlightVideoLink(liId){
	var indexLi=liId.split("_");
	var j;var x;
	indexLi=indexLi[1];
	for(j=(noOfVideos-1);j>indexLi;j--){document.getElementById("li_"+j).className="";}	
	for(x=0;x<indexLi;x++){	document.getElementById("li_"+x).className="";}
	document.getElementById(liId).className="current";
}