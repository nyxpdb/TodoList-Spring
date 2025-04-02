package com.toDo.list.dto;

import com.toDo.list.entities.Tarefa;
import com.toDo.list.entities.enunms.Prioridade;
import com.toDo.list.entities.enunms.Status;

import java.time.LocalDate;

public class TarefaDTO {

    private Long id;
    private String descricao;
    private String setor;
    private Prioridade prioridade;
    private LocalDate dataCadastro;
    private Status status;
    private Long idUsuario;

    public TarefaDTO()
    {

    }

    public TarefaDTO(Long id, String descricao, String setor, Prioridade prioridade, LocalDate dataCadastro, Status status, Long idUsuario) {
        this.id = id;
        this.descricao = descricao;
        this.setor = setor;
        this.prioridade = prioridade;
        this.dataCadastro = dataCadastro;
        this.status = status;
        this.idUsuario = idUsuario;
    }

    public TarefaDTO(Tarefa entity) {
        id = entity.getId();
        descricao = entity.getDescricao();
        setor = entity.getSetor();
        prioridade = entity.getPrioridade();
        dataCadastro = entity.getDataCadastro();
        status = entity.getStatus();
        idUsuario = entity.getUsuario().getId(); //Fazendo a busca fo usuario pelo ID
    }

    //GET

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSetor() {
        return setor;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public Status getStatus() {
        return status;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

}
