package com.br.cefops.cefopsBD.domain.Financias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Table(name = "fluxo_caixa")
@Entity
public class FluxoCaixa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateFluxo;
//    @OneToMany()
//    private FinanceInterna fluxos;

}