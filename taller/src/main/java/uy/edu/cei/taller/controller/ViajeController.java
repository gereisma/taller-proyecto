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
import uy.edu.cei.taller.bean.ViajeBean;
import uy.edu.cei.taller.dao.ViajeMapper;

@RestController
@RequestMapping("/Viaje")

public class ViajeController {

	private final ViajeMapper viajeMapper;

	@Autowired
	public ViajeController(final ViajeMapper ViajeMapper) {
		this.viajeMapper = ViajeMapper;
	}

	@GetMapping()
	public List<ViajeBean> getAll() {
		return this.viajeMapper.selectAll();
	}

	@GetMapping("/{id}")
	public ViajeBean getById(@PathVariable long id) {
		return this.viajeMapper.selectById(id);
	}

	@PostMapping
	public void save(@RequestBody ViajeBean viaje) {
		this.viajeMapper.insert(viaje);
	}

	@PutMapping
	public void updateById(@RequestBody ViajeBean viaje) {
		this.viajeMapper.updateById(viaje);
	}
	
	@DeleteMapping("/{nombreUsuario}")
	public void de(@PathVariable int id) {
		this.viajeMapper.deleteById(id);
	}

}
