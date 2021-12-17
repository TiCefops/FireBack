package com.br.cefops.cefopsBD.Services.escola;

import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.RequerimentsTypysVo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class RequerimentTaypeServiceTest {
    @Autowired
    RequerimentTaypeService service;

    @Test
    void encontrarTodosTiposRequerimentos() {
        List<RequerimentsTypysVo> data=service.EncontrarTodosTiposRequerimentos();
        assertEquals(false,data.isEmpty());
    }

    @Test
    void criarTopoRequerimento() {
    }

    @Test
    void atualizarTipoRequerimento() {
    }
}