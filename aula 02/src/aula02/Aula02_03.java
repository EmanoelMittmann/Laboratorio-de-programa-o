package aula02;

import javax.swing.*;
import java.text.DecimalFormat;

public class Aula02_03 {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        double np1,np2,nt3;
        double media;
        String dado;
        dado = JOptionPane.showInputDialog("Informe nota de prova 1");
        np1 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe nota de prova 2");
        np2 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("Informe a nota final "); 
        nt3 = Double.parseDouble(dado);

        media=(np1+np2+nt3)/3;
        if (media>6){
            JOptionPane.showMessageDialog(null,"Aprovado!"+df2.format(media));
        }else{
            JOptionPane.showMessageDialog(null,"Reprovado!"+df2.format(media));
        }


    }
}
