package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Capacitacion")
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCapacitacion;

    @Column(nullable = false)
    private String tema;

    @Column(nullable = false)
    private String fecha;

    @Column(nullable = false)
    private String duracion;
}
