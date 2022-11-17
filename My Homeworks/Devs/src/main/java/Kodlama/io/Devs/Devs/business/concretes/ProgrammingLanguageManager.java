package Kodlama.io.Devs.Devs.business.concretes;

import Kodlama.io.Devs.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
    private ProgrammingLanguageRepository programmingLanguageRepository;

    List<ProgrammingLanguage> programmingLanguages;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }


    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {

        for (ProgrammingLanguage programmingLanguageFor : programmingLanguages){
            if(programmingLanguageFor.getName().equals(programmingLanguage.getName())){
                throw new Exception("Aynı isimli programlama dili bulunmaktadır.");
            }
            if(programmingLanguage.getName().equals("")|| programmingLanguage.getName() == null){
                throw new Exception("Programlama dili ismi boş geçilemez.");
            }
        }

    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.delete(id);
    }

    @Override
    public void delete(String name) {
        programmingLanguageRepository.delete(name);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.update(programmingLanguage);
    }
}
