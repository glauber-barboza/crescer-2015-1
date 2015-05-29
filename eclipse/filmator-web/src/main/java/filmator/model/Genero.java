package filmator.model;

public enum Genero {

	ACAO("Açao"), COMEDIA("Comédia"), AVENTURA("Aventura"), TERROR("Terror");

	private String descricao;

	private Genero(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
