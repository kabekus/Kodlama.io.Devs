package com.example.kodlamaio_devs.dataAccess.abstracts;

import com.example.kodlamaio_devs.entities.concretes.SoftwareLanguage;

import java.util.List;

public interface ISoftwareLanguageRepository {
    List<SoftwareLanguage> getAll();
    SoftwareLanguage getById(int id);
    void add(SoftwareLanguage softwareLanguage,int id);
    void delete(SoftwareLanguage softwareLanguage,int id);
    Void update(SoftwareLanguage softwareLanguage,int id);
}
