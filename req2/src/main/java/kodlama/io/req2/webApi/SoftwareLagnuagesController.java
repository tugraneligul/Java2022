package kodlama.io.req2.webApi;

import kodlama.io.req2.business.abstracts.SoftwareLanguageService;
import kodlama.io.req2.business.requests.CreateSoftwareLanguageRequest;
import kodlama.io.req2.business.requests.DeleteSoftwareLanguageRequest;
import kodlama.io.req2.business.requests.UpdateSoftwareLanguageRequest;
import kodlama.io.req2.business.responses.GetAllSoftwareLanguageResponse;
import kodlama.io.req2.business.responses.GetByIdSoftwareLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/softwareLanguages")
public class SoftwareLagnuagesController {
    private SoftwareLanguageService softwareLanguageService;

    @Autowired
    public SoftwareLagnuagesController(SoftwareLanguageService softwareLanguageService){
        this.softwareLanguageService = softwareLanguageService;
    }

    @GetMapping("/getAll")
    public List<GetAllSoftwareLanguageResponse> getAll(){
        return softwareLanguageService.getAll();
    }

    @GetMapping("{id}")
    public GetByIdSoftwareLanguageResponse getById(int id){
        return softwareLanguageService.getById(id);
    }

    @PostMapping("/add")
    public void add(CreateSoftwareLanguageRequest createSoftwareLanguageRequest){
        this.softwareLanguageService.add(createSoftwareLanguageRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguageRequest){
        this.softwareLanguageService.delete(deleteSoftwareLanguageRequest);
    }

    @PutMapping("/update")
    public void update(int id, UpdateSoftwareLanguageRequest updateSoftwareLanguageRequest){
        this.softwareLanguageService.update(id,updateSoftwareLanguageRequest);
    }

}
