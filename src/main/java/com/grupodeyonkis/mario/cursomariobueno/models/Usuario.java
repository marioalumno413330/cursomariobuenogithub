package com.grupodeyonkis.mario.cursomariobueno.models;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class Usuario {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(id, usuario.id) && Objects.equals(apellido, usuario.apellido) && Objects.equals(email, usuario.email) && Objects.equals(telefono, usuario.telefono) && Objects.equals(password, usuario.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, apellido, email, telefono, password);
    }
    @Column(name="id")
    @Id
    private Long id;
    @Column(name="nombre")
    private String nombre;
     @Column(name="apellidos")
    private String apellido;
    @Column(name="email")
    private String email;
     @Column(name="telefono")
    private String telefono;
     @Column(name="password")
    private String password;
}
