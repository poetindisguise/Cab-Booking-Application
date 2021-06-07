/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uber;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author NITJ
 */
public class fake {
    


public fake()
{
    JFrame jfrm=new JFrame("JText Field Demo");
    jfrm.setLayout(new FlowLayout());
    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jfrm.setSize(600,600);
    JTextField jtf=new JTextField(15);
    jfrm.add(jtf);
    JLabel jlab=new JLabel();
    jfrm.add(jlab);
    JLabel jlab1=new JLabel();
    jfrm.add(jlab1);
    JLabel jlab2=new JLabel();
    jfrm.add(jlab2);
    JLabel jlab3=new JLabel();
    jfrm.add(jlab3);
    jtf.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae)
        {
            String id="028";
            int k=0;
            char ch[]=id.toCharArray();
            BufferedReader bf = null;
            try {
                bf = new BufferedReader(new FileReader("C:\\Users\\NITJ\\Desktop\\java\\students.txt"));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(fake.class.getName()).log(Level.SEVERE, null, ex);
            }
            String s1;
            try {
                while((s1=bf.readLine())!=null)
                {
                    k=0;
                    char ch1[]=s1.toCharArray();
                    for(int i=0;i<id.length();i++)
                    {
                        if(ch[i]!=ch1[i+8])
                        {
                            k=1;
                            break;
                        }
                    }
                    if(k==0)
                    {
                        String str1="";
                        for(int i=15;i<18;i++)
                            str1=str1+ch1[i];
                        jlab1.setText(str1);
                        str1="";
                        for(int i=18;i<21;i++)
                            str1=str1+ch1[i];
                        jlab2.setText(str1);
                        str1="";
                        for(int i=21;i<24;i++)
                            str1=str1+ch1[i];
                        jlab3.setText(str1);
                    }
                }   } catch (IOException ex) {
                    Logger.getLogger(fake.class.getName()).log(Level.SEVERE, null, ex);
                }
            jfrm.setVisible(true);
        }
    });

}

public static void main(String args[])throws IOException
{
	
SwingUtilities.invokeLater(
new Runnable(){
public void run(){
new fake();
}
}
);

}



}
