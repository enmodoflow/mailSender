package es.plexus.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Usuario {

	@Id
    @Column(name = "email")
    private String email;

	@Column(name = "password")
    private String pw;
	
    @Column(name = "nombre")
    private String nombre;
	
    @Column(name = "apellidos")
    private String apellidos;
    
    @Column(name = "cp")
    private String cp;
    
    @Column(name = "pais")
    private String pais;
    
    
    public Usuario() {}

}