package com.br.cefops.cefopsBD.Services.escola;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class DocumentosServiceTest {
    @Autowired
    DocumentosService service;

    @Test
    void buscarDocumentos() {
        var data=service.buscarDocumentos("00067102935");
        assertEquals("Wally", data.getAlunosId().getName());
    }

    @Test
    void novoDocumento() {

    }
}