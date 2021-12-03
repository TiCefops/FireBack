//package com.br.cefops.cefopsBD.converter;
//
//import org.springframework.stereotype.Service;
//
//import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.RequerimentoVo;
//import com.br.cefops.cefopsBD.domain.escola.Requerimentos.Requerimentos;
//
//@Service
//public class RequerimentConverter {
//
//	public RequerimentoVo convertEntityToVo(Requerimentos requerimentos) {
//		String nomeCompleto=requerimentos.getAluno().getName() +requerimentos.getAluno().getLastName();
//		RequerimentoVo vo=new RequerimentoVo();
//
//		vo.setId(requerimentos.getId());
//		vo.setStatus(requerimentos.getStatus());
//		vo.setResponsavel(requerimentos.getResponsavel());
//		vo.setEntregue(requerimentos.getEntregue());
//		vo.setConcluido(requerimentos.getConcluido());
//		vo.setDataatualizacao(requerimentos.getDataatualizacao());
//		vo.setNomeAluno(nomeCompleto);
//		vo.setIdaluno(requerimentos.getAluno().getId());
//		vo.setAbertoem(requerimentos.getAbertoem());
//		vo.setAluno(requerimentos.getAluno());
//		vo.setTipo(requerimentos.getTipo());
//
//
//		return vo;
//	}
//
//	public Requerimentos convertVoToEntity(RequerimentoVo requerimentosVo) {
//		Requerimentos entity=new Requerimentos();
//		String nomeAluno=requerimentosVo.getAluno().getName()+requerimentosVo.getAluno().getLastName();
//
//		entity.setConcluido(requerimentosVo.getConcluido());
//		entity.setEntregue(requerimentosVo.getEntregue());
//		entity.setId(requerimentosVo.getId());
//		entity.setResponsavel(requerimentosVo.getResponsavel());
//		entity.setStatus(requerimentosVo.getStatus());
//		entity.setTipo(requerimentosVo.getTipo());
//		entity.setAbertoem(requerimentosVo.getAbertoem());
//		entity.setAluno(requerimentosVo.getAluno());
//		entity.setDataatualizacao(requerimentosVo.getDataatualizacao());
//		entity.setNomeAluno(nomeAluno);
//		entity.setIdaluno(requerimentosVo.getAluno().getId());
//		return entity;
//
//	}
//}
