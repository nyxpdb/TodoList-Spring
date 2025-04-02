package com.toDo.list.repository;

import com.toDo.list.entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa,Long>
{

}
