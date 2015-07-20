/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.dao;

import cliente.bean.ClienteBean;
import util.BaseDaoImpl;

/**
 *
 * @author pierre
 */
public class ClienteDaoImpl extends BaseDaoImpl<ClienteBean> implements ClienteDao{

    public ClienteDaoImpl() {
        super(ClienteBean.class);
    }
    
}
