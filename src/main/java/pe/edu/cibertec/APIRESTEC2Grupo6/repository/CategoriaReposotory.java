package pe.edu.cibertec.APIRESTEC2Grupo6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Categoria;

@Repository
public interface CategoriaReposotory extends JpaRepository<Categoria, Integer> {
}
