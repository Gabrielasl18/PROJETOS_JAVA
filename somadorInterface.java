//SOMADOR DE 2 NÚMEROS INTEIROS,MOSTRA O RESULTADO,LIMPA A CAIXA DE TEXTO,SAI DA JANELA.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class somadorInterface extends JFrame implements ActionListener{

int result;
JButton jb = new JButton("Resultado");
JButton jb2 = new JButton("Limpar");
JButton jb3 = new JButton("sair");
JLabel legenda1 = new JLabel();
JLabel legenda2 = new JLabel();
JLabel legenda3 = new JLabel();
JTextField caixa2 = new JTextField("digite aqui");
JTextField resultado = new JTextField("resultado");
JTextField caixa1 = new JTextField("digite aqui");

    public void actionPerformed(ActionEvent e){//método actionPerformed trata o JButton
        if(e.getSource() == jb){
            int n1 = Integer.parseInt(caixa1.getText());
            int n2 = Integer.parseInt(caixa2.getText());
            int result = n1 + n2;
            resultado.setText(String.valueOf(result));
        }
        if(e.getSource() == jb3){
            int simnao;
            simnao = JOptionPane.showConfirmDialog(null,"deseja sair?");
            if(simnao == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,"Adeus!");
            System.exit(0);
            }
            else{
            JOptionPane.showMessageDialog(null,"Que bom que continou com a gente!");
            }
        }
        if(e.getSource() == jb2){
        caixa1.setText("");
        caixa2.setText("");
        caixa1.requestFocus();
        resultado.setText("Null");
        }
    }
    public somadorInterface(){
    add(caixa1);
    add(caixa2);
    add(resultado);
    caixa1.setBounds(230,90,300,25);
    caixa2.setBounds(230,140,300,25);
    resultado.setBounds(230,235,300,25);

    jb.addActionListener(this);
    jb2.addActionListener(this);
    jb3.addActionListener(this);
    setLayout(null); // componente(botao) sai da janela
    jb.setBounds(50,405,150,60);//posicao horizontal(x) e vertical(y),largura e altura.
    jb2.setBounds(230,405,120,60);
    jb3.setBounds(600,511,80,30);
    add(jb);//getContentPane().add(jb) vai retornar a área da janela que da pra adicionar um componente.
    add(jb2);
    add(jb3);
    legenda1.setBounds(50,50,200,100);
    legenda1.setText("primeiro número:");
    legenda2.setBounds(50,100,200,100);
    legenda2.setText("segundo número:");
    legenda3.setBounds(50,200,200,100);
    legenda3.setText("resultado:");
    add(legenda1);
    add(legenda2);
    add(legenda3);
        
    setTitle("SOMADOR");
    setSize(700,600);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
    }
    public static void main(String args[]){
        new somadorInterface();//instanciando a janela
    }
}
