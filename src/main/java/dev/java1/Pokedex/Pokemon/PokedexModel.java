package dev.java1.Pokedex.Pokemon;

import dev.java1.Pokedex.Missoes.MissoesModel;
import jakarta.persistence.*;

@Entity
@Table(name ="tb_Pokedex")
public class PokedexModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tipo;
    private int poder;

    @ManyToOne // um pokemon tem uma unica missao
    @JoinColumn(name = "missoes_id")// Foreing Key ou Chave estrangeira
    private MissoesModel missoes;

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
