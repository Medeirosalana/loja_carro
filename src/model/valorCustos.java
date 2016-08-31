package model;

public class valorCustos {

    private Custos custo;
    private CustosCarros valor;

    public Custos getCusto() {
        return custo;
    }

    public void setCusto(Custos custo) {
        this.custo = custo;
    }

    public CustosCarros getValor() {
        return valor;
    }

    public void setValor(CustosCarros valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "valorCustos{" + "custo=" + custo + ", valor=" + valor + '}';
    }
    
}
