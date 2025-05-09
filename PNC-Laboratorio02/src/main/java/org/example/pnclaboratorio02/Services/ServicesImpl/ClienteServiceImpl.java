package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Cliente;
import org.example.pnclaboratorio02.Repositories.ClienteRepository;
import org.example.pnclaboratorio02.Services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente guardar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> buscarPorId(UUID id) {
        return clienteRepository.findById(id);
    }

    @Override
    public List<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente actualizar(UUID id, Cliente clienteActualizado) {
        if (!clienteRepository.existsById(id)) {
            throw new EntityNotFoundException("Cliente no encontrado");
        }
        clienteActualizado.setIdCliente(id);
        return clienteRepository.save(clienteActualizado);
    }

    @Override
    public void eliminar(UUID id) {
        clienteRepository.deleteById(id);
    }
}
