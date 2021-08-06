package com.littleBigBusters.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.littleBigBusters.backend.model.Cargo;

@Repository
public interface ICargoRepository extends JpaRepository<Cargo, Long> {

}
