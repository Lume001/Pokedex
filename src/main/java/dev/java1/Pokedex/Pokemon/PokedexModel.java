package dev.java1.Pokedex.Pokemon;

import dev.java1.Pokedex.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="tb_Pokedex")
@NoArgsConstructor // lombok, constroi um construtor sem argumentos
@AllArgsConstructor// lombok, constroi um construtor com argumentos
@Data// constroi getters e setters automaticamente

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


}
