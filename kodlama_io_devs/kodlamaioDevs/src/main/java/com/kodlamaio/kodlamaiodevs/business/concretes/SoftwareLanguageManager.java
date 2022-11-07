package com.kodlamaio.kodlamaiodevs.business.concretes;

import com.kodlamaio.kodlamaiodevs.business.abstracts.ISoftwareLanguageService;
import com.kodlamaio.kodlamaiodevs.business.requests.CreateLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.responses.GetAllLanguageResponse;

import java.util.List;

public class SoftwareLanguageManager implements ISoftwareLanguageService {
    @Override
    public List<GetAllLanguageResponse> getAll() {
        return null;
    }

    @Override
    public void add(CreateLanguageRequest createLanguageRequest) throws Exception {

    }

    @Override
    public void delete(CreateLanguageRequest createLanguageRequest) {

    }

    @Override
    public void update(CreateLanguageRequest createLanguageRequest) {

    }
}
