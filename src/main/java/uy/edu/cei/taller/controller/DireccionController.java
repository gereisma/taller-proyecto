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
import uy.edu.cei.taller.bean.UsuarioBean;
import uy.edu.cei.taller.dao.DireccionMapper;


@RestController
@RequestMapping("/Direccion")

public class DireccionController {
	
	private final DireccionMapper DireccionMapper ;

	
	
	@Autowired
	public DireccionController(final DireccionMapper DireccionMapper, DireccionMapper DireccionMapper1) {
		this.DireccionMapper = DireccionMapper1;
		
	}
	

	@GetMapping("/{idUsuario}")
	public DireccionBean getByNombreDireccion(@PathVariable String nombre) {
		return this.DireccionMapper.selectByidUsuario(nombre);
	}
	@PostMapping
	public void save(@RequestBody DireccionBean direccion) {
		this.DireccionMapper.insert(direccion);
	}
	@DeleteMapping("/{idUsuario}")
	public void de(@PathVariable int idUsuario) {
		this.DireccionMapper.deleteByIdUsuario(idUsuario);
	}

	


}
