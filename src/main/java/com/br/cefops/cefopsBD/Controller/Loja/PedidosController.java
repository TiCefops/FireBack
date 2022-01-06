package com.br.cefops.cefopsBD.Controller.Loja;

import com.br.cefops.cefopsBD.Contratos.VendasControllerInterface;
import com.br.cefops.cefopsBD.data.vo.v1.loja.PedidosVo;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name = "Endpoint venda de items loja",description = "EndPoint Responsavel Por Controlar a venda  da loja")
@ApiResponses({
        @ApiResponse(responseCode = "403", description = "Acesso não permitido",
                content = @Content),
        @ApiResponse(responseCode = "201", description = "Criado Com Sucesso",
                content = @Content),
})
@RestController()
@RequestMapping("/api/v1/venda")
public class PedidosController implements VendasControllerInterface {

    @PostMapping(value = "/adm/payments/new")
    @Override
    public ResponseEntity<PedidosVo> newPedido(PedidosVo pedido) {
        return null;
    }
    @GetMapping(value = "/adm/payments")
    @Override
    public ResponseEntity<List<PedidosVo>> getAllPedidos() {
        return null;
    }
    @GetMapping(value = "/adm/payments/{id}")
    @Override
    public ResponseEntity<PedidosVo> statusPedido(@RequestParam Long Id) {
        return null;
    }
    @PatchMapping(value = "/adm/payments/{id}/update")
    @Override
    public ResponseEntity<PedidosVo> updatePedido(@RequestParam Long Id) {
        return null;
    }
}
