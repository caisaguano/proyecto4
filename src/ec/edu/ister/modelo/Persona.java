/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Instituto Superior Tecnologico Rumiñahui
 * @Katherine Chango {} 
 */
public class Persona implements Edad{
    
     private String nombre;
     private String apellido;
     private Date fecha;
     private String cedula;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Date fecha, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.cedula = cedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
     
public String calcularEdad(){

return" ";
}

public Date sumarFechasDias(Date fech,int dias){
    Calendar cal= new GregorianCalendar();
    cal.setTimeInMillis(fech.getTime());
    cal.add(Calendar.DATE, dias);
    return new java.sql.Date(cal.getTimeInMillis());
}

    @Override
    public String diferenciEntreFechas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
