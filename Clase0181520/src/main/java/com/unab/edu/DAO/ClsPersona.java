/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.DAO;

import com.unab.edu.Entidades.Persona;
import com.unab.edu.conexionamysql.conexionBd;
import java.sql.CallableStatement;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class ClsPersona {

    conexionBd claseConectar = new conexionBd();
    Connection conectar = claseConectar.RetornarConexion();

    public ArrayList<Persona> MostrarPersona() {
        ArrayList<Persona> Personas = new ArrayList<>();
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_S_Persona()");
            ResultSet resultadoDeConsulta = Statement.executeQuery();
            while (resultadoDeConsulta.next()) {
                Persona persona = new Persona();
                persona.setIdPersona(resultadoDeConsulta.getInt("idPersona"));
                persona.setNombre(resultadoDeConsulta.getString("Nombre"));
                persona.setApellido(resultadoDeConsulta.getString("Apellido"));
                persona.setEdad(resultadoDeConsulta.getInt("Edad"));
                persona.setSexo(resultadoDeConsulta.getString("Sexo"));
                Personas.add(persona);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Personas;
    }

    public void AgergarPersonas(Persona Per) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_I_Persona(?,?,?,?)");
            Statement.setString("PNombre", Per.getNombre());
            Statement.setString("PApellido", Per.getApellido());
            Statement.setInt("PEdad", Per.getEdad());
            Statement.setString("PSexo", Per.getSexo());
            Statement.execute();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void BorrarPersona(Persona Per) {
        try {
            CallableStatement Statement = conectar.prepareCall("call SP_D_Persona(?)");

            Statement.setInt("PIdPersonas", Per.getIdPersona());

            Statement.execute();
            JOptionPane.showMessageDialog(null, "Datos Eliminados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void ActualizarPersonas(Persona Persona) {
       try {
            CallableStatement Statement = conectar.prepareCall("call SP_U_Persona(?,?,?,?,?)");
            Statement.setInt("PIdPersona", Persona.getIdPersona());
            Statement.setString("PNombre", Persona.getNombre());
            Statement.setString("PApellido", Persona.getApellido());
            Statement.setInt("Pedad", Persona.getEdad());
            Statement.setString("Psexo", Persona.getSexo());
            Statement.execute();
            JOptionPane.showMessageDialog(null, "Datos Actualizados");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
