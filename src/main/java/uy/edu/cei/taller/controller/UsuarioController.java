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
import uy.edu.cei.taller.bean.UsuarioBean;
import uy.edu.cei.taller.dao.UsuarioMapper;

@RestController
@RequestMapping("/Usuario")

public class UsuarioController {

	private final UsuarioMapper usuarioMapper;

	@Autowired
	public UsuarioController(final UsuarioMapper usuarioMapper) {
		this.usuarioMapper = usuarioMapper;
	}

	@GetMapping()
	public List<UsuarioBean> getAll() {
		return this.usuarioMapper.selectAll();
	}

	@GetMapping("/{nombreUsuario}")
	public UsuarioBean getByNombreUsuario(@PathVariable String nombreUsuario) {
		return this.usuarioMapper.selectByNombreUsuario(nombreUsuario);
	}

	@GetMapping("/id/{id}")
	public UsuarioBean getById(@PathVariable int id) {
		return this.usuarioMapper.selectById(id);
	}

	@PostMapping
	public boolean save(@RequestBody UsuarioBean usuario) {
		this.usuarioMapper.insert(usuario);
		return true;
	}

	@PutMapping
	public boolean updateById(@RequestBody UsuarioBean usuario) {
		this.usuarioMapper.updateByIdOrNombreUsuario(usuario);
		return true;
	}

	@DeleteMapping("/id/{id}")
	public boolean de(@PathVariable long id) {
		this.usuarioMapper.deleteById(id);
		return true;
	}
	
	@DeleteMapping("/{nombreUsuario}")
	public void de(@PathVariable String nombreUsuario) {
		this.usuarioMapper.deleteByNombreUsuario(nombreUsuario);
	}

}
