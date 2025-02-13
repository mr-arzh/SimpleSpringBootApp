package org.simplespringbootapp.simplespringbootapp.repository;


import org.simplespringbootapp.simplespringbootapp.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

//    @Query("from CountryEntity")
//    public List<CountryEntity> getAllCountries();
}
