package com.example.exercicio08;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/fipe")
public class FipeController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/valor/{marca}/{modelo}/{ano}")
    public ResponseEntity<String> getValorFipe(
            @PathVariable String marca,  // Código da marca
            @PathVariable String modelo,  // Código do modelo
            @PathVariable String ano) {   // Código do ano

        String url = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca + "/modelos/" + modelo + "/anos/" + ano;

        // Verifique se a URL está correta
        try {
            String result = restTemplate.getForObject(url, String.class);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            // Logar o erro ou retornar uma mensagem de erro
            return ResponseEntity.status(500).body("Erro ao acessar a API FIPE: " + e.getMessage());
        }
    }
}
