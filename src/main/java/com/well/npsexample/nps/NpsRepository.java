package com.well.npsexample.nps;

import com.well.npsexample.nps.Nps;

import org.springframework.data.jpa.repository.JpaRepository;

public interface NpsRepository extends JpaRepository<Nps, Long> { }

