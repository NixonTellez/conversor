package com.conversor.conversores;

import javax.swing.*;

public class ConversorMoneda extends Conversor{

    private double convertir(double monto){
        return monto * getValorUnitario();
    }
    public double convertirDolarAPesos(double monto){
        setValorUnitario(4089.06);
        return convertir(monto);
    }

    public double convertirEuroAPesos(double monto){
        setValorUnitario(4444.99);
        return convertir(monto);
    }

    public double convertirLibraAPesos(double monto){
        setValorUnitario(5152.20);
        return convertir(monto);
    }

    public double convertirYenAPesos(double monto){
        setValorUnitario(28.18);
        return convertir(monto);
    }

    public double convertirWonAPesos(double monto){
        setValorUnitario(3.08);
        return convertir(monto);
    }

    public double convertirADolar(double monto){
        setValorUnitario(0.00025);
        return convertir(monto);
    }

    public double convertirAEuro(double monto){
        setValorUnitario(0.00022);
        return convertir(monto);
    }

    public double convertirALibra(double monto){
        setValorUnitario(0.00019);
        return convertir(monto);
    }

    public double convertirAYen(double monto){
        setValorUnitario(0.035);
        return convertir(monto);
    }

    public double convertirAWon(double monto){
        setValorUnitario(0.32);
        return convertir(monto);
    }
    @Override
    public String convertirPorTipo(String tipo, double monto){
        double montoFin;
        String mensaje;
        String titulo = "Conersor - Dinero";
        switch (tipo){
            case("Peso (COP) a Dolar (USD)"):
                montoFin = convertirADolar(monto);
                mensaje = String.format("El valor de "+monto+" (COP) pesos en dolares es:\n"+montoFin+" (USD)",monto, montoFin);
                return showConversion(mensaje, titulo);

            case("Peso (COP) a Euro (EUR)"):
                montoFin = convertirAEuro(monto);
                mensaje = String.format("El valor de "+monto+" (COP) pesos en euros es:\n"+montoFin+" (EUR)",monto, montoFin);
                return showConversion(mensaje, titulo);

            case("Peso (COP) a Libra Esterlina (GBP)"):
                montoFin = convertirALibra(monto);
                mensaje = String.format("El valor de "+monto+" (COP) pesos en libras esterlinas es:\n"+montoFin+" (GBP)",monto, montoFin);
                return showConversion(mensaje, titulo);

            case("Peso (COP) a Yen (JPY)"):
                montoFin = convertirAYen(monto);
                mensaje = String.format("El valor de "+monto+" (COP) pesos en yenes es:\n"+montoFin+" (JPY)",monto, montoFin);
                return showConversion(mensaje, titulo);

            case("Peso (COP) a Won (KRW)"):
                montoFin = convertirAWon(monto);
                mensaje = String.format("El valor de "+monto+" (COP) pesos en wones surcoreanos es:\n"+montoFin+" (KRW)",monto, montoFin);
                return showConversion(mensaje, titulo);

            case("Dolar (USD) a Peso (COP)"):
                montoFin = convertirDolarAPesos(monto);
                mensaje = ("El valor de "+monto+" (USD) dolares en pesos es:\n"+montoFin+" (COP)");
                return showConversion(mensaje, titulo);

            case("Euro (EUR) a Peso (COP)"):
                montoFin = convertirEuroAPesos(monto);
                mensaje = ("El valor de "+monto+" (EUR) euros en pesos es:\n"+montoFin+" (COP)");
                return showConversion(mensaje, titulo);

            case("Libra Esterlina (GBP) a Peso (COP)"):
                montoFin = convertirLibraAPesos(monto);
                mensaje = ("El valor de "+monto+" (GBP) libras esterlinas en pesos es:\n"+montoFin+" (COP)");
                return showConversion(mensaje, titulo);

            case("Yen (JPY) a Peso (COP)"):
                montoFin = convertirYenAPesos(monto);
                mensaje = ("El valor de "+monto+" (JPY) yenes en pesos es:\n"+montoFin+" (COP)");
                return showConversion(mensaje, titulo);

            case("Won (KRW) a Peso (COP)"):
                montoFin = convertirWonAPesos(monto);
                mensaje = ("El valor de "+monto+" (KRW) wones surcoreanos en pesos es:\n"+montoFin+" (COP)");
                return showConversion(mensaje, titulo);

            default:
                montoFin = 0;
                JOptionPane.showMessageDialog(null,"Opción no valida, intentelo nuevamente", "Conversor - Error",JOptionPane.WARNING_MESSAGE);
                return "1";
        }
    }
}