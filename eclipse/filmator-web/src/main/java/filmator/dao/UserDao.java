package filmator.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import org.springframework.stereotype.Controller;

import filmator.model.Users;

@Component
public class UserDao {

	/*
	 * create table users(idUser integer PRIMARY KEY auto_increment not null,
	 * nome varchar(100) not null, senha varchar(100) not null, tipoUser integer
	 * not null);
	 */
	@Inject
	private JdbcTemplate jdbcTemplate;

	public void inserir(Users user) {

		jdbcTemplate.update("INSERT INTO users (nome,senha,tipoUser)"
				+ " VALUES (?,?,?)", user.getLogin(), user.getSenha(),0);
	}

	public List<Users> verificaUsuario(String logim, String senha) {
		return jdbcTemplate
				.query("SELECT iduser,nome,senha,tipoUser FROM users where nome=? and senha=?",
						(ResultSet rs, int rowNum) -> {
							Users usr = new Users(rs.getInt("idUser"), rs
									.getString("nome"), rs.getString("senha"),
									rs.getInt("tipoUser"));
							return usr;
						}, logim, senha);

	}
}
