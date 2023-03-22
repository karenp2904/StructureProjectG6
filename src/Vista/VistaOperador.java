package Vista;

import javax.swing.*;
import java.awt.*;

public class VistaOperador extends JFrame {
    JLabel fondo = new JLabel();
    JLayeredPane contenedor=new JLayeredPane();
    JPanel panelInicio = new JPanel();
    JPanel panelBlanco = new JPanel();

    public VistaOperador(){
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.white);
    }

    public void panelRegistro(){
        //Panel que tendrá las etiquetas y botones
        panelBlanco.setLayout(null);
        panelBlanco.setOpaque(false);
        panelBlanco.setVisible(false);
        panelBlanco.setBounds(200,100,200,300);
        Color colo1=new Color(255,245,238);
        panelBlanco.setBackground(Color.white);
        this.add(panelBlanco);

        JLabel logo=new JLabel("Logo");
        logo.setBounds(10,0,50,50);
        ImageIcon imgLogo= new ImageIcon("src/Imagenes/logoPerrito.png");// se le pone icono a boton
        Icon ilogo= new ImageIcon(imgLogo.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_DEFAULT));
        logo.setIcon(ilogo);
        panelBlanco.add(logo);




    }

    public void contenedor(){
        ImageIcon imagen =(new ImageIcon("src/Imagenes/loginOperador.png"));
        fondo.setIcon(imagen);
        fondo.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        fondo.setBounds(100,40,1400,600);

        contenedor.add(panelBlanco,Integer.valueOf(2));
        contenedor.add(fondo,Integer.valueOf(0));
      //  contenedor.add(panelInicio,Integer.valueOf(2));

        this.getContentPane().add(contenedor);
        this.setSize(getMaximumSize());
        //this.setSize(imagen.getIconWidth(), imagen.getIconHeight());
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


}
