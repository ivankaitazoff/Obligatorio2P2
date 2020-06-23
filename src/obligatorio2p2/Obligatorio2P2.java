
package obligatorio2p2;

import dominio.Sistema;
import interfaz.MenuPrincipal;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.JOptionPane;


public class Obligatorio2P2 {

    
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema = cargarSistema();
        MenuPrincipal menu= new MenuPrincipal(sistema);
        //menu.pack();
      
        menu.setVisible(true);
    }
    public static void guardarSistema(Sistema unSistema){
        try{
            FileOutputStream fileOut =  new FileOutputStream("datos.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(unSistema);
            System.out.println("done");
            out.close();
        }catch(IOException e){
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Error al guardar el archivo ", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Sistema cargarSistema(){
        Sistema unSistema = new Sistema();
        try{
            ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get("datos.txt")));
            unSistema = (Sistema) in.readObject();
            in.close();
        }catch(IOException|ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se encontro el archivo ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return unSistema;
    }
}
