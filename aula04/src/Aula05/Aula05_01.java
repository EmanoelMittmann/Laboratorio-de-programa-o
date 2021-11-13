package Aula05;

public class Aula05_01 {
    public static void contar() {
        for (int i=0;i<10;i++){
            System.out.println(i);
        }

    }
    public static void contar(int fim){
        for (int i=0;i<fim;i++){
            System.out.println(i);
        }
    }

    public static void contar(int inicio,int fim){
        for (int i=inicio;i<=fim;i++){
            System.out.println(inicio);
        }

    }
    public static void contar(int inicio,int fim,int pausa){
        for (int i=inicio;i<=fim;i++){
            System.out.println(i);
        try{
            Thread.sleep(pausa);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
