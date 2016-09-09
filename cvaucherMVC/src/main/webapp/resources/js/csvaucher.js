/**
 * 
 */
window.addEventListener("load", function(){
	setTimeout(
			function(){
				var r = new XMLHttpRequest();
				r.open("POST","/cvaucherMVC/pacsearch", true);
				r.onreadystatechange = function () {  
					if (r.readyState != 4 || r.status != 200) return;   
					console.log(r.responseText); 
				}; 
				r.send();
				//window.open("http://localhost:8091/cvaucherMVC/pacsearch","GET");
				//assert(true,"Forever!");
			},
			2000);
	var tag = document.getElementsByName("tratamId");
	for(var i =0;i<tag.length;i++){
		tag[i].addEventListener("change",function(){
			
			window.location="${flowExecutionKey}&_eventId_cantSesionesTratamiento";
			/*var r = new XMLHttpRequest();
			r.open("POST","_eventId_cantSesionesTratamiento", true);
			r.onreadystatechange = function () {  
				if (r.readyState != 4 || r.status != 200) return;   
				console.log(r.responseText); 
			}; 
			r.send();
			*/
			alert("Prueba");
		}, false);
	}
}, false);

