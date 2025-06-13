import java.util.Arrays;

public class ArvoreAVL {
    static final int MAX = 100;
    static int[] arvore = new int[MAX];
    static int tamanho = 0;

    public static void inserir(int valor) {
        arvore[tamanho] = valor;
        tamanho++;
        Arrays.sort(arvore, 0, tamanho); 
    }

   
    public static void deletar(int valor) {
        int index = -1;
        for (int i = 0; i < tamanho; i++) {
            if (arvore[i] == valor) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < tamanho - 1; i++) {
                arvore[i] = arvore[i + 1];
            }
            tamanho--;
        }
    }

   
    public static void imprimir() {
        System.out.print("Árvore (em ordem): ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(arvore[i] + " ");
        }
        System.out.println();
    }

 
    public static void rotacaoDireita() {
        if (tamanho > 1) {
            int temp = arvore[0];
            for (int i = 0; i < tamanho - 1; i++) {
                arvore[i] = arvore[i + 1];
            }
            arvore[tamanho - 1] = temp;
        }
    }

    public static void rotacaoEsquerda() {
        if (tamanho > 1) {
            int temp = arvore[tamanho - 1];
            for (int i = tamanho - 1; i > 0; i--) {
                arvore[i] = arvore[i - 1];
            }
            arvore[0] = temp;
        }
    }

 
    public static void mostrarCores() {
        for (int i = 0; i < tamanho; i++) {
            String cor = (i % 2 == 0) ? "Preto" : "Vermelho";
            System.out.println("Valor: " + arvore[i] + " | Cor: " + cor);
        }
    }

    public static void main(String[] args) {
        inserir(10);
        inserir(20);
        inserir(5);
        inserir(15);
        inserir(25);

        imprimir();
        mostrarCores();

        System.out.println("\nRemovendo 10...");
        deletar(10);
        imprimir();

        System.out.println("\nRotação à esquerda:");
        rotacaoEsquerda();
        imprimir();

        System.out.println("\nRotação à direita:");
        rotacaoDireita();
        imprimir();
    }
}
