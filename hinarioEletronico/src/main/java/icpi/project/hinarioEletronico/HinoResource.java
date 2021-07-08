package icpi.project.hinarioEletronico;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import icpi.project.hinarioEletronico.model.Hino;
import icpi.project.hinarioEletronico.repo.HinoRepo;
import icpi.project.hinarioEletronico.service.HinoService;

@RestController
@RequestMapping("/hinario")
public class HinoResource {
    
    @Autowired
    private final HinoRepo hymnRepo;

    private final HinoService hymnService;

    public HinoResource(HinoService hinoService, HinoRepo hinoRepo) {
        this.hymnRepo = hinoRepo;
        this.hymnService = hinoService;

    }

    @GetMapping("/find/all")
    public ResponseEntity<List<Hino>> getAllHymns() {

        List<Hino> hinos = hymnService.findAllHinos();
        return new ResponseEntity<>(hinos, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Hino> getHinoById(@PathVariable("id") Long id){

        Hino Hino = hymnService.findHinoById(id);
        return new ResponseEntity<>(Hino, HttpStatus.OK);

    }

    @GetMapping("/findNumero/{numero}")
    public ResponseEntity<Hino> getHinoById(@PathVariable("numero") Integer numero){

        Hino Hino = hymnService.findHinoByNumber(numero);
        return new ResponseEntity<>(Hino, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<Hino> addHino(@RequestBody Hino hino){

        Hino newHino = hymnService.addHino(hino);
        return new ResponseEntity<>(newHino, HttpStatus.CREATED);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Hino> deleteHino(@PathVariable("id") Long id){
        
        Hino hino = hymnService.findHinoById(id);
        hymnRepo.delete(hino);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
