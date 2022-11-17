package kodlama.io.trendyol.business.abstracts;

import kodlama.io.trendyol.business.requests.productRequest.CreateProductRequest;
import kodlama.io.trendyol.business.requests.productRequest.DeleteProductRequest;
import kodlama.io.trendyol.business.requests.productRequest.UpdateProductRequest;
import kodlama.io.trendyol.business.responses.productResponse.GetAllProductResponse;
import kodlama.io.trendyol.business.responses.productResponse.GetByIdProductResponse;

import java.util.List;

public interface ProductService {
    List<GetAllProductResponse> getAll();
    GetByIdProductResponse getById(int id);

    void add(CreateProductRequest createProductRequest);
    void delete(DeleteProductRequest deleteProductRequest);
    void update(int id, UpdateProductRequest updateProductRequest);
}
