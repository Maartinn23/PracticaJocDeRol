/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicagestorjocrolmartin;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author alumnegs
 */
public class FinestraPrincipal extends JFrame{
    
    
    
    public FinestraPrincipal(){
        setUndecorated(true);
        setSize(750,520);
        
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel();
        
        PanellPrincipal panellPrincipal = new PanellPrincipal(cardLayout,cardPanel);
        
        cardPanel.add(panellPrincipal,"panellPrincipal");
        
        add(cardPanel);
        
        
        
        
        
        
        
        
        setVisible(true);
        
    }
    
    
    
    public static void main(String [] args){
        
        
        FinestraPrincipal finestraPrincipal = new FinestraPrincipal();
        
        
        
    }
    
    
}
