package pe.edu.cibertec.APIRESTEC2Grupo6.models.dbo;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class FarmacoRequestDto {

    private Integer idfarmaco;
    private String nombrefarmaco;
    private String composicion;
    private Date FechaVencimiento;

}
