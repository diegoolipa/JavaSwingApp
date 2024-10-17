
package com.diego.pe.cnegocio;

import java.sql.Connection;
import com.diego.pe.cdatosdao.TipoDocumentoDao;
import com.diego.pe.cmodelo.TipoDocumento;
import com.diego.pe.db.Conexion;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;

public class TipoDocumentoBO {
    private String mensaje;
    TipoDocumentoDao tdd = new TipoDocumentoDao();
    
    public String agregarTipoDocomento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.agregarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    
    public String eliminarTipoDocomento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.elimiarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    
    public String modificarTipoDocumento(TipoDocumento tipoDocumento) throws SQLException{
        Connection c = Conexion.getConnection();
        try {
            mensaje = tdd.modificarTipoDocumento(c, tipoDocumento);
            c.commit();
        } catch (Exception e) {
            c.rollback();
        } finally {
            c.close();
        }
        return mensaje;
    }
    
    public void listarTipoDocumento(JTable table){
        Connection c = Conexion.getConnection();
        tdd.listarTipoDocumento(c, table);
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
    }
    
    public ArrayList<TipoDocumento> listarTipoDocumentoCombo(){
        ArrayList<TipoDocumento> listaTipoDocumento = new ArrayList<>();
        Connection c = Conexion.getConnection();
        listaTipoDocumento = tdd.listarTipoDocumentosCombo(c);
        try {
            c.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        return listaTipoDocumento;
    }
}
