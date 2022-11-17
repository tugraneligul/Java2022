package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //annotation
@RequestMapping("/api/brands")
public class BrandsController {

    private BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        //IoC
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }
}
