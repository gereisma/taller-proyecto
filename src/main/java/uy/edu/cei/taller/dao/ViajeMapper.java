package uy.edu.cei.taller.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import uy.edu.cei.taller.bean.ViajeBean;

@Mapper
public interface ViajeMapper {
	
	public List<ViajeBean> selectAll();
	
	public List<ViajeBean> selectViajesFinishOrCancelado();
	public List<ViajeBean> selectViajesForAssignViaje2();
	public List<ViajeBean> selectViajesByCliente(@Param("id") int id);
	public Boolean anyClienteHaveViajeInProcess(@Param("id") int id);
	public Boolean anyChoferHaveViajeInProcess(@Param("id") int id);
	public List<ViajeBean> selectViajesByRangeDt(@Param("desde") Date desde,@Param("hasta") Date hasta);
	public ViajeBean selectById(@Param("id") int id);
	public void insert(@Param("viaje") ViajeBean viaje);
	public void updateById(@Param("viaje") ViajeBean viaje);
	public int getIdByViaje(@Param("viaje") ViajeBean viaje);
	public void deleteById(@Param("id") int id);	
		
}
