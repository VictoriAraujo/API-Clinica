package med.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.api.medico.ListagemMedicos;
import med.api.medico.Medico;
import med.api.medico.MedicoRepository;
import med.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new Medico(dados));
    }
    @GetMapping
    public List<ListagemMedicos> listar(){
        return repository.findAll().stream().map(ListagemMedicos::new).toList() ;
    };
}
