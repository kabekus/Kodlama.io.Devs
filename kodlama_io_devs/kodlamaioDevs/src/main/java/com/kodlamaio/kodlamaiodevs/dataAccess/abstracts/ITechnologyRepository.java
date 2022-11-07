package com.kodlamaio.kodlamaiodevs.dataAccess.abstracts;

import com.kodlamaio.kodlamaiodevs.entities.TechnologysOfLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITechnologyRepository extends JpaRepository<TechnologysOfLanguage,Integer> {
}
