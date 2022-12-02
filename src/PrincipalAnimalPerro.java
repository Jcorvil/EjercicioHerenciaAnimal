public class PrincipalAnimalPerro {
    public static void main(String[] args) {
        // Creo un objeto de tipo Perro
        Perro perro1 = new Perro();

        //TODO: al campo nombre del objeto perro le asigno el valor "Toby"
        perro1.setNombre("Toby");
        //TODO: al campo raza del objeto perro le asigno el valor "Podenco"
        perro1.setRaza("podenco");
        //TODO: crea un método en Perro que imprima el nombre y la raza (la misma frase anterior),
        System.out.println("¡Guau! Me llamo " + perro1.nombre + " y soy un " + perro1.raza);


        // TODO: crea un método en la clase Animal que imprima el nombre ("¡Guau! me llamo Toby") y otro
        // en la clase Perro de nombre imprimePorPartes que invoque al anterior y seguidamente imprima
        // la raza ("y soy un Podenco"). Invócalo desde aquí y comprueba que el efecto es el mismo que la línea anterior.
        System.out.println(perro1.saludoToby);
        perro1.imprimePorPartes();

        // TODO: Creo un constructor con un sólo parámetro para la raza
        Perro perro2 = new Perro("dalmata");
        perro2.imprimePorPartes();

        // TODO: Creo un objeto de tipo Perro utilizando un constructor con dos parámetros para el nombre y la raza
        Perro perro3 = new Perro("dalmata", "Rolly");
        perro3.imprimePorPartes();

    }
}