package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Previsao;


public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {

}
