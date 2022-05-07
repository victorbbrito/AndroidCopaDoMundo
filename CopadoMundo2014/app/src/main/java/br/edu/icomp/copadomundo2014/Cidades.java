package br.edu.icomp.copadomundo2014;

public class Cidades {
    private String estado;
    private String cidade;
    private String estadio;

    public Cidades(String estado, String cidade, String estadio){
        this.estado = estado;
        this.cidade = cidade;
        this.estadio = estadio;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setEstadio(String estadio){
        this.estadio = estadio;
    }

    public String getEstadio(){
        return this.estadio;
    }

}
