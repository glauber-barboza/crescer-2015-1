package filmator.model;

public class Filme {

	private String nomeFilme, sinopse, img, dataLancamento;
	private Genero genero;
	private double notaFilme;
	private int idFilme;


	public Filme(int idfilme, String nome, String sinopse, String img,
			String dataLancamento, Genero genero) {
		this.idFilme=idfilme;
		this.nomeFilme = nome;
		this.sinopse = sinopse;
		this.img = img;
		this.dataLancamento = dataLancamento;
		this.genero = genero;

	}
	
	
	public Filme() {

	}

	
	
	public int getIdFilme() {
		return idFilme;
	}



	public void setIdFilme(int idFilme) {
		this.idFilme = idFilme;
	}



	public double getNotaFilme() {
		return notaFilme;
	}



	public void setNotaFilme(double notaFilme) {
		this.notaFilme = notaFilme;
	}




	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
