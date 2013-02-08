package javaapplication1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Data {
      static  ImageIcon bg1 = new ImageIcon("image/black.png");
      static  ImageIcon bg2 = new ImageIcon("image/color.png");
      static  ImageIcon bg3 = new ImageIcon("image/yin.png");
      static  ImageIcon bg = new ImageIcon("image/tt.png");
      static  ImageIcon t;
      public static  JButton2[][] grid=new JButton2[20][20];
      static  boolean flag=true;
      static  int[][]  board=new int[20][20];
      static int[][] winpoint=new int[2000][4];
      static int winnum;
      static void getwinpoint(){
          int i,j,k;
          winnum=0;
          for(i=1;i<=16;i++)
              for(j=1;j<=16;j++)
                  if(j+4<=16)
                  {
                      winnum++;
                      winpoint[winnum][0]=i;
                      winpoint[winnum][1]=j;
                      winpoint[winnum][2]=0;
                      winpoint[winnum][3]=1;
                  }
          for(i=1;i<=16;i++)
              for(j=1;j<=16;j++)
                  if(i+4<=16)
                  {
                      winnum++;
                      winpoint[winnum][0]=i;
                      winpoint[winnum][1]=j;
                      winpoint[winnum][2]=1;
                      winpoint[winnum][3]=0;
                  }
          for(i=1;i<=16;i++)
              for(j=1;j<=16;j++)
                  if(i+4<=16&&j+4<=16)
                  {
                      winnum++;
                      winpoint[winnum][0]=i;
                      winpoint[winnum][1]=j;
                      winpoint[winnum][2]=1;
                      winpoint[winnum][3]=1;
                  }
           for(i=1;i<=16;i++)
              for(j=1;j<=16;j++)
                  if(i+4<=16&&j-4>=1)
                  {
                      winnum++;
                      winpoint[winnum][0]=i;
                      winpoint[winnum][1]=j;
                      winpoint[winnum][2]=1;
                      winpoint[winnum][3]=-1;
                  }
      }
        Data(){
            getwinpoint();
           System.out.print("winnum="+winnum);
                for(int i=1;i<=16;i++)
                    for(int j=1;j<=16;j++)
                    {
                        board[i][j]=0;
                        grid[i][j]=new JButton2();
                    }
        }

}
