package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idProyecto;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String precioFinal;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false, foreignKey = @ForeignKey(name = "Fk_proyecto_cliente"))
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_lider", nullable = false, foreignKey = @ForeignKey(name = "fk_proyecto_lider"))
    private Empleado lider;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false, foreignKey = @ForeignKey(name = "Fk_proyecto_categoria"))
    private Categoria categoria;

}
