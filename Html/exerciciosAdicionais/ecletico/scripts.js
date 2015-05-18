'use strict';

var albums = [];
var id = [];

function pesquisar(){
	
	var procura = $('input[name=pesquisa]').val().toLowerCase();
	
	$.ajax({
		url: 'https://api.spotify.com/v1/search?q='+procura+'&type=artist',
		type: 'get',
		dataType: 'json'
	})
	.done(function(artist){
		id = artist.artists.items[0].id;
		
		console.log(procura);
		
		$.ajax({
			url: 'https://api.spotify.com/v1/artists/'+id+'/albums?limit=50',
			type: 'GET',
			dataType: 'json'
		})
		.done(function(data) {
			$.each(data.items, function(i, itemRecebido){
				$('.album').append($('<img>', {src: itemRecebido.images[0].url}));
			})
		})
		
		
	});
	
}
$(function(){
	$('.button').click(function(){
		pesquisar();
	});	
})