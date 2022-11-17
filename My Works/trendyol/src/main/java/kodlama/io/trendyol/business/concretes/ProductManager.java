package kodlama.io.trendyol.business.concretes;

import kodlama.io.trendyol.business.abstracts.ProductService;
import kodlama.io.trendyol.business.requests.productRequest.CreateProductRequest;
import kodlama.io.trendyol.business.requests.productRequest.DeleteProductRequest;
import kodlama.io.trendyol.business.requests.productRequest.UpdateProductRequest;
import kodlama.io.trendyol.business.responses.productResponse.GetAllProductResponse;
import kodlama.io.trendyol.business.responses.productResponse.GetByIdProductResponse;
import kodlama.io.trendyol.dataAccess.abstracts.CategoryRepository;
import kodlama.io.trendyol.dataAccess.abstracts.ProductRepository;
import kodlama.io.trendyol.entities.concretes.Category;
import kodlama.io.trendyol.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Autowired
    public ProductManager(ProductRepository productRepository , CategoryRepository categoryRepository){
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<GetAllProductResponse> getAll() {
        List<Product> products = productRepository.findAll();
        List<GetAllProductResponse> productResponse = new ArrayList<GetAllProductResponse>();

        for (Product product : products){
            GetAllProductResponse responseItem = new GetAllProductResponse();
            responseItem.setName(product.getName());
            responseItem.setCategoryName(product.getCategory().getName());
            productResponse.add(responseItem);
        }

        return productResponse;
    }

    @Override
    public GetByIdProductResponse getById(int id) {
        Product product = productRepository.findById(id).get();
        GetByIdProductResponse responseItem = new GetByIdProductResponse();
        responseItem.setName(product.getName());
        return responseItem;
    }

    @Override
    public void add(CreateProductRequest createProductRequest) {
        Product product = new Product();
        Category category = categoryRepository.findById(createProductRequest.getCategoryId()).get();
        product.setName(createProductRequest.getName());
        product.setCategory(category);
        product.setDescreption(createProductRequest.getProductDescreption());
        product.setPrice(createProductRequest.getProductPrice());
        productRepository.save(product);
    }

    @Override
    public void delete(DeleteProductRequest deleteProductRequest) {
        productRepository.deleteById(deleteProductRequest.getId());
    }

    @Override
    public void update(int id, UpdateProductRequest updateProductRequest) {
        Product product = productRepository.findById(id).get();
        Category category = categoryRepository.findById(updateProductRequest.getCategoryId()).get();
        product.setName(updateProductRequest.getName());
        product.setCategory(category);
        product.setDescreption(updateProductRequest.getProductDescreption());
        product.setPrice(updateProductRequest.getProductPrice());
        productRepository.save(product);
    }
}
