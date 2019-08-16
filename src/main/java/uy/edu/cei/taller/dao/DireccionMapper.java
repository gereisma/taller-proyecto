package uy.edu.cei.taller.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import uy.edu.cei.taller.bean.DireccionBean;

public interface DireccionMapper {

		DireccionBean selectByidUsuario(String nombre);
		
		public void deleteByIdUsuario(@Param("idUsuario") int idUsuario);

		void insert(DireccionBean direccion);

		

}
