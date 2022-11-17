package Kodlama.io.Devs.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage programmingLanguage);
    void delete(int id);
    void delete(String name);
    void update(ProgrammingLanguage programmingLanguage);
}
