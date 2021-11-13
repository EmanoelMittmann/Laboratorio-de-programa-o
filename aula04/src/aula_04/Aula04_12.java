package aula_04;

public class Aula04_12 {
    public static String getMesporextensao;{

    }
    public static String Getportugues(int mes,int idioma) {

        if(idioma==1){
            switch (mes) {
                case 1:{
                    return "Janeiro";
                }
                case 2:{
                    return "Fevereiro";
                }
                case 3:{
                    return "Março";
                }
                case 4:{
                    return "Abril";
                }
                case 5:{
                    return "Maio";
                }
            }
        }
        return null;
    }
    public static String Getingles(int mes, int idioma){

        if(idioma==1){
            switch (mes) {
                case 1:{
                    return "January";
                }
                case 2:{
                    return "February";
                }
                case 3:{
                    return "March";
                }
                case 4:{
                    return "April";
                }
            }
        }
        return null;
    }
}
