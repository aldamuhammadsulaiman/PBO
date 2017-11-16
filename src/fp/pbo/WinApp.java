/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.pbo;
import javax.swing.*;

public class WinApp {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        new MainWindow().show();
      }
    });
  }
}

