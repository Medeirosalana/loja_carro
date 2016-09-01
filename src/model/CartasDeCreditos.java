package model;

public class CartasDeCreditos {

    private int id;
    private String cota;
    private String grupo;
    private float proposta;
    private int prazo;
    private float parcela;
    private float valor_inicial;
    private float valor_final;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCota() {
        return cota;
    }

    public void setCota(String cota) {
        this.cota = cota;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public float getProposta() {
        return proposta;
    }

    public void setProposta(float proposta) {
        this.proposta = proposta;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public float getParcela() {
        return parcela;
    }

    public void setParcela(float parcela) {
        this.parcela = parcela;
    }

    public float getValor_inicial() {
        return valor_inicial;
    }

    public void setValor_inicial(float valor_inicial) {
        this.valor_inicial = valor_inicial;
    }

    public float getValor_final() {
        return valor_final;
    }

    public void setValor_final(float valor_final) {
        this.valor_final = valor_final;
    }

    @Override
    public String toString() {
        return "CartasDeCreditos{" + "id=" + id + ", cota=" + cota + ", grupo=" + grupo + ", proposta=" + proposta + ", prazo=" + prazo + ", parcela=" + parcela + ", valor_inicial=" + valor_inicial + ", valor_final=" + valor_final + '}';
    }

        
}
