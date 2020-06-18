/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio2p2;

import dominio.Sistema;
import interfaz.MenuPrincipal;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan
 */
public class Obligatorio2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema = cargarSistema();
        MenuPrincipal menu= new MenuPrincipal();
        //menu.pack();
        menu.setSize(600, 400);
        menu.setVisible(true);
    }
    public static void guardarSistema(Sistema unSistema){
        try{
            ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get("datos")));
            out.writeObject(unSistema);
            out.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo ", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Sistema cargarSistema(){
        Sistema unSistema = new Sistema();
        try{
            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("datos")));
            unSistema = (Sistema) in.readObject();
            in.close();
        }catch(IOException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se encontro el archivo ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return unSistema;
    }
}
