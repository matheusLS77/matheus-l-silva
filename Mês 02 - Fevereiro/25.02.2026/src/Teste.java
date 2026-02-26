public class Teste {

    public static void main(String[] args) {
//        double[] notasPt = {5, 6, 10};
//        double[] notasMat = {8, 10, 5};
//        Aluno a = new Aluno("Cleber", notasMat, "2A");
//        Professor pp = new Professor("Jurandir", "Portugues", "2A", 100);
//        Professor pm = new Professor("Marcela", "Matematica", "2A", 150);
//
//       Boletim b = new Boletim();
//
//       b.imprimirBoletim(a,pm);

        Cliente c1 = new Cliente("Alberto", "alberto@gmail.com");
        Produto p1 = new Produto("Pneu", 129.99);
        Produto p2 = new Produto("Banana", 5.99);

        Pedido pedido1 = new Pedido(c1, p2, 2);
        pedido1.imprimirResumo();


    }
}
