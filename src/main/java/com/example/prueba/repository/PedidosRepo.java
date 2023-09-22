package com.example.prueba.repository;

import com.example.prueba.model.PedidosModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PedidosRepo {
    @Insert(" INSERT INTO pedidos\n" +
            " (id_cliente, descripcion)\n" +
            " VALUES(#{idCliente}, #{descripcion}) ")
    Integer guardarPedido(PedidosModel pedidosModel);
    @Select(" SELECT " +
            " id_pedido as idPedido, " +
            " id_cliente as idCliente, " +
            " descripcion\n" +
            " FROM pedidos WHERE id_cliente = #{id} ")
    List<PedidosModel> listarPedido(Integer id);
}
