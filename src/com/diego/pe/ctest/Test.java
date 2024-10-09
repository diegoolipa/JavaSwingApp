
package com.diego.pe.ctest;

import com.diego.pe.cmodelo.TipoDocumento;
import com.diego.pe.cnegocio.TipoDocumentoBO;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;

public class Test {
    TipoDocumentoBO tdbo = new  TipoDocumentoBO();
    TipoDocumento td = new TipoDocumento();
    
    public  void insertar() throws SQLException, ParseException{
        td.setNombre("ASDASDAS DASD  Nacional de Identidad");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("DNIA");
        td.setFecha("12-12-12");
        td.setFechaActuliza("09-10-2024");
        tdbo.agregarTipoDocomento(td);
    }
    
    public  void eliminar() throws SQLException, ParseException{
        td.setIdTipoDocumento(9);
        tdbo.eliminarTipoDocomento(td);
    }
    
    public  void modificar() throws SQLException, ParseException{
        td.setNombre("Diego");
        td.setEstado("1");
        td.setOrden(1);
        td.setSigla("D");
        td.setFecha("12-12-12");
        td.setFechaActuliza("09-10-2024");
        td.setIdTipoDocumento(11);
        
        tdbo.modificarTipoDocumento(td);
    }
    
    public static void main(String[] args) throws SQLException, ParseException {
        Test t = new  Test();
        //t.insertar();
        //t.eliminar();
        t.modificar();
    }
}
