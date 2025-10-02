package page.api.dto;

import page.api.model.Produto;

public record ProdutoResponseDTO(Long id,
                                 String nome,
                                 String descricao,
                                 Double preco,
                                 String imageUrl) {
    public ProdutoResponseDTO(Produto salvo) {
        this(salvo.getId(), salvo.getNome(), salvo.getDescricao(), salvo.getPreco(), salvo.getImageUrl());
    }
}
