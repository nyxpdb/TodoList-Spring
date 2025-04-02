package com.toDo.list.dto;

import com.toDo.list.entities.Usuario;

public class UsuarioDTO
{

    private Long id;
    private String nome;
    private String email;

    public UsuarioDTO()
    {

    }

    public UsuarioDTO(Long id, String nome, String email)
    {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public UsuarioDTO(Usuario entity)
    {
        this.id = entity.getId();
        this.nome = entity.getNome();
        this.email = entity.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
