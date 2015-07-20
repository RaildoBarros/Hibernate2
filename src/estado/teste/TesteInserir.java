/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estado.teste;

import estado.bean.EstadoBean;
import estado.dao.EstadoDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author pierre
 */
public class TesteInserir {
    public static void main(String[] args) {
        EstadoBean estado = new EstadoBean();
        
        //Adicionando Descrição
        estado.setDescricao("Roraima");
        
        EstadoDaoImpl ed = new EstadoDaoImpl();
        
        try {
            ed.inserir(estado);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
