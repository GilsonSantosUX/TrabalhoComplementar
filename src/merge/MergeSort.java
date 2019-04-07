package merge;
public class MergeSort{
    public void mergeSort(String[] lista, int init,int end){
        if(init < end){
            int middle = (init+end)/2;
            mergeSort(lista, init, middle);
            mergeSort(lista, middle+1, end);
            merge(lista, init, middle, end);
        }
    }

    private void merge(String[] lista,int init,int middle,int end){
        String[] listaB = new String[lista.length];
        
        for(int i=0;i<lista.length;i++){
            listaB[i] = lista[i];
        }

        int i = init;
        int j = middle + 1;
        int k = init;

        while(i <= middle && j <= end){
            if(listaB[i].charAt(0) <= listaB[j].charAt(0))
                lista[k++] = listaB[i++];
            else
                lista[k++] = listaB[j++];
        }
        while (i <= middle){
            lista[k++] = listaB[i++];
        }
    }
}