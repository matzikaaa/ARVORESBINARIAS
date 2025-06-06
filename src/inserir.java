No inserir(No no, int chave) {
    if (no == null)
        return new No(chave);

    if (chave < no.chave)
        no.esquerdo = inserir(no.esquerdo, chave);
    else if (chave > no.chave)
        no.direito = inserir(no.direito, chave);
    else
        return no;

    no.altura = 1 + Math.max(altura(no.esquerdo), altura(no.direito));