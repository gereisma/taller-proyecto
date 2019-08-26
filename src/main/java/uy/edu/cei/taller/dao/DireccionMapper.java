package uy.edu.cei.taller.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import uy.edu.cei.taller.bean.DireccionBean;

@Mapper
public interface DireccionMapper {

		DireccionBean selectByidUsuario(long idUsuario);
		
		public void deleteByIdUsuario(@Param("idUsuario") long idUsuario);

		void insert(@Param("direccion")DireccionBean direccion);

		

}
