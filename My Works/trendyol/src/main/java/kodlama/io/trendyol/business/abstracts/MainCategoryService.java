package kodlama.io.trendyol.business.abstracts;

import kodlama.io.trendyol.business.requests.mainCategoryRequest.CreateMainCategoryRequest;
import kodlama.io.trendyol.business.requests.mainCategoryRequest.DeleteMainCategoryRequest;
import kodlama.io.trendyol.business.requests.mainCategoryRequest.UpdateMainCategoryRequest;
import kodlama.io.trendyol.business.responses.mainCategoryResponse.GetAllMainCategoryResponse;
import kodlama.io.trendyol.business.responses.mainCategoryResponse.GetByIdMainCategoryResponse;

import java.util.List;

public interface MainCategoryService {
    List<GetAllMainCategoryResponse> getAll();
    GetByIdMainCategoryResponse getById(int id);

    void add(CreateMainCategoryRequest createMainCategoryRequest);
    void delete(DeleteMainCategoryRequest deleteMainCategoryRequest);
    void update(int id, UpdateMainCategoryRequest updateMainCategoryRequest);
}
