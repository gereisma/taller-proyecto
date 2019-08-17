package uy.edu.cei.taller.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import uy.edu.cei.taller.bean.UsuarioBean;

@Mapper
public interface UsuarioMapper {

	public List<UsuarioBean> selectAll();
	public UsuarioBean selectByNombreUsuario(@Param("nombreUsuario") String nombreUsuario);
	public List<UsuarioBean> selectIfNameStartWith(@Param("nombreUsuario") String nombreUsuario);
	public UsuarioBean selectById(@Param("id") long id);
	public void insert(@Param("usuario") UsuarioBean usuario);
	public void updateByIdOrNombreUsuario(@Param("usuario") UsuarioBean usuario);
	public void deleteById(@Param("id") long id);	
	public void deleteByNombreUsuario(@Param("nombreUsuario") String nombreUsuario);	
		
}
