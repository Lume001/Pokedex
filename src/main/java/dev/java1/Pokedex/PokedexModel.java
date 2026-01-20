package dev.java1.Pokedex;

import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;

@Entity
@Table(name ="tb_Pokedex")
public class PokedexModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    private int poder;

    public PokedexModel() {
    }

    public PokedexModel(String nome, String tipo, int poder) {
        this.nome = nome;
        this.tipo = tipo;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
