package stackes.practica4;

/**
 *
 * @author maria
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Practica4 extends JFrame {
    JLabel Matricula;
    JTextField TMatricula;
    JButton BBuscar, BNuevo;
    JTable tabla;
    JScrollPane scrollPane;
     
    public Practica4(){
        setTitle("Práctica4");
        setSize(550, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
    }
    
    public void componentes() {
        // Inicialización y configuración de componentes
        Matricula = new JLabel("Matricula:");
        Matricula.setBounds(30, 30, 70, 25);
        
        TMatricula = new JTextField();
        TMatricula.setBounds(100, 30, 120, 25);
        
        BBuscar = new JButton("Buscar");
        BBuscar.setBounds(380, 30, 80, 25);
        
        BNuevo = new JButton("Nuevo");
        BNuevo.setBounds(470, 30, 80, 25);
        
        String[] columnas = {"Matricula", "Nombre", "Edad", "Teléfono", "Correo"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 6);
        tabla = new JTable(modelo);
        
        scrollPane = new JScrollPane(tabla);
        scrollPane.setBounds(30, 80, 560, 220);
        
        add(Matricula);
        add(TMatricula);
        add(BBuscar);
        add(BNuevo);
        add(scrollPane);
    }

    public static void main(String[] args) {
        Practica4 practica = new Practica4();
    }
}