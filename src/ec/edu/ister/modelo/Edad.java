/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Date;
import javafx.scene.chart.XYChart;
import java.sql.*;

/**
 *
 * @author LAB7-PC9-USER
 */
public interface Edad {
    
    public String calcularEdad();
    
    public Date sumarFechasDias(Date fech,int dias);
    public String diferenciEntreFechas();
    
}
