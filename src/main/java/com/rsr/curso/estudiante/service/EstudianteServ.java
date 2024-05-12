package com.rsr.curso.estudiante.service;

import java.util.List;

import com.rsr.curso.estudiante.entity.Estudiante;

public interface EstudianteServ {

	 public List<Estudiante> findAll();
	 public Estudiante save(Estudiante estudiante);
	 public void delete(Long id);
	 public Estudiante findById(Long id);
	 public Estudiante findByNombre(String nombre);

}
