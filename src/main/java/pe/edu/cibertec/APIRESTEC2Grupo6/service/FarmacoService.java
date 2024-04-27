package pe.edu.cibertec.APIRESTEC2Grupo6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Farmaco;
import pe.edu.cibertec.APIRESTEC2Grupo6.repository.FarmacoRepository;

import java.util.List;

@Service
public class FarmacoService implements iFarmacoService {

    @Autowired
    private FarmacoRepository farmacoRepository;

    @Override
    public List<Farmaco> getAllFarmacos() {
        return farmacoRepository.findAll();
    }
}
