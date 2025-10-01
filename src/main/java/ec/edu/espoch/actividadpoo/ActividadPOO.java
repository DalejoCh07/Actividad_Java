
package ec.edu.espoch.actividadpoo;

/**
 *
 * @author daalc
 */
public class ActividadPOO {

    public static void main(String[] args) {
       Estudiante estudianteUno=new Estudiante();
       estudianteUno.nombre="Daniel";
       estudianteUno.identificacion=1758398828;
       estudianteUno.calificacion=9.5;
       
       Estudiante estudianteDos=new Estudiante();
       estudianteDos.nombre="Danny";
       estudianteDos.identificacion=1700478630;
       estudianteDos.calificacion=8;
       
       Estudiante estudianteTres=new Estudiante();
       estudianteTres.nombre="John";
       estudianteTres.identificacion=220027839;
       estudianteTres.calificacion=9.5;
       
       System.out.println("Estudiante 1");
       System.out.println("Nombre: "+estudianteUno.nombre);
       System.out.println("Identificacion: "+estudianteUno.identificacion);
       System.out.println("Calificacion: "+estudianteUno.calificacion);
       System.out.println("");
       System.out.println("Estudiante 2");
       System.out.println("Nombre: "+estudianteDos.nombre);
       System.out.println("Identificacion: "+estudianteDos.identificacion);
       System.out.println("Calificacion: "+estudianteDos.calificacion);
       System.out.println("");
       System.out.println("Estudiante 3");
       System.out.println("Nombre: "+estudianteTres.nombre);
       System.out.println("Identificacion: "+estudianteTres.identificacion);
       System.out.println("Calificacion: "+estudianteTres.calificacion);
       
    }
}
