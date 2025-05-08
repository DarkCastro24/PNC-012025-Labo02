package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Area")
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idArea;

    @Column(unique = true, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String precio;
}
