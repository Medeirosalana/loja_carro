package model;

public class Cores {

    private int id;
    private String cor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Cores{" + "id=" + id + ", cor=" + cor + '}';
    }
    
}
