package com.example.SpringBoot_InitialProject.service.impl;

import com.example.SpringBoot_InitialProject.entity.Panda;
import com.example.SpringBoot_InitialProject.repository.PandaRepository;
import com.example.SpringBoot_InitialProject.service.PandaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class PandaServiceImpl implements PandaService {
    private final PandaRepository pandaRepository;

    @Override
    public void savePanda(Panda panda) {
        pandaRepository.save(panda);
    }

    @Override
    public List<Panda> fetchPandas() {
        return pandaRepository.findAll();
    }

    @Override
    public void deletePanda(Integer id) {
        pandaRepository.deleteById(id);
    }

}
