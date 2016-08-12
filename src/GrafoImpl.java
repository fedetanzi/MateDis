import java.util.ArrayList;
import java.util.List;

/**
 * Created by federicotanzi on 8/12/16.
 */
public class GrafoImpl implements Grafo {

    private Object[] V;
    private boolean[][] A;
    private int n;
    private int alfa;

    public GrafoImpl() {
        V = new Object[10];
        A = new boolean[10][10];
        n = 0;
        alfa = 0;
    }
    public GrafoImpl(int capacidad) {
        V = new Object[capacidad];
        A = new boolean[capacidad][capacidad]; n = 0;
        alfa = 0;
    }

    public void agregarVertice(Object x){
        V[n] = x;
        n++;
    }
    public void agregarArista(int v, int w){
        A[v][w]=A[w][v] = true;
        alfa++;
    }
    public void eliminarArista(int v, int w){
        A[v][w]=A[w][v] = false;
        alfa--;
    }
    public void eliminarVertice(int v){

    }
    public boolean hayArista(int v, int w){
        return A[v][w];
    }
    public int orden(){
        return n;
    }
    public int cantAristas(){
        return alfa;
    }
    public Object verVertice(int v){
        return V[v];
    }
    public List<Integer> getListaAdy(int v){
        List<Integer> lst = new ArrayList<>();
        for (int w = 0; w < n ; w++)
            if (A[v][w]) lst.add(w);
        return lst;
    }
}
