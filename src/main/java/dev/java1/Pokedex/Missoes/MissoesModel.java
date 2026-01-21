package dev.java1.Pokedex.Missoes;
import dev.java1.Pokedex.Pokemon.PokedexModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeMissao;

    private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<PokedexModel> pokemons;





}
