package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Evaluacion")
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idEvaluacion;

    @Column(nullable = false)
    private int puntaje;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false, foreignKey = @ForeignKey(name = "Fk_empleado_evaluacion"))
    private Empleado empleado;
}
