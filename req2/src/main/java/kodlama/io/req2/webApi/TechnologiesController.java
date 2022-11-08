package kodlama.io.req2.webApi;

import kodlama.io.req2.business.abstracts.SoftwareLanguageService;
import kodlama.io.req2.business.abstracts.TechnologyService;
import kodlama.io.req2.business.requests.CreateTechnologyRequest;
import kodlama.io.req2.business.requests.DeleteTechnologyRequest;
import kodlama.io.req2.business.requests.UpdateTechnologyRequest;
import kodlama.io.req2.business.responses.GetAllTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
    private TechnologyService technologyService;

    @Autowired
    public TechnologiesController(TechnologyService technologyService){
        this.technologyService = technologyService;
    }

    @GetMapping("/getAll")
    public List<GetAllTechnologyResponse> getAll(){
        return technologyService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateTechnologyRequest createTechnologyRequest){
        this.technologyService.add(createTechnologyRequest);
    }

    @DeleteMapping("/delete")
    public void delete(DeleteTechnologyRequest deleteTechnologyRequest){
        this.technologyService.delete(deleteTechnologyRequest);
    }

    @PutMapping("/update")
    public void updateById(int id, UpdateTechnologyRequest updateTechnologyRequest){
        this.technologyService.update(id,updateTechnologyRequest);
    }

}
