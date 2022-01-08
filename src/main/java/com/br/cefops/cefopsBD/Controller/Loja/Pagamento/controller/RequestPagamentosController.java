package com.br.cefops.cefopsBD.Controller.Loja.Pagamento.controller;
import com.br.cefops.cefopsBD.Controller.Loja.Pagamento.Model.LoginModel;
import com.br.cefops.cefopsBD.data.vo.v1.gestaoEscolar.AlunosVo;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class RequestPagamentosController {
    WebClient client = WebClient.builder()
            .baseUrl("https://servidorcefops.herokuapp.com")
            .defaultHeaders(header -> header.setBasicAuth("adm", "1234"))
            .build();
    String token="";
    public  LoginModel  teste() throws URISyntaxException {

        Map<String, String> bodyMap = new HashMap();
        bodyMap.put("username","adm");
        bodyMap.put("password","1234");

        LoginModel response = client.post()
                .uri("/auth/signin")
                .body(BodyInserters.fromValue(bodyMap))
                .retrieve()
                .bodyToMono(LoginModel.class)
                .block();
        //Token
        token=response.getToken();

        WebClient.ResponseSpec responseSpec = client.get()
                .uri("/api/v1/alunos")
                .header("Authorization", "Bearer "+token)
                .retrieve();
        Flux<AlunosVo> responseBody = responseSpec.bodyToFlux(AlunosVo.class);

        System.out.println(responseBody);
        return response;

    }



}
