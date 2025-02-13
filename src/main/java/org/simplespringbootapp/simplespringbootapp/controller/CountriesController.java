package org.simplespringbootapp.simplespringbootapp.controller;

import lombok.RequiredArgsConstructor;
import org.simplespringbootapp.simplespringbootapp.entity.CountryEntity;
import org.simplespringbootapp.simplespringbootapp.repository.CountryRepository;
import org.simplespringbootapp.simplespringbootapp.service.CountryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/countries")

public class CountriesController {

    private final CountryService countryService;


    @GetMapping
    public List<CountryEntity>  getAllCountries() {
        return countryService.getCountries();
    }

}
