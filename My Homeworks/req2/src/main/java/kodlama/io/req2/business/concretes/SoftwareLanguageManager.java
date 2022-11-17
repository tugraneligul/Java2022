package kodlama.io.req2.business.concretes;

import kodlama.io.req2.business.abstracts.SoftwareLanguageService;
import kodlama.io.req2.business.requests.CreateSoftwareLanguageRequest;
import kodlama.io.req2.business.requests.DeleteSoftwareLanguageRequest;
import kodlama.io.req2.business.requests.UpdateSoftwareLanguageRequest;
import kodlama.io.req2.business.responses.GetAllSoftwareLanguageResponse;
import kodlama.io.req2.business.responses.GetByIdSoftwareLanguageResponse;
import kodlama.io.req2.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.req2.entities.concretes.SoftwareLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {

    private SoftwareLanguageRepository softwareLanguageRepository;

    @Autowired
    public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository){
        this.softwareLanguageRepository = softwareLanguageRepository;
    }


    @Override
    public List<GetAllSoftwareLanguageResponse> getAll() {
        List<SoftwareLanguage> softwareLanguages = softwareLanguageRepository.findAll();
        List<GetAllSoftwareLanguageResponse> softwareLanguageResponse = new ArrayList<GetAllSoftwareLanguageResponse>();

        for(SoftwareLanguage softwareLanguage : softwareLanguages){
            GetAllSoftwareLanguageResponse languageResponseItem = new GetAllSoftwareLanguageResponse();
            languageResponseItem.setId(softwareLanguage.getId());
            languageResponseItem.setName(softwareLanguage.getName());
            softwareLanguageResponse.add(languageResponseItem);
        }
        return softwareLanguageResponse;
    }

    @Override
    public GetByIdSoftwareLanguageResponse getById(int id) {
        SoftwareLanguage softwareLanguage = softwareLanguageRepository.findById(id).get();
        GetByIdSoftwareLanguageResponse response = new GetByIdSoftwareLanguageResponse();
        response.setName(softwareLanguage.getName());
        return response;
    }

    @Override
    public void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest) {
        SoftwareLanguage softwareLanguage = new SoftwareLanguage();
        softwareLanguage.setName(createSoftwareLanguageRequest.getName());
        this.softwareLanguageRepository.save(softwareLanguage);
    }

    @Override
    public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest) {
        softwareLanguageRepository.deleteById(deleteSoftwareLanguageRequest.getId());
    }

    @Override
    public void update(int id, UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest) {
        if(!updateSoftwareLanguageRequest.getName().isEmpty()){
            SoftwareLanguage softwareLanguage = softwareLanguageRepository.findById(id).get();
            softwareLanguage.setName(updateSoftwareLanguageRequest.getName());
            softwareLanguageRepository.save(softwareLanguage);
        }
    }
}
