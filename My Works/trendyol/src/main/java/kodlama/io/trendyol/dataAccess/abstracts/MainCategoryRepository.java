package kodlama.io.trendyol.dataAccess.abstracts;

import kodlama.io.trendyol.entities.concretes.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainCategoryRepository extends JpaRepository<MainCategory,Integer> {
}
