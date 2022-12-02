public class Perro extends Animal {
    String raza;

    public Perro () { }

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String raza, String nombre){
        this.raza = raza;
        this.nombre = nombre;
    }

    void imprime () {
        System.out.println("¡Guau! me llamo " + nombre);
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    void imprimePorPartes(){
        super.imprime();
        System.out.println(" y soy un " + raza);
    }
}