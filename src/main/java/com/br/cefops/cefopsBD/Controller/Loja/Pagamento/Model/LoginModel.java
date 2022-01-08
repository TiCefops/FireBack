package com.br.cefops.cefopsBD.Controller.Loja.Pagamento.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginModel {
    private String alunoID;
    private String[] role;
    private String foto;
    private String fullName;
    private String token;
}
