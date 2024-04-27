package pe.edu.cibertec.APIRESTEC2Grupo6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Farmaco;


@Repository
public interface FarmacoRepository extends
        JpaRepository<Farmaco, Integer> {

}
