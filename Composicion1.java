/*
Disenie unj algoritmo que implmente una colleccion de las clase libro y clase pagina
 */
package composicion1;
import java.util.*;
/**
 * @author Hector Ortiz
 */
class Pagina{
    
    //ATRIBUTOS DE INSTANCIA
    private String contenido;
    private int numero;
    
    //CONSTRUCTOR CON PARAMETRO
    public Pagina(String contenido, int numero) {
        this.contenido = contenido;
        this.numero = numero;
    }
    //METODOS DE INSTANCIA
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}


class Libro{
    //ATRIBUTOS
    private String titulo;
    private long isbn;
    private String autor;
    private int anioPublicacion;
    //ATRIBUTOS REPRESENTANDO LA RELACIÓN DE COMPOSICIÓN
    private Pagina[] paginas;
    private int numeroPaginas;
    //CONSTRUCTOR
    public Libro(String titulo, long isbn, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anioPublicacion=anioPublicacion;
     
        //RESERVAMOS ESPACIO EN MEMORIA PARA EL OBJETO "array"
        this.paginas=new Pagina[999];
        for(int i=0;i<999;i++){
            this.paginas[i]=new Pagina("",i);
        }
        this.numeroPaginas=0;
    }
 //MÉTODOS INSTANCIA
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return this.anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
 //MÉTODOS PARA TRABAJAR CON LA CLASE DE COMPOSICIÓN
    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }
    
    public void AniadirPagina(Pagina nueva_Pagina){
        if(this.numeroPaginas<999){
            this.paginas[this.numeroPaginas]=nueva_Pagina;
            this.numeroPaginas++;
        }
    }
    
    public Pagina getPaginaNumero(int numero_Pagina){
        for(int i=0;i<this.numeroPaginas;i++){
            if(this.paginas[i].getNumero()==numero_Pagina){
                return this.paginas[i];
            }
        }
        return null;
    }
    public void InterpretacionInformacion(){
        for(int i=0;i<this.numeroPaginas;i++){
            System.out.println(paginas[i].getContenido());
            System.out.println("Pagina número: "+paginas[i].getNumero());
        }
    }
}

public class Composicion1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
System.out.println("\t\tUniversidad de las Fuerzas Armadas ESPE - Sede Latacunga \n");
     
System.out.println("Nombre: Ortiz Hector ");
System.out.println("Materia: PROGRAMACION");
System.out.println("Docente: Ing. Luis Guerra");
System.out.println("Tema: COMPOSICION\n");

//declaracion y definicion de objetos
Libro Controles_Instrumentos=new Libro("Arranque y apagado del motor",1234345296,"Chevrolet",2020);
Pagina pagina1=new Pagina("\nAsegurese de que todos los interruptores  estén en la posición desactivada",6);
Pagina pagina2=new Pagina("\nGire interruptor de arranque a posición ON verifique luces y combustible normal",7);
        
System.out.println("Titulo del Libro: "+Controles_Instrumentos.getTitulo());
System.out.println("Isbn: "+Controles_Instrumentos.getIsbn());
System.out.println("Autor: "+Controles_Instrumentos.getAutor());
System.out.println("Fecha Publicación: "+
 
   //pasamos al objeto libro los objetos del tipo pagina   
Controles_Instrumentos.getAnioPublicacion());
Controles_Instrumentos.AniadirPagina(pagina1);
Controles_Instrumentos.AniadirPagina(pagina2);
Controles_Instrumentos.InterpretacionInformacion();
    }
}