package com.tolk.cities.api.model.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.tolk.cities.api.domain.State;

public interface StateRepository extends JpaRepository<State, Long> {
}