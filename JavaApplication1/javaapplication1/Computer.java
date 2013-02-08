
package javaapplication1;

public class Computer {
        static int ansx,ansy,point;
        static void thought(){
            point=-1;
            int i,j,k;
            for(i=1;i<=16;i++)
                for(j=1;j<=16;j++)
                    if(Data.board[i][j]==0)
                {
                    int sum1=0,sum2=0;
                    for(k=1;k<=Data.winnum;k++)
                    {
                        int flag=0,ii,jj,tt;
                        for( ii=Data.winpoint[k][0],jj=Data.winpoint[k][1],tt=1; tt<=5 ;ii+=Data.winpoint[k][2],jj+=Data.winpoint[k][3],tt++)
                              if(ii==i&&jj==j)
                                  flag=1;
                         if(flag==0) continue;
                        int sumk=0;
                        for( ii=Data.winpoint[k][0],jj=Data.winpoint[k][1],tt=1; tt<=5 ;ii+=Data.winpoint[k][2],jj+=Data.winpoint[k][3],tt++)
                            if(Data.board[ii][jj]==1)
                                sumk++;
                            else
                                if(Data.board[ii][jj]==2)
                                    sumk=-100;
                            if(sumk==3) sumk+=20;
                            if(sumk==4) sumk+=180;
                            if(sumk<0) sumk=0;
                        sum1+=sumk;
                        sumk=0;
                        for( ii=Data.winpoint[k][0],jj=Data.winpoint[k][1],tt=1; tt<=5 ;ii+=Data.winpoint[k][2],jj+=Data.winpoint[k][3],tt++)
                            if(Data.board[ii][jj]==2)
                                sumk++;
                            else
                                if(Data.board[ii][jj]==1)
                                    sumk=-100;
                            if(sumk==3) sumk+=20;
                            if(sumk==4) sumk+=180;
                            if(sumk<0) sumk=0;
                        sum2+=sumk;
                    }
                  //  System.out.println("sum1 sum2 i j=="+sum1+"  "+sum2+" "+i+" "+j);
                   if(point<sum1)
                   {
                       point=sum1;
                       ansx=i;
                       ansy=j;
                   }
                     if(point<sum2)
                   {
                       point=sum2;
                       ansx=i;
                       ansy=j;
                   }

                    // System.out.print("sum1 sum2 i j=="+sum1+"  "+sum2+" "+i+" "+j);


                }
        }
        static void set(){
           // System.out.print("x,y=="+ansx+" "+ansy);
             JButton2 jt=(JButton2)Data.grid[ansx][ansy];

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
        static void play(){
            thought();
            set();
        }


}
