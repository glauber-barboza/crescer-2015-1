package filmator.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import filmator.model.Filme;
import filmator.model.Genero;

@Component
public class FilmeDao {

	@Inject
	private JdbcTemplate jdbcTemplate;

	/*
	 * create table FILME(idFilme integer not null auto_increment, nome
	 * varchar(100) not null, datalancamento varchar(50) not null, sinopse
	 * varchar(50) not null, caminhoimg varchar(200) not null, gênero
	 * varchar(100) not null);
	 */

	public void inserir(Filme filme) {
		jdbcTemplate.update(
				"INSERT INTO Filme (nome,datalancamento,sinopse,caminhoimg,genero)"
						+ " VALUES (?,?,?,?,?)", filme.getNomeFilme(),
				filme.getDataLancamento(), filme.getSinopse(), filme.getImg(),
				filme.getGenero().name());
	}

	public List<Filme> buscaTodosFilmes() {
		return jdbcTemplate
				.query("SELECT idfilme,nome,datalancamento,sinopse,caminhoimg, genero FROM Filme",
						(ResultSet rs, int rowNum) -> {
							Filme filme = new Filme(rs.getInt("idfilme"),
									rs.getString("nome"), rs
									.getString("sinopse"), rs
									.getString("caminhoimg"), rs
									.getString("datalancamento"), Enum.valueOf(
									Genero.class, rs.getString("genero")));
							return filme;
						});
	}

}
