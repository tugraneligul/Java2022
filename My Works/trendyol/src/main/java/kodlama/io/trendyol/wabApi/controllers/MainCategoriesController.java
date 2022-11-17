package kodlama.io.trendyol.wabApi.controllers;

import kodlama.io.trendyol.business.abstracts.MainCategoryService;
import kodlama.io.trendyol.business.requests.mainCategoryRequest.CreateMainCategoryRequest;
import kodlama.io.trendyol.business.requests.mainCategoryRequest.DeleteMainCategoryRequest;
import kodlama.io.trendyol.business.requests.mainCategoryRequest.UpdateMainCategoryRequest;
import kodlama.io.trendyol.business.responses.mainCategoryResponse.GetAllMainCategoryResponse;
import kodlama.io.trendyol.business.responses.mainCategoryResponse.GetByIdMainCategoryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mainCategories")
public class MainCategoriesController {
    private MainCategoryService mainCategoryService;

    @Autowired
    public MainCategoriesController(MainCategoryService mainCategoryService){
        this.mainCategoryService = mainCategoryService;
    }
    @GetMapping("/getAll")
    List<GetAllMainCategoryResponse> getAll(){
        return mainCategoryService.getAll();
    }
    @GetMapping("/getById/{id}")
    GetByIdMainCategoryResponse getById(int id){
        return mainCategoryService.getById(id);
    }
    @PostMapping("/add")
    public void add(CreateMainCategoryRequest createMainCategoryRequest){
        this.mainCategoryService.add(createMainCategoryRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteMainCategoryRequest deleteMainCategoryRequest){
        this.mainCategoryService.delete(deleteMainCategoryRequest);
    }
    @PutMapping("/update")
    public void update(int id, UpdateMainCategoryRequest updateMainCategoryRequest){
        this.mainCategoryService.update(id,updateMainCategoryRequest);
    }
}
