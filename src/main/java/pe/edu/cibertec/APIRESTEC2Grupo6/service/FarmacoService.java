package pe.edu.cibertec.APIRESTEC2Grupo6.service;

import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Categoria;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.bd.Farmaco;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.dbo.CategoriaRequetDto;
import pe.edu.cibertec.APIRESTEC2Grupo6.models.dbo.FarmacoRequestDto;
import pe.edu.cibertec.APIRESTEC2Grupo6.repository.FarmacoRepository;

import java.util.List;

@NoArgsConstructor
@Service
public class FarmacoService implements iFarmacoService {
    private FarmacoRepository farmacoRepository;
    private ICategoriaService iCategoriaService;

    @Transactional
    @Override
    public Farmaco registrarFarmaco(FarmacoRequestDto farmacoRequestDto) {
       Farmaco farmaco = new Farmaco();
       farmaco.setNombrefarmaco(farmacoRequestDto.getNombrefarmaco());
       farmaco.setComposicion(farmacoRequestDto.getComposicion());
       farmaco.setFechaVencimiento(farmacoRequestDto.getFechaVencimiento());
       Farmaco nuevoFarmaco = farmacoRepository.save(farmaco);
        Categoria categoria;
        for (CategoriaRequetDto categoriaRequetDto: farmacoRequestDto.getCategoria()){
            categoria = new Categoria();
            categoria.setNomCategoria(categoriaRequetDto.getNomCategoria());
            categoria.setDescripCategoria(categoriaRequetDto.getDescripCategoria());
            categoria.setFechaRegistro(categoriaRequetDto.getFechaRegistro());
        }
        return nuevoFarmaco;
    }
}

