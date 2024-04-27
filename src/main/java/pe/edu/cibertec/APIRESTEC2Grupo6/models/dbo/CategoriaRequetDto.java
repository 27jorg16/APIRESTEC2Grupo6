package pe.edu.cibertec.APIRESTEC2Grupo6.models.dbo;

import lombok.Data;

import java.util.Date;

@Data
public class CategoriaRequetDto {
    private String nomCategoria;
    private String descripCategoria;
    private Date fechaRegistro;
}
