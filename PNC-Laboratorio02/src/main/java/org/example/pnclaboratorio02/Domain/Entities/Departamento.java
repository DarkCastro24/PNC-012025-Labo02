package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idDepartamento;

    @Column(unique = true, nullable = false)
    private String nombre;

}
