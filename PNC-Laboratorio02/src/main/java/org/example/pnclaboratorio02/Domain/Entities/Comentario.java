package org.example.pnclaboratorio02.Domain.Entities;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idComentario;

    @Column(nullable = false, length = 1000)
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_evaluacion", nullable = false, foreignKey = @ForeignKey(name = "Fk_evaluacion_comentario"))
    private Evaluacion evaluacion;
}
