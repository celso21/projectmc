package com.celsoaquino.projectmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.celsoaquino.projectmc.domain.Estado;;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	
	

}
