package page.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import page.api.dto.ProdutoRequestDTO;
import page.api.dto.ProdutoResponseDTO;
import page.api.model.Produto;
import page.api.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<ProdutoResponseDTO> cadastrar(@RequestBody ProdutoRequestDTO dto){
        ProdutoResponseDTO prodCriado = service.cadastrar(dto);
        return ResponseEntity.status(201).body(prodCriado);
    }
}
