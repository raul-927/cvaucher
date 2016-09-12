/**
 * 
 */
window.addEventListener("load", function(){
	setTimeout(
			function(){
				var r = new XMLHttpRequest();
				r.open("POST","/cvaucherMVC/pacsearch/prueba", false);
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
		var aux = document.getElementsByName("_flowExecutionKey");
		var aux2 = aux[0].value[4];
		var aux3 = aux[0].value[1,3];
		aux2++;
		var aux4 = aux3+aux2;
		window.location="http://localhost:8091/cvaucherMVC/tratamientos?execution="
				+aux4;
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

