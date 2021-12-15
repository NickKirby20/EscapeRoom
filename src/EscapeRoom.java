import com.sun.deploy.appcontext.AppContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoom {

    static JFrame frame;
    static JPanel panel;
    static JLabel  resultLabel,Door,Bed,Dresser,StepStool, InputAnswer;
    static JButton startButton1;
    static JTextField answerInput;
    static int userAnswer, correctAnswer;
    static ButtonGroup radios = new ButtonGroup();


    //static int userAnswer, correctAnswer, answerInput;
    public static void main(String[] args) {
        new EscapeRoom();
    }

    public EscapeRoom(){

        frame = new JFrame("Escape Room");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        startButton1 = new JButton("Click to Start");
        resultLabel = new JLabel();
        answerInput = new JTextField("Put Answer here");
        Bed = new JLabel("1.)Bed");
        Dresser = new JLabel("2.)Dresser");
        StepStool = new JLabel("3.)StepStool");
        Door = new JLabel("4.)Door");
        InputAnswer = new JLabel("Put 1,2,3,4 Here");




        answerInput = new JTextField(10);


        startButton1.addActionListener(new startListener());



        Bed.setBounds(100,25,200,20);
        Dresser.setBounds(150,25,200,20);
        StepStool.setBounds(225,25,200,20);
        Door.setBounds(310,25,200,20);
        answerInput.setBounds(180,80,75,20);
        InputAnswer.setBounds(180,50,75,50);

        panel.setLayout(null);
        panel.add(Bed);
        panel.add(Dresser);
        panel.add(StepStool);
        panel.add(Door);
        panel.add(startButton1);
        panel.add(resultLabel);
        panel.add(answerInput);

        frame.add(panel);
        frame.setVisible(true);


    }

    private static class startListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {





        }
    }

    private static class checkUsersAnswer implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {



        }
    }





}













