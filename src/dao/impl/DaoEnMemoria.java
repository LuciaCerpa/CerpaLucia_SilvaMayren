package dao.impl;

import dao.IDao;
import model.Odontologo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class DaoEnMemoria implements IDao<Odontologo> {
    public static final Logger logger = Logger.getLogger(DaoEnMemoria.class);
    private List<Odontologo> odontologos = new ArrayList<>();
    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologo.setId(odontologos.size()+1);
        odontologos.add(odontologo);
        logger.info("Odontologo guardado en memoria " + odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> buscarTodos() {
        logger.info("Obteniendo lista de todos los odontólogos");
        List<Odontologo> odontologosObtenidos = new ArrayList<>(odontologos);
        odontologosObtenidos.forEach(odontologo -> logger.info(odontologo.toString()));
        return odontologosObtenidos;
    }
}
