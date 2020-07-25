package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class consultas extends conexion  {
    public boolean  registrar(estudiante EST) 
    {
        PreparedStatement ps=null;
        Connection con = getConexion();
        String sql ="INSERT INTO `estudiante`.`estudiante` (`codigo_est`, `nombre_est`, `direccion_est`, `edad_est`) VALUES (?,?,?,?)";
        try{
         ps =con.prepareStatement(sql);
         ps.setInt(1,EST.getCodigo_est());
         ps.setString(2, EST.getNombre_est());
         ps.setString(3, EST.getDireccion_est());
         ps.setInt(4,EST.getEdad_est());
         ps.execute();
        }catch (SQLException e){
               System.err.println(e);
               return false;
               
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        return false;
    } 
}
