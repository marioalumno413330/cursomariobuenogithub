package com.grupodeyonkis.mario.cursomariobueno.controllers;

import com.grupodeyonkis.mario.cursomariobueno.dao.UsuarioDao;
import com.grupodeyonkis.mario.cursomariobueno.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id ){
        Usuario  usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("652206959");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario editar() {
        Usuario  usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("652206959");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario eliminar() {
        Usuario  usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("652206959");
        return usuario;
    }

    @RequestMapping(value = "usuario4")
    public Usuario buscar() {
        Usuario  usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@hotmail.com");
        usuario.setTelefono("652206959");
        return usuario;
    }


}
