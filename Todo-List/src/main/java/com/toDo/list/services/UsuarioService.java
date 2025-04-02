package com.toDo.list.services;

import com.toDo.list.dto.UsuarioDTO;
import com.toDo.list.entities.Usuario;
import com.toDo.list.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService
{

    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioDTO criarUsuario(UsuarioDTO dto)
    {
        Usuario user = new Usuario();
        user.setEmail(dto.getEmail());
        user.setEmail(dto.getNome());
        user = usuarioRepository.save(user);
        return new UsuarioDTO(user);
    }
}

