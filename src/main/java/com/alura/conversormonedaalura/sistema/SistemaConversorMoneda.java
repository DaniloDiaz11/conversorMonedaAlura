
package com.alura.conversormonedaalura.sistema;

import com.alura.conversormonedaalura.modelo.Dolar;
import javax.swing.JOptionPane;
import com.alura.conversormonedaalura.exceptions.tasaDeCambioException;
import com.alura.conversormonedaalura.exceptions.CantidadInvalidaException;
import com.alura.conversormonedaalura.modelo.Euro;
import com.alura.conversormonedaalura.modelo.LibrasEsterlinas;
import com.alura.conversormonedaalura.modelo.Won;
import com.alura.conversormonedaalura.modelo.Yen;

/**
 *
 * @author DaniloDiaz
 */
public class SistemaConversorMoneda {
    
    static Dolar d = new Dolar( 4154.06);
    static Euro e = new Euro(4605.31);
    static LibrasEsterlinas le = new LibrasEsterlinas(5409.02);
    static Yen y = new Yen(29.80);
    static Won w = new Won(3.24);
    
    public static void convertirMoneda() {
        boolean continuar = true;

        while (continuar) {
            String montoStr = JOptionPane.showInputDialog(null, "Ingrese el monto a convertir:", "Conversor de moneda", JOptionPane.PLAIN_MESSAGE);
            
            try {
                double monto = Double.parseDouble(montoStr);

                String[] opciones = { "De peso Colombiano a Dolar", "De peso Colombiano a Euro", "De peso Colombiano a Libras Esterlinas",
                        "De peso Colombiano a Yen", "De peso Colombiano a Won", "De dolar a peso Colombiano", "De Euro a peso Colombiano",
                        "De Libras Esterlinas a peso Colombiano","De Yen a peso Colombiano", "De Won a peso Colombiano"};

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
                    switch (opcionSeleccionada) {
                        case "De peso Colombiano a Dolar":
                            // Aquí puedes llamar a tu función de conversión de moneda
                            JOptionPane.showMessageDialog(null, "El resultado es: " + d.convertir(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "De peso Colombiano a Euro":
                            // Aquí puedes llamar a otra función o realizar alguna otra acción
                            JOptionPane.showMessageDialog(null, "El resultado es: " + e.convertir(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "De peso Colombiano a Libras Esterlinas":
                            // Aquí puedes llamar a otra función o realizar alguna otra acción
                            JOptionPane.showMessageDialog(null, "El resultado es: " + le.convertir(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "De peso Colombiano a Yen":
                            // Aquí puedes llamar a otra función o realizar alguna otra acción
                            JOptionPane.showMessageDialog(null, "El resultado es: " + y.convertir(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "De peso Colombiano a Won":
                            // Aquí puedes llamar a otra función o realizar alguna otra acción
                            JOptionPane.showMessageDialog(null, "El resultado es: " + w.convertir(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "De dolar a peso Colombiano":
                            // Aquí puedes llamar a tu función de conversión de moneda
                            JOptionPane.showMessageDialog(null, "El resultado es: " + d.convertirInversa(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "De Euro a peso Colombiano":
                            // Aquí puedes llamar a otra función o realizar alguna otra acción
                            JOptionPane.showMessageDialog(null, "El resultado es: " + e.convertirInversa(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "De Libras Esterlinas a peso Colombiano":
                            // Aquí puedes llamar a otra función o realizar alguna otra acción
                            JOptionPane.showMessageDialog(null, "El resultado es: " + le.convertirInversa(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "De Yen a peso Colombiano":
                            // Aquí puedes llamar a otra función o realizar alguna otra acción
                            JOptionPane.showMessageDialog(null, "El resultado es: " + y.convertirInversa(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        case "De Won a peso Colombiano":
                            // Aquí puedes llamar a otra función o realizar alguna otra acción
                            JOptionPane.showMessageDialog(null, "El resultado es: " + w.convertirInversa(monto), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            break;
                    }
                }

                // Preguntar si desea continuar
                int opcionContinuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Continuar", JOptionPane.YES_NO_OPTION);
                if (opcionContinuar != JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Programa Terminado", "Programa Terminado", JOptionPane.INFORMATION_MESSAGE);
                    continuar = false;
                }
            } catch (CantidadInvalidaException | tasaDeCambioException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error: El monto ingresado no es válido", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
