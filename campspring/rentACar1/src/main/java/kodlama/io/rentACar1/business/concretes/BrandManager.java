package kodlama.io.rentACar1.business.concretes;

import kodlama.io.rentACar1.business.abstracts.BrandService;
import kodlama.io.rentACar1.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar1.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
