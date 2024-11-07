class Cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro esta latindo.");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro esta se movendo.");
    }
}
