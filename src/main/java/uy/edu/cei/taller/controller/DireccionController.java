package uy.edu.cei.taller.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import uy.edu.cei.taller.bean.DireccionBean;
import uy.edu.cei.taller.dao.DireccionMapper;

@RestController
@RequestMapping("/Direccion")

public class DireccionController {
	
	private final DireccionMapper direccionMapper;
	
	
	@Autowired
	public DireccionController(final DireccionMapper DireccionMapper, DireccionMapper direccionMapper) {
		this.direccionMapper = direccionMapper;
		
	}
	
	@GetMapping("/{id}")
	public DireccionBean getByIdUsuario(@PathVariable long id) {
		return this.direccionMapper.selectByidUsuario(id);
	}
	@PostMapping
	public boolean save(@RequestBody DireccionBean direccion) {
		this.direccionMapper.insert(direccion);
		return true;
	}
	@DeleteMapping("/{idUsuario}")
	public boolean de(@PathVariable long idUsuario) {
		this.direccionMapper.deleteByIdUsuario(idUsuario);
		return true;
	}

}
