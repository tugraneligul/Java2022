package kodlama.io.trendyol.business.concretes;

import kodlama.io.trendyol.business.abstracts.CategoryService;
import kodlama.io.trendyol.business.requests.categoryRequest.CreateCategoryRequest;
import kodlama.io.trendyol.business.requests.categoryRequest.DeleteCategoryRequest;
import kodlama.io.trendyol.business.requests.categoryRequest.UpdateCategoryRequest;
import kodlama.io.trendyol.business.responses.categoryResponses.GetAllCategoryResponse;
import kodlama.io.trendyol.business.responses.categoryResponses.GetByIdCategoryResponse;
import kodlama.io.trendyol.dataAccess.abstracts.CategoryRepository;
import kodlama.io.trendyol.dataAccess.abstracts.MainCategoryRepository;
import kodlama.io.trendyol.entities.concretes.Category;
import kodlama.io.trendyol.entities.concretes.MainCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryManager implements CategoryService {

    private CategoryRepository categoryRepository;
    private MainCategoryRepository mainCategoryRepository;

    @Autowired
    public CategoryManager(CategoryRepository categoryRepository, MainCategoryRepository mainCategoryRepository){
        this.categoryRepository = categoryRepository;
        this.mainCategoryRepository = mainCategoryRepository;
    }

    @Override
    public List<GetAllCategoryResponse> getAll() {
        List<Category> categories = categoryRepository.findAll();
        List<GetAllCategoryResponse> categoryResponse = new ArrayList<GetAllCategoryResponse>();

        for (Category category : categories){
            GetAllCategoryResponse responseItem = new GetAllCategoryResponse();
            responseItem.setName(category.getName());
            responseItem.setMainCategoryName(category.getMainCategory().getName());
            categoryResponse.add(responseItem);
        }
        return categoryResponse;
    }

    @Override
    public GetByIdCategoryResponse getById(int id) {
        Category category = categoryRepository.findById(id).get();
        GetByIdCategoryResponse responseItem = new GetByIdCategoryResponse();
        responseItem.setName(category.getName());
        return responseItem;
    }

    @Override
    public void add(CreateCategoryRequest categoryRequest) {
        Category category = new Category();
        MainCategory mainCategory = mainCategoryRepository.findById(categoryRequest.getMainCategoryId()).get();
        category.setName(categoryRequest.getName());
        category.setMainCategory(mainCategory);
        categoryRepository.save(category);
    }

    @Override
    public void delete(DeleteCategoryRequest deleteCategoryRequest) {
        categoryRepository.deleteById(deleteCategoryRequest.getId());
    }

    @Override
    public void update(int id, UpdateCategoryRequest updateCategoryRequest) {
        Category category = categoryRepository.findById(id).get();
        MainCategory mainCategory = mainCategoryRepository.findById(updateCategoryRequest.getMainCategoryId()).get();
        category.setName(updateCategoryRequest.getName());
        category.setMainCategory(mainCategory);
        categoryRepository.save(category);
    }
}
