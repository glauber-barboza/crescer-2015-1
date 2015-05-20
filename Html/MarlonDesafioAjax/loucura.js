'use strict';


var meuNome={nome:'Glauber'}
var jsonLoco= JSON.stringify(meuNome); 





function inicio(){

			$.ajax({
		type: "POST",
		url: 'http://illuminati.instaweb.com.br:6789/autentica',
		data: jsonLoco,
		dataType: 'json'
	}).done(function(data){
	alert('Funfo?')
		
	});
	}

var r1={RESPOSTA:8}
var res1= JSON.stringify(r1); 

function parteex1(){

			$.ajax({
		type: "POST",
		url: 'http://illuminati.instaweb.com.br:6789/exercicios?token=ace564b4865f',
		data: res1,
		dataType: 'json'
	}).done(function(data){
	alert('Funfo?')
		
	});
	}

$(function() {
parteex1()
});