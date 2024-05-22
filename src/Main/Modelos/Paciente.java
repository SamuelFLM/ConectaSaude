package Main.Modelos;
import java.util.ArrayList;
import java.util.UUID;

public class Paciente {

    public Paciente(){

    }

    public Paciente(Cadastro usuario) {
        Usuario = usuario;
        Consultas = new ArrayList<>();
    }

    public void Exibir(){
        System.out.println("Nome: " + Usuario.getNome());
        System.out.println("Número Seguro: " + Usuario.getNumeroDoSeguro());

        VisualizarConsultas();
    }

    public void AgendarConsulta(Consulta consulta){
        Consultas.add(consulta);
    }

    public void VisualizarConsultas(){
        System.out.println("Consultas: ");
        int indice = 0;
        for(Consulta consulta : Consultas){
            System.out.println("Id: " + indice++ + " - " +" Horário Agendado: " + consulta.getAgendamento() + " Médico: " + consulta.getMedico().getNome() + "\t Especialidade: " + consulta.getMedico().getEspecialidade());
        }
    }

    public void EditarConsulta(int idConsulta, String novaDataAgendamento){
        Consulta consulta = Consultas.get(idConsulta);
        consulta.setAgendamento(novaDataAgendamento);
    }

    public void CancelarConsulta(int idConsulta){
        Consultas.remove(idConsulta);
    }



    public ArrayList<Consulta> getConsultas() {
        return Consultas;
    }


    private Cadastro Usuario;
    private ArrayList<Consulta> Consultas;

}
