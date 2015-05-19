'use strict';

var albums = [];


function obterItensComAjaxlimpezaprofunda() {
	$.ajax({
		type: "GET",
		url: 'https://api.spotify.com/v1/artists/6mdiAmATAx73kdxrNrnlao/albums?limit=50',
		dataType: 'json'
	}).done(function(data){
		var alb = $('.albums');
		$.each(data.items, function(i, itemRecebido){
		alb.append($('<img>', {src: itemRecebido.images[1].url }));
	
		});
	});
}
$(function() {
  obterItensComAjaxlimpezaprofunda();
});