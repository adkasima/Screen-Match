import br.com.alura.screenmatch.modelos.Filme;

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


    }
}
