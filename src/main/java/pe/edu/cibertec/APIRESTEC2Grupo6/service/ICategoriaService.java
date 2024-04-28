package pe.edu.cibertec.APIRESTEC2Grupo6.service;

import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Categoria;

import java.util.List;

public interface ICategoriaService {
    List<Categoria> listarCaterorias();
    Categoria registrarCategoria(Categoria categoria);
}
