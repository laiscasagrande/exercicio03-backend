package ex02;

public class Empregado {
    private String nome;
    private String sobrenome;
    private Double salarioMensal;

    Empregado(String nome, String sobrenome, Double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }

    void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    String getSobrenome(){
        return this.sobrenome;
    }

    void setSalarioMensal(Double salarioMensal){
        this.salarioMensal = salarioMensal;
    }

    Double getSalarioMensal(){
        return this.salarioMensal;
    }

    Double getSalarioAnual() {
       return this.salarioMensal * 13;
    }
}


