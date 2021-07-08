package icpi.project.hinarioEletronico.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import icpi.project.hinarioEletronico.model.Hino;

public interface HinoRepo extends JpaRepository<Hino, Long>{

    void deleteHinoById(Long id);

    Optional<Hino> findHinoById(Long id);

    Optional<Hino> findHinoBynumero(Integer numero);
}
