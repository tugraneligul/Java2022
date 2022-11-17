package kodlama.io.trendyol.wabApi.controllers;

import kodlama.io.trendyol.business.abstracts.ProductService;
import kodlama.io.trendyol.business.requests.productRequest.CreateProductRequest;
import kodlama.io.trendyol.business.requests.productRequest.DeleteProductRequest;
import kodlama.io.trendyol.business.requests.productRequest.UpdateProductRequest;
import kodlama.io.trendyol.business.responses.productResponse.GetAllProductResponse;
import kodlama.io.trendyol.business.responses.productResponse.GetByIdProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private ProductService productService;
    @Autowired
    public ProductsController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/getAll")
    List<GetAllProductResponse> getAll(){
        return this.productService.getAll();
    }
    @GetMapping("/getById/{id}")
    GetByIdProductResponse getById(int id){
        return this.productService.getById(id);
    }
    @PostMapping("/add")
    public void add(CreateProductRequest createProductRequest){
        this.productService.add(createProductRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteProductRequest deleteProductRequest){
        this.productService.delete(deleteProductRequest);
    }
    @PutMapping("/update")
    public void update(int id, UpdateProductRequest updateProductRequest){
        this.productService.update(id,updateProductRequest);
    }
}
