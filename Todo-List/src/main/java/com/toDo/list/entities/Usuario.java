package com.toDo.list.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "usuario")
    private List<Tarefa> tarefas = new ArrayList<>();


    public Usuario() 
    {
        
    }

    public Usuario(Long id, String nome, String email) 
    {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Long getId() 
    {
        return id;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public void setTarefas(List<Tarefa> tarefas) 
    {
        this.tarefas = tarefas;
    }
}
