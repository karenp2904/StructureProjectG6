package Vista;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaPrincipal extends JFrame {
    //inicializando
    JButton  botonIniciar, botonCreditos, botonSalir, botonAdmin, botonOperador, botonCocina, botonRepartidor;
    JPanel panelInicio = new JPanel();
    JPanel panelModulos = new JPanel();
    JLayeredPane contenedor=new JLayeredPane();

    public VistaPrincipal() {
        this.setTitle("Hot Dogs Palace");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.add(contenedor);
        //this.add(panelInicio);
        panelInicio();

    }


    public void panelInicio() {

        //Panel que tendrá las etiquetas y botones
        panelInicio.setLayout(null);
        panelInicio.setVisible(true);
        panelInicio.setOpaque(true);
        panelInicio.setBounds(300,100,200,300);
        Color colo1=new Color(255,245,238);
        panelInicio.setBackground(colo1);
        //this.add(panelInicio);

        //boton de inicio

        botonIniciar = new JButton("Iniciar Sesion");
        botonIniciar.setBounds(600, 300, 300, 113);
        ImageIcon img= new ImageIcon("InterfazProyecto/Vista/INICIO.png");// se le pone icono a boton
        Icon i= new ImageIcon(img.getImage().getScaledInstance(botonIniciar.getWidth(), botonIniciar.getHeight(), Image.SCALE_DEFAULT));
        botonIniciar.setIcon(i);
        botonIniciar.setLayout(null);
        botonIniciar.setOpaque(true);
        botonIniciar.setBorderPainted(false);
        ImageIcon imgJugar1= new ImageIcon("InterfazProyecto/Vista/INICI.png");// se le pone icono a boton
        Icon iconIniciar= new ImageIcon(imgJugar1.getImage().getScaledInstance(botonIniciar.getWidth(), botonIniciar.getHeight(), Image.SCALE_DEFAULT));
        botonIniciar.setRolloverIcon(iconIniciar);
        botonIniciar.setBackground(colo1);

        botonIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelInicio.setVisible(false);
                panelModulos();
                panelModulos.setVisible(true);

            }
        });
        panelInicio.add(botonIniciar);

        botonSalir = new JButton("Salir");
        botonSalir.setBounds(600, 500, 300, 113);
        //botonReglas.setFont(new Font("BeaufortforLOL-Bold", Font.ITALIC, 12));
        ImageIcon imgSalir3= new ImageIcon("InterfazProyecto/Vista/SALIR.png");// se le pone icono a boton
        Icon iconSalir= new ImageIcon(imgSalir3.getImage().getScaledInstance(botonSalir.getWidth(), botonSalir.getHeight(), Image.SCALE_DEFAULT));
        botonSalir.setIcon(iconSalir);
        botonSalir.setOpaque(false);
        botonSalir.setBorderPainted(false);
        botonSalir.setBackground(Color.black);

        ImageIcon imgSalirD= new ImageIcon("InterfazProyecto/Vista/SALIR2.png");// se le pone icono a boton
        Icon iconSalirD= new ImageIcon(imgSalirD.getImage().getScaledInstance(botonSalir.getWidth(), botonSalir.getHeight(), Image.SCALE_DEFAULT));
        botonSalir.setRolloverIcon(iconSalirD);

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
        panelInicio.add(botonSalir);


        ImageIcon imagLogo= new ImageIcon("E:\\Estructuras\\StructureProjectG6\\src\\Imagenes\\Logo.jpeg");// se le pone icono a boton
        Icon iconLogo= new ImageIcon(imagLogo.getImage().getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_DEFAULT));
        JLabel fondo= new JLabel(iconLogo);

        contenedor.add(fondo,JLayeredPane.DEFAULT_LAYER);
       // contenedor.add(imagLogo,1);
        contenedor.add(panelInicio,JLayeredPane.DRAG_LAYER);
        contenedor.add(panelModulos,3);
        //this.getContentPane().add(panelInicio);
        this.getContentPane().add(contenedor);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public void panelModulos(){

        //Panel que tendrá las etiquetas y botones
        panelModulos.setLayout(null);
        panelModulos.setOpaque(true);
        panelModulos.setBounds(300,100,1000,300);
        Color colo1=new Color(255,245,238);
        panelModulos.setBackground(colo1);
        this.add(panelModulos);

        botonAdmin = new JButton("Aministrador");
        botonAdmin.setBounds(100, 300, 300, 300);
        ImageIcon img= new ImageIcon("InterfazProyecto/Vista/ADMIN.png");// se le pone icono a boton
        Icon i= new ImageIcon(img.getImage().getScaledInstance(botonAdmin.getWidth(), botonAdmin.getHeight(), Image.SCALE_DEFAULT));
        botonAdmin.setIcon(i);
        botonAdmin.setLayout(null);
        botonAdmin.setOpaque(true);
        botonAdmin.setBorderPainted(false);
        ImageIcon imgadmin= new ImageIcon("InterfazProyecto/Vista/ADMIN.png");// se le pone icono a boton
        Icon iconAdmin= new ImageIcon(imgadmin.getImage().getScaledInstance(botonAdmin.getWidth(), botonAdmin.getHeight(), Image.SCALE_DEFAULT));
        botonAdmin.setRolloverIcon(iconAdmin);
        botonAdmin.setBackground(colo1);

        botonAdmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelModulos.setVisible(false);

                //  panel.setVisible(true);

            }
        });
        panelModulos.add(botonAdmin);

        botonOperador = new JButton("Operador");
        botonOperador.setBounds(400, 300, 300, 300);
        ImageIcon imgopera= new ImageIcon("InterfazProyecto/Vista/OPERADOR.png");// se le pone icono a boton
        Icon iOpera= new ImageIcon(imgopera.getImage().getScaledInstance(botonOperador.getWidth(), botonOperador.getHeight(), Image.SCALE_DEFAULT));
        botonOperador.setIcon(iOpera);
        botonOperador.setLayout(null);//
        botonOperador.setOpaque(true);
        botonOperador.setBorderPainted(false);
        ImageIcon imgaopera= new ImageIcon("InterfazProyecto/Vista/OPERADOR.png");// se le pone icono a boton
        Icon iconopera= new ImageIcon(imgaopera.getImage().getScaledInstance(botonOperador.getWidth(), botonOperador.getHeight(), Image.SCALE_DEFAULT));
        botonOperador.setRolloverIcon(iconopera);
        botonOperador.setBackground(colo1);

        botonOperador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelModulos.setVisible(false);

                //  panel.setVisible(true);

            }
        });
        panelModulos.add(botonOperador);

        botonCocina = new JButton("Cocina");
        botonCocina.setBounds(700, 300, 300, 300);
        ImageIcon imgococina= new ImageIcon("InterfazProyecto/Vista/COCINA.png");// se le pone icono a boton
        Icon iCocina= new ImageIcon(imgococina.getImage().getScaledInstance(botonCocina.getWidth(), botonCocina.getHeight(), Image.SCALE_DEFAULT));
        botonCocina.setIcon(iCocina);
        botonCocina.setLayout(null);
        botonCocina.setOpaque(true);
        botonCocina.setBorderPainted(false);
        ImageIcon imgaCocina= new ImageIcon("InterfazProyecto/Vista/COCINA.png");// se le pone icono a boton
        Icon iconoCocina= new ImageIcon(imgaCocina.getImage().getScaledInstance(botonCocina.getWidth(), botonCocina.getHeight(), Image.SCALE_DEFAULT));
        botonCocina.setRolloverIcon(iconoCocina);
        botonCocina.setBackground(colo1);

        botonCocina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelModulos.setVisible(false);

                //  panel.setVisible(true);

            }
        });
        panelModulos.add(botonCocina);




        botonRepartidor = new JButton("Repartidor");
        botonRepartidor.setBounds(1000, 300, 300, 300);
        ImageIcon imgorRepartidor= new ImageIcon("InterfazProyecto/Vista/REPARTIDOR.png");// se le pone icono a boton
        Icon iRepartidor= new ImageIcon(imgorRepartidor.getImage().getScaledInstance(botonRepartidor.getWidth(), botonRepartidor.getHeight(), Image.SCALE_DEFAULT));
        botonRepartidor.setIcon(iRepartidor);
        botonRepartidor.setLayout(null);
        botonRepartidor.setOpaque(true);
        botonRepartidor.setBorderPainted(false);
        ImageIcon imgRepartidor= new ImageIcon("InterfazProyecto/Vista/REPARTIDOR.png");// se le pone icono a boton
        Icon iconoRepartidor= new ImageIcon(imgRepartidor.getImage().getScaledInstance(botonRepartidor.getWidth(), botonRepartidor.getHeight(), Image.SCALE_DEFAULT));
        botonRepartidor.setRolloverIcon(iconoRepartidor);
        botonRepartidor.setBackground(colo1);

        botonRepartidor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelModulos.setVisible(false);

                //  panel.setVisible(true);

            }
        });
        panelModulos.add(botonRepartidor);





    }


}
