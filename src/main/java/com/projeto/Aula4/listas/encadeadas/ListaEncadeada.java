package com.projeto.Aula4.listas.encadeadas;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    //Método add()
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++){
             noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    //Método get()
    public T get(int index){
        return getNo(index).getConteudo();
    }

     //Método getNo()
    private No<T> getNo(int index){
        validaIndex(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i < this.size()-1; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    //Métono remove()
    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    //Método size vai retornar o tamanho da minha lista
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }

        return tamanhoLista;
    }

    //Método para validar Index
    private void validaIndex(int index){
        if (index >= size()){
            int ultimoIndex = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteudo no index " + index +
                    " desta Lista. Esta lista só vai ate o index " + ultimoIndex + ".");
        }
    }

    //Método para verificar se minha Lista está vazia
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    //Método toString()
    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i =  0; i < this.size(); i ++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
