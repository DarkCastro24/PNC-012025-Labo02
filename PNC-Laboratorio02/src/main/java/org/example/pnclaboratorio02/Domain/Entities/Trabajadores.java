package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Trabajadores")

public class Trabajadores {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTrabajador;

    @ManyToOne
    @JoinColumn(name = "id_lider", nullable = false, foreignKey = @ForeignKey(name = "Fk_empleado_lider"))
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_proyecto", nullable = false, foreignKey = @ForeignKey(name = "Fk_proyecto"))
    private Proyecto proyecto;
}
