import java.util.List;

public class Main {

    public static void main(String[] args) {
        GrafoImpl grafo = new GrafoImpl();
        grafo.agregarVertice(5);
        grafo.agregarVertice(4);
        grafo.agregarArista(0,1);
        int[][] result1 = getAristas(grafo);
        int[][] result2 =getAristasAdy(grafo);
    }

    public static int[][] getAristas(Grafo g){
        int arista = g.cantAristas();
        int orden = g.orden();
        int k = 0;
        int[][] result = new int[arista][2];
        for (int i = 0; i <orden ; i++) {
            for (int j = i; j <orden ; j++) {
                if (g.hayArista(i,j)){
                    result[k][0]= i;
                    result[k][1]= j;
                    k++;
                }
            }
        }
        return result;
    }

    public static int[][] getAristasAdy(Grafo g) {
        int arista = g.cantAristas();
        int orden = g.orden();
        int [][] result = new int[arista][2];
        int k=0;
        int w;
        List<Integer> lst;
        for (int v=0; v < orden ; v++) {
            lst = g.getListaAdy(v);
            for (Integer integer : lst) {
                w = integer;
                if ( v <= w){
                    result[k][0]= v;
                    result[k][1] = w;
                    k++;
                }
            }
        }
        return result;
    }

}
