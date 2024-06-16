import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFIlme = new Filme();

        meuFIlme.setNome("O Poderoso Chefão");
        meuFIlme.setAnoDeLancamento(1970);
        meuFIlme.setDuracaoEmMinutos(180);

        meuFIlme.exibeFichaTecnica();
        meuFIlme.avalia(10);
        meuFIlme.avalia(10);
        meuFIlme.avalia(20);
        System.out.println(meuFIlme.retornaMediaAvaliacoes());

        Serie arcane = new Serie();
        arcane.setNome("Arcane");
        arcane.setAnoDeLancamento(2021);
        arcane.exibeFichaTecnica();


    }
}
