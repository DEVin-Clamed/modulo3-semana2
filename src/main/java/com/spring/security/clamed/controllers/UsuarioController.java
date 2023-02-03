package com.spring.security.clamed.controllers;

import com.spring.security.clamed.model.Usuario;
import com.spring.security.clamed.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {


    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario){

        return new ResponseEntity<Usuario>(usuarioService.salvar(usuario), HttpStatus.CREATED);
    }


    @PutMapping
    public ResponseEntity<Usuario> atualizar(@RequestBody Usuario usuario){
        return new ResponseEntity<Usuario>(usuarioService.salvar(usuario), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestParam Long idUsuario){

        usuarioService.delete(idUsuario);
        return new ResponseEntity<String>("Usuário deletado com sucesso.",HttpStatus.OK);
    }

    @DeleteMapping(value = "/{idUsuario}")
    public ResponseEntity<String> deletePathVariable(@PathVariable(value = "idUsuario") Long idUsuario){

        usuarioService.delete(idUsuario);
        return new ResponseEntity<String>("Usuário deletado com sucesso.",HttpStatus.OK);
    }


    @GetMapping(value = "/")
    public ResponseEntity<List<Usuario>> getUsersByName(@RequestParam (name = "nome") String nome){

        // obtem a lista de usuários model
        List<Usuario> usuarios = usuarioService.findUsersByName(nome);

        return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios(){

        return new ResponseEntity<List<Usuario>>(usuarioService.getUsers(), HttpStatus.OK);
    }



}
