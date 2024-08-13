package test;

import dao.impl.DaoEnMemoria;
import model.Odontologo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.OdontologoService;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTestMemoria {
    OdontologoService odontologoService = new OdontologoService(new DaoEnMemoria());

    @Test
    @DisplayName("Testear que un odontologo fue cargado correctamente")
    void caso1(){
        //Dado
        Odontologo odontologo = new Odontologo(46543,"Castillo","Gabriela");
        //cuando
        Odontologo odontologoDesdeDb = odontologoService.guardarOdontologo(odontologo);
        // entonces
        assertNotNull(odontologoDesdeDb.getId());
    }

    @Test
    @DisplayName("Testear que se obtengan todos los odontologos")
    void caso2(){
        // Dado
        odontologoService.guardarOdontologo(new Odontologo(4652, "Vazquez", "Alfredo"));
        odontologoService.guardarOdontologo(new Odontologo(12345, "Perez", "Juan"));

        //Cuando
        List<Odontologo> odontologos = odontologoService.buscarTodos();

        // Entonces
        assertNotNull(odontologos, "La lista de odontólogos no debería ser nula");
        assertFalse(odontologos.isEmpty(), "La lista de odontólogos no debería estar vacía");
    }

}