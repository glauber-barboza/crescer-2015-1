//Exercicio 1

function brewdog(texto1, texto2){
	var t1 = texto1.split('');
	var t2 = texto2.split('');
	var contador=0;
	if(t1.length<t2.length){
		var aux=t1;
		t1=t2;
		t2=aux;
	}
	for(var i=0; i<t1.length; i++){
		if(t1[i]!==t2[i]){
			contador++;
		}
	}
	return contador;
}

  [
    { params: ['american ipa','american ipa'],                        esperado: 0 },
    { params: ['russian imperial stout','russian imperial vodka'],    esperado: 5 },
    { params: ['1002012','dfgdf12'],                                  esperado: 5 },
    { params: ['k4rol1n','k4thr1n'],                                  esperado: 3 },
    { params: ['a1df222266%334op;','ssdfjfdkjgsdfgofdgudf9g8dufsg'],  esperado: 26 },
  ].forEach(
    function(ct) {
      var res = brewdog(ct.params[0], ct.params[1]);
      console.assert(res === ct.esperado, 'Errooooou! CT:', ct.params, 'Esperado:', ct.esperado, 'Obtido:', res);
    }
  );

//2A
function Emprestimo(valorTotal, juros, parcelas){
	this.valorTotal = valorTotal;
	this.juros = juros;
	this.parcelas = parcelas || 3;

	//2B
	this.valorParcela = function(){
		var valorParcela = (valorTotal*juros) / (1-(1/Math.pow(1+juros,parcelas)));
		return parseFloat(valorParcela.toFixed(2));
	}

	//2C
	this.valorTotalJuros = function(){
		var valorTotalJuros = this.valorParcela()*parcelas-valorTotal;
		return parseFloat(valorTotalJuros.toFixed(2));
	}

}

[
    { emprestimo: new Emprestimo(1000, 0.03, 4),  esperado: 269.03 },
    { emprestimo: new Emprestimo(1800, 0.05, 8),  esperado: 278.5 },
    { emprestimo: new Emprestimo(500, 0.05),      esperado: 183.6 },
  ].forEach(
    function(ct) {
      var res = ct.emprestimo.valorParcela();
      console.assert(res === ct.esperado, 'Errooooou! CT:', ct.emprestimo, 'Esperado:', ct.esperado, 'Obtido:', res);
    }
  );


  [
    
    { emprestimo: new Emprestimo(1800, 0.13, 8),  esperado: 1200.8 },
    { emprestimo: new Emprestimo(1000, 0.03, 4),  esperado: 76.12 },
    { emprestimo: new Emprestimo(500, 0.05),      esperado: 50.8 },
  ].forEach(
    function(ct) {
      var res = ct.emprestimo.valorTotalJuros();
      console.assert(res === ct.esperado, 'Errooooou! CT:', ct.emprestimo, 'Esperado:', ct.esperado, 'Obtido:', res);
    }
  );
  /*
'iluminatti'
'ledesma'
'dante'
'verde musgo'
'bacon'
  */
  
  function palindromoiluminati(String){
	  var palindromo=String.toLowerCase();
	  var palindromo1 = palindromo.replace(/\W|\s|\d/gi,'');
	  var palindromo2 = palindromo1.split('').reverse().join('');
	  if(palindromo1==='iluminatti' || palindromo1==='ledesma'|| palindromo1==='dante'|| palindromo1==='verdemusgo'|| palindromo1==='bacon'){
		  console.log(palindromo+' É um Palíndromo Iluminatti');
		  return true;
	  }
	  else if(palindromo2===palindromo1){
			console.log(palindromo+' É um palindromo');
			return true;
		
	  }else{
		return false;
	  }
  }