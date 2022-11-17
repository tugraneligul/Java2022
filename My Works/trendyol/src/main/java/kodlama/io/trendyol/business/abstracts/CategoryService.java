package kodlama.io.trendyol.business.abstracts;

import kodlama.io.trendyol.business.requests.categoryRequest.CreateCategoryRequest;
import kodlama.io.trendyol.business.requests.categoryRequest.DeleteCategoryRequest;
import kodlama.io.trendyol.business.requests.categoryRequest.UpdateCategoryRequest;
import kodlama.io.trendyol.business.responses.categoryResponses.GetAllCategoryResponse;
import kodlama.io.trendyol.business.responses.categoryResponses.GetByIdCategoryResponse;

import java.util.List;

public interface CategoryService {
    List<GetAllCategoryResponse> getAll();
    GetByIdCategoryResponse getById(int id);

    void add(CreateCategoryRequest categoryRequest);
    void delete(DeleteCategoryRequest deleteCategoryRequest);
    void update(int id, UpdateCategoryRequest updateCategoryRequest);
}
