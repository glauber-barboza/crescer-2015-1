<!-- 
funçao map
--> 

function allBacon(array){
var concatenaBacon= function(i){

	return i + " Bacon";
	
	};
	return array.map(concatenaBacon);
	
}

allBacon(['teste2','teste3','teste4'])


<!-- 
funçao reduce
--> 

var numeros=[1,2,3];

<!--
Exercicios https://gist.github.com/bernardobrezende/1ba28480317e1528e2bb
-->



	var Arsenal = {
	  nome: 'Arsenal',
	  titulos: [
		{ desc: 'Nacionais', qtd: 39 },
		{ desc: 'Continentais', qtd: 0 },
		{ desc: 'Mundiais', qtd: 0 }
	  ]
	};

	var chelsea = {
	  nome: 'Chelsea Football Club',
	  titulos: [
		{ desc: 'Nacionais', qtd: 5 },
		{ desc: 'Continentais', qtd: 1 },
		{ desc: 'Mundiais', qtd: 0 }
	  ]
	};

	var Liverpool = {
	  nome: 'Chelsea Football Club',
	  titulos: [
		{ desc: 'Nacionais', qtd: 18 },
		{ desc: 'Continentais', qtd: 3 },
		{ desc: 'Mundiais', qtd: 0 }
	  ]
	};
	
		var ManchesterUnited = {
	  nome: 'Chelsea Football Club',
	  titulos: [
		{ desc: 'Nacionais', qtd: 5 },
		{ desc: 'Continentais', qtd: 3 },
		{ desc: 'Mundiais', qtd: 57 }
	  ]
	};
	
	
	
	var times=[Liverpool,Arsenal,chelsea,ManchesterUnited];

	//2 a
	
	//serve para fazer ordenação nes caso ordenação por quantidade
	function ordenaPorNacionais(Array){
	Array.sort(function(a,b) { 
	return a.titulos[0].qtd > b.titulos[0].qtd;
	});
	return Array;
	};
	
ordenaPorNacionais(times);


//2 b

	//serve para fazer ordenação
	function ordenaPorContinentais(Array){
	Array.sort(function(a,b) { 
	return a.titulos[1].qtd > b.titulos[1].qtd;
	});
	return Array;
	};
	
ordenaPorContinentais(times);

//2 c

	//serve para fazer ordenação
	function ordenaPorMundiais(Array){
	Array.sort(function(a,b) { 
	return a.titulos[3].qtd > b.titulos[3].qtd;
	});
	return Array;
	};
	
ordenaPorContinentais(times);

//3 a
//quando nao inicializei a vaiavel ele estava retornando NaN
	function somarPorNacionais(Array){
		var soma=0;
		for(var i=0;i<Array.length;i++){
			soma=Array[i].titulos[0].qtd+soma;
			//console.log(soma=Array[i].titulos[0].qtd+soma);//console.log imprime no conlole
		}
		return soma;
	};
		
	}
somarPorContinentais(Array)


function somarPorContinentais(Array){
		var soma=0;
		for(var i=0;i<Array.length;i++){
			soma=Array[i].titulos[0].qtd+soma;
			//console.log(soma=Array[i].titulos[0].qtd+soma);//console.log imprime no conlole
		}
		return soma;
	};
