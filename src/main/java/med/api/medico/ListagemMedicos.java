package med.api.medico;

public record ListagemMedicos(Long id,String nome, String email, String crm, Especialidade especialidade) {
    public ListagemMedicos(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());

    }

}
