package com.br.cefops.cefopsBD.domain.escola.Loja;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Table(name = "pedido")
@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String idTransicao;
    private String codigoTrasicao;
    @ManyToMany
    @JoinColumn(name = "itens")
    private List<ItensLoja> itens;
    @OneToOne
    @JoinColumn(name = "aluno_id")
    private AlunosData alunoId;
    @Column(nullable = false, columnDefinition ="tinyint(1) default 0"  )
    private Boolean vencido;
    private  Date dataPagamento;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME DEFAULT CURRENT_TIMESTAMP")
    private Date dataPedido;
    private  Date dataVencimento;
    private  int statusPagamento;
    private  int tipoPagamento;
    private  Double valor;
    private  Double valorTotal;
    private  Double desconto;
    private  Double valorTotalComDesconto;
    private  Double valorPago;
    private String origem;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pedidos vendas = (Pedidos) o;
        return id != null && Objects.equals(id, vendas.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}