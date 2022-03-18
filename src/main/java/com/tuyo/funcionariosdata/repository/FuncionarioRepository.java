package com.tuyo.funcionariosdata.repository;

import com.tuyo.funcionariosdata.entities.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer> {
}
