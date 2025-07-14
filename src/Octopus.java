public class Octopus implements Prey, Predator{

    @Override
    public void flee() {
        System.out.println("Octopus is running away");
    }

    @Override
    public void hunt() {
        System.out.println("Octopus is swmming away");
    }
}
