package com.example.departamento.service;

import com.example.departamento.model.DepartamentoModel;
import com.example.departamento.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    private final DepartamentoRepository repository;

    public DepartamentoService(DepartamentoRepository repository) {
        this.repository = repository;
    }

    public DepartamentoModel salvar(DepartamentoModel departamento) {
        return repository.save(departamento);
    }

    public List<DepartamentoModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<DepartamentoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}