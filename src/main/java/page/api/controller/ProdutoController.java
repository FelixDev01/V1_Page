package page.api.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping
    public ResponseEntity<Page<ProdutoResponseDTO>> listar(
            @PageableDefault(page = 0, size = 6) Pageable pageable){
        Page<ProdutoResponseDTO> responseDTOPage = service.listar(pageable);
        return ResponseEntity.status(200).body(responseDTOPage);
    }
}
