package model;

public class Custos {

    private int id;
    private float valor;
    private String descrissao;
    private Carros carro;

    public Carros getCarro() {
        return carro;
    }

    public void setCarro(Carros carro) {
        this.carro = carro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescrissao() {
        return descrissao;
    }

    public void setDescrissao(String descrissao) {
        this.descrissao = descrissao;
    }
  

    
}
