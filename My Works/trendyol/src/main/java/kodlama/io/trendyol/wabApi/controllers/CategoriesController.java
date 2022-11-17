package kodlama.io.trendyol.wabApi.controllers;

import kodlama.io.trendyol.business.abstracts.CategoryService;
import kodlama.io.trendyol.business.requests.categoryRequest.CreateCategoryRequest;
import kodlama.io.trendyol.business.requests.categoryRequest.DeleteCategoryRequest;
import kodlama.io.trendyol.business.requests.categoryRequest.UpdateCategoryRequest;
import kodlama.io.trendyol.business.responses.categoryResponses.GetAllCategoryResponse;
import kodlama.io.trendyol.business.responses.categoryResponses.GetByIdCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
    private CategoryService categoryService;
    @Autowired
    public CategoriesController(CategoryService categoryService){
        this.categoryService = categoryService;
    }
    @GetMapping("/getAll")
    List<GetAllCategoryResponse> getAll(){
        return this.categoryService.getAll();
    }
    @GetMapping("/getById/{id}")
    GetByIdCategoryResponse getById(int id){
        return this.categoryService.getById(id);
    }
    @PostMapping("/add")
    public void add(CreateCategoryRequest categoryRequest){
        this.categoryService.add(categoryRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteCategoryRequest deleteCategoryRequest){
        this.categoryService.delete(deleteCategoryRequest);
    }
    @PutMapping("/update")
    public void update(int id, UpdateCategoryRequest updateCategoryRequest){
        this.categoryService.update(id,updateCategoryRequest);
    }
}
