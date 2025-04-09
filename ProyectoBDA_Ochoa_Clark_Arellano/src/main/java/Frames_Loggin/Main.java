/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Frames_Loggin;

import Control.Conexion;
import Entidades.Usuario;
import Frames_Usuario.FrmRegistarUsuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Arell
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! comenzamos");
        Loggin loggin = new Loggin();
      //  loggin.setVisible(true);
      
        JFrame frame = new JFrame("Inicio de Sesión");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setLayout(null);

        JLabel labelTitle = new JLabel("INICIAR SESIÓN", SwingConstants.CENTER);
        labelTitle.setForeground(Color.WHITE);
        labelTitle.setFont(new Font("Arial", Font.BOLD, 18));
        labelTitle.setBounds(0, 20, 400, 30);
        panel.add(labelTitle);

        JLabel labelUser = new JLabel("Nombre:");
        labelUser.setForeground(Color.LIGHT_GRAY);
        labelUser.setBounds(50, 80, 100, 25);
        panel.add(labelUser);

        JTextField textUser = new JTextField();
        textUser.setBounds(150, 80, 200, 25);
        panel.add(textUser);

        JLabel labelPassword = new JLabel("Contraseña:");
        labelPassword.setForeground(Color.LIGHT_GRAY);
        labelPassword.setBounds(50, 120, 100, 25);
        panel.add(labelPassword);

        JPasswordField textPassword = new JPasswordField();
        textPassword.setBounds(150, 120, 200, 25);
        panel.add(textPassword);

        JButton buttonLogin = new JButton("INICIAR SESIÓN");
        buttonLogin.setBounds(150, 170, 200, 30);
        panel.add(buttonLogin);

        JButton buttonRegister = new JButton("Registrar Usuario");
        buttonRegister.setBounds(150, 210, 200, 30);
        panel.add(buttonRegister);

        frame.add(panel);
        frame.setVisible(true);

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textUser.getText().trim();
                String password = new String(textPassword.getPassword()).trim();
                
                // Validación de campos vacíos
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Los campos no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                // Validación de caracteres especiales
                if (!Pattern.matches("^[a-zA-Z0-9]*$", username) || !Pattern.matches("^[a-zA-Z0-9]*$", password)) {
                    JOptionPane.showMessageDialog(frame, "No se permiten caracteres especiales.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Acción de Iniciar Sesión
                Conexion n = new Conexion();
                Usuario u = new Usuario(username,password);
                // Acción de Iniciar Sesión
            int id = n.Loggin(u);
            if(id > 0)
            {True t = new True();
                t.setVisible(true);
                frame.dispose();
            }
            else
               JOptionPane.showMessageDialog(frame, "Incorrecto!! Por favor, Intente de nuevo", "Alerta", JOptionPane.WARNING_MESSAGE);
                
            }
        });

        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción de Registrar Usuario
                FrmRegistarUsuario fru = new FrmRegistarUsuario();
                fru.setVisible(true);
                frame.dispose();
            }
        });
    }
}


    

