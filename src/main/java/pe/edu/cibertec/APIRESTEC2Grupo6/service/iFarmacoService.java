package pe.edu.cibertec.APIRESTEC2Grupo6.service;

import jakarta.transaction.Transactional;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Farmaco;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.dbo.FarmacoRequestDto;

import java.util.List;

public interface iFarmacoService {
    Farmaco registrarFarmaco(FarmacoRequestDto farmacoRequestDto);
}
