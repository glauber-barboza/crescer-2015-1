'use strict';
"cc8e6df76fee"

var meuNome={nome:'Glauber'}
var jsonLoco= JSON.stringify(meuNome); 
var retorno=[];




	function inicio(){

				$.ajax({
			type: "get",
			url: 'http://localhost:4567/tarefas?token=cc8e6df76fee',
			dataType: 'json'
		}).done(function(data){
		alert('Funfo?')
			var retorno = $('.albums');
		$.each(data.items, function(i, itemRecebido){}));
	
		});
		}
		$(function() {
	inicio()
	});

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