package com.diego.pe.cdatosdao;

import com.diego.pe.cmodelo.TipoDocumento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class TipoDocumentoDao {
    private String mensaje;
    
    //Primer metodo - INSERTAR TIPO DOCUMENTOS A LA DB
    public String agregarTipoDocumento(Connection conn, TipoDocumento tipoDocumento){
        PreparedStatement ps = null;
        String sql = "INSERT INTO TIPO_DOCUMENTO(NOMBRE,SIGLA,ESTADO,ORDEN)"
                + "VALUES(?,?,?,?)";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tipoDocumento.getNombre());
            ps.setString(2, tipoDocumento.getSigla());
            ps.setString(3, tipoDocumento.getEstado());
            ps.setInt(4, tipoDocumento.getOrden());
            //ps.setDate(5, (Date) tipoDocumento.getFecha());
            ps.execute();
            ps.close();
            mensaje = "El tipo documento fue creado corectamente";
        } catch (Exception e) {
            mensaje = "Alto! error al crear tipo documento. " + e.getMessage();
            System.out.println(e.getMessage());
        }
        return mensaje;
    }
    
    //Segundo Metodo - Modificar Tipo documento.
    //........
}
