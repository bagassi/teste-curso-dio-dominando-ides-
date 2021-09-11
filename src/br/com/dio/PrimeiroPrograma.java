package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato()

        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 porcos", 300);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello Word! " + (a+b));*/
    }
    
}


class Livro {
    private String nome;
    private Integer num.Paginas

    public Livro(String nome, Integer num) {
        this.nome = nome;
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", num=" + num +
                '}';
    }
}