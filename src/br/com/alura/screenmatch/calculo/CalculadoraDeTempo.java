package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        System.out.println(tempoTotal += f.getDuracaoEmMinutos());
//    }
//
//    public void inclui(Serie s) {
//        System.out.println(tempoTotal += s.getDuracaoEmMinutos());
//    }

    public void inclui(Titulo titulo) {
        System.out.println(tempoTotal += titulo.getDuracaoEmMinutos());


    }


}
