/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionaulas;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author JANDRES
 */
public class GestionAulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos un variable donde indicaremos el archivo a modificar
         File fichero = new File("GestionAulas-G/classrooms.txt");
         
         LeerClassroom(fichero);
    }

    private static void LeerClassroom(File fichero) {
        int numLineas=0;
        //Se intentara hacer la siguiente acción
        try {
            // Codificación ISO-8859-1 (ANSI) o UTF-8 dependiendo de cómo esté creado el fichero de texto
            Scanner lectorFichero = new Scanner(fichero, "UTF-8");
            // Se ejecutara un bucle con la finalidad de que se 
            while(lectorFichero.hasNext()) {
                System.out.println(lectorFichero.nextLine());
                numLineas++;
            }
            
            lectorFichero.close();
            System.out.println("Existen "+numLineas+" aulas en classroom");
        } catch (Exception e) {
            //En caso de que no se encuentre el archivo pues se imprimo este mensaje de error
            System.out.println("El archivo classrooms no existe");
        }
    }
    
}
