package Kodlama.io.Devs.Devs.webApi.controllers;

import Kodlama.io.Devs.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programming-languages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/get-all")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }
    @GetMapping("/get-by-id/{id}")
    public ProgrammingLanguage getById(@PathVariable int id){

        return programmingLanguageService.getById(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.add(programmingLanguage);
    }
    @DeleteMapping("/delete-id/{id}")
    public void delete(@PathVariable int id){
        programmingLanguageService.delete(id);
    }
    @DeleteMapping("/delete-name/{name}")
    public void delete(@PathVariable String name){
        programmingLanguageService.delete(name);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody ProgrammingLanguage programmingLanguage){
        programmingLanguageService.update(programmingLanguage);
    }
}
