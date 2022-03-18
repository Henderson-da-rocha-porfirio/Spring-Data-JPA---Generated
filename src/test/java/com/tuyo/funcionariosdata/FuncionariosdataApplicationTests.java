package com.tuyo.funcionariosdata;

import com.tuyo.funcionariosdata.entities.Funcionario;
import com.tuyo.funcionariosdata.repository.FuncionarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FuncionariosdataApplicationTests {

    @Autowired
    FuncionarioRepository repository;

    @Test
    void testCreateFuncionario() {

        Funcionario funcionario = new Funcionario();
        funcionario.setName("John");

        repository.save(funcionario);
    }
}
