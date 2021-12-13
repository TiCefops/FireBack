package com.br.cefops.cefopsBD.Services.escola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cefops.cefopsBD.converter.DozerConvert;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.EnderecoVo;
import com.br.cefops.cefopsBD.domain.escola.Documentos.Endereco;
import com.br.cefops.cefopsBD.domain.Exception.ResourceNotFoundException;
import com.br.cefops.cefopsBD.repository.GestaoEscolar.Documentos.EndrerecoRepository;

@Service
public class EnderecoService {

	@Autowired
	EndrerecoRepository repository;
	
	
	public EnderecoVo NovoEndereco(EnderecoVo enderecoVo) {
		var entity=DozerConvert.parseObject(enderecoVo, Endereco.class);
		EnderecoVo vo=DozerConvert.parseObject(repository.save(entity), EnderecoVo.class);

		return vo;
	}
	
	public EnderecoVo BuscarEnderecoPorAlunoID(String id) {
		var entity=repository.buscarAlunoId(id);
		if (entity==null){
			EnderecoVo dataNull=new EnderecoVo();
			dataNull.setBairro("Não cadastrado");
			dataNull.setCep("00000000");
			dataNull.setCidade("Não cadastrado");
			dataNull.setNumero("000");
			dataNull.setComplemento("Não cadastrado");
			dataNull.setRua("Não cadastrado");
			dataNull.setUf("ND");
			dataNull.setEstado("Não cadastrado");
			dataNull.setId(0L);

			return dataNull;
		}else {
			EnderecoVo data=DozerConvert.parseObject(entity, EnderecoVo.class);
			return data;
		}


		
	}
	public EnderecoVo AtualizarEndereco(EnderecoVo endereco) {
		Endereco entity=repository.findById(endereco.getId()).orElseThrow(()->
		new ResourceNotFoundException("Não Encontramos Nehum Endereço Com esta ID"));
		
		entity.setBairro(endereco.getBairro());
		entity.setCep(endereco.getCep());
		entity.setCidade(endereco.getCidade());
		entity.setComplemento(endereco.getComplemento());
		entity.setEstado(endereco.getEstado());
		entity.setNumero(endereco.getNumero());
		entity.setRua(endereco.getRua());
		entity.setUf(endereco.getUf());
		
		var vo=DozerConvert.parseObject(repository.save(entity), EnderecoVo.class);
		return vo;
		
	}


	
}
