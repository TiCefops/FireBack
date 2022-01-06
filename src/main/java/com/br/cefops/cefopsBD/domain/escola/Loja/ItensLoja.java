package com.br.cefops.cefopsBD.domain.escola.Loja;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "items_loja")
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ItensLoja {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nome;
    private String categoria;
    private double valor;
    private double quantidade;
    private double descontode;
    @Column(nullable = false, columnDefinition ="tinyint(1) default 1"  )
    private boolean ativo;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ItensLoja itemsLoja = (ItensLoja) o;
        return id != null && Objects.equals(id, itemsLoja.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}