package ex1;

public class CalcularDesconto implements Calculo {

    @Override
    public double calcular(double preco, double valor) {
        return preco - (preco * valor/100);
    }
}
