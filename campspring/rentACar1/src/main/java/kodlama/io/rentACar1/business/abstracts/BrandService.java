package kodlama.io.rentACar1.business.abstracts;

import kodlama.io.rentACar1.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
