public class CalcularImposto implements Calculo {

    @Override
    public double calcular(double preco, double valor) {
        return preco + (preco * valor/100);
    }
}
