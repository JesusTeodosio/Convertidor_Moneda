import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class convertidor {
    public static void main(String[] args) {

    	String[] options = { "Convertir Monedas", "Conversor de Temperatura", "Salir" };
    	String choice = (String) JOptionPane.showInputDialog(null, "Que Quieres hacer?", "Convertir",
                JOptionPane.DEFAULT_OPTION, null, options, options[0]);

        if (choice.equals("Salir")) {
            JOptionPane.showMessageDialog(null, "Programa Cerrado");
            System.exit(0);
        }
        if (choice.equals("Convertir Monedas")) {
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");
            boolean conver_mon = true;
            while (conver_mon) {
                String[] opciones = { "Pesos_MX a Euros", "Pesos_MX a Dólares USA", "Pesos_MX a Libras", "Pesos_MX a Yen", "Pesos_MX a Won Coreano", "Euro a Pesos_MX", "Dolar USA a Pesos_MX", "Libras a Pesos_MX", "Yen a Pesos_MX", "Won Coreano a Pesos_MX" };
                String choices = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                        "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos Mexicanos: ");
                double pesos_mx;
                try {
                    pesos_mx = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido.");
                    return;
               }
                
                double euro = 0.053;
            	double dollars = 0.058;
            	double libras = 0.045;
            	double yen = 8.32;
            	double won_cor = 76.02;
            	
                if (choices.equals("Pesos_MX a Euros")) {
                	
                    double pesos_euro = euro * pesos_mx;
                    	JOptionPane.showMessageDialog(null, pesos_mx + " Pesos es igual a " + FormatearDecimal.format(pesos_euro) + " Euros");
                } 
                
                	else if (choices.equals("Pesos_MX a Dólares USA")) {
                		double pesos_dollars = dollars * pesos_mx;
                			JOptionPane.showMessageDialog(null, pesos_mx + " Pesos es igual a " + FormatearDecimal.format(pesos_dollars) + " Dolar USA");
                } 
                	
                	else if (choices.equals("Pesos_MX a Libras")) {
                		double pesos_libras = libras * pesos_mx;
                			JOptionPane.showMessageDialog(null, pesos_mx + " Pesos es igual a " + FormatearDecimal.format(pesos_libras) + " libras esterlinas.");
                } 
                	
                	else if (choices.equals("Pesos_MX a Yen")) {
                		double pesos_yen = yen * pesos_mx;
                			JOptionPane.showMessageDialog(null, pesos_mx + " Pesos es igual a" + FormatearDecimal.format(pesos_yen) + " yenes japoneses.");
                    
                } 
                	else if (choices.equals("Pesos_MX a Won Coreano")) {
                		double pesos_woncor = won_cor * pesos_mx;
                			JOptionPane.showMessageDialog(null, pesos_mx + " Pesos es igual a " + FormatearDecimal.format( pesos_woncor)+ " wones surcoreanos.");
                } 
                	else if (choices.equals("Euro a Pesos_MX")) {
                		double euro_pesos= pesos_mx / euro;
                			JOptionPane.showMessageDialog(null, euro + " Euros es igual a " + FormatearDecimal.format(euro_pesos) + " Pesos MX");
                } 
                	else if (choices.equals("Dolar USA a Pesos_MX")) {
                		double dollars_pesos = pesos_mx / dollars;
                			JOptionPane.showMessageDialog(null, dollars + " Dolar es igual a " + FormatearDecimal.format(dollars_pesos) + " Pesos MX");
                } 
                	
                	else if (choices.equals("Libras a Pesos_MX")) {
                		double libras_pesos = pesos_mx / libras;
                			JOptionPane.showMessageDialog(null, libras + " Libras es igual a " + FormatearDecimal.format(libras_pesos) + " Pesos MX.");
                } 
                	
                	else if (choices.equals("Yen a Pesos_MX")) {
                		double yen_pesos = pesos_mx / yen;
                			JOptionPane.showMessageDialog(null, yen + " Yen es igual a " + FormatearDecimal.format(yen_pesos) + " Pesos MX");
                    
                } 
                	else if (choices.equals("Won Coreano a Pesos_MX")) {
                		double woncor_pesos = pesos_mx / won_cor;
                			JOptionPane.showMessageDialog(null, won_cor + " Won Coreano es igual a " + FormatearDecimal.format(woncor_pesos) + " Pesos MX.");
                }
                
           
                
                int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                	conver_mon = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                }
            }

        }
        if (choice.equals("Conversor de Temperatura")) {
       
            Boolean Celsius_Fahrenheit = true;
            while (Celsius_Fahrenheit) {

                String[] opciones1 = { "Celsius a Fahrenheit", "Fahrenheit a Celsius" };
                String cambiosT = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                		"Convertidor de Temperatura", JOptionPane.QUESTION_MESSAGE, null, opciones1, opciones1[0]);

                String input = JOptionPane.showInputDialog("Ingresa el valor a convertir: ");


                double valor = 0;
                try {
                    valor = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no válido");
                    System.exit(0);
                }

                double resultado = 0;
                if (cambiosT.equals("Celsius a Fahrenheit")) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Celsius son " + resultado + " grados Fahrenheit");
                } else if (cambiosT.equals("Fahrenheit a Celsius")) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null,
                            valor + " grados Fahrenheit son " + resultado + " grados Celsius");
                }

                int continuar = JOptionPane.showConfirmDialog(null, "¿Deseas continuar usando el programa?", "",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (continuar == JOptionPane.NO_OPTION || continuar == JOptionPane.CANCEL_OPTION) {
                    Celsius_Fahrenheit = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }

    }
}
