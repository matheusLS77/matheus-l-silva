import ex4.Cliente;
import ex4.Pedido;
import ex4.Produto;

public class Teste {

    public static void main(String[] args) {
//        double[] notasPt = {5, 6, 10};
//        double[] notasMat = {8, 10, 5};
//        ex3.Aluno a = new ex3.Aluno("Cleber", notasMat, "2A");
//        ex3.Professor pp = new ex3.Professor("Jurandir", "Portugues", "2A", 100);
//        ex3.Professor pm = new ex3.Professor("Marcela", "Matematica", "2A", 150);
//
//       ex3.Boletim b = new ex3.Boletim();
//
//       b.imprimirBoletim(a,pm);

        Cliente c1 = new Cliente("Alberto", "alberto@gmail.com");
        Produto p1 = new Produto("Pneu", 129.99);
        Produto p2 = new Produto("Banana", 5.99);

        Pedido pedido1 = new Pedido(c1, p2, 2);
        pedido1.imprimirResumo();


    }
}
