package org.example.pnclaboratorio02.Services.impl;

import org.example.pnclaboratorio02.Domain.Entities.Empleado;
import org.example.pnclaboratorio02.Repositories.EmpleadoRepository;
import org.example.pnclaboratorio02.Services.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado guardar(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Optional<Empleado> buscarPorId(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public List<Empleado> buscarTodos() {
        return empleadoRepository.findAll();
    }

    @Override
    public Empleado actualizar(Long id, Empleado empleadoActualizado) {
        if (!empleadoRepository.existsById(id)) {
            throw new EntityNotFoundException("Empleado no encontrado");
        }
        empleadoActualizado.setIdEmpleado(id);
        return empleadoRepository.save(empleadoActualizado);
    }

    @Override
    public void eliminar(Long id) {
        empleadoRepository.deleteById(id);
    }
}
