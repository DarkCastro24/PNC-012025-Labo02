package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Tecnologia-Proyecto")
public class TecnologiaXProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idTecnologiaProyecto;

    @ManyToOne
    @JoinColumn(name = "id_tecnologia", nullable = false, foreignKey = @ForeignKey(name = "Fk_tecnologia_proyecto"))
    private Tecnologia tecnologia;

    @ManyToOne
    @JoinColumn(name = "id_proyecto", nullable = false, foreignKey = @ForeignKey(name = "Fk_proyecto_tecnologia"))
    private Proyecto proyecto;
}
