package uy.edu.cei.taller.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import uy.edu.cei.taller.bean.ViajeBean;

@Mapper
public interface ViajeMapper {

	public List<ViajeBean> selectAll();
	public List<ViajeBean> selectByRangeOfDate(@Param("desde") Date desde,@Param("hasta") Date hasta);
	public ViajeBean selectById(@Param("id") long id);
	public void insert(@Param("viaje") ViajeBean viaje);
	public ViajeBean updateById(@Param("viaje") ViajeBean viaje);
	public void deleteById(@Param("id") int id);	
		
}
