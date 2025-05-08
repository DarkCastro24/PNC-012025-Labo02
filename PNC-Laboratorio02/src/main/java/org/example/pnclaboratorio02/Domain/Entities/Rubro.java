package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Rubro")
public class Rubro {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idRubro;

    @Column(nullable = false)
    private String nombre;
}
