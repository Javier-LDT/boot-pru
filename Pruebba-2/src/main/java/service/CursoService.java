package service;

import java.util.List;

import model.Curso;

public interface CursoService {
	
	void altaCurso(Curso curso);
	Curso actualizarCurso(Curso curso);
	List<Curso> recuperarTodos();
	List<Curso> cursosDuracionMaxima(int duracion);
	void eliminarCursos(String denominacion);
	List<Curso> cursosPorTematica(String tematica);
}
