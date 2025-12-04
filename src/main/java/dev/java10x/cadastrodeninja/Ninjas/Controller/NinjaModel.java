package dev.java10x.cadastrodeninja.Ninjas.Controller;

import dev.java10x.cadastrodeninja.Missoes.MissoeModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_Cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private int idade;
// um ninja tem um unica missao
    @ManyToMany(mappedBy = "ninja", cascade = CascadeType.ALL)
    @JoinColumn(name = "Missoes_id")//foreing key == chave estrsngeira
    private List<MissoeModel> missoes;

    public NinjaModel() {}

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<MissoeModel> getMissoes() {
        return missoes;
    }

    public void setMissoes(List<MissoeModel> missoes) {
        this.missoes = missoes;
    }
}
