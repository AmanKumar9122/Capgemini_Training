package com.example.SpringBoot_InitialProject.controller;

import com.example.SpringBoot_InitialProject.entity.Panda;
import com.example.SpringBoot_InitialProject.service.PandaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/panda")
@RequiredArgsConstructor
public class PandaController {
    private final PandaService pandaService;

    // Post Mapping - > Create a resource
    @PostMapping("/save")
    public String savePanda(@RequestBody Panda panda){
        pandaService.savePanda(panda);
        return "Panda saved";
    }

    // Get Mapping - > Read a resource
    @GetMapping("/get")
    public List<Panda> getPandas(){
        return pandaService.fetchPandas();
    }

    // Put Mapping - > Update a resource
    @PutMapping("/update")
    public String updatePanda(@RequestBody Panda panda) {
        pandaService.savePanda(panda);
        return "Panda updated";
    }

    // Delete Mapping - > Delete a resource
    @DeleteMapping("/delete/{id}")
    public String deletePanda(@PathVariable Integer id) {
        pandaService.deletePanda(id);
        return "Panda deleted";
    }

    // Patch Mapping - > Partial update
    @PatchMapping("/update/{id}")
    public String updatePandaWeight(@PathVariable Integer id, @RequestBody Map<String, Double> body) {
        Double weight = body.get("weight");
        if (weight == null) {
            return "Weight not provided";
        }
        List<Panda> pandas = pandaService.fetchPandas();
        for (Panda panda : pandas) {
            if (panda.getId().equals(id)) {
                panda.setWeight(weight);
                pandaService.savePanda(panda);
                return "Panda weight updated";
            }
        }
        return "Panda not found";
    }
}
