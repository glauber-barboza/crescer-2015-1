package filmator.dao;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;

import filmator.model.Filme;
import filmator.model.Users;

public class notasDao {

	@Inject
	private JdbcTemplate jdbcTemplate;
	/*
	 *create table notaDoFilme(idNota integer not null auto_increment,
nota integer not null,
fk_idFilme integer not null,
fk_idUser integer not null);
	 */

	
	public void inserir(int idUser, double notaFilme,int idfilme) {

		jdbcTemplate.update("INSERT INTO notadofilme (nota,fk_idFilme,fk_idUser)"
				+ " VALUES (?,?)", notaFilme, idfilme,idUser);
	}
}
