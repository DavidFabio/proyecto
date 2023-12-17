import javax.swing.*;

public class InterfazRopa {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Crear un frame
        JFrame frame = new JFrame("Información de Ropa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear instancias de las clases
        Ropa ropa = new Ropa("Camiseta", "M");
        Precio precio = new Precio(19.99);
        Nombre nombre = new Nombre("Ropa Casual");

        // Crear un panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Agregar etiquetas al panel
        panel.add(new JLabel("Tienda: " + nombre.getNombre()));
        panel.add(new JLabel("Tipo de ropa: " + ropa.getTipo()));
        panel.add(new JLabel("Talla: " + ropa.getTalla()));
        panel.add(new JLabel("Precio: $" + precio.getValor()));

        // Agregar panel al frame
        frame.getContentPane().add(panel);

        // Ajustar tamaño y hacer visible el frame
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}