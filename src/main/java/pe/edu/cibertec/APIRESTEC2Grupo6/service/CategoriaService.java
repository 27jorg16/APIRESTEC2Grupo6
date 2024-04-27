package pe.edu.cibertec.APIRESTEC2Grupo6.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Categoria;
import pe.edu.cibertec.APIRESTEC2Grupo6.repository.CategoriaReposotory;

@NoArgsConstructor
@Service
public class CategoriaService implements ICategoriaService{
    private CategoriaReposotory categoriaReposotory;
    @Override
    public Categoria registrarCategoria(Categoria categoria) {
        return categoriaReposotory.save(categoria);
    }
}
