package game;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import game.Character;


public class Game{
	BUTTONPRESSED nameButton;
	BUTTONPRESSED opponentButton;
	public enum BUTTONPRESSED {
		YES, NO;
	}
	JTextField name     	=	 new JFormattedTextField();
	JButton makeChar 		=	 new JButton("Create");
	JLabel enterName 	    =	 new JLabel("Enter name:");
	static Character myChar = new Character("Hi", 10, 10, 10);

    public static void main(String args[]){
    	Game first = new Game();
    	first.setupFight();    	
    }
    
    
    //Builds Setup screen
    	public void setupFight(){
    	JFrame setupFrame = new JFrame("Setup Frame");
    	JLabel opponent = new JLabel("Choose your opponent:");
    	JButton opponent1 = new JButton("Opponent 1");
    	JButton opponent2 = new JButton("Opponent 2");
    	JButton opponent3 = new JButton("Opponent 3");
    	JPanel buttonPanel = new JPanel();
    	JPanel charBuilder = new JPanel();
    	JPanel chooseOpponent = new JPanel();
    	//Uses name field to assign player's character a name
    	makeChar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				myChar.setName(name.getText());
				name.setVisible(false);
				makeChar.setVisible(false);
				enterName.setText("Your name is : " + myChar.getName());
			}
		}
		);
    	name.setColumns(20);
    	charBuilder.add(enterName, BorderLayout.WEST);
    	charBuilder.add(name);
    	charBuilder.add(makeChar, BorderLayout.SOUTH);
    	chooseOpponent.add(opponent, BorderLayout.NORTH);
    	chooseOpponent.add(buttonPanel);
    	buttonPanel.add(opponent1);
    	buttonPanel.add(opponent2);
    	buttonPanel.add(opponent3);
    	
    	setupFrame.add(charBuilder);
    	setupFrame.add(chooseOpponent, BorderLayout.SOUTH);
    	setupFrame.setSize(300, 400);
        setupFrame.setVisible(true);
        setupFrame.setResizable(false);
        setupFrame.pack();
        setupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    	
    	
    	
    	//Builds fight screen
    public static void buildFight(Character char1, Character char2){
    	JFrame fightFrame = new JFrame("Fight Frame");
    	JPanel char1panel = new JPanel();
    	JPanel char2panel = new JPanel();
    	JLabel char1name = new JLabel(char1.getName());
    	JLabel char1health = new JLabel(Integer.toString(char1.getHealth()));
    	JLabel char2name = new JLabel(char2.getName());
    	JLabel char2health = new JLabel(Integer.toString(char2.getHealth())); 
    	char1panel.add(char1name, BorderLayout.NORTH);
    	char1panel.add(char1health, BorderLayout.SOUTH);
    	char2panel.add(char2name, BorderLayout.NORTH);
    	char2panel.add(char2health, BorderLayout.SOUTH);
    	fightFrame.add(char1panel, BorderLayout.SOUTH);
    	fightFrame.add(char2panel, BorderLayout.NORTH);
    	fightFrame.setSize(300, 400);
        fightFrame.setVisible(true);
        fightFrame.setResizable(false);
        fightFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}