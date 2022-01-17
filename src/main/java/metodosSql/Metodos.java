package metodosSql;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * @date 17 ene. 2022
 * @author Jhoan López
 * @email Jhoanlopezclase@gmail.com
 */

public class Metodos {
    public void asignarImagenes(String nombre, JLabel jlabel) {
        ImageIcon imagLogo;
        imagLogo = new ImageIcon ("src/imagenes/" + nombre);
        Icon icono = new ImageIcon (imagLogo.getImage().getScaledInstance(jlabel.getWidth(), jlabel.getHeight(), Image.SCALE_DEFAULT));
        jlabel.setIcon(icono);
    }

}
