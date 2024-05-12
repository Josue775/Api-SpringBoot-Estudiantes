package com.rsr.curso.estudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsr.curso.estudiante.entity.Estudiante;
import com.rsr.curso.estudiante.repository.EstudianteDAO;

import jakarta.transaction.Transactional;

@Service
public class EstudianteService implements EstudianteServ {

	@Autowired
	private EstudianteDAO estudianteDao;
	
	@Transactional
	public List<Estudiante> findAll(){
		return (List <Estudiante>) estudianteDao.findAll();
	}
	
	@Transactional
	public Estudiante save(Estudiante estudiante){
		
		return estudianteDao.save(estudiante);
	}
	
	//busqueda por id
	public Estudiante findById(Long id) {
		return estudianteDao.findById(id).orElse(null);
	}
	@Transactional
	public Estudiante findByNombre(String nombre) {
        return estudianteDao.findByNombre(nombre).orElse(null);
    }
	@Transactional
	public void delete(Long id){
		
	  estudianteDao.deleteById(id);
	}

	
}
