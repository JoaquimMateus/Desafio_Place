package services;

import projeto_place_1.desafio_2.dto.CidadeDTO;
import projeto_place_1.desafio_2.entity.Cidade;
import projeto_place_1.desafio_2.repository.CidadeRepository;

import org.aspectj.apache.bcel.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;

//------------------------------------------------------------------
/** Service usado para acessar os repositórios da aplicação */
//------------------------------------------------------------------
@Service
public class ProjetoService {
	
	@Autowired
	private final Logger logger = LoggerFactory.getLogger(getClass());


	//--------------------------------------------------------- 
	/** Método que busca uma cidade pelo seu ID */
	//---------------------------------------------------------
	public Cidade pesquisarCidade(Long id) {
		return CidadeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cidade não encontrada"));
	
	}

	//---------------------------------------------------------
	/** Método que retorna todas as cidades cadastradas */
	//---------------------------------------------------------
	public List<CidadeDTO> pesquisarCidades() {
		return CidadeRepository.findAll();

	}

	//----------------------------------------------------------
	/** Método chamado para incluir uma nova cidade */
	//----------------------------------------------------------	
	public void incluirCidade(CidadeDTO dto) {
		return CidadeRepository.save(CidadeDTO);
		
	}

	//----------------------------------------------------------
	/** Método chamado para alterar os dados de uma cidade 
	 * @return */
	//----------------------------------------------------------
	public Cidade alterarCidade(Cidade dto) {
		return CidadeRepository.save(dto);

	}

	//----------------------------------------------------------
	/** Método chamado para excluir uma cidade */
	//----------------------------------------------------------	
	public void excluirCidade(Long idCidade) {
		CidadeRepository.deleteById(idCidade);
	}

	public Logger getLogger() {
		return logger;
	}
}
