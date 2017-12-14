/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.Persona;
import ec.edu.ister.vista.formulario.FrmMetodosFechas;
import ec.edu.ister.vista.formulario.FrmRegistro;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 * @Instituto Superior Tecnologico Rumiñahui
 * @Katherine Chango {} 
 */
public class Aplicacion {
    public static void main(String[] args) {
        
        FrmRegistro frm1=new FrmRegistro();
       frm1.setVisible(true);
        Persona p =new Persona();
       Date ahora = new Date();
        JOptionPane.showMessageDialog(null,p.sumarFechasDias(ahora, 6));
     FrmMetodosFechas frm2= new FrmMetodosFechas();
     frm2.setVisible(true);
    }

}
