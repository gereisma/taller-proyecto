package uy.edu.cei.taller.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import uy.edu.cei.taller.bean.ClienteBean;

@Mapper
public interface ClienteMapper {

	public List<ClienteBean> selectAll();

	public ClienteBean selectByNombreCliente(@Param("nombre") String nombre);

	public List<ClienteBean> selectIfNameStartWith(@Param("nombre") String nombre);

	public ClienteBean selectById(@Param("id") long id);

	public void insert(@Param("cliente") ClienteBean cliente);

	public void updateByIdOrNombreCliente(@Param("cliente") ClienteBean cliente);

	public void deleteById(@Param("id") int id);

	public void deleteByNombre(String nombre);

}
