package com.conversor.conversores;

import javax.swing.*;

public class ConversorUtil {
    public boolean isNumero(String texto){
        try {
            if (texto.isBlank()){
                return false;
            }
            Double.parseDouble(texto);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public double ingresarNumero(){
        double numero = 0;
        String numeroTxt = " ";
        while (!isNumero(numeroTxt)) {
            numeroTxt = (JOptionPane.showInputDialog(null,"Ingrese el valor a convertir", "Conversor - Ingresar Valor", JOptionPane.QUESTION_MESSAGE)).toString();
            if (isNumero(numeroTxt)){
                numero = Double.parseDouble(numeroTxt);
            }else{
                JOptionPane.showMessageDialog(null,"Numero no valido, intentelo nuevamente", "Conversor - Error",JOptionPane.WARNING_MESSAGE);
            }
        }
        return numero;
    }

    public String ingresarTipoConversion(String mensaje, String titulo, String[] opciones){
        double numero = 0;
        String tipo ;

        try {
            tipo = (JOptionPane.showInputDialog(null, mensaje, titulo,
                    JOptionPane.PLAIN_MESSAGE, null, opciones, "Seleccione una opción")).toString();
            return tipo;
        }catch (NullPointerException e){
            return "1";
        }
    }
}
