package kodlama.io.trendyol.business.concretes;

import kodlama.io.trendyol.business.abstracts.MainCategoryService;
import kodlama.io.trendyol.business.requests.mainCategoryRequest.CreateMainCategoryRequest;
import kodlama.io.trendyol.business.requests.mainCategoryRequest.DeleteMainCategoryRequest;
import kodlama.io.trendyol.business.requests.mainCategoryRequest.UpdateMainCategoryRequest;
import kodlama.io.trendyol.business.responses.mainCategoryResponse.GetAllMainCategoryResponse;
import kodlama.io.trendyol.business.responses.mainCategoryResponse.GetByIdMainCategoryResponse;
import kodlama.io.trendyol.dataAccess.abstracts.MainCategoryRepository;
import kodlama.io.trendyol.entities.concretes.MainCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainCategoryManager implements MainCategoryService {

    private MainCategoryRepository mainCategoryRepository;

    @Autowired
    public MainCategoryManager(MainCategoryRepository mainCategoryRepository){
        this.mainCategoryRepository = mainCategoryRepository;
    }

    @Override
    public List<GetAllMainCategoryResponse> getAll() {
        List<MainCategory> mainCategories = mainCategoryRepository.findAll();
        List<GetAllMainCategoryResponse> mainCategoryResponse = new ArrayList<GetAllMainCategoryResponse>();

        for (MainCategory mainCategory : mainCategories){
            GetAllMainCategoryResponse responseItem = new GetAllMainCategoryResponse();
            responseItem.setId(mainCategory.getId());
            responseItem.setName(mainCategory.getName());
            mainCategoryResponse.add(responseItem);
        }
        return mainCategoryResponse;
    }

    @Override
    public GetByIdMainCategoryResponse getById(int id) {
        MainCategory mainCategory = mainCategoryRepository.findById(id).get();
        GetByIdMainCategoryResponse responseItem = new GetByIdMainCategoryResponse();
        responseItem.setName(mainCategory.getName());
        return responseItem;
    }

    @Override
    public void add(CreateMainCategoryRequest createMainCategoryRequest) {
        MainCategory mainCategory = new MainCategory();
        mainCategory.setName(createMainCategoryRequest.getName());
        mainCategoryRepository.save(mainCategory);
    }

    @Override
    public void delete(DeleteMainCategoryRequest deleteMainCategoryRequest) {
        mainCategoryRepository.deleteById(deleteMainCategoryRequest.getId());
    }

    @Override
    public void update(int id, UpdateMainCategoryRequest updateMainCategoryRequest) {
        if (!updateMainCategoryRequest.getName().isEmpty()) {
            MainCategory mainCategory = mainCategoryRepository.findById(id).get();
            mainCategory.setName(updateMainCategoryRequest.getName());
            mainCategoryRepository.save(mainCategory);
        }
        }
}
