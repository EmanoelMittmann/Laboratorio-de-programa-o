package aula_07;

import java.util.Objects;
import java.util.Scanner;

public class Livro {

        public int qtdpag;
        public int capitulos;
        public String titulo;
        public String sinopse;

        public void lerDados(){
            System.out.println("Informe o titulo");
            Scanner tc = new Scanner(System.in);
            titulo= tc.next();
        }
        public void exibirDados(){
            System.out.println(this.titulo);
            System.out.println(this.sinopse);
            System.out.println(this.qtdpag);
            System.out.println(this.capitulos);
    }
    public Livro(int paginas){
            this.qtdpag=paginas;
            System.out.println("criando objeto");
    }
    public Livro(){

    }
    public void setQtdpag(int qtdpag) {
        this.qtdpag = qtdpag;
    }

    public int getQtdpag() {
        return qtdpag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
