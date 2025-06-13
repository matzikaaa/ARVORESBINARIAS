rotacaoDireitaDireita(No y) {
    No x = y.esquerdo;
    No T2 = x.direito;

    
    x.direito = y;
    y.esquerdo = T2;

   
    y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;
    x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;

   
    return x;
}
