package com.example.prueba.repository;

import com.example.prueba.model.ClienteModel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClienteRepo {
    @Select(" SELECT id_cliente as idCliente, " +
            " nombre, " +
            " apellidos, " +
            " rfc\n" +
            " FROM cliente ")
    List<ClienteModel> obtenerClientes();
    @Insert(" INSERT INTO cliente\n" +
            " (nombre, apellidos, rfc)\n" +
            " VALUES(#{nombre}, #{apellidos}, #{rfc}) ")
    Integer guardarCliente(ClienteModel clienteModel);
    @Update(" UPDATE cliente " +
            " SET " +
            " nombre=#{nombre}, " +
            " apellidos=#{apellidos}, " +
            " rfc=#{rfc} " +
            " WHERE id_cliente=#{idCliente} ")
    Integer editarCliente(ClienteModel clienteModel);
    @Delete(" DELETE FROM cliente " +
            " WHERE id_cliente=#{id} ")
    Integer eliminarCliente(Integer id);
}
