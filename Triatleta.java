public class Triatleta extends Pessoa implements Corredor, Nadador, Ciclista {

    public void correr() {
        System.out.println(getNome() + " corre");
    }

    public void pedalar() {
        System.out.println(getNome() + " pedala");
    }

    public void nadar() {
        System.out.println(getNome() + " nada");
    }

    public void aquecer() {
        System.out.println(getNome() + " tem que aquecer antes treinar");
    }
    
}
