//faz uma execução após o tempo informado
var i= setTimeout(function(){
	console.log('caiu a ficha');
		},2000);

//executa varias vezes de acordo com o tempo informado
var i= setInterval(function(){
	console.log('caiu a ficha');
	},2000);

	//parar a execução
	clearInterval(i);
	
	