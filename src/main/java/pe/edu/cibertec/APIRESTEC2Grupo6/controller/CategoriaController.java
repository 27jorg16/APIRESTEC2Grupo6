package pe.edu.cibertec.APIRESTEC2Grupo6.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Categoria;
import pe.edu.cibertec.APIRESTEC2Grupo6.service.ICategoriaService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/categoria")
public class CategoriaController() {

    private ICategoriaService iCategoriaService;

    @GetMapping("/categorias")
    public String frmCategoria(Model model){
        model.addAttribute("listarcategoria", iCategoriaService.listarCaterorias());
        return "backoffice/categoria/frmcategoria";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Categoria> listarCategoria(){

        return iCategoriaService.listarCaterorias();
    }

}
