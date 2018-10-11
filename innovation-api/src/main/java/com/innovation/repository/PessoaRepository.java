package com.innovation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.innovation.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
