//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int)(Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }
        // bubble sort
        // complexidade N^2
        int aux;

        for(int i = 0; i < vetor.length; i ++){
            for(int j = i + 1; j < vetor.length; j ++){
                if(vetor[i]> vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        System.out.println("vetor ordenado");
        for(int i = 0; i < vetor.length; i++){

            System.out.println(vetor[i]);
        }
    }
}