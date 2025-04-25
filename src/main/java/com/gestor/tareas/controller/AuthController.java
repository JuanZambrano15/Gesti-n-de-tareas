package com.gestor.tareas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestor.tareas.model.Usuario;
import com.gestor.tareas.service.UsuarioService;

@RestController
@RequestMapping("/api/auth")

public class AuthController {
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/register")
    public Usuario registrar(@RequestBody Usuario usuario){
        return usuarioService.registrar(usuario);
    }
}
