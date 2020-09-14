package com.unab.edu.Entidades;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper=false)
public class Profesor extends Persona {
    private int IdProfesor;
    private String dui;
    private String usuario;
    private String pass;
}
