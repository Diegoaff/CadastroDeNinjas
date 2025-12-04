package dev.java10x.cadastrodeninja.Missoes;

import dev.java10x.cadastrodeninja.Ninjas.Controller.NinjaModel;
import jakarta.persistence.*;

@Table(name = "tb_missoes")
@Entity
public class MissoeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String dificuldade;
    //uma missa pode ter varios ninjas
    @OneToMany(mappedBy = "tb_missoes")
    private NinjaModel ninjas;


    public MissoeModel(Long id, String nomeMissao, String dificuldade) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.dificuldade = dificuldade;
    }
}
