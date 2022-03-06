package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Curso;

public interface CursosDao extends JpaRepository<Curso,Integer> {
	
	Curso findByDenominacion(String denominacion);
	List<Curso> findByTematica(String tematica);
	@Query("select c from Curso c where c.duracion<=?1")
	List<Curso> findByDuracionMax(int duracion);
	//o con palabras reservadas List<Curso> findByDuracionLessThan(int duracion);
	@Modifying
	@Transactional
	void deleteByDenominacion(String denominacion);
}
