package com.media.main;

import com.media.ui.MainWindow;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // SwingUtilities asegura que la interfaz se cargue de forma segura
        SwingUtilities.invokeLater(() -> {
            try {
                // 1. Creamos la ventana principal
                MainWindow window = new MainWindow();

                // 2. La hacemos visible (por defecto las ventanas en Java nacen ocultas)
                window.setVisible(true);

                // 3. (Opcional) Centrarla en la pantalla
                window.setLocationRelativeTo(null);



            } catch (Exception e) {
                System.err.println("Error al iniciar la interfaz: " + e.getMessage());
            }
        });
    }
}