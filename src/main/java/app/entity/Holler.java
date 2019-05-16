package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela HOLLER
 * @generated
 */
@Entity
@Table(name = "\"HOLLER\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Holler")
public class Holler implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.util.Date nome;

  /**
  * @generated
  */
  @Column(name = "hora", nullable = false, unique = false, insertable=true, updatable=true)
  
  private java.lang.String hora;

  /**
   * Construtor
   * @generated
   */
  public Holler(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Holler setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.util.Date getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Holler setNome(java.util.Date nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém hora
   * return hora
   * @generated
   */
  
  public java.lang.String getHora(){
    return this.hora;
  }

  /**
   * Define hora
   * @param hora hora
   * @generated
   */
  public Holler setHora(java.lang.String hora){
    this.hora = hora;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Holler object = (Holler)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
