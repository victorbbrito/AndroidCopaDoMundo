package br.edu.icomp.copadomundo2014;

public class Jogos {
    private String selecao1;
    private String selecao2;
    private String data;
    private String estado;
    private String cidade;
    private String estadio;
    private String placar;
    private String penalti;
    private String tipo;
    private String resultado;

    public Jogos(String selecao1,String selecao2,String data,String estado,String cidade,String estadio,String placar,String penalti,String tipo,String resultado){
        this.selecao1 = selecao1;
        this.selecao2 = selecao2;
        this.data = data;
        this.estado = estado;
        this.cidade = cidade;
        this.estadio = estadio;
        this.placar = placar;
        this.penalti = penalti;
        this.tipo = tipo;
        this.resultado = resultado;
    }

    // Setar as duas seleções que irão disputar a partida ex: Brasil x Alemanha
    public void setSelecao(String time1String, String time2String){
        this.selecao1 = time1String;
        this.selecao2 = time2String;
    }

    // retornar as duas seleções que estão disputando a partida ex: Brasil x Alemanha
    public String getSelecoes(){
        return this.selecao1 + " X " + this.selecao2;
    }

    public String getSelecao1(){
        return this.selecao1;
    }

    public String getSelecao2(){
        return this.selecao2;
    }

    // setar a data da partida ex: 12-06-2014
    public void setData(String dataString){
        this.data = dataString;
    }

    // retornar a data em que ocorreu a partida ex: 2014/06/13
    public String getData(){
        return this.data;
    }

    // setar o estado em que a partida ocorre (conforme o estádio) ex: Amazonas
    public void setEstado(String estadoString){
        this.estado = estadoString;
    }

    // retorna o estado em que a partida ocorre (conforme o estádio) ex: Amazonas
    public String getEstado(){
        return this.estado;
    }

    // setar a cidade em que a partida ocorre (conforme o estádio) ex: Manaus
    public void setCidade(String cidadeString){
        this.cidade = cidadeString;
    }

    // retorna a cidade em que a partida ocorre (conforme o estádio) ex: Manaus
    public String getCidade(){
        return this.cidade;
    }

    // setar o estádio em que a partida ocorre ex: Arena da Amazônia - Vivaldo Lima
    public void setEstadio(String estadioString){
        this.estadio = estadioString;
    }

    // retornar o estádio em que a partida ocorreex: Arena da Amazônia - Vivaldo Lima
    public String getEstadio(){
        return this.estadio;
    }

    // setar o placar final da partida ex: 3x2 (time1 x time2)
    public void setPlacar(String placarString){
        this.placar = placarString;
    }

    // retornar o placar final da partida ex: 3x2 (time1 x time2)
    public String getPlacar(){
        return this.placar;
    }

    // setar se a partida teve penaltis e qual o resultado dos penaltis ex: com penaltis 5x4 (time1 x time2) ou sem penaltis xxx {resultado dos penaltis}
    public void setPenalti(String penaltString){
        this.penalti = penaltString;
    }

    // retornar o resultado dos penaltis ex: com penaltis 5x4 (time1 x time2) ou sem penaltis xxx {resultado dos penaltis}
    public String getPenalti(){
        return this.penalti;
    }

    // setar a fase da competição em que a partida ocorre ex: final, semi-final ,  quartas de final , etc ...
    public void setTipo(String tipoString){
        this.tipo = tipoString;
    }
    // retorna a fase da competição em que a partida ocorre ex: final, semi-final ,  quartas de final , etc ...
    public String getTipo(){
        return this.tipo;
    }

    // seta o resultado da partida ex: Alemanha (Alemanha x Brasil){time que conquistou a vitória} ou empate {quando ocorrer um empate na partida}
    public void setResultado(String resultadoString){
        this.resultado = resultadoString;
    }

    // retorna o resultado da partida ex: Alemanha (Alemanha x Brasil){time que conquistou a vitória} ou empate {quando ocorrer um empate na partida}
    public String getResultado(){
        return this.resultado;
    }

}
