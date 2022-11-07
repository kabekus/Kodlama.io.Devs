package com.kodlamaio.kodlamaiodevs.business.abstracts;

import com.kodlamaio.kodlamaiodevs.business.requests.CreateLanguageRequest;
import com.kodlamaio.kodlamaiodevs.business.responses.GetAllLanguageResponse;

import java.util.List;

public interface ISoftwareLanguageService {
    List<GetAllLanguageResponse> getAll();
    void add(CreateLanguageRequest createLanguageRequest) throws Exception;
    void delete(CreateLanguageRequest createLanguageRequest);
    void update(CreateLanguageRequest createLanguageRequest);
}
