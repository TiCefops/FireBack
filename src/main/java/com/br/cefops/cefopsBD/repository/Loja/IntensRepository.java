package com.br.cefops.cefopsBD.repository.Loja;

import com.br.cefops.cefopsBD.domain.escola.Loja.ItensLoja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntensRepository extends JpaRepository<ItensLoja, Long> {
}
