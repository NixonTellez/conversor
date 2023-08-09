import com.conversor.conversores.Conversor;
import com.conversor.conversores.ConversorMoneda;
import com.conversor.conversores.ConversorTemperatura;
import  com.conversor.conversores.ConversorUtil;
import javax.swing.JOptionPane;
public class Main {



    public static void main(String[] args) {
        final String[] OPCIONES = {"Dinero", "Temperatura"};
        String[] opcionesDeConversion;
        int continuar = 1;
        String input = "";
        String opcion = "";
        Double valorAConvertir = null;
        Conversor conversor;
        ConversorUtil conversorTool = new ConversorUtil();

        do{
            if (valorAConvertir == null) {
                opcion = "";
            }
            try {
                opcion = (JOptionPane.showInputDialog(null, "Seleccione que desea convertir", "Conversor - Menu",
                        JOptionPane.QUESTION_MESSAGE, null, OPCIONES, "Seleccione una opción")).toString();

                switch (opcion) {
                    case ("Dinero"):
                        conversor = new ConversorMoneda();
                        opcionesDeConversion = new String[]{"Peso (COP) a Dolar (USD)",
                                "Peso (COP) a Euro (EUR)",
                                "Peso (COP) a Libra Esterlina (GBP)",
                                "Peso (COP) a Yen (JPY)",
                                "Peso (COP) a Won (KRW)",
                                "Dolar (USD) a Peso (COP)",
                                "Euro (EUR) a Peso (COP)",
                                "Libra Esterlina (GBP) a Peso (COP)",
                                "Yen (JPY) a Peso (COP)",
                                "Won (KRW) a Peso (COP)"};
                        input = conversorTool.ingresarTipoConversion("Seleccione las monedas a convertir","Conversor - Dinero", opcionesDeConversion);
                        if (!input.equals("1")) {
                            valorAConvertir = conversorTool.ingresarNumero();
                            input = conversor.convertirPorTipo(input, valorAConvertir);
                        }
                        break;
                    case ("Temperatura"):
                        conversor = new ConversorTemperatura();
                        opcionesDeConversion = new String[]{"Celsius (°C) a Fahrenheit (°F)", "Fahrenheit (°F) a Celsius (°C)"};
                        input = conversorTool.ingresarTipoConversion("Seleccione la temperatura a convertir","Conversor - Temperatura", opcionesDeConversion);
                        if (!input.equals("1")) {
                            valorAConvertir = conversorTool.ingresarNumero();
                            input = conversor.convertirPorTipo(input, valorAConvertir);
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "La opción no existe", "Conversor - Error", JOptionPane.WARNING_MESSAGE);
                        break;
                }
                continuar = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                if(continuar != 0){
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro conversor", "Conversor - Salir", JOptionPane.PLAIN_MESSAGE);
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor", "Conversor - Error", JOptionPane.ERROR_MESSAGE);
            }
        }while(continuar == 0);
    }
}