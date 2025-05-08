package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCliente;

    @Column(nullable = false)
    private String nombre;

    @Column(unique = true, nullable = false)
    private String correo;

    @ManyToOne
    @JoinColumn(name = "id_rubro", nullable = false, foreignKey = @ForeignKey(name = "Fk_rubro_cliente"))
    private Rubro rubro;

}
