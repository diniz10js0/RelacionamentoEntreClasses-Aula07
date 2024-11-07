// Classe Pegasus que estende Cavalo e implementa o método mover
public class Pegasus extends Cavalo {
    @Override
    public void mover() {
        super.mover(); // Chama o método mover da classe Cavalo
        System.out.println("Pegasus esta voando");
    }
}
