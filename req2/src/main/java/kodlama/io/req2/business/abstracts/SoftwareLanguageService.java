package kodlama.io.req2.business.abstracts;

import kodlama.io.req2.business.requests.CreateSoftwareLanguageRequest;
import kodlama.io.req2.business.requests.DeleteSoftwareLanguageRequest;
import kodlama.io.req2.business.requests.UpdateSoftwareLanguageRequest;
import kodlama.io.req2.business.responses.GetAllSoftwareLanguageResponse;
import kodlama.io.req2.business.responses.GetByIdSoftwareLanguageResponse;

import java.util.List;

public interface SoftwareLanguageService {
    List<GetAllSoftwareLanguageResponse> getAll();
    GetByIdSoftwareLanguageResponse getById(int id);

    void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest);
    void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest);
    void update(int id,UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest);
}
