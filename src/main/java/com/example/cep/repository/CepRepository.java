package com.example.cep.repository;

import com.example.cep.domain.Cep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CepRepository extends JpaRepository<Cep, Long> {

    Cep findCepByCep(String cep);
}
