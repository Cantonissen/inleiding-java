package h10;


import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Opdracht1Plus2 extends Applet{
    Button knopOK;
    boolean firstNumber;
    TextField tekst;
    Label resultaat;
    int maxinput, mininput, userInput;
    String schermtekst;


    public void init(){

        setSize(500,200);
        knopOK = new Button("OK");
        knopOK.addActionListener(new knopOKHandler());
        tekst = new TextField(12);
        tekst.addActionListener(new knopOKHandler());
        schermtekst = (String.valueOf(userInput));
        resultaat = new Label(" ");
        add(tekst);
        firstNumber = true;
        maxinput = 0;
        mininput = 0;
        add(knopOK);
        add(resultaat);

    }

    public void paint (Graphics g) {
        g.drawString("Max input" + maxinput, 50,100);
        g.drawString("Min input" + mininput, 50,130);
        g.drawString(schermtekst,50,160);
    }


    class knopOKHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String userInputString = tekst.getText();
            userInput = Integer.parseInt(userInputString);
            if (userInput > maxinput) {
                firstNumber = false;
                maxinput = userInput;
                mininput = userInput;
                schermtekst = "";
                repaint();
            }
            else {
                if (userInput > maxinput) {
                    maxinput = userInput;
                    schermtekst = "";
                    repaint();
                }
                else if (userInput < mininput) {
                    mininput = userInput;
                    schermtekst = "";
                    repaint();
                }
                else {
                    schermtekst = "Sorry, maar" + userInput + "is niet hoger dan" + maxinput + "en niet lager dan" + mininput;
                    repaint();
                }
            }

            }
            }
    }


