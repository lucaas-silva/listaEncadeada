public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.mostrar();
        
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(10);
        lista.inserirInicio(novoNodo);
        
        novoNodo = new Nodo();
        novoNodo.setValor(5);
        lista.inserirFim(novoNodo);

        lista.mostrar();
        
        int posicao = 1;
        Nodo nodoAcessado = lista.acesso(posicao);

        if (nodoAcessado == null){
            System.out.println("Não existe na lista");
        }else{
            System.out.println(nodoAcessado.getValor());
        }


        int valor = 7; 
        Nodo nodoPesquisado = lista.pesquisa(valor);

        if(nodoPesquisado == null){
            System.out.println("NAO TEM ");
        }else{
            System.out.println(nodoPesquisado.getValor());
        }
    

        for(int i = 0; i < 10; i++){
            novoNodo = new Nodo();
            novoNodo.setValor(i);
            lista.inserirInicio(novoNodo);
        }
        lista.mostrar();

        posicao = 20;
        novoNodo = new Nodo();
        novoNodo.setValor(17);

        lista.insercaoPosicaoEspecifica(posicao, novoNodo);
        lista.mostrar();
    }
}