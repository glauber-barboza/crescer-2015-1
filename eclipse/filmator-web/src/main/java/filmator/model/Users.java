package filmator.model;

public class Users {

	private String login, senha;
	private int tipoUser=0, idUser;

	public Users() {

	}

	public Users(int idUser, String login, String senha, int tipoUser) {
		this.idUser = idUser;
		this.login = login;
		this.senha = senha;
		this.tipoUser = tipoUser;
	}

	public Users(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(int tipoUser) {
		this.tipoUser = tipoUser;
	}

}
