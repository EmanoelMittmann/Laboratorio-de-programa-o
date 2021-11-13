package aula_04;

import java.util.Random;

//Uma imagem é formada por pixels.
// Considere uma imagem com dimensão de 40 x 40 e faça uma classe que contenha um array bidimensional
// com essas dimensões. A seguir, para cada posição desse array bidimensional armazene um valor aleatório
// entre 0 e 255
// (esses valores correspondem às tonalidades aplicadas sobre a imagem). Apresente em tela os 1600 valores gerados.
public class Aula04_09 {
    public static void main(String[] args) {
        Random random = new Random();
        final int estrutura = 45;
        int [][] img = new int[estrutura][estrutura];

        for (int i=0;i<estrutura;i++){
            for (int j=0;j<estrutura;j++){
                img[i][j]= random.nextInt(255);
            }
        }
        for (int i=0;i<estrutura;i++){
            for (int j=0;j<estrutura;j++){
                System.out.println(img[i][j] + ",");
            }
        }
    }
}
