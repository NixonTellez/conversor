package com.conversor.conversores;

import javax.swing.*;

public class ConversorTemperatura extends Conversor{

    public ConversorTemperatura() {
        setValorUnitario(1.8);
    }

    public double convertirACelsius(double monto){
        return ((monto - 32)/getValorUnitario());
    }

    public double convertirAFahrenheit(double monto){
        return ((monto * getValorUnitario())+32);
    }


    @Override
    public String convertirPorTipo(String tipo, double monto){
        double montoFin;
        String mensaje;
        String titulo = "Conersor - Temperatura";
        switch (tipo){
            case("Celsius (°C) a Fahrenheit (°F)"):
                montoFin = convertirAFahrenheit(monto);
                mensaje = String.format("El valor de "+monto+"°C celsius en fahrenheit es:\n"+montoFin+"°F",monto, montoFin);
                return showConversion(mensaje, titulo);
            case("Fahrenheit (°F) a Celsius (°C)"):
                montoFin = convertirACelsius(monto);
                mensaje = ("El valor de "+monto+"°F fahrenheit en celsius es:\n"+montoFin+"°C");
                return showConversion(mensaje, titulo);
            default:
                montoFin = 0;
                JOptionPane.showMessageDialog(null,"Opción no valida, intentelo nuevamente", "Conversor - Error",JOptionPane.WARNING_MESSAGE);
                return "1";
        }
    }
}
