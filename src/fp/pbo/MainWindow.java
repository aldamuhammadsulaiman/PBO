/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.pbo;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author alda
 */
public class MainWindow {
  JFrame frmUtama;
  JPanel panel;

  public MainWindow(){
    // initialize the component
    initialize();

    //initialize the property
  }
  
  public void initialize(){

    try{
		UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    } catch(Exception e){
        System.err.println("No Look and Feel found!");
    }

    frmUtama = new JFrame("Windows GUI Application");
    frmUtama.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frmUtama.setDefaultLookAndFeelDecorated(true);

	
		
    panel = new JPanel(new BorderLayout());

    frmUtama.add(panel);
    ImageIcon icon = new ImageIcon("img.png");
    JLabel lbl = new JLabel(icon);

    panel.add(lbl);
    frmUtama.pack();
  }

  public void show(){
    frmUtama.setVisible(true);
    frmUtama.setSize(500,500);
  }

}
