package kodlama.io.trendyol.dataAccess.abstracts;

import kodlama.io.trendyol.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
