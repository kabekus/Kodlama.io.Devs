package com.kodlamaio.kodlamaiodevs.dataAccess.abstracts;

import com.kodlamaio.kodlamaiodevs.entities.SoftwareLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISoftwareLanguageRepository extends JpaRepository<SoftwareLanguage,Integer> {
}
