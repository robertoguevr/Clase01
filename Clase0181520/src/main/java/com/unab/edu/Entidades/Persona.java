/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.Entidades;

import lombok.Data;

/**
 *
 * @author Roberto
 */
@Data
public class Persona {
    protected int idPersona;
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected String sexo;
}
