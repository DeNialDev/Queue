/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qeueest;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
/**
 *
 * @author danie
 */
public class QeueEst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String NoControl;
        String Nombre;
        Double Promedio;
        
        Queue <Estudiante> Cola = new LinkedList<>();
        System.out.println("Ingrese No. de control");
        NoControl = br.readLine();
        System.out.println("Ingrese Nombre");
        Nombre = br.readLine();
        System.out.println("Ingrese Promedio");
        Promedio = Double.parseDouble(br.readLine());
        Estudiante E1 = new Estudiante("18150301", "Daniel Moreno", 8.5);
        System.out.println("Ingrese No. de control");
        NoControl = br.readLine();
        System.out.println("Ingrese Nombre");
        Nombre = br.readLine();
        System.out.println("Ingrese Promedio");
        Promedio = Double.parseDouble(br.readLine());
        Estudiante E2 = new Estudiante(NoControl, Nombre, Promedio);
        System.out.println("Ingrese No. de control");
        NoControl = br.readLine();
        System.out.println("Ingrese Nombre");
        Nombre = br.readLine();
        System.out.println("Ingrese Promedio");
        Promedio = Double.parseDouble(br.readLine());
        Estudiante E3 = new Estudiante(NoControl, Nombre, Promedio);
        System.out.println("Ingrese No. de control");
        NoControl = br.readLine();
        System.out.println("Ingrese Nombre");
        Nombre = br.readLine();
        System.out.println("Ingrese Promedio");
        Promedio = Double.parseDouble(br.readLine());
        Estudiante E4 = new Estudiante(NoControl, Nombre, Promedio);
        System.out.println("Ingrese No. de control");
        NoControl = br.readLine();
        System.out.println("Ingrese Nombre");
        Nombre = br.readLine();
        System.out.println("Ingrese Promedio");
        Promedio = Double.parseDouble(br.readLine());
        Estudiante E5 = new Estudiante(NoControl, Nombre, Promedio);
        System.out.println("Ingrese No. de control");
        NoControl = br.readLine();
        System.out.println("Ingrese Nombre");
        Nombre = br.readLine();
        System.out.println("Ingrese Promedio");
        Promedio = Double.parseDouble(br.readLine());
        Estudiante E6 = new Estudiante(NoControl, Nombre, Promedio);
        System.out.println("Ingrese No. de control");
        NoControl = br.readLine();
        System.out.println("Ingrese Nombre");
        Nombre = br.readLine();
        System.out.println("Ingrese Promedio");
        Promedio = Double.parseDouble(br.readLine());
        Estudiante E7 = new Estudiante(NoControl, Nombre, Promedio);
        Cola.add(E1);
        Cola.add(E2);
        Cola.add(E3);
        Cola.add(E4);
        Cola.add(E5);
        Cola.add(E6);
        Cola.add(E7);
        for( Estudiante c: Cola ){
             System.out.println( "Estudiante: " + c.getNo_Control()+ ", " + c.getNombre() + ", " + c.getPromedio());
        }
        
        System.out.println("Remover");
        Cola.remove(E4);
        Cola.remove(E5);
        Cola.remove(E5);
        Cola.remove(E7);
        for( Estudiante c: Cola ){
             System.out.println( "Estudiante: " + c.getNo_Control()+ ", " + c.getNombre() + ", " + c.getPromedio());
        }
    }
    
}
