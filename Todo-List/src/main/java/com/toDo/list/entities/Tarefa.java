package com.toDo.list.entities;

import com.toDo.list.entities.enunms.Prioridade;
import com.toDo.list.entities.enunms.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String setor;
    private Prioridade prioridade;
    private LocalDate dataCadastro;
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Tarefa()
    {

    }

    public Tarefa(Long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro, Status status, Usuario usuario) {
        this.id = id;
        this.descricao = descricao;
        this.setor = setor;
        this.prioridade = prioridade;
        this.dataCadastro = dataCadastro;
        this.status = status;
        this.usuario = usuario;
    }

    public Long getId() 
    {
        return id;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public String getSetor()
    {
        return setor;
    }

    public Prioridade getPrioridade() 
    {
        return prioridade;
    }

    public LocalDate getDataCadastro()
    {
        return dataCadastro;
    }

    public Status getStatus() 
    {
        return status;
    }

    public Usuario getUsuario() 
    {
        return usuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    public void setPrioridade(Prioridade prioridade)
    {
        this.prioridade = prioridade;
    }

    public void setSetor(String setor) 
    {
        this.setor = setor;
    }

    public void setDataCadastro(LocalDate dataCadastro)
    {
        this.dataCadastro = dataCadastro;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public void setUsuario(Usuario usuario) 
    {
        this.usuario = usuario;
    }
}

