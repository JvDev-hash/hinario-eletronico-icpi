package icpi.project.hinarioEletronico.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import icpi.project.hinarioEletronico.exception.UserNotFoundException;
import icpi.project.hinarioEletronico.model.Hino;
import icpi.project.hinarioEletronico.repo.HinoRepo;

@Service
public class HinoService {
    
    private final HinoRepo hymnRepo;

    @Autowired
    public HinoService(HinoRepo hinoRepo) {
        this.hymnRepo = hinoRepo;
    }

    public List<Hino> findAllHinos() {
        return hymnRepo.findAll();
    }

    public Hino addHino(Hino notice){
        return hymnRepo.save(notice);
    }

    public Hino findHinoById(Long id) {
        return hymnRepo.findHinoById(id)
                    .orElseThrow(() -> new UserNotFoundException("Hymn by id: "+id+"was not found"));
    }

    public Hino findHinoByNumber(Integer numero) {
        return hymnRepo.findHinoBynumero(numero)
                    .orElseThrow(() -> new UserNotFoundException("Não foi encontrado um hino com o número"+numero));
    }
}
