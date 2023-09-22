package com.example.prueba.repository;

import com.example.prueba.model.ImprimirModel;
import com.example.prueba.model.PartidasPedidoModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface ParidasPedidoRepo {
    @Insert(" INSERT INTO partidas_pedido " +
            " (id_pedido, id_articulo, cantidad) " +
            " VALUES(#{idPedido}, #{idArticulo}, #{cantidad}) ")
    Integer guardarPedido(PartidasPedidoModel partidasPedidoModel);
    @Select(" select\n" +
            " pp.id_partida as idPedido,\n" +
            " pp.cantidad, \n" +
            " a.precio,\n" +
            " pp.cantidad * a.precio as totalPago,\n" +
            " a.nombre,\n" +
            " a.descripcion,\n" +
            " c.nombre as nombreCliente\n" +
            " from partidas_pedido pp\n" +
            " inner join articulo a on pp.id_articulo = a.id_articulo \n" +
            " inner join pedidos p on pp.id_pedido = p.id_pedido \n" +
            " inner join cliente c on p.id_cliente = c.id_cliente \n" +
            " WHERE p.id_cliente = #{id} ")
    List<ImprimirModel> imprimir(Integer id);
}
