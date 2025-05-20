
class No {
    int valor;
    No esquerda;
    No direita;

    No(int valor) {
        this.valor = valor;
        esquerda = null;
        direita = null;
    }
}


class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    
    public int contarNos() {
        return contarNosRecursivo(raiz);
    }

    
    private int contarNosRecursivo(No no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNosRecursivo(no.esquerda) + contarNosRecursivo(no.direita);
    }
}


public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        

        arvore.raiz = new No(1);
        arvore.raiz.esquerda = new No(2);
        arvore.raiz.direita = new No(3);
        arvore.raiz.esquerda.esquerda = new No(4);
        arvore.raiz.esquerda.direita = new No(5);
        arvore.raiz.direita.esquerda = new No(6); 

        System.out.println("Total de nós na árvore: " + arvore.contarNos());
    }
}
