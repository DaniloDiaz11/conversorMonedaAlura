
package com.alura.conversormonedaalura.sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author DaniloDiaz
 */
public class Main {
    
    public static void main(String[] args) {

        String[] opciones = { "Conversor de moneda"};

        // Mostrar el cuadro de diálogo con las opciones
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione una opción:",
                "Menú",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]);

        // Verificar la opción seleccionada
        if (opcionSeleccionada != null) {
            if (opcionSeleccionada.equals("Conversor de moneda")) {
                // Aquí puedes llamar a tu función de conversión de moneda
                SistemaConversorMoneda.convertirMoneda();
            }
        }
    }
}
