package com.projeto.aula3.filas;

//Refatorando a nossa classe fila
public class Fila<T> {

    //Implementando nossa referencia de entrada na Fila, lembrando que estamos entrando na fila pelo final dela
    private No<T> refNoEntradaFila;


    //Construtor, colocamos null para quando instanciar nossa Fila seja vazia
    public Fila() {
        this.refNoEntradaFila = null;
    }

    //Vamos implementar o método Enqueue que vai enfileirar a nossa Fila
//    public void enqueue(No novoNo) {
//        novoNo.setRefNo(refNoEntradaFila);
//        refNoEntradaFila = novoNo;
//    }

    //refatorando o Método enqueue
    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    //Método fist ele vai nos retornar o primeiro No da Fila ou seja o primeiro que chegou na Fila
    public T first() {
        //Verificamos se a lista não está vazia diferente do método isEmpty, estamos negando ! o isEmpty
        if (!this.isEmpty()) {
            //vamos correr ela por trás
            //Então vamos criar um No auxiliar para nos retorna o primeiro
            No primeiroNo = refNoEntradaFila;
            //Como pode acontecer de não aver apenas um No na Fila vamos utilizar o while
            while (true) {
                //Testando se é o primeiro da fila ou seja estando diferente de null sabemos que tem um próximo No na Fila
                if (primeiroNo.getRefNo() != null) {
                    //primeiro No vai passar a ser o No da frente dele
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    //Sendo null vai aver um break no while
                    break;
                }
            }
            //Fazemos um Casting para mostrar nosso tipo genérico
            return (T) primeiroNo.getObject();
        }
        //Caso ela esteja vazia retornamos null
        return null;
    }

    //Vamos implementar o método Dequeue ele chega até ser bem parecido com o first. Só que além dele pegar e retorno o primeiro da fila
    // ele vai tirar da fila esse objeto que ele pegou ele vai pegar o anterior a ele e apontar pro null
    public T dequeue() {
        //Verificamos se a lista não está vazia diferente do método isEmpty, estamos negando ! o isEmpty
        if (!this.isEmpty()) {
            //vamos correr ela por trás
            //Então vamos criar um No auxiliar para nos retorna o primeiro
            No primeiroNo = refNoEntradaFila;
            //Vamos criar um Noauxiliar
            No noAuxiliar = refNoEntradaFila;
            //Como pode acontecer de não aver apenas um No na Fila vamos utilizar o while
            while (true) {
                //Testando se é o primeiro da fila ou seja estando diferente de null sabemos que tem um próximo No na Fila
                if (primeiroNo.getRefNo() != null) {
                    noAuxiliar = primeiroNo;
                    //primeiro No vai passar a ser o No da frente dele
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            //Fazemos um Casting para mostrar nosso tipo genérico
            return (T) primeiroNo.getObject();
        }
        //Caso ela esteja vazia retornamos null
        return null;
    }

    //Vamos implementar o método isEmpty para verificar se a nossa Fila está vazia ou não se estiver vazia retorna true
    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                //Testando se exister apenas um elemento na Fila
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
