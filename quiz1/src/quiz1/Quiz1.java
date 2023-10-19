/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author LABORATORIO 04
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String CantidadEmpleados = JOptionPane.showInputDialog("Ingrese la cantidad de empleados:");
        int cantiEmplead = Integer.parseInt(CantidadEmpleados);
       
        int totalAbn = 0;

        for (int i = 1; i <= cantiEmplead; i++) {
            String inputSal = JOptionPane.showInputDialog("Ingrese el salario del empleado #" + i + ":");
            int Sal = Integer.parseInt(inputSal);
           
            double montoSEM = Sal * 0.0925;
            
            double montoIVM = Sal * 0.0508;
            
            totalAbn += montoSEM + montoIVM;
            
        }
        
        System.out.println("La empresa deberá abonar a la CCSS el monto de $"+ totalAbn +" por concepto de SEM y IVM.");
    }
 
    }
    
