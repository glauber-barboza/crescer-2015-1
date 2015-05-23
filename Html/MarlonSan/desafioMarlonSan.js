'use strict';


$.ajax({
		url: 'http://karatekid.instaweb.com.br:4567/apresentar?nome=Glauber',
		type: 'post'
	})
	.done(function(data) {
		var NomeRecebido = '?nome='+data.nome;
		$.ajax({
			url: 'http://karatekid.instaweb.com.br:4567/tarefas'+NomeRecebido,
			type: 'get'
		})
		.done(function(data) {
			var tarefa =  $.extend({}, data.atividades);
			$.ajax({
				url: 'http://karatekid.instaweb.com.br:4567'+tarefa[0].atividade+NomeRecebido,
				type: 'post'
			}).done(function(){
				console.log("Feito1");
			})
			
			
			$.ajax({
				url: 'http://karatekid.instaweb.com.br:4567'+tarefa[1].atividade+NomeRecebido,
				type: 'post'
			}).done(function(){
				console.log("Feito2");
			})
			
			$.ajax({
				url: 'http://karatekid.instaweb.com.br:4567'+tarefa[2].atividade+NomeRecebido,
				type: 'post'
			}).done(function(){
				console.log("Feito3");
				$.ajax({
					url: 'http://karatekid.instaweb.com.br:4567/acabei'+NomeRecebido,
					type: 'post'
				}).done(function(){
				console.log("FeitoTudo");
			})
			})
			
				
			
		})
		
	});