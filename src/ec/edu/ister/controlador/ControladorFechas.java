/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;
import ec.edu.ister.vista.formulario.FrmRegistro;
import java.text.DateFormat;
import java.util.Date;
/**
 *
 * @author LAB7-PC9-USER
 */
public class ControladorFechas {
    
    public static synchronized int diferenciafecha(Date fechainicial,Date fechafinal){
    
        DateFormat difer = DateFormat.getDateInstance(DateFormat.MEDIUM);
        String fechainicioString = difer.format(fechafinal);
        try {
            fechainicial =difer.parse(fechainicioString);
        } catch (Exception e) {
        }
        String fechafinalString = difer.format(fechafinal);
        try {
            fechainicial =difer.parse(fechainicioString);
        } catch (Exception e) {
        }
            
            long msInicial=fechainicial.getTime();
            long msFinal=fechainicial.getTime();
            long diferencial=msFinal-msInicial;
            double dias =Math.floor(diferencial/(1000*60*60*24));
            return (int)dias;
    }
    
    
}
