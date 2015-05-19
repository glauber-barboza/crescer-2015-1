package MestreCuca;

public class Ingrediente {
	
	private Medidas med;
	private int quantidadeMedida;
	private String nome;
	private double valorProduto;

	double quantidade;
	
	public Ingrediente(Medidas med,String nome,int quant,int  valorProduto){
		this.med= med;
		this.nome=nome;
		this.quantidadeMedida= quant;
		this.valorProduto=valorProduto;
	
		
	}

	public Medidas getMed() {
		return med;
	}

	public void setMed(Medidas med) {
		this.med = med;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeMedida() {
		return quantidadeMedida;
	}

	public void setQuantidadeMedida(int quantidadeMedida) {
		this.quantidadeMedida = quantidadeMedida;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((med == null) ? 0 : med.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingrediente other = (Ingrediente) obj;
		if (med != other.med)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	

}
