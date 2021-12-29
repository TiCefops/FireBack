package com.br.cefops.cefopsBD.repository.Seguranca;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    UserRepository repository;

    @Test
    void findByUsername() {
    }

    @Test
    void findUserByEmail() {
        var ac=repository.findUserByEmail("teste11@cadastroapp.com");
        assertEquals(false,ac.getEmail().isEmpty());
        assertEquals("00000000000",ac.getCpf());
    }
    @Test
    void findUserByCpf(){
        var data=repository.findUserByCpf("12345678911");
        assertEquals("Dias",data.getFristName());
    }
}