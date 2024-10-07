
package com.diego.pe.ctest;

import com.diego.pe.cmodelo.TipoDocumento;
import com.diego.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.util.Date;

public class Test {
    TipoDocumentoBO tdbo = new  TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public  void insertar() throws SQLException{
        td.setNombre("ASDASDAS DASD  Nacional de Identidad");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("DNIA ");
        td.setFecha(new Date());
        
        tdbo.agregarTipoDocomento(td);
    }
    
    public static void main(String[] args) throws SQLException {
        Test t = new  Test();
        t.insertar();
    }
}
