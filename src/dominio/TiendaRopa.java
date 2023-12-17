public class TiendaRopa {
    public static void main(String[] args) {
        // Ejemplo de uso
        Ropa ropa = new Ropa("Camiseta", "M");
        Precio precio = new Precio(19.99);
        Nombre nombre = new Nombre("Ropa Casual");

        // Mostrar información
        System.out.println("Tienda: " + nombre.getNombre());
        System.out.println("Tipo de ropa: " + ropa.getTipo());
        System.out.println("Talla: " + ropa.getTalla());
        System.out.println("Precio: $" + precio.getValor());
    }
}