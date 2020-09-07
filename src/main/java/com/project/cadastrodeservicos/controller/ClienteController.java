package com.project.cadastrodeservicos.controller;

import com.project.cadastrodeservicos.domain.entity.Cliente;
import com.project.cadastrodeservicos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteRepository repository;

    @Autowired
    public ClienteController(ClienteRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Boolean> salvar(@RequestBody Cliente cliente) {
        Map<String, Boolean> map =  new HashMap<>();
        repository.save(cliente);
        map.put("success", true);

        return map;
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable("id") Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
