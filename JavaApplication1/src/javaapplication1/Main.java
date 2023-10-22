package javaapplication1;

public class Main {
    public static void main(String[] args) {
        //Aca se crea el nuevo "individuo" para la clase 
        Cancion cancion1 = new Cancion(01, "Monaco", "Bad Bunny", 4.27, 2023);

        // Utilizar los getters para obtener información de la canción
        System.out.println("ID de la canción: " + cancion1.getIdCancion());
        System.out.println("Título: " + cancion1.getTitulo());
        System.out.println("Autor: " + cancion1.getAutor());
        System.out.println("Duración: " + cancion1.getDuracion() + " minutos");
        System.out.println("Año de creación: " + cancion1.getAnioCreacion());

       

        // Mostrar la información actualizada
    }
}
