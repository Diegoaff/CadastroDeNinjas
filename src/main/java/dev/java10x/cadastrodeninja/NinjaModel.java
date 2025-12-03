package dev.java10x.cadastrodeninja;

import jakarta.persistence.*;
//JP$ = Java persistence API
// transforma uma clase em uma entidade do banco de dados(Entidy(
@Table(name = "tb_Cadastro")
@Entity
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
