package com.br.cefops.cefopsBD.Controller.Loja;

import com.br.cefops.cefopsBD.Services.Loja.ItensServices;
import com.br.cefops.cefopsBD.data.vo.v1.loja.ItensLojaVo;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Endpoint itens loja",description = "EndPoint Responsavel Por Controlar o estoque da loja")
@ApiResponses({
        @ApiResponse(responseCode = "403", description = "Acesso não permitido",
                content = @Content),
        @ApiResponse(responseCode = "201", description = "Criado Com Sucesso",
                content = @Content),
})
@RestController()
@RequestMapping("/api/v1/loja")
public class ItensController {
    @Autowired
    ItensServices services;

    @PostMapping(value = "/adm/itens/novo")
    public ResponseEntity<ItensLojaVo> CreateNewItem(@RequestBody ItensLojaVo itens){
        return services.createNewIten(itens);
    }
    @GetMapping(value = "/itens")
    public ResponseEntity<List<ItensLojaVo>> getAllItems(){

        return  services.getAllItems();
    }
    @GetMapping(value = "/iten{id}")
    public ResponseEntity<ItensLojaVo> GetItemsById(@PathVariable Long id){
        return  ResponseEntity.ok().build();
    }
    @PatchMapping(value = "/adm/iten/{id}")
    public ResponseEntity<ItensLojaVo> disableIten(@RequestParam Long id){
        return  ResponseEntity.ok().build();
    }
}
