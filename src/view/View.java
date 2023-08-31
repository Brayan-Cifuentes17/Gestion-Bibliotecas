package view;

import javax.swing.JOptionPane;

public class View {
    public String readGraphicString(String message) {
        return JOptionPane.showInputDialog(message);
    }

    public int readGraphicInt(String message) {
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }

    public void showGraphicMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public int showMenu() {
        return readGraphicInt("1.Agregar Libro\n2.Prestar libro\n3.Devolver Libro" +
                "\n4.Visualizar libros Disponibles\n5.Visualizar libros devueltos\n6.Visualizar libros prestados\n7.Salir");
    }
}
