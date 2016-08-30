package model;

public class Aprovacao {

    private int id;
    private String aprovacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(String aprovacao) {
        this.aprovacao = aprovacao;
    }

    @Override
    public String toString() {
        return "Aprovacao{" + "id=" + id + ", aprovacao=" + aprovacao + '}';
    }
    
    
}
