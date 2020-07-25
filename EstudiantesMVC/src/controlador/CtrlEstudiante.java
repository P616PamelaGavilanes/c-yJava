
package controlador;

import java.awt.event.ActionEvent;

import modelo.consultas;
import modelo.estudiante;
import vista.frmEst;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlEstudiante  implements ActionListener {
    
    private estudiante mod;
    private consultas modC;
    private  frmEst frml;
    public CtrlEstudiante(estudiante mod,consultas modC,frmEst frml)
    {
        this.mod=mod;
        this.modC=modC;
        this.frml=frml;
        this.frml.btninsertar.addActionListener(this);

    }
    public void iniciar(){
        frml.setTitle("Estudiantes");
                 System.out.println("Castle Crash is beginning...");

    }
@Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==frml.btninsertar)
        {
        mod.setCodigo_est(Integer.parseInt(frml.codigo.getText()));
        mod.setNombre_est(frml.nombre.getText());
        mod.setDireccion_est(frml.direccion.getText());
         mod.setEdad_est(Integer.parseInt(frml.edad.getText()));
         
         if(modC.registrar(mod))
         {
             JOptionPane.showMessageDialog(null,"Registro enviado");
             limpiar();
         }else{
         
         JOptionPane.showMessageDialog(null,"Registrno ");
         }
        }
    
    }
    
    public void limpiar(){
    frml.codigo.setText(null);
    frml.nombre.setText(null);
    frml.direccion.setText(null);
    frml.edad.setText(null);
    }
    
    
    
}
