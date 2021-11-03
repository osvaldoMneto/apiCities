package com.tolk.cities.api.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tolk.cities.api.domain.Country;



public interface CountryRepository extends JpaRepository<Country, Long> {

}
