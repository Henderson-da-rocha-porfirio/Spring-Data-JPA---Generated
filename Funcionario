package com.tuyo.funcionariosdata.entities;

import javax.persistence.*;

@Entity
public class Funcionario { // Entidade funcionario com geracao de ID sem uma tabela geradora e usando o IDENTITY.

    
    @Id                                                        
    @GeneratedValue(strategy= GenerationType.IDENTITY)                 // Mostrando ao Hibernate como gerar uma estratégia.
    private int id;                                                    // IDENTITY é usado quando queremos que o Hibernate saiba que o que está no database é uma Coluna ID e automaticamente o database proverá o auto-incremento.
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
