package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Cateogira")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCategoria;

    @Column(unique = true, nullable = false)
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_area", nullable = false, foreignKey = @ForeignKey(name = "Fk_area_categoria"))
    private Area area;
}
