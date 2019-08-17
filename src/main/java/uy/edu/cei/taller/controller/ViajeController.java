package uy.edu.cei.taller.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uy.edu.cei.taller.bean.MessageBean;
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
	public ViajeBean getById(@PathVariable int id) {
		return this.viajeMapper.selectById(id);
	}
	
	@GetMapping("/selectViajesForAssignViaje2")
	public List<ViajeBean> selectViajesForAssignViaje2() {
		return this.viajeMapper.selectViajesForAssignViaje2();

	}
	@GetMapping("/selectViajesFinishOrCancelado")
	public List<ViajeBean> selectViajesFinishOrCancelado() {
		return this.viajeMapper.selectViajesForAssignViaje2();
	}
	
	@GetMapping("/selectViajesByCliente/{id}")
	public List<ViajeBean> selectViajesByCliente(@PathVariable int id) {
		return this.viajeMapper.selectViajesByCliente(id);

	}
	
	@GetMapping("/anyChoferHaveViajeInProcess/{id}")
	public MessageBean anyChoferHaveViajeInProcess(@PathVariable int id) {
		Boolean nose =  this.viajeMapper.anyChoferHaveViajeInProcess(id);
		return new MessageBean(nose);
	}
	
	@GetMapping("/anyClienteHaveViajeInProcess/{id}")
	public MessageBean anyClienteHaveViajeInProcess(@PathVariable int id) {
		Boolean nose =  this.viajeMapper.anyClienteHaveViajeInProcess(id);
		return new MessageBean(nose);
	}
	
	@PatchMapping
	public List<ViajeBean> selectViajesByRangeDt(@RequestBody Date desde, Date hasta ) {
		return this.viajeMapper.selectViajesByRangeDt(desde,hasta);
	}

	@PostMapping
	public long save(@RequestBody ViajeBean viaje) {
		return this.viajeMapper.insert(viaje);
	}

	@PutMapping
	public ViajeBean updateById(@RequestBody ViajeBean viaje) {
		 this.viajeMapper.updateById(viaje);
		 return this.getById(viaje.getId());
	}
	
	@DeleteMapping("/{nombreUsuario}")
	public void de(@PathVariable int id) {
		this.viajeMapper.deleteById(id);
	}

}
