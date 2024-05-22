package Main.Modelos;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Consulta {


    public Consulta(String agendamento, Medico medico) {
        Date dataAtual = new Date();
        Agendamento = agendamento;
        Data = FormatData.format(dataAtual);
        Hora = FormatHora.format(dataAtual);
        Medico = medico;
    }
    public String getAgendamento(){
        return Agendamento;
    }

    public void setAgendamento(String agendamento){
        Agendamento = agendamento;
    }

    public String getData() {
        return Data;
    }

    public String getHora() {
        return Hora;
    }

    public Medico getMedico() {
        return Medico;
    }

    public void setMedico(Medico medico) {
        Medico = medico;
    }
    private String Agendamento;
    private String Data;
    private String Hora;
    private SimpleDateFormat FormatData = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat FormatHora = new SimpleDateFormat("HH:mm:ss");
    private Medico Medico;

}
