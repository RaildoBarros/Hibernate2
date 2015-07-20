/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endereco.teste;

import cliente.bean.ClienteBean;
import endereco.bean.EnderecoBean;
import endereco.dao.EnderecoDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author pierre
 */
public class TesteInserir {
    public static void main(String[] args) {
        EnderecoBean enderecoBean = new EnderecoBean();
        enderecoBean.setRua("Rua xyz");
        
        ClienteBean clienteBean = new ClienteBean();
        clienteBean.setCodigo(1);
        
        enderecoBean.setCliente(clienteBean);
        
        EnderecoDaoImpl ed = new EnderecoDaoImpl();
        try {
            ed.inserir(enderecoBean);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
