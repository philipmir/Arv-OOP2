public class Pikachu extends Pokemon{ // Pikachu ärver av pokemon ( pikachu )

    public Pikachu(String name) {
        super(name, "electric");
    }
    @Override
    public void attack() {
        System.out.println("Pika " + this.name + " Attack!!! ");
    }



}
