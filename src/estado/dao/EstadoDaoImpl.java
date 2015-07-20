/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estado.dao;

import estado.bean.EstadoBean;
import util.BaseDaoImpl;

/**
 *
 * @author pierre
 */
public class EstadoDaoImpl extends BaseDaoImpl<EstadoBean> implements EstadoDao{

    public EstadoDaoImpl() {
        super(EstadoBean.class);
    }
    
}
