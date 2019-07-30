/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Administrador
 */

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Ator;

public class AtorDao {
    
    
     public static boolean inserir(Ator objeto) {
        String sql = "INSERT INTO ator (nomereal, nomeartistico) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNomereal());
            ps.setString(2, objeto.getNomeartistico());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
       
    }
     
     public static void main(String[] args) {
        Ator objeto = new Ator();
        objeto.setNomereal("afonso");
        objeto.setNomeartistico("tales");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
     
}
