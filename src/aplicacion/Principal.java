public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Ropa ropa1 = new Ropa("Camiseta", "M");
        Precio precio1 = new Precio(19.99);
        Nombre nombre1 = new Nombre("Ropa Casual");

        Ropa ropa2 = new Ropa("Pantalón", "L");
        Precio precio2 = new Precio(29.99);
        Nombre nombre2 = new Nombre("Tienda Elegante");

        // Mostrar información de la primera tienda
        System.out.println("Tienda: " + nombre1.getNombre());
        System.out.println("Tipo de ropa: " + ropa1.getTipo());
        System.out.println("Talla: " + ropa1.getTalla());
        System.out.println("Precio: $" + precio1.getValor());
        System.out.println();

        // Mostrar información de la segunda tienda
        System.out.println("Tienda: " + nombre2.getNombre());
        System.out.println("Tipo de ropa: " + ropa2.getTipo());
        System.out.println("Talla: " + ropa2.getTalla());
        System.out.println("Precio: $" + precio2.getValor());
    }
}