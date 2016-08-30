package model;

public class CustosCarros {

    private Carros carro;
    private String nome;
    private float valor;
    private Custos custo;

    public Custos getCusto() {
        return custo;
    }

    public void setCusto(Custos custo) {
        this.custo = custo;
    }

    public Carros getCarro() {
        return carro;
    }

    public void setCarro(Carros carro) {
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "CustosCarros{" + "carro=" + carro + ", nome=" + nome + ", valor=" + valor + ", custo=" + custo + '}';
    }
    
   

    

    
    

   
    
}
