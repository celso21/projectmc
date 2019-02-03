package com.celsoaquino.projectmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.celsoaquino.projectmc.domain.Produto;;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
