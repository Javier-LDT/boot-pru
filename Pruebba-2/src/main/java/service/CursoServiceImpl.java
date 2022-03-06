package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CursosDao;
import model.Curso;

@Service
public class CursoServiceImpl implements CursoService {
	@Autowired
	CursosDao dao;

	 @Override
	public void altaCurso(Curso curso) {
	if(dao.findByDenominacion(curso.getDenominacion())==null) {
	dao.save(curso);
	}

	 }

	 @Override
	public Curso actualizarCurso(Curso curso) {
	if(dao.findByDenominacion(curso.getDenominacion())!=null) {
	dao.save(curso);
	return curso;
	}
	return null;
	}

	 @Override
	public List<Curso> recuperarTodos() {
	return dao.findAll();
	}

	 @Override
	public List<Curso> cursosDuracionMaxima(int duracion) {
	return dao.findByDuracionMax(duracion);
	}

	 @Override
	public void eliminarCursos(String denominacion) {
	dao.deleteByDenominacion(denominacion);

	 }

	 @Override
	public List<Curso> cursosPorTematica(String tematica) {
	return dao.findByTematica(tematica);
	}

}
