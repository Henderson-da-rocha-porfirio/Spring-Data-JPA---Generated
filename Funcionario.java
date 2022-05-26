package com.tuyo.funcionariosdata.entities;

import javax.persistence.*;

@Entity
public class Funcionario {

    @TableGenerator(name = "funcionarios_gen",table = "ger_id",pkColumnName = "ger_name",valueColumnName = "ger_val ",allocationSize=100)        //Colocamos um nome para a tabela geradora. E em table, o nome da tabela como está no banco.
    @Id                                                                                                                                             // Informamos com TableGenerator qual a nossa tabela geradora e suas informacoes.
    @GeneratedValue(strategy= GenerationType.TABLE,generator = "funcionarios_gen")                                                               // Ao utilizar TableGenerator se faz necesário colocar no strategy TABLE e generator.
    private int id;                                                                                                                             // O gerador de tabela TableGenerator prover a informacao da tabela, coluna, tamanho da alocação, e foi usado em GeneratedValue um strategy com a tabela chamada corretamente.
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
