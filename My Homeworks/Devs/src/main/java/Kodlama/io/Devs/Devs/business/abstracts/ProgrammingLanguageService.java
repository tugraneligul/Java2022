package Kodlama.io.Devs.Devs.business.abstracts;

import Kodlama.io.Devs.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(int id);
    void delete(String name);
    void update(ProgrammingLanguage programmingLanguage);
}
