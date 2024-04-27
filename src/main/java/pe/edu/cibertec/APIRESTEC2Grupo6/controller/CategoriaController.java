import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.WAEC2Grupo6.model.bd.Categoria;
import pe.edu.cibertec.WAEC2Grupo6.service.ICategoriaService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    private ICategoriaService iCategoriaService;

    @GetMapping("")
    public String frmCategoria(Model model){
        model.addAttribute("listarcategoria", iCategoriaService.listarCategorias());
        return "backoffice/categoria/frmcategoria";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Categoria> listarCategoria(){
        return iCategoriaService.listarCategorias();
    }

}
