package org.example.pnclaboratorio02.Services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.example.pnclaboratorio02.Domain.Entities.Cliente;

public interface IClienteService {
    Cliente guardar(Cliente cliente);
    Optional<Cliente> buscarPorId(UUID id);
    List<Cliente> buscarTodos();
    Cliente actualizar(UUID id, Cliente clienteActualizado);
    void eliminar(UUID id);
}
