package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Tecnologia")
public class Tecnologia {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTecnologia;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String version;

}
