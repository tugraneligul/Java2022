package kodlama.io.req2.business.concretes;

import kodlama.io.req2.business.abstracts.TechnologyService;
import kodlama.io.req2.business.requests.CreateTechnologyRequest;
import kodlama.io.req2.business.requests.DeleteTechnologyRequest;
import kodlama.io.req2.business.requests.UpdateTechnologyRequest;
import kodlama.io.req2.business.responses.GetAllTechnologyResponse;
import kodlama.io.req2.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.req2.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.req2.entities.concretes.SoftwareLanguage;
import kodlama.io.req2.entities.concretes.Technology;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechnologyManager implements TechnologyService {

    private TechnologyRepository technologyRepository;
    private SoftwareLanguageRepository softwareLanguageRepository;

    public TechnologyManager(TechnologyRepository technologyRepository, SoftwareLanguageRepository softwareLanguageRepository){
        this.technologyRepository = technologyRepository;
        this.softwareLanguageRepository = softwareLanguageRepository;
    }

    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyResponse> technologyResponse = new ArrayList<GetAllTechnologyResponse>();

        for(Technology technology : technologies){
            GetAllTechnologyResponse technologyResponseItem = new GetAllTechnologyResponse();
            technologyResponseItem.setName(technology.getName());
            technologyResponseItem.setLanguageName(technology.getSoftwareLanguage().getName());
            technologyResponse.add(technologyResponseItem);
        }
        return technologyResponse;
    }

    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
        Technology technology = new Technology();
        SoftwareLanguage softwareLanguage = softwareLanguageRepository.findById(createTechnologyRequest.getSoftwareLanguageId()).get();
        technology.setName(createTechnologyRequest.getName());
        technology.setSoftwareLanguage(softwareLanguage);
        technologyRepository.save(technology);
    }

    @Override
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest) {
        technologyRepository.deleteById(deleteTechnologyRequest.getId());
    }

    @Override
    public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology = technologyRepository.findById(id).get();
        SoftwareLanguage softwareLanguage = softwareLanguageRepository.findById(updateTechnologyRequest.getSoftwareLanguageId()).get();
        technology.setName(updateTechnologyRequest.getName());
        technology.setSoftwareLanguage(softwareLanguage);
        technologyRepository.save(technology);
    }
}
