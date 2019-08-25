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

	@GetMapping("id")
	public ClienteBean getByIdUsuario(@RequestParam(value = "idUsuario", required = true) long idUsuario) {
		return this.clienteMapper.selectById(idUsuario);
	}

	@PostMapping
	public int save(@RequestBody ClienteBean cliente) {
		this.clienteMapper.insert(cliente);
		return 1;
	}
	
	@PutMapping
	public boolean update(@RequestBody ClienteBean cliente) {
		this.clienteMapper.updateById(cliente);
		return true;
	}

	@DeleteMapping("/{id}")
	public void de(@PathVariable int id) {
		this.clienteMapper.deleteById(id);
	}


}
