/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package endereco.bean;

import cliente.bean.ClienteBean;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author pierre
 */
@Entity
@Table(name = "endereco")
public class EnderecoBean implements Serializable {

    @Id
    @Column(name = "codigo")
    @SequenceGenerator(name = "seq_endereco", sequenceName = "endereco_codigo_seq")
    @GeneratedValue(generator = "seq_endereco")
    private Integer codigo;
    
    @Column(name = "rua")
    private String rua;
    
    @OneToOne
    @JoinColumn(name = "codcliente")
    private ClienteBean cliente;

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the cliente
     */
    public ClienteBean getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(ClienteBean cliente) {
        this.cliente = cliente;
    }
}
