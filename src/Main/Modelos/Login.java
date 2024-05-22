package Main.Modelos;

import Main.Dados.DtCadastros;

import java.util.ArrayList;

public class Login {

    public Login(){}

    public Login(ArrayList<Cadastro> dtCadastros) {
        this.dtCadastros = dtCadastros;
    }


    public Cadastro validarLogin(String email, String senha) {

        for(int i = 0; i < dtCadastros.size(); i++){
            if(dtCadastros.get(i).getEmail().equals(email) && dtCadastros.get(i).getSenha().equals(senha)){
                return dtCadastros.get(i);
            }
        }
        return null;
    }


    public ArrayList<Cadastro> getDtCadastros() {
        return dtCadastros;
    }

    public void setDtCadastros(ArrayList<Cadastro> dtCadastros) {
        this.dtCadastros = dtCadastros;
    }

    private ArrayList<Cadastro> dtCadastros;




}
