import java.util.List;

/**
 * Created by federicotanzi on 8/12/16.
 */
public interface Grafo {
    void agregarVertice(Object x);
    void agregarArista(int v, int w);
    void eliminarArista(int v, int w);
    void eliminarVertice(int v);
    boolean hayArista(int v, int w);
    int orden();
    int cantAristas();
    Object verVertice(int v);
    List<Integer> getListaAdy(int v);
}
