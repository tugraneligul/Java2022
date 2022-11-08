package kodlama.io.req2.business.abstracts;

import kodlama.io.req2.business.requests.CreateTechnologyRequest;
import kodlama.io.req2.business.requests.DeleteTechnologyRequest;
import kodlama.io.req2.business.requests.UpdateSoftwareLanguageRequest;
import kodlama.io.req2.business.requests.UpdateTechnologyRequest;
import kodlama.io.req2.business.responses.GetAllTechnologyResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnologyResponse> getAll();
    void add(CreateTechnologyRequest createTechnologyRequest);
    void delete(DeleteTechnologyRequest deleteTechnologyRequest);
    void update(int id, UpdateTechnologyRequest updateTechnologyRequest);
}
