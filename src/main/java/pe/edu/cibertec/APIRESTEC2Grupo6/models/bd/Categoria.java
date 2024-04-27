package pe.edu.cibertec.APIRESTEC2Grupo6.models.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCategoria;

    private String nomCategoria;
    private String descripCategoria;
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "IdFarmaco")
    private Farmaco farmaco;
}
