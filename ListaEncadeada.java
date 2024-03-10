public class ListaEncadeada {
    private Nodo lista;
    private int nElementos;

    public ListaEncadeada(){
        this.lista = null;
        this.nElementos = 0;
    }

    public void inserirInicio(Nodo novoNodo){
        if(this.lista == null){
            this.lista = novoNodo;
        }else{
            novoNodo.setProx(lista);
            this.lista = novoNodo;
        }
        this.nElementos++;
    }

    public void inserirFim(Nodo novoNodo){
        if(this.lista == null){
            this.lista = novoNodo;
        }else{
            Nodo aux = this.lista;
            while(aux.getProx() != null){
                aux = aux.getProx();
            }
            aux.setProx(novoNodo);
        }
        this.nElementos++;
    }

    public void removeInicio(){
        if(this.lista == null){
            System.out.println("Vazia"); 
        }else{
            this.lista = this.lista.getProx();
            this.nElementos--;
        }
    }

    public void removeFinal(){
        if(this.lista == null)
            System.out.println("Vazia!");
        else{
            if(this.lista.getProx() == null){ 
                this.lista = null;
            }else {
                Nodo aux = this.lista;
                Nodo anterior = this.lista;
                while (aux.getProx() != null) {
                    anterior = aux;
                    aux = aux.getProx();
            }
            anterior.setProx(null);
           }
       this.nElementos--;
       }
    }

    public void mostrar(){
        if(this.lista == null){
            System.out.println("Vazia");
        }else{
            Nodo aux = this.lista;
            while(aux != null){
                if(aux.getProx() != null){
                    System.out.print(aux.getValor()+ ", ");
                }else{
                    System.out.print(aux.getValor());
                }
                aux = aux.getProx();
            }
            System.out.println();
        }
    }

    public Nodo acesso(int posicao){
        Nodo nodoAcessado = null;
        if(this.lista == null){
            System.out.println("Lista Vazia");
        }else{
            Nodo aux = this.lista;
            int i = 1;
            while(aux.getProx() != null && i != posicao){
                aux = aux.getProx();
                i++;
            }
            if(i == posicao){
                nodoAcessado = aux;
                return nodoAcessado;
            }else{
                return nodoAcessado;
            }
        }
        return nodoAcessado;
    }

    public Nodo pesquisa(int valor){
        Nodo nodoPesquisado = null;
        if(this.lista == null){
            System.out.println("Lista Vazia");
        }else{
            Nodo aux = this.lista;
            while(aux.getProx() != null && aux.getValor() != valor){
                aux = aux.getProx();
            }

            if(aux.getValor() == valor){
                nodoPesquisado = aux;
                return nodoPesquisado;
            }else{
                return nodoPesquisado;
            }
        }
        return nodoPesquisado;
    }

    public void insercaoPosicaoEspecifica(int posicao, Nodo novoNodo){
        if(this.lista == null){
            this.inserirInicio(novoNodo);
        }else if(posicao > this.nElementos){
            this.inserirFim(novoNodo);
        }
        else{
            Nodo anterior = this.lista;
            Nodo aux = this.lista;
            int i = 0;

            while(aux.getProx() != null && posicao != i){
                anterior = aux;
                aux = aux.getProx();
                i++;
            }
            novoNodo.setProx(aux);
            anterior.setProx(novoNodo);
        }
    }

    public int getnElementos() {
        return nElementos;
    }

    public void setnElementos(int nElementos) {
        this.nElementos = nElementos;
    }

    public Nodo getLista() {
        return lista;
    }

    public void setLista(Nodo lista) {
        this.lista = lista;
    }
}
