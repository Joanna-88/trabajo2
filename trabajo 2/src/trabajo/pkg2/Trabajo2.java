/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.pkg2;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Trabajo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejerc5();
    }

    public static void ejerc1() {
        String a1 = JOptionPane.showInputDialog("ingrese un numero entero");
        int num = Integer.parseInt(a1);
        if (num % 3 == 0 && num >= 100 && num <= 200) {
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 3 y está en el rango de 100 a 200.");
        } else {
            JOptionPane.showMessageDialog(null, "no se cumple la condicion");

        }
    }

    public static void ejerc2() {
        String dia = JOptionPane.showInputDialog("ingrese su dia de nacimiento");
        String mes = JOptionPane.showInputDialog("ingrese su    mes de nacimiento");

        int x1 = Integer.parseInt(dia);
        mes = mes.toLowerCase();

        switch (mes) {
            case "enero":

                if (x1 >= 20) {
                    JOptionPane.showMessageDialog(null, "su signo es Acuario");
                }
                else {
                        JOptionPane.showMessageDialog(null, "es Capricornio");
                            }
                break;
            case "febrero":

                if (x1 >= 19) {
                    JOptionPane.showMessageDialog(null, "su signo es Piscis");
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es capricornio");
                }
                break;
            case "marzo":
                if (x1>= 21) {
                    JOptionPane.showMessageDialog(null, "su signo es Aries");    
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es Piscis");
                }
                break;
            case "abril":
                if ( x1>=20) {
                    JOptionPane.showMessageDialog(null, "su signo es Tauro");      
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es Aries");  
                }
                break;
            case "mayo":
                if (x1>=21) {
                 JOptionPane.showMessageDialog(null, "su signo es Genesis");           
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es Tauro");  
                }
                break;
            case "junio":
                if ( x1>=21) {
                    JOptionPane.showMessageDialog(null, "su signo es cancer");
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es geminis");  
                }
                break;
               
            case "julio":
                if ( x1>=23) {
                    JOptionPane.showMessageDialog(null, "su signo es Leo");  
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es cancer");  
                }
                break;
            case "agosto":
                if ( x1>=23) {
                    JOptionPane.showMessageDialog(null, "su signo es virgo");  
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es Leo");  
                }
                break;
            case "septiembre":
                if ( x1>=22) {
                    JOptionPane.showMessageDialog(null, "su signo es libra");
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es virgo");  
                }
                break;
            case "octubre":
                if ( x1>=23) {
                    JOptionPane.showMessageDialog(null, "su signo es escorpio");  
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es libra");  
                }
                break;
            case "noviembre":
                if ( x1>=22) {
                    JOptionPane.showMessageDialog(null, "su signo es Sagitario");  
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es Escorpio");      
                }
                break;
            case "diciembre":
                if ( x1>=22) {
                    JOptionPane.showMessageDialog(null, "su signo es capricornio");  
                } else {
                    JOptionPane.showMessageDialog(null, "su signo es Sagitario");
                }
                break;
            default:JOptionPane.showInternalMessageDialog(null," mes invalido");
        }
    }
    public static void ejerc3() {
         String precio=JOptionPane.showInputDialog("ingrese el precio del producto");
         String descuento=JOptionPane.showInputDialog("ingresa el descuento del producto");
          
         double x1=Integer.parseInt(precio);
         double x2= Integer.parseInt(descuento);
         
         double total=x1*(x2/100);
         JOptionPane.showMessageDialog(null, total);
        
    }
    public static void ejerc4() {
        String n1=JOptionPane.showInputDialog("ingresa un numero");
        String n2=JOptionPane.showInputDialog("ingresa un numero");
        String n3=JOptionPane.showInputDialog("ingresa un numero");
        
        int x1=Integer.parseInt(n1);
        int x2=Integer.parseInt(n2);
        int x3=Integer.parseInt(n3);
         
        // hallar el mayor
        
        if (x1>x2 && x1>x3) {
            JOptionPane.showMessageDialog(null, "el numero mas grande es:"+x1);
        } else if( x2>x1 && x2>x3) {
            JOptionPane.showMessageDialog(null, "el numero mas grande es:"+x2);
        }
        else if (x3>x1 && x3>x2){
            JOptionPane.showMessageDialog(null, "sel número más grande es:"+x3);
        }
        // organizar los numeros de mayor a menor
        int mayor, medio, menor;

// Determinar el mayor
if (x1 >= x2 && x1 >= x3) {
    mayor = x1;
} else if (x2 >= x1 && x2 >= x3) {
    mayor = x2;
} else {
    mayor = x3;
}

// Determinar el menor
if (x1 <= x2 && x1 <= x3) {
    menor = x1;
} else if (x2 <= x1 && x2 <= x3) {
    menor = x2;
} else {
    menor = x3;
}

// El número del medio
medio = x1 + x2 + x3 - mayor - menor;

// Mostrar ordenados de mayor a menor
JOptionPane.showMessageDialog(null,
        "Números ordenados de mayor a menor: "
        + mayor + " - " + medio + " - " + menor);

    }
    public static void ejerc5() {
      
   

        String n1 = JOptionPane.showInputDialog("Ingrese el día");
        String n2 = JOptionPane.showInputDialog("Ingrese el mes");
        String n3 = JOptionPane.showInputDialog("Ingrese el año");

        int dia = Integer.parseInt(n1);
        int mes = Integer.parseInt(n2);
        int año = Integer.parseInt(n3);

        int diasMes = 0;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diasMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diasMes = 30;
                break;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    diasMes = 29;
                } else {
                    diasMes = 28;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ese mes no existe");
                return;
        }

        dia++;

        if (dia > diasMes) {
            dia = 1;
            mes++;

            if (mes > 12) {
                mes = 1;
                año++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "El día siguiente es: " + dia + "/" + mes + "/" + año);
    }
}
