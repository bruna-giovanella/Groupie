import com.groupie.produtos.Musica;
import com.groupie.produtos.Podcast;

public class Main {
    public static void main(String[] args) {
        // instanciando o objeto;
        Musica noMoreTiers = new Musica();
        noMoreTiers.setTitulo("No More Tiers");
        noMoreTiers.setAvaliacao(10);
        noMoreTiers.setTotalCurtidas(100);
        noMoreTiers.setTotalReproducoes(200);
        noMoreTiers.setEstaTocando(true);
        noMoreTiers.curte();
        noMoreTiers.curte();
        System.out.println(noMoreTiers.fichaTecnica());
        noMoreTiers.descurte();
        System.out.println(noMoreTiers.fichaTecnica());


        Musica fakePlasticTrees = new Musica();
        fakePlasticTrees.setTitulo("Fake Plastic Trees");
        fakePlasticTrees.setArtista("Radiohead");
        fakePlasticTrees.setAlbum("The Bends");
        fakePlasticTrees.setGenero("Rock");
        fakePlasticTrees.setAvaliacao(10);
        fakePlasticTrees.setTotalCurtidas(50);
        fakePlasticTrees.setTotalReproducoes(50);
        fakePlasticTrees.setEstaTocando(true);
        System.out.println(fakePlasticTrees.fichaTecnica());


        Podcast podpah = new Podcast();
        podpah.setTitulo("Podcast do dia");
        podpah.setHost("Fulano e Ciclano");
        podpah.setDescricao("Aqui você vai encontrar episodios de tal e tal");
        podpah.setQuantiaDeEpisodios(189);
        podpah.setTotalCurtidas(1);
        podpah.setAvaliacao(1);
        podpah.setTotalReproducoes(2);
        podpah.setEstaTocando(false);
        podpah.descurte();
        podpah.setDuracaoEmSegundos(1983);
        System.out.println(podpah.fichaTecnica());




    }
}