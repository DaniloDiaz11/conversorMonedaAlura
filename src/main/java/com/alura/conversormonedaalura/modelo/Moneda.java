
package com.alura.conversormonedaalura.modelo;

import com.alura.conversormonedaalura.exceptions.tasaDeCambioException;
import com.alura.conversormonedaalura.exceptions.CantidadInvalidaException;
import java.text.DecimalFormat;

/**
 *
 * @author DaniloDiaz
 */
public abstract class Moneda {
    
    DecimalFormat df = new DecimalFormat("#.##");
    protected double tasaDeCambio;
    
    public Moneda(double tasaDeCambio) {
        this.tasaDeCambio = tasaDeCambio;
    }

    public double convertir(double cantidad) throws CantidadInvalidaException, tasaDeCambioException {
        if (Double.isNaN(cantidad) || cantidad < 0) {
            throw new CantidadInvalidaException("La cantidad ingresada no es un número valido");
        }
        else if (tasaDeCambio <= 0) {
            throw new tasaDeCambioException("La Tasa de cambio no es valida");
        }
        
        String resultadoFormateado = df.format(cantidad / tasaDeCambio);
        return Double.parseDouble(resultadoFormateado);
    };
    
    
    public double convertirInversa(double cantidad) throws CantidadInvalidaException, tasaDeCambioException{
        if (Double.isNaN(cantidad) || cantidad < 0) {
            throw new CantidadInvalidaException("La cantidad ingresada no es un número valido");
        }
        else if (tasaDeCambio <= 0) {
            throw new tasaDeCambioException("La Tasa de cambio no es valida");
        }
        
        String resultadoFormateado = df.format(cantidad * tasaDeCambio);
        return Double.parseDouble(resultadoFormateado);
    };

}
