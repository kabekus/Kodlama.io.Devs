package com.kodlamaio.kodlamaiodevs.webApi.controller;

import com.kodlamaio.kodlamaiodevs.business.abstracts.ISoftwareLanguageService;
import com.kodlamaio.kodlamaiodevs.business.requests.CreateLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.responses.GetAllLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class SoftwareLanguageController {
    private ISoftwareLanguageService languageService;

    @Autowired
    public SoftwareLanguageController(ISoftwareLanguageService languageService){
        this. languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<GetAllLanguageResponse> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {
        this.languageService.add(createLanguageRequest);
    }
}
