package com.br.cefops.cefopsBD.domain.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.CONFLICT)
public class ResourceDuplicateException  extends  RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;
    public ResourceDuplicateException(String exception) {
        super(exception);
    }
}
