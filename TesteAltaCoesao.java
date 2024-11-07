public class TesteAltaCoesao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Joao", 20);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Maior de idade: " + pessoa.isMaiorDeIdade());
    }
}
