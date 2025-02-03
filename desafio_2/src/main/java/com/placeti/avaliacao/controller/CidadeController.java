package com.placeti.avaliacao.controller;

import com.placeti.avaliacao.dto.CidadeDTO;

import projeto_place_1.desafio_2.entity.Cidade;

import org.hibernate.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//--------------------------------------------------
/** Endpoint para consultar e manter cidades */
//--------------------------------------------------
@RequestMapping("/cidades")
public class CidadeController {

	//----------------------------------------------------------
	/** Endpoint que retorna uma cidade conforme seu ID */
	//----------------------------------------------------------
	public ResponseEntity<Cidade> buscarPeloId(Long id) {
		Cidade cidade = ProjetoService.pesquisarCidade(id);
        return ResponseEntity.ok(cidade);
	}
	
	//----------------------------------------------------------
	/** Endpoint que retorna todas as cidades cadastradas */
	//----------------------------------------------------------
	public List<CidadeDTO> pesquisarCidades() {
		  List<Cidade> Cidade = ProjetoService.listarTodasCidades();
	        return ResponseEntity.ok(Cidades);
	}
	
	//----------------------------------------------------------
	/** Endpoint para incluir nova cidade */
	//----------------------------------------------------------
	public void incluirCidade(CidadeDTO cidadeDto) {
		//	TODO: Responde POST em http://localhost:8080/placeti/cidades
		//	Envia JSON no body:
		//	{
		//	 	"nome": "Florianópolis",
		//	  	"uf": "SC",
		//	   	"capital": true
		//	}
	}	
	
	//----------------------------------------------------------
	/** Endpoint para alterar cidade */
	//----------------------------------------------------------
	public void alterarCidade(CidadeDTO cidadeDto) {
		cidadeDto.setId(id);
        CidadeDTO cidadeAtualizada = ProjetoService.s(CidadeDTO);
        return ResponseEntity.ok(cidadeAtualizada);
	}
	
	//----------------------------------------------------------
	/** Endpoint para excluir uma cidade */
	//----------------------------------------------------------
	public void excluirCidade(Long idCidade) {
		ProjetoService.deleteById(long id);
        return ResponseEntity.noContent().build();
	}	
}
