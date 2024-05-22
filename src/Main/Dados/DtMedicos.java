package Main.Dados;

import Main.Modelos.Medico;

import java.util.ArrayList;

public class DtMedicos {

    public ArrayList<Medico> CarregarDadosMedicos()
    {
        ArrayList<Medico> medicos = new ArrayList<>();
        medicos.add(new Medico("José", "Urologista"));
        medicos.add(new Medico("Ana", "Cardiologista"));
        medicos.add(new Medico("Carlos", "Dermatologista"));
        medicos.add(new Medico("Mariana", "Ginecologista"));
        medicos.add(new Medico("Rafael", "Ortopedista"));
        medicos.add(new Medico("Isabel", "Neurologista"));
        medicos.add(new Medico("Pedro", "Oftalmologista"));
        medicos.add(new Medico("Lúcia", "Psiquiatra"));
        medicos.add(new Medico("Fernando", "Endocrinologista"));
        medicos.add(new Medico("Camila", "Pneumologista"));

        return medicos;
    }
}
