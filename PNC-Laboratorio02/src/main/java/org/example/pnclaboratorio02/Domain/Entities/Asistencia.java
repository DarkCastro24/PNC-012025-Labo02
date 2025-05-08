package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Asistencia")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idAsistencia;

    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false, foreignKey = @ForeignKey(name = "Fk_asistencia_empleado"))
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_capacitacion", nullable = false, foreignKey = @ForeignKey(name = "Fk_asistencia_capacitacion"))
    private Capacitacion capacitacion;
}
