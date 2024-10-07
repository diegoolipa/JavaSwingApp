
package com.diego.pe.cnegocio;

import java.sql.Connection;
import com.diego.pe.cdatosdao.TipoDocumentoDao;
import com.diego.pe.cmodelo.TipoDocumento;
import com.diego.pe.db.Conexion;
import java.sql.SQLException;

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
}
