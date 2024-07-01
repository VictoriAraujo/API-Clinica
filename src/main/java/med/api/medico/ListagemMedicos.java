package med.api.medico;

public record ListagemMedicos(String nome, String email, String crm, Especialidade especialidade) {
    public ListagemMedicos(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());

    }

}
