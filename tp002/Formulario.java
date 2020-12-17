/*
 * Aluno 1: Vinicius do Carmo Costa
 * Aluno 2: Aramis Nogueira
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Component;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.Font;

public class Formulario implements ActionListener {
  private List<Aluno> aluno = new ArrayList<Aluno>();
  private JFrame frame = new JFrame();

  private JLabel labelNome;
  private JLabel labelIdade;
  private JLabel labelEndereco;

  private JButton buttonOK;
  private JButton buttonClear;
  private JButton buttonShow;
  private JButton buttonExit;
  private JTextField fieldNome;
  private JTextField fieldIdade;
  private JTextField fieldEndereco;

  private void initializeElements() {
	labelNome = new JLabel();
	labelNome.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    labelIdade = new JLabel();
    labelIdade.setFont(new Font("Times New Roman", Font.PLAIN, 30));
    labelIdade.setAlignmentY(Component.BOTTOM_ALIGNMENT);
    labelEndereco = new JLabel();
    labelEndereco.setFont(new Font("Times New Roman", Font.PLAIN, 30));
 /* ------------------------------------------------------------------------- */
    buttonOK = new JButton();
    buttonOK.setFont(new Font("Times New Roman", Font.PLAIN, 18));
    buttonOK.setPreferredSize(new Dimension(10, 10));
    buttonClear = new JButton();
    buttonClear.setFont(new Font("Times New Roman", Font.PLAIN, 18));
    buttonShow = new JButton();
    buttonShow.setFont(new Font("Times New Roman", Font.PLAIN, 18));
    buttonExit = new JButton();
    buttonExit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
    buttonExit.setAlignmentX(Component.RIGHT_ALIGNMENT);

  /* ------------------------------------------------------------------------- */

    labelNome.setText("Nome:");
    labelIdade.setText("Idade:");
    labelEndereco.setText("Endereço:");

    buttonOK.setText("OK");
    buttonClear.setText("Limpar");
    buttonShow.setText("Mostrar");
    buttonExit.setText("Sair");

    buttonOK.addActionListener(this);
    buttonClear.addActionListener(this);
    buttonShow.addActionListener(this);
    buttonExit.addActionListener(this);
     /* ------------------------------------------------------------------------- */
    fieldNome = new JTextField();
    fieldNome.setColumns(10);
    
    fieldIdade = new JTextField();
    fieldIdade.setColumns(10);
    
    fieldEndereco = new JTextField();
    fieldEndereco.setColumns(10);
    GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
    groupLayout.setHorizontalGroup(
    	groupLayout.createParallelGroup(Alignment.LEADING)
    		.addGroup(groupLayout.createSequentialGroup()
    			.addGap(1)
    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addGroup(groupLayout.createSequentialGroup()
    					.addComponent(buttonOK, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(buttonClear, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
    					.addPreferredGap(ComponentPlacement.RELATED)
    					.addComponent(buttonShow, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
    					.addGap(9)
    					.addComponent(buttonExit, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
    					.addGap(6))
    				.addGroup(groupLayout.createSequentialGroup()
    					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    						.addGroup(groupLayout.createSequentialGroup()
    							.addComponent(labelEndereco, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
    							.addPreferredGap(ComponentPlacement.UNRELATED))
    						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    							.addComponent(labelNome, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
    							.addComponent(labelIdade, GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
    					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    						.addComponent(fieldEndereco, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
    						.addGroup(groupLayout.createSequentialGroup()
    							.addPreferredGap(ComponentPlacement.RELATED)
    							.addComponent(fieldNome, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE))
    						.addComponent(fieldIdade, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE))
    					.addContainerGap(13, Short.MAX_VALUE))))
    );
    groupLayout.setVerticalGroup(
    	groupLayout.createParallelGroup(Alignment.LEADING)
    		.addGroup(groupLayout.createSequentialGroup()
    			.addGap(33)
    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
    				.addComponent(labelNome, 0, 35, Short.MAX_VALUE)
    				.addComponent(fieldNome, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
    			.addGap(27)
    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
    				.addComponent(labelIdade)
    				.addComponent(fieldIdade, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
    			.addGap(20)
    			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    				.addComponent(labelEndereco, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
    				.addComponent(fieldEndereco, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
    			.addGap(112)
    			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
    				.addComponent(buttonOK, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
    				.addComponent(buttonClear, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
    				.addComponent(buttonShow, GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
    				.addComponent(buttonExit, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
    			.addContainerGap())
    );
    frame.getContentPane().setLayout(groupLayout);
  }
 /* ------------------------------------------------------------------------- */
  Formulario() {
    frame.setSize(600, 400);
    frame.setResizable(false);
    frame.setLocation(400, 200);
    frame.setTitle("Formulário de alunos");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    initializeElements();

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new Formulario();

    System.out.println("Iniciou");
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    String command = event.getActionCommand();

    switch (command) {
      case "OK":
    	  aluno.add(new Aluno(fieldNome.getText(), fieldEndereco.getText(), Integer.parseInt(fieldIdade.getText())));

        fieldNome.setText("");
        fieldEndereco.setText("");
        fieldIdade.setText("");

        break;

      case "Limpar":
        fieldNome.setText("");
        fieldEndereco.setText("");
        fieldIdade.setText("");
        break;

      case "Mostrar":
        String dadosAlunos = new String();

        for (Aluno student : aluno) {

        	dadosAlunos += "Id:" + student.getUUID() + ", ";
        	dadosAlunos += "Nome:" + student.getNome() + ", ";
        	dadosAlunos += "Idade:" + student.getIdade() + ", ";
        	dadosAlunos += "Endereço:" + student.getEndereco() + "";
        	dadosAlunos += "\n";
        }

        JOptionPane.showMessageDialog(null, dadosAlunos);
        break;

      case "Sair":
        frame.dispose();
        break;
    }

//    System.out.println(command);
  }
}