package page.api.service;

import org.springframework.stereotype.Service;
import page.api.dto.ProdutoRequestDTO;
import page.api.dto.ProdutoResponseDTO;
import page.api.model.Produto;
import page.api.repository.ProdutoRepository;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    /// POST
    public ProdutoResponseDTO cadastrar(ProdutoRequestDTO dto){
        Produto produto = new Produto();
        produto.setNome(dto.nome());
        produto.setDescricao(dto.descricao());
        produto.setPreco(dto.preco());
        produto.setImageUrl(dto.imageUrl());

        Produto salvo = repository.save(produto);
        return new ProdutoResponseDTO(salvo);
    }



}
