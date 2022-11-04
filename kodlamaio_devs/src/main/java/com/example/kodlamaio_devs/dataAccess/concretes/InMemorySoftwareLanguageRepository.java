package com.example.kodlamaio_devs.dataAccess.concretes;

import com.example.kodlamaio_devs.dataAccess.abstracts.ISoftwareLanguageRepository;
import com.example.kodlamaio_devs.entities.concretes.SoftwareLanguage;
import java.util.ArrayList;
import java.util.List;

public class InMemorySoftwareLanguageRepository implements ISoftwareLanguageRepository {
   List<SoftwareLanguage> softwareLanguages;


    public InMemorySoftwareLanguageRepository() {
        softwareLanguages = new ArrayList<SoftwareLanguage>();
        softwareLanguages.add(new SoftwareLanguage(1,"Java"));
        softwareLanguages.add(new SoftwareLanguage(2,"C#"));
        softwareLanguages.add(new SoftwareLanguage(3,"Python"));
    }

    @Override
    public List<SoftwareLanguage> getAll() {
        return null;
    }

    @Override
    public SoftwareLanguage getById(int id) {
        return null;
    }

    @Override
    public void add(SoftwareLanguage softwareLanguage, int id) {

    }

    @Override
    public void delete(SoftwareLanguage softwareLanguage, int id) {

    }

    @Override
    public Void update(SoftwareLanguage softwareLanguage, int id) {
        return null;
    }
}
