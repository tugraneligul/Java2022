package Kodlama.io.Devs.Devs.dataAccess.concretes;

import Kodlama.io.Devs.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository(){
        programmingLanguages=new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
        programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
        programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
        programmingLanguages.add(new ProgrammingLanguage(4,".NET"));
    }



    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages){
            if(programmingLanguage.getId()==id){
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        programmingLanguages.remove(id);
    }

    @Override
    public void delete(String name) {
        programmingLanguages.remove(name);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage programmingLanguageFor : programmingLanguages){
            if(programmingLanguageFor.getId()==programmingLanguage.getId()){
                programmingLanguageFor.setName(programmingLanguage.getName());
            }
        }
    }
}
