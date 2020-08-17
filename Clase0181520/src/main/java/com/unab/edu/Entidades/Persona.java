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
    private int idPersona;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
}
