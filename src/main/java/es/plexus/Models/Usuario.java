package es.plexus.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Usuario {

	@Id
    @Column
    private String email;

	@Column(name = "password")
    private String pw;
	
    @Column
    private String nombre;
	
    @Column
    private String apellidos;
    
    @Column
    private String cp;
    
    @Column
    private String pais;
    
    
    public Usuario() {}

}