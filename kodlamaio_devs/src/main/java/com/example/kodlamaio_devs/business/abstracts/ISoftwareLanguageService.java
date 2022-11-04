package com.example.kodlamaio_devs.business.abstracts;

import com.example.kodlamaio_devs.entities.concretes.SoftwareLanguage;
import java.util.List;

public interface ISoftwareLanguageService {
    List<SoftwareLanguage> getAll();
    SoftwareLanguage getById(int id);
    void add(SoftwareLanguage softwareLanguage,int id) throws Exception;
    void delete(SoftwareLanguage softwareLanguage,int id);
    void update(SoftwareLanguage softwareLanguage,int id);
}
