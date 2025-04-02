    package com.toDo.list.controller;
    
    import com.toDo.list.dto.TarefaDTO;
    import com.toDo.list.entities.Tarefa;
    import com.toDo.list.services.TarefaService;
    import jakarta.validation.Valid;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;
    
    import java.util.List;
    
    @RestController
    @RequestMapping("/tarefa")
    public class TarefaController
    {
    
        @Autowired
        TarefaService tarefaService;
    
        @PostMapping(value ="/new")
        public ResponseEntity<TarefaDTO> criarTarefa(@Valid @RequestBody TarefaDTO dto)
        {
            dto = tarefaService.criarTarefa(dto);
            return ResponseEntity.ok(dto);
        }
    
        @GetMapping
        public ResponseEntity<List<Tarefa>> buscarTarefa()
        {
            return ResponseEntity.ok(tarefaService.mostarTarefas());
        }
    
    }
