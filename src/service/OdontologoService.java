package service;

import dao.IDao;
import model.Odontologo;

import java.util.List;

public class OdontologoService {
    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> pacienteIDao) {
        this.odontologoIDao = pacienteIDao;
    }

    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }

    public List<Odontologo> buscarTodos(){
        return odontologoIDao.buscarTodos();
    }
}
