import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
public class FormPanel extends JPanel implements ActionListener{
	JTextField txname , txdepartment;
	JLabel labname , labdepartment;
	JButton btn;
	TextPanel tx;
	FormListener fl;
public FormPanel(){
	Dimension dim = this.getPreferredSize();
	dim.width = 220;
	setPreferredSize(dim);

	txname = new JTextField(10);
	txdepartment = new JTextField(10);
	labname = new JLabel("Name : ");
	labdepartment = new JLabel("Department : ");
	btn= new JButton("OK");
	
	Border inter = BorderFactory.createTitledBorder("Add Person");
	Border outer = BorderFactory.createEmptyBorder(5,5,5,5);
	setBorder(BorderFactory.createCompoundBorder(outer, inter));
	
	setLayout(new GridBagLayout());
	GridBagConstraints gc = new GridBagConstraints();
	gc.gridx = 0;
	gc.gridy = 0;
	gc.anchor = GridBagConstraints.LINE_END;
	gc.weightx = 1 ;
	gc.weighty = 0.1;
	
	add(labname , gc);
	gc.anchor = GridBagConstraints.LINE_START;
	gc.gridx = 1;
	gc.gridy = 0;
	
	add(txname,gc);
	gc.anchor = GridBagConstraints.LINE_END;
	gc.gridx = 0;
	gc.gridy = 1;
	add(labdepartment,gc);
	gc.anchor = GridBagConstraints.LINE_START;
	gc.gridx =1 ;
	gc.gridy = 1;
	
	add(txdepartment,gc);
	gc.anchor = GridBagConstraints.CENTER;
	gc.gridx = 1;
	gc.weightx = 1 ;
	gc.weighty = 0.1;
	gc.gridy = 3;
	add(btn,gc);
	
}
public void setFormListener(FormListener FL){
	fl = FL;
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource().equals(btn)){
	
			String name = txname.getText();
			String depart = txdepartment.getText();
			
			FormEvents ev = new FormEvents(this ,name  ,depart);
		
	}
	
}
}
