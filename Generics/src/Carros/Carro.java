package Carros;

public abstract class Carro {
    String nome,cor;
    Integer potencia;

    public Carro(String nome, String cor, Integer potencia) {
        this.nome = nome;
        this.cor = cor;
        this.potencia = potencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", potencia=" + potencia +
                '}';
    }
}
