package mx.com.cetech.Clase12.Encapsulacion;

import java.io.Serializable;

import javax.print.attribute.standard.RequestingUserName;

public class Persona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8433152625465883727L;
	/*
	 * JAVABEAN ES UN REFLEJO DE UNA TABLA DE BASE DE DATOS
	 * 
	 * CARACTERISTICAS
	 * 
	 * 1- ATRIBUTOS PRIVADOS
	 * 2- METODOS GETTERS & SETTERS
	 * 3- CONSTRUCTOR POR DEFAULT Y USANDO TODOS SUS CAMPOS
	 * 4- DEBE IMPLEMENTR SERIALIZABLE
	 * 
	 */
	
	private String nombre;
	private String apellido;
	private String sexo;
	private String domicilio;
	private int edad;
	
	public Persona() {
	}

	public Persona(String nombre, String apellido, String sexo, String domicilio, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.domicilio = domicilio;
		this.edad = edad;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getEdad(){
		return edad;
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	
}
