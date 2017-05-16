import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalculatePanel  extends JPanel{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	boolean start;
    String lastCommand="=";
    double result;
    JFrame frame=new JFrame();
    JButton display;
       private JPanel panel;
       public CalculatePanel(){
           frame.setSize(250, 250);
           panel=new JPanel();
           display=new JButton("0");
           start=true;
           display.setEnabled(false);
           setLayout(new BorderLayout());
           panel.setLayout(new GridLayout(4,4));
           ActionListener listener=new NumAction();
           ActionListener watch=new CalculateAction();
           frame.add(display,BorderLayout.NORTH);
           addButton("7",listener);
           addButton("8",listener);
           addButton("9",listener);
           addButton("/",watch);
           addButton("4",listener);
           addButton("5",listener);
           addButton("6",listener);
           addButton("*",watch);
           addButton("1",listener);
           addButton("2",listener);
           addButton("3",listener);
           addButton("-",watch);
           addButton("0",listener);
           addButton(".",listener);
           addButton("=",watch);
           addButton("+",watch);
           add(panel,BorderLayout.CENTER);
           frame.add(panel,BorderLayout.CENTER);
           frame.setTitle("Caculator_061");
           frame.setVisible(true);
       }
       
   
       private void addButton(String str,ActionListener listener){
           JButton button=new JButton(str);
           button.addActionListener(listener);// ����ť��Ӽ�����
           panel.add(button);//����ť��ӵ������
       }

class NumAction implements ActionListener{
   
   public void actionPerformed(ActionEvent event) {
       // TODO �Զ����ɵķ������
       String input=event.getActionCommand();
       if(start){
           display.setText("");
           start=false;
       }
       display.setText(display.getText()+input);
   }
}

class CalculateAction implements ActionListener{
   public void actionPerformed(ActionEvent event){//ʵ��ÿ��ActionListener�ӿڵ������Ҫʵ��actionPerformed()����
       String command=event.getActionCommand();
       if(start){
           if(command.equals("-")) {
               display.setText(command);
           start=false;
           }
           else lastCommand=command;
       }
       else {
           Calculate(Double.parseDouble(display.getText()));
           lastCommand=command;
           start=true;
       }
   }
}    
   public void Calculate(double x){
       if(lastCommand.equals("+")) result+=x;
       else if(lastCommand.equals("-")) result-=x;
       else if(lastCommand.equals("*"))result*=x;
       else if(lastCommand.equals("/")) result/=x;
       else result=x;
       display.setText(""+result);;
   }
}


public class Test {

   public static void main(String[] args) {
       // TODO �Զ����ɵķ������
       CalculatePanel aTest = new CalculatePanel();
   }

}
