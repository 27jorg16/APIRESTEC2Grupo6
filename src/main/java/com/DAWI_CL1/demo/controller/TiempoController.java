package com.DAWI_CL1.demo.controller;

import com.DAWI_CL1.demo.model.Tiempo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class TiempoController {

    @GetMapping("/calcularMinutos")
    public String mostrarFormularioTiempo(Model model) {
        model.addAttribute("tiempo", new Tiempo());
        return "tiempo";
    }

    @PostMapping("/calcularMinutos")
    public String calcularMinutos(@ModelAttribute("tiempo") Tiempo tiempo, Model model) {
        int segundos = tiempo.getSegundos();
        int minutos = segundos / 60;

        model.addAttribute("minutos", minutos);
        return "tiempo";
    }
}
