package com.br.cefops.cefopsBD.Contratos;

import com.br.cefops.cefopsBD.data.vo.v1.loja.PedidosVo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface VendasControllerInterface {
    public ResponseEntity<PedidosVo>  newPedido(@RequestBody PedidosVo pedido);
    public ResponseEntity<List<PedidosVo>> getAllPedidos();
    public ResponseEntity<PedidosVo> statusPedido(@RequestParam Long Id);
    public ResponseEntity<PedidosVo> updatePedido(@RequestParam Long Id);



}
