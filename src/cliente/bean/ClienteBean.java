/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente.bean;

import estado.bean.EstadoBean;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author pierre
 */
@Entity
@Table(name = "cliente")
public class ClienteBean implements Serializable{
    @Id
    @Column(name = "codigo")
     @SequenceGenerator(name = "seq_cliente", sequenceName = "cliente_codigo_seq")
    @GeneratedValue(generator = "seq_cliente")
    private Integer codigo;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "datanascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataNascimento;
    
    @ManyToOne
    @JoinColumn(name = "codestado")
    private EstadoBean estado;

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
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNascimento
     */
    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the estado
     */
    public EstadoBean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(EstadoBean estado) {
        this.estado = estado;
    }
}
