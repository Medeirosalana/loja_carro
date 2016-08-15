package model;

import java.util.Date;

public class Vendas {

    private int id;
    private Date dt_venda;
    private CartasDeCreditos cartas;
    private Clientes cliente;
    private Carros carro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDt_venda() {
        return dt_venda;
    }

    public void setDt_venda(Date dt_venda) {
        this.dt_venda = dt_venda;
    }

    public CartasDeCreditos getCartas() {
        return cartas;
    }

    public void setCartas(CartasDeCreditos cartas) {
        this.cartas = cartas;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Carros getCarro() {
        return carro;
    }

    public void setCarro(Carros carro) {
        this.carro = carro;
    }
    
}
