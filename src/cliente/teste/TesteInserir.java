/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.teste;

import cliente.bean.ClienteBean;
import cliente.dao.ClienteDao;
import cliente.dao.ClienteDaoImpl;
import estado.bean.EstadoBean;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author pierre
 */
public class TesteInserir {
    public static void main(String[] args) {
        ClienteBean clienteBean = new ClienteBean();
        
        clienteBean.setNome("Pierre");
        clienteBean.setDataNascimento(Calendar.getInstance());
        
        EstadoBean estadoBean = new EstadoBean();
        estadoBean.setCodigo(1);
        
        clienteBean.setEstado(estadoBean);
        
        ClienteDaoImpl cd = new ClienteDaoImpl();
        try {
            cd.inserir(clienteBean);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
