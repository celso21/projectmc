package com.celsoaquino.projectmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.celsoaquino.projectmc.domain.Cidade;;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	
	

}
