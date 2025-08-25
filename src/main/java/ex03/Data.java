package ex03;
import java.time.Year;

public class Data {
    private Integer mes;
    private Integer dia;
    private Integer ano;

    Data(Integer mes, Integer dia, Integer ano){
        this.setMes(mes);
        this.setDia(dia);
        this.setAno(ano);
    }

    Integer getMes() {
        return this.mes;
    }
    void setMes(Integer mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        }else{
            System.out.println("Mês fornecido não existente");
        }
    }

    Integer getDia() {
        return this.dia;
    }

    void setDia(Integer dia) {
        if (mes == 1){
            if (dia >=1 && dia <= 31) {
                this.dia = dia;
            }
        }else if (mes == 2 && !Year.isLeap(this.ano)){
            if (dia >=1 && dia <= 28 ) {
                this.dia = dia;
            }
        } else if (mes == 2 && Year.isLeap(this.ano)){
            if (dia >=1 && dia <= 29 ) {
                this.dia = dia;
            }
        } else if (mes == 3){
            if (dia >=1 && dia <= 31) {
                this.dia = dia;
            }
        }else if (mes == 4){
            if (dia >=1 && dia <= 30) {
                this.dia = dia;
            }
        } else if (mes == 5){
            if (dia >=1 && dia <= 31) {
                this.dia = dia;
            }
        } else if (mes == 6){
            if (dia >=1 && dia <= 30) {
                this.dia = dia;
            }
        } else if (mes == 7){
            if (dia >=1 && dia <= 31) {
                this.dia = dia;
            }
        } else if (mes == 8){
            if (dia >=1 && dia <= 31) {
                this.dia = dia;
            }
        } else if (mes == 9){
            if (dia >=1 && dia <= 30) {
                this.dia = dia;
            }
        } else if (mes == 10){
            if (dia >=1 && dia <= 31) {
                this.dia = dia;
            }
        } else if (mes == 11){
            if (dia >=1 && dia <= 30) {
                this.dia = dia;
            }
        } else if (mes == 12){
            if (dia >=1 && dia <= 31) {
                this.dia = dia;
            }
        }
    }

    Integer getAno() {
        return this.ano;
    }

    void setAno(Integer ano) {
        this.ano = ano;
    }

    void displayData() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}