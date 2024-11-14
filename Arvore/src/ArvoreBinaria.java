public class ArvoreBinaria {

    private No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // métodos de Esquerda Festiva

    private long EsquedaFestiva(No atual, long esquerda) {
        if (atual != null) {
            if (atual.getEsq() != null) {
                esquerda++;
            }
            esquerda = EsquedaFestiva(atual.getEsq(), esquerda);
            esquerda = EsquedaFestiva(atual.getDir(), esquerda);
        }
        return esquerda;
    }

    public long CalcularEsquerda() {
        long esquerda = 0;
        return EsquedaFestiva(raiz, esquerda);
    }

    private long DireitaFestiva(No atual, long direita) {
        if (atual != null) {
            if (atual.getDir() != null) {
                direita++;
            }
            direita = DireitaFestiva(atual.getEsq(), direita);
            direita = DireitaFestiva(atual.getDir(), direita);
        }
        return direita;
    }

    public long CalcularDireita() {
        long direita = 0;
        return DireitaFestiva(raiz, direita);
    }

    // métodos de imprimir arvore com espaço

    public void Calcular(No atual, int altura) {
        String texto = "";
        for (int i = 0; i < altura; i++) {
            texto = texto + "   ";
        }
        if (atual != null) {

            texto = texto + atual.getId();
            System.out.println(texto);

            Calcular(atual.getEsq(), altura + 1);
            Calcular(atual.getDir(), altura + 1);
        } else {
            texto = texto + "-";
            System.out.println(texto);
        }
    }

    public void Imprimir() {
        int altura = 0;
        Calcular(raiz, altura);

    }

    // métodos de inserção

    public void Inserir(long id) {

        No novoNo = new No(id, null, null);

        if (raiz == null) {
            raiz = novoNo;
        } else {

            No atual = raiz;
            No pai;

            while (true) {

                pai = atual;

                if (novoNo.getId() < atual.getId()) {

                    atual = atual.getEsq();

                    if (atual == null) {

                        pai.setEsq(novoNo);
                        return;
                    }
                } else {
                    atual = atual.getDir();
                    if (atual == null) {
                        pai.setDir(novoNo);
                        return;
                    }
                }
            }
        }
    }

}
