rotacaoDireitaDireita(No y) {
    No x = y.esquerdo;
    No T2 = x.direito;

    // Realizar rotação
    x.direito = y;
    y.esquerdo = T2;

    // Atualizar alturas
    y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;
    x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;

    // Retornar nova raiz
    return x;
}
