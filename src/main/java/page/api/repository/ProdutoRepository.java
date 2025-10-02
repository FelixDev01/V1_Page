package page.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import page.api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
