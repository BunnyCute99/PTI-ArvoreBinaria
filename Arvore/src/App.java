public class App {
    public static void main(String[] args) throws Exception {
        // a esquerda Fetiva
        ArvoreBinaria a = new ArvoreBinaria();
        a.Inserir(500);
        a.Inserir(300);
        a.Inserir(100);
        a.Inserir(400);
        a.Inserir(350);
        a.Inserir(375);
        a.Inserir(800);
        a.Inserir(600);
        a.Inserir(550);
        a.Inserir(650);
        a.Inserir(900);
        a.Inserir(1000);

        System.out.println("Esquerda Festiva: " + a.CalcularEsquerda());

        // b Imprimir

        ArvoreBinaria b = new ArvoreBinaria();
        b.Inserir(555);
        b.Inserir(333);
        b.Inserir(111);
        b.Inserir(444);
        b.Inserir(888);
        b.Inserir(999);

        b.Imprimir();
    }

}
