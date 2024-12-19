package com.foroAlura.challenge.domain.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import com.foroAlura.challenge.domain.usuario.Usuario;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private StatusTopico estado = StatusTopico.NO_RESPONDIDO;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    private String nombreCurso;

    // Constructor vacío manual
    public Topico() {
    }

    // Constructor para crear un nuevo tópico
    public Topico(DatosRegistroTopico datos, Usuario usuario) {
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.usuario = usuario;
        this.nombreCurso = datos.nombreCurso();
    }

    // Getters requeridos
    public Long getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getMensaje() {
        return this.mensaje;
    }

    public LocalDateTime getFechaCreacion() {
        return this.fechaCreacion;
    }

    public StatusTopico getEstado() {
        return this.estado;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public String getNombreCurso() {
        return this.nombreCurso;
    }

    // Método para actualizar datos
    public void actualizarDatos(DatosActualizarTopico datos) {
        if (datos.titulo() != null) {
            this.titulo = datos.titulo();
        }
        if (datos.mensaje() != null) {
            this.mensaje = datos.mensaje();
        }
        if (datos.estado() != null) {
            this.estado = datos.estado();
        }
    }
}