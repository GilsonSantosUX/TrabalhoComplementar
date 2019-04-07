package bubble;
public class BubbleSort{
    public void bubbleSort(String[] lista){
        for(int i = 0; i < lista.length-1; i++) {
            for(int j = 0; j < lista.length-1-i; j++) {
                  if(lista[j].charAt(0) > lista[j+1].charAt(0)) {
                     String temp = lista[j];
                     lista[j] = lista[j+1];
                     lista[j+1] = temp;
                  }
             }
         }
    }
}