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
import uy.edu.cei.taller.bean.ClienteBean;
import uy.edu.cei.taller.dao.ClienteMapper;


@RestController
@RequestMapping("/Cliente")

public class ClienteController {
	
	private final ClienteMapper clienteMapper ;

	
	
	@Autowired
	public ClienteController(final ClienteMapper ClienteMapper, ClienteMapper clienteMapper) {
		this.clienteMapper = clienteMapper;
		
	}
	
	@GetMapping()
	public List<ClienteBean> getAll() {
		return this.clienteMapper.selectAll();
	}
	@GetMapping("/{nombre}")
	public ClienteBean getByNombreCliente(@PathVariable String nombre) {
		return this.clienteMapper.selectByNombreCliente(nombre);
	}

	@GetMapping("id")
	public ClienteBean getByIdUsuario(@RequestParam(value = "idUsuario", required = true) long idUsuario) {
		return this.clienteMapper.selectById(idUsuario);
	}

	@PostMapping
	public void save(@RequestBody ClienteBean cliente) {
		this.clienteMapper.insert(cliente);
	}

	@PutMapping
	public void updateById(@RequestBody ClienteBean cliente) {
		this.clienteMapper.updateByIdUsuarioOrNombre(cliente);
	}

	@DeleteMapping("/{nombre}")
	public void de(@PathVariable String nombre) {
		this.clienteMapper.deleteByNombre(nombre);
	}


}
