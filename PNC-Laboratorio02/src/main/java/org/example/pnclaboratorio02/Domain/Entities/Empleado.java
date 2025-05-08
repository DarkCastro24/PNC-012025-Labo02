package org.example.pnclaboratorio02.Domain.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String fechaIngreso;

    @ManyToOne
    @JoinColumn(name = "id_departamento", nullable = false, foreignKey = @ForeignKey(name = "Fk_user_departamento"))
    private Departamento departamento;

    @ManyToOne
    @JoinColumn(name = "id_puesto", nullable = false, foreignKey = @ForeignKey(name = "Fk_user_puesto"))
    private Puesto puesto;
}
