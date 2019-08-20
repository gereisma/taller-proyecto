package uy.edu.cei.taller.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import uy.edu.cei.taller.bean.DireccionBean;

@Mapper
public interface DireccionMapper {

		DireccionBean selectByidUsuario(String nombre);
		
		public void deleteByIdUsuario(@Param("idUsuario") int idUsuario);

		void insert(DireccionBean direccion);

		

}
