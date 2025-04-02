package com.toDo.list.services;

import com.toDo.list.dto.TarefaDTO;
import com.toDo.list.entities.Tarefa;
import com.toDo.list.entities.Usuario;
import com.toDo.list.entities.enunms.Prioridade;
import com.toDo.list.entities.enunms.Status;
import com.toDo.list.repository.TarefaRepository;
import com.toDo.list.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService
{

    @Autowired
    TarefaRepository tarefaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    public TarefaDTO criarTarefa(TarefaDTO dto)
    {
        Tarefa tarefa = new Tarefa();

        tarefa.setDescricao(dto.getDescricao());
        tarefa.setSetor(dto.getSetor());
        tarefa.setPrioridade(Prioridade.BAIXA);
        tarefa.setDataCadastro(dto.getDataCadastro());
        tarefa.setStatus(Status.A_FAZER);

        Usuario usuario = usuarioRepository.getReferenceById(dto.getIdUsuario());
        tarefa.setUsuario(usuario);

        tarefa = tarefaRepository.save(tarefa);
        return new TarefaDTO(tarefa);
    }

    public List<Tarefa> mostarTarefas()
    {
        List<Tarefa> lista = tarefaRepository.findAll();
        return lista;
    }


}
