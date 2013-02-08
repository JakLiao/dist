package javaapplication1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.applet.*;
public class Gobang extends JFrame {
       
        
        public Gobang(){
        new Data();
        setLayout(new BorderLayout(0,0));
        JPanel panel=new JPanel();
        panel.setSize(500, 500);
        panel.setOpaque(false);
        panel.setLayout(new GridLayout(16,16,-1,-1));
        for(int i=1;i<=16;i++)
            for(int j=1;j<=16;j++)
                {
                    JButton2 jt=Data.grid[i][j];
                    jt.flag=false;
                    jt.xx=i;
                    jt.yy=j;
                    jt.setContentAreaFilled(false);
                    jt.addActionListener(new TillListener());
                    jt.setIcon(Data.bg);
                    jt.setRolloverIcon(Data.bg3);
                    jt.setPressedIcon(Data.bg);
                    // jt.setBorder(BorderFactory.createLineBorder(Color.blue,1));
                    panel.add(jt);
        }
        add(panel,BorderLayout.CENTER);
       
    }
 
    public static void main(String[] args) {
        Gobang frame = new Gobang();
        ImageIcon bg = new ImageIcon("image/tiankong.jpg");
        JLabel label = new JLabel(bg);
        label.setBounds(0,0,bg.getIconWidth(),bg.getIconHeight());
        frame.getRootPane().add(label,new Integer(Integer.MIN_VALUE));
        JPanel jp=(JPanel)frame.getContentPane();
        jp.setOpaque(false);
        frame.setTitle("五子棋");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    //    URL urlForAudio=frame.getClass().getResource("mimi.wav");
   //     AudioClip audioClip=Applet.newAudioClip(urlForAudio);
      //  audioClip.loop();
        new Music();
        while(true){
            int f=0;
            Init.go();
            while((f=Judge.result)==0){
                if(Data.flag)
                    Person.play();
                 else
                    Computer.play();
                   Judge.check();
            }
               if(f==1)
                JOptionPane.showMessageDialog(null," Red Bird Win!");
               else
                JOptionPane.showMessageDialog(null," Black Bird Win!");
        }
    }
}

