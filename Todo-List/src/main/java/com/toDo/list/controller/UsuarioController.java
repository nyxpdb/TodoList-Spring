package com.toDo.list.controller;

import com.toDo.list.dto.UsuarioDTO;
import com.toDo.list.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController
{

    @Autowired
    UsuarioService usuarioService;

    @PostMapping(value ="/new")
    public ResponseEntity<UsuarioDTO> criarUsuario(@Valid @RequestBody UsuarioDTO dto){
        dto = usuarioService.criarUsuario(dto);
        return ResponseEntity.ok(dto);
    }
}
