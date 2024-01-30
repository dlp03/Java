import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class JInsurance extends JFrame implements ItemListener {

FlowLayout flow = new FlowLayout();

ButtonGroup insGrp = new ButtonGroup();

JCheckBox hmo, ppo, dental, vision;
  
  


JTextField insChoice ;

String output, insChosen="";

public JInsurance() {
  
   hmo = new JCheckBox("HMO");
ppo = new JCheckBox("PPO");
dental = new JCheckBox("Dental");
vision = new JCheckBox("Vision");
  

  
insChoice = new JTextField(20);
insChoice.setAlignmentX((float) 1.0);
  
   this.setLayout(flow);
  
   this.add(hmo);
   this.add(ppo);
   this.add(dental);
   this.add(vision);
     
   this.add(insChoice);
  
   hmo.addItemListener(this);
   ppo.addItemListener(this);
   dental.addItemListener(this);
   vision.addItemListener(this);
  

}
  
  
  

public static void main(String[] arguments) {

JInsurance iFrame = new JInsurance();

iFrame.setSize(400, 100);

iFrame.setVisible(true);

}
  
  

  
int cost=0;
@Override
public void itemStateChanged(ItemEvent check) {
  
   if(check.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
       if(check.getSource()==hmo){
        insChosen=insChosen+" hmo";
        cost=cost+200;
    }
       else if(check.getSource()==ppo) {
        insChosen=insChosen+" ppo";
        cost=cost+600;
    }
      
    else if(check.getSource()==dental){
        insChosen=insChosen+" dental";
        cost=cost+75;
    }
          
    else if(check.getSource()==vision) {
        insChosen=insChosen+" vision";
        cost=cost+20;
    }
} else {//checkbox has been deselected 

if(check.getSource()==hmo){ 
insChosen=insChosen.replace(" hmo", ""); 
cost=cost-200; } else if(check.getSource()==ppo) { insChosen=insChosen.replace(" ppo", ""); 
cost=cost-600; }

     
   output=insChosen + " $" + cost + " additional";
   insChoice.setText(output);
  

}
}
}