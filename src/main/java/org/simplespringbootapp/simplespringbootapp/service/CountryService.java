package org.simplespringbootapp.simplespringbootapp.service;

import lombok.RequiredArgsConstructor;
import org.simplespringbootapp.simplespringbootapp.entity.CountryEntity;
import org.simplespringbootapp.simplespringbootapp.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

//    @Autowired
//    public CountryService(CountryRepository countryRepository) {
//        this.countryRepository = countryRepository;
//    }

    public List<CountryEntity> getCountries(){
        return countryRepository.findAll();
    }
}
