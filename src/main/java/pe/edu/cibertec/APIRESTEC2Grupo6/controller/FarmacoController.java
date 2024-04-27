package pe.edu.cibertec.APIRESTEC2Grupo6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Farmaco;
import pe.edu.cibertec.APIRESTEC2Grupo6.repository.FarmacoRepository;
import java.util.List;

@RestController
public class FarmacoController {

    @Autowired
    private FarmacoRepository farmacoRepository;

    @GetMapping("/farmacos")
    public List<Farmaco> getAllFarmacos() {
        return farmacoRepository.findAll();
    }
}