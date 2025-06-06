No rotacaoEsquerda(No x) {
    No y = x.direito;
    No T2 = y.esquerdo;

    y.esquerdo = x;
    x.direito = T2;

    x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;
    y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;

    return y;
}
