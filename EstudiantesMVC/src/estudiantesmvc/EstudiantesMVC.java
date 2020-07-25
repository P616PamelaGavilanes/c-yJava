/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiantesmvc;

import controlador.CtrlEstudiante;
import modelo.consultas;
import modelo.estudiante;
import vista.frmEst;

/**
 *
 * @author User
 */
public class EstudiantesMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        estudiante  mod = new estudiante();
        consultas modC =new consultas();
        frmEst frml = new frmEst();
        
        CtrlEstudiante ctrl = new  CtrlEstudiante(mod,modC,frml);
        ctrl.iniciar();
        frml.setVisible(true);
        
    }
    
}
