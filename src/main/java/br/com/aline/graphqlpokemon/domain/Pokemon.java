package br.com.aline.graphqlpokemon.domain;

import javax.persistence.*;

@Entity
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "tipo", nullable = false)
    private String tipo;

    @Column(name = "idade", nullable = false)
    private Integer idade;

    @Deprecated
    Pokemon() {
    }

    public Pokemon(String nome, String tipo, Integer idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getIdade() {
        return idade;
    }
}