
package javaapplication1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TillListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton2 jt=(JButton2)e.getSource();
            if(!jt.flag)
            {
            Data.flag=!Data.flag;
            if(Data.flag)
            { Data.t=Data.bg1;Data.board[jt.xx][jt.yy]=1;}
            else
            { Data.t=Data.bg2;Data.board[jt.xx][jt.yy]=2;}

            jt.setIcon(Data.t);
            jt.setRolloverIcon(Data.t);
            jt.setPressedIcon(Data.t);
            jt.flag=true;
            
            }
        }
    }