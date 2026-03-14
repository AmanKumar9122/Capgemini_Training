package com.example.SpringBoot_InitialProject.service;

import com.example.SpringBoot_InitialProject.entity.Panda;

import java.util.List;

public interface PandaService {
    void savePanda(Panda panda);
    List<Panda> fetchPandas();
    void deletePanda(Integer id);
}
