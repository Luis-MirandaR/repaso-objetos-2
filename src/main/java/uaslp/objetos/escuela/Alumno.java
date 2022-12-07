package uaslp.objetos.escuela;

import java.time.LocalDate;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Alumno {
    private String nombre;
    private String clave;
    private String  claveDeCarrera;
    private int anioDeIngreso;
    private LocalDate fechaDeNacimiento;

    public Alumno(String nombre, String clave, String claveDeCarrera, int anioDeIngreso, LocalDate fechaDeNacimiento){
        this.nombre = nombre;
        this.clave = clave;
        this.claveDeCarrera = claveDeCarrera;
        this.anioDeIngreso = anioDeIngreso;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getClaveDeCarrera() {
        return claveDeCarrera;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaDeNacimiento;
    }

    public static AlumnoBuilder builder(){
        return new AlumnoBuilder();
    }
}
