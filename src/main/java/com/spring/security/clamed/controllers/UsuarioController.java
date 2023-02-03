package com.spring.security.clamed.controllers;

import com.spring.security.clamed.model.Usuario;
import com.spring.security.clamed.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){

        return new ResponseEntity<Usuario>(usuarioService.salvar(usuario), HttpStatus.CREATED);
    }



}
