package com.tuyo.funcionariosdata.entities;

import com.tuyo.funcionariosdata.funcionario.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {
}
