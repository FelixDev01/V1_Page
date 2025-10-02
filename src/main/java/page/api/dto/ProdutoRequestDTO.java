package page.api.dto;

public record ProdutoRequestDTO(String nome,
                                String descricao,
                                Double preco,
                                String imageUrl) {
}
