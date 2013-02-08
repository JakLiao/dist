/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class Init {
        Init(){
             
        }
        public static void go(){
            for(int i=1;i<=16;i++)
               for(int j=1;j<=16;j++)
               {
                   JButton2 jt=Data.grid[i][j];
                   jt.flag=false;
                   jt.xx=i;
                   jt.yy=j;
                   jt.setContentAreaFilled(false);
                  // jt.addActionListener(new TillListener());
                   jt.setIcon(Data.bg);
                   jt.setRolloverIcon(Data.bg3);
                   jt.setPressedIcon(Data.bg);
                    // jt.setBorder(BorderFactory.createLineBorder(Color.blue,1));
                   Data.board[i][j]=0;
               }
            Data.flag=true;
            Judge.result=0;
        }
    
}
