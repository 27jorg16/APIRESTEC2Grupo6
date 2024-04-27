package pe.edu.cibertec.APIRESTEC2Grupo6.service;

import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Farmaco;
import java.util.List;

public interface iFarmacoService {
    List<Farmaco> getAllFarmacos();
}
