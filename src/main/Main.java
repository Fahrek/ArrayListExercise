package main;

import java.util.ArrayList;
import java.util.List;

public class Main 
{
    public static void main(String[] args) 
    {
        // Creación de una lista de ArrayList de elementos de tipo String
        List<String> fb = new ArrayList<>();
        
        // Agregamos elementos a la lista
        fb.add("Andres Galarraga");
        fb.add("Miguel Cabrera");
        fb.add("Omar Vizquel");
        fb.add("Carlos Beltran");
        
        // Despliegue de los elementos de la lista
        System.out.println("La lista tiene los siguientes futbolistas: " + fb);
        
        // Añadir 2 elementos en el índice dado
        fb.add(0, "Adrian Beltre");
        fb.add(1, "Jose Altuve");
        
        // Eliminar elementos de la lista
        fb.remove("Carlos Beltran");
        
        System.out.println("La lista actual es: " + fb);
        
        // Eliminar el elemento del indice dado
        fb.remove(1);
        
        System.out.println("La lista definitiva es: " + fb);
    } 
}
