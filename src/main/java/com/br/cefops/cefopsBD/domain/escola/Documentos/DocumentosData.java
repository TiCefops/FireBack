package com.br.cefops.cefopsBD.domain.escola.Documentos;

import com.br.cefops.cefopsBD.domain.escola.AlunosData;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "Documentos")
public class DocumentosData  implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String cpf;
    private String rg;
    private Date dataemissaorg;
    private String orgaoemissorrg;
    private String estadoemissorrg;
    private String tituloeleitor;
    private String zona;
    private String secao;
    private Date dataemissaotitulo;
    private String estadoemissortitulo;
    private String nomedamae;
    private String nomedopai;
    @OneToOne()
    private AlunosData alunosId;

}
