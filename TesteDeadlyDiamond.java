// Classe de teste para o exemplo "Deadly Diamond of Death"
public class TesteDeadlyDiamond {
    public static void main(String[] args) {
        // Instanciação da classe Pegasus
        Pegasus pegasus = new Pegasus();

        // Teste dos métodos de movimento
        pegasus.mover(); // Chamará o método mover da classe Cavalo e depois o específico de Pegasus
    }
}
