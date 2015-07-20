/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endereco.dao;

import endereco.bean.EnderecoBean;
import util.BaseDaoImpl;

/**
 *
 * @author pierre
 */
public class EnderecoDaoImpl extends BaseDaoImpl<EnderecoBean> implements EnderecoDao{

    public EnderecoDaoImpl() {
        super(EnderecoBean.class);
    }
    
}
