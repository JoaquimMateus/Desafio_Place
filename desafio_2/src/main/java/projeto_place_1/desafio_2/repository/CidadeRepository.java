package projeto_place_1.desafio_2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto_place_1.desafio_2.entity.Cidade;
@Repository
//----------------------------------------------
/** Repositório para entidade Cidade */
//----------------------------------------------
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
	
    List<Cidade> findAll();


    Optional<Cidade> findById(Long id);

   
    List<Cidade> findByNome(String NOME);

 
    <S extends Cidade> S save(S entity);

   
    void deleteById(Long id);
}