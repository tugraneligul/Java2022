package kodlama.io.rentACar1.dataAccess.abstracts;

import kodlama.io.rentACar1.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository {
    List<Brand>  getAll();
}
