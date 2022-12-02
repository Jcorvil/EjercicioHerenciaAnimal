public class Animal {
    String nombre;
    Animal () {}

    Animal (String nombre) {
        this.nombre = nombre;
    }
    void imprime () {
        System.out.print("¡Guau! Me llamo " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String saludoToby = "¡Guau! Me llamo Toby";
}