import com.groupie.produtos.Musica;

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

    }
}