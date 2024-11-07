// Classe de teste para verificar a herança
public class TesteHerancaSimples {
    public static void main(String[] args) {
        // Instanciação da classe Cachorro
        Cachorro2 cachorro2 = new Cachorro2();

        // Teste dos métodos herdados e específicos
        cachorro2.mover(); // Chamando o método herdado de Animal
        cachorro2.latir(); // Chamando o método específico de Cachorro
    }
}
