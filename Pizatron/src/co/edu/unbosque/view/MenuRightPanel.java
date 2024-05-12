package co.edu.unbosque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import co.edu.unbosque.view.MainWindow;

public class MenuRightPanel extends JPanel {
	
	Image menu;
	
	
	MenuRightPanel(){
		setPreferredSize(new Dimension(MainWindow.xDim,MainWindow.yDim));
		menu = new ImageIcon("Menu.png").getImage();
		
		
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(menu,1710,1080,null);
		
	}
}



