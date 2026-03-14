package com.example.SpringBoot_InitialProject.repository;

import com.example.SpringBoot_InitialProject.entity.Panda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PandaRepository extends JpaRepository<Panda, Integer> {

}
