package com.br.cefops.cefopsBD.repository.GestaoEscolar;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cefops.cefopsBD.domain.escola.Posts;

public interface PostRepository extends JpaRepository<Posts,Integer>{

}
