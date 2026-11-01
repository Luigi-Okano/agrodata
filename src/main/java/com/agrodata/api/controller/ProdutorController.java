package com.agrodata.api.controller;

import com.agrodata.api.model.Produtor;
import com.agrodata.api.repository.ProdutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtores")
@CrossOrigin(origins = "*")
public class ProdutorController {

    @Autowired
    private ProdutorRepository produtorRepository;

    @GetMapping
    public List<Produtor> listarTodos() {
        return produtorRepository.findAll();
    }

    @PostMapping
    public Produtor cadastrar(@RequestBody Produtor produtor) {
        return produtorRepository.save(produtor);
    }
}
