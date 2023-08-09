package com.conversor.conversores;

import javax.swing.*;

public abstract class Conversor{
    private double valorUnitario;

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public abstract String convertirPorTipo(String tipo, double monto);

    public String showConversion(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null,mensaje, titulo,JOptionPane.INFORMATION_MESSAGE);
        return "1";
    }
}
