package model;

public class Carros {

    private int id;
    private String renavam;
    private int ano_fabricacao;
    private int ano_modelo;
    private String chassi;
    private String obeservacoes;
    private Cores cor;
    private String modelo;
    private String motorizacao;
    private String placa;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public int getAno_fabricacao() {
        return ano_fabricacao;
    }

    public void setAno_fabricacao(int ano_fabricacao) {
        this.ano_fabricacao = ano_fabricacao;
    }

    public int getAno_modelo() {
        return ano_modelo;
    }

    public void setAno_modelo(int ano_modelo) {
        this.ano_modelo = ano_modelo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getObeservacoes() {
        return obeservacoes;
    }

    public void setObeservacoes(String obeservacoes) {
        this.obeservacoes = obeservacoes;
    }

    public Cores getCor() {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(String motorizacao) {
        this.motorizacao = motorizacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Carros{" + "id=" + id + ", renavam=" + renavam + ", ano_fabricacao=" + ano_fabricacao + ", ano_modelo=" + ano_modelo + ", chassi=" + chassi + ", obeservacoes=" + obeservacoes + ", cor=" + cor + ", modelo=" + modelo + ", motorizacao=" + motorizacao + ", placa=" + placa + '}';
    }

  
    

   
    
}
