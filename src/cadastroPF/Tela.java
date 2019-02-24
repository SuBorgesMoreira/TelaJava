package cadastroPF;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Tela extends JFrame{
	MaskFormatter mascpf = null;
	MaskFormatter mascep = null;
	MaskFormatter masnasc = null;
	MaskFormatter masctel = null;
	
	
	JLabel nome = new JLabel ("Nome: ");
	JTextField nm = new JTextField( );
	JLabel cpf = new JLabel ("CPF: ");
	JTextField cp = new JTextField( );
	JLabel txt = new JLabel ("Ou, se preferir informar outro documento de identificação(RG, CNH, Passaporte, RNE ou outro documento válido.)");
	JLabel tpdoc = new JLabel ("Tipo de documento: ");
	JTextField doc = new JTextField( );
	JLabel n = new JLabel ("N°: ");
	JTextField num = new JTextField();
	JLabel end = new JLabel ("Endereço eletrônico (e-mail): ");
	JTextField email = new JTextField ();
	JLabel ende = new JLabel ("Endereço fisico(Rua, N°, Complemento, Bairro): ");
	JTextField ende2 = new JTextField();
	JLabel cid = new JLabel ("Cidade: ");
	JTextField cidade = new JTextField();
	JLabel est = new JLabel("Estado: ");
	JTextField est2 = new JTextField();
	JLabel uf = new JLabel("UF: ");
	JComboBox cbuf = new JComboBox();
	JLabel cep = new JLabel("CEP: ");
	JTextField cepp  = new JTextField();
	JLabel pais = new JLabel("País: ");
	JTextField pa = new JTextField();
	
	JLabel sex = new JLabel("Sexo: ");
	JRadioButton[] rbdsexo = new JRadioButton[2];
	ButtonGroup grupo = new ButtonGroup();{
		rbdsexo[0] = new JRadioButton("Feminino");
		rbdsexo[1] = new JRadioButton("Masculino");}
	JLabel dtnasc = new JLabel("Data de Nascimento: ");
	JTextField nasc = new JTextField();
	
	JLabel esc = new JLabel("Escolaridade:");
	JRadioButton[] rbdesc = new JRadioButton[7];
		ButtonGroup gp = new ButtonGroup ();{
			rbdesc[0] = new JRadioButton("Ensino Fundamental");
			rbdesc[1] = new JRadioButton("Ensino Médio");
			rbdesc[2] = new JRadioButton("Ensino superior");
			rbdesc[3] = new JRadioButton("Especializações");
			rbdesc[4] = new JRadioButton("Mestrado");
			rbdesc[5] = new JRadioButton("Doutorado");
			rbdesc[6] = new JRadioButton("Sem instrução formal");
	}
		
		JLabel prof = new JLabel("Ocupação principal/ Profissão");
		JRadioButton[] rdpro = new JRadioButton[16];
			ButtonGroup gprof = new ButtonGroup();{
				rdpro[0] = new JRadioButton("Empregado-setor privado");		rdpro[8] = new 	JRadioButton("Estudante");
				rdpro[1] = new JRadioButton("Jornalista");					rdpro[9] = new 	JRadioButton("Emppresário/Empreendedor");
				rdpro[2] = new JRadioButton("Membro de Partido Politico");	rdpro[10] = new JRadioButton("Servidor Público Federal");
				rdpro[3] = new JRadioButton("Representante de Sindicato");	rdpro[11] = new JRadioButton("Servidor Público Estadual");
				rdpro[4] = new JRadioButton("Profis. Liberal/Autonomo");    rdpro[12] = new JRadioButton("Servidor Público Municipal");
				rdpro[5] = new JRadioButton("Pesquisador");					rdpro[13] = new JRadioButton("Membro de ONG Nacional");
				rdpro[6] = new JRadioButton("Professor");					rdpro[14] = new JRadioButton("Membro de ONG Internacional");
																			rdpro[15] = new JRadioButton("Outros");
		}
		JLabel tel = new JLabel ("Telefone: ");
		JTextField tel2 = new JTextField();
		
		JLabel dest = new JLabel("Órgão/Entidade destinatário do pedido: ");
		JTextField txtdest = new JTextField ();
		JLabel resp = new JLabel("Forma preferencial de recebimento da resposta: ");
		JRadioButton[] rdresp = new JRadioButton[3];
		ButtonGroup gpresp = new ButtonGroup();{
			rdresp[0] = new JRadioButton("Buscar/Consultar pessoalmente");
			rdresp[1] = new JRadioButton("E-mail");
			rdresp[2] = new JRadioButton("Por carta(COM CUSTO)");
		}
	
		JLabel esp = new JLabel("Especificação do pedido: ");
		JPanel jpesp = new JPanel();
		JButton btn =  new JButton("Enviar");
		
		public Tela(){
			super("Cadastro Pessoa Física");
		Container paine =this.getContentPane();{

			paine.add(nome);
			nome.setBounds(20, 15, 40, 30);
			paine.add(nm);
			nm.setBounds(70, 15, 350, 30);
			
			paine.add(cpf);
			cpf.setBounds(20, 60, 30, 30);
			paine.add(cp);
			try {
				mascpf = new MaskFormatter("  ### . ### . ### - ##");
				cp = new JFormattedTextField(mascpf);
			}
			catch(Exception  ex){
				ex.printStackTrace();
			}
			paine.add(cp);
			cp.setBounds(70, 60, 250, 30);
			paine.add(txt);
			txt.setBounds(20, 80, 800, 70);
			
			paine.add(tpdoc);
			tpdoc.setBounds(20, 140, 150, 30);
			paine.add(doc);
			doc.setBounds(150, 140, 250, 30);
			
			paine.add(n);
			n.setBounds(470, 140, 30, 30);
			paine.add(num);
			num.setBounds(500, 140, 40, 30);
			
			paine.add(end);
			end.setBounds(20,185, 170, 30);
			paine.add(email);
			email.setBounds(200, 185, 260, 30);
			
			paine.add(ende);
			ende.setBounds(20, 225, 270, 30);
			paine.add(ende2);
			ende2.setBounds(20, 250, 480, 30);
			
			paine.add(cid);
			cid.setBounds(20, 290, 50, 30);
			paine.add(cidade);
			cidade.setBounds(70, 290, 160,30);
			
			paine.add(est);
			est.setBounds(295, 290, 50, 30);
			paine.add(est2);
			est2.setBounds(350, 290, 160, 30);
			
			paine.add(uf);
			uf.setBounds(570, 290, 30, 30);
			paine.add(cbuf);
			cbuf.setBounds(600, 290, 60, 30);
			cbuf.addItem("...");
			cbuf.addItem("AC");		cbuf.addItem("AL");
			cbuf.addItem("AP");		cbuf.addItem("AM");
			cbuf.addItem("BA");		cbuf.addItem("CE");
			cbuf.addItem("DF");		cbuf.addItem("ES");
			cbuf.addItem("GO");		cbuf.addItem("MA");
			cbuf.addItem("MT");		cbuf.addItem("MS");
			cbuf.addItem("MG");		cbuf.addItem("PA");
			cbuf.addItem("PB");		cbuf.addItem("PR");
			cbuf.addItem("PE");		cbuf.addItem("PI");
			cbuf.addItem("RJ");		cbuf.addItem("RN");
			cbuf.addItem("RS");		cbuf.addItem("RO");
			cbuf.addItem("RR");		cbuf.addItem("SC");
			cbuf.addItem("SP");		cbuf.addItem("SE");
			cbuf.addItem("TO");		
			
			paine.add(cep);
			cep.setBounds(20, 330, 30, 30);
			paine.add(cepp);
			try {
				mascep = new MaskFormatter(" ##### - ###");
				cepp = new JFormattedTextField(mascep);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
			paine.add(cepp);
			cepp.setBounds(70, 330, 100, 30);
			
			paine.add(pais);
			pais.setBounds(250, 330, 45, 30);
			paine.add(pa);
			pa.setBounds(285, 330, 150, 30);
			
			paine.add(sex);			
			sex.setBounds(20, 370, 55, 30);
			grupo.add(rbdsexo[0]); 
			grupo.add(rbdsexo[1]);
			paine.add(rbdsexo[0]); 
			rbdsexo[0].setBounds(60, 370, 90, 30);
			rbdsexo[0].setBackground(Color.ORANGE);
			rbdsexo[0].setSelected(true);
			paine.add(rbdsexo[1]);
			rbdsexo[1].setBounds(170, 370, 100, 30);
			rbdsexo[1].setBackground(Color.ORANGE);

			paine.add(dtnasc);
			dtnasc.setBounds(380, 370, 150, 30);
			paine.add(nasc);
			try {
				masnasc = new MaskFormatter("## / ## / ####");
				nasc = new JFormattedTextField(masnasc);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			paine.add(nasc);
			nasc.setBounds(500, 370, 130, 30);
			
			
			paine.add(esc);
			esc.setBounds(20, 400, 130, 30);
			gp.add(rbdesc[0]);				gp.add(rbdesc[4]);
			gp.add(rbdesc[1]);				gp.add(rbdesc[5]);
			gp.add(rbdesc[2]);				gp.add(rbdesc[6]);
			gp.add(rbdesc[3]);
			paine.add(rbdesc[0]);
			rbdesc[0].setBounds(20, 420, 150, 30);
			rbdesc[0].setBackground(Color.ORANGE);
			paine.add(rbdesc[1]);
			rbdesc[1].setBounds(20, 440, 150, 30);
			rbdesc[1].setBackground(Color.ORANGE);
			paine.add(rbdesc[2]);
			rbdesc[2].setBounds(20, 460, 150, 30);
			rbdesc[2].setBackground(Color.ORANGE);
			paine.add(rbdesc[3]);
			rbdesc[3].setBounds(200, 420, 150, 30);
			rbdesc[3].setBackground(Color.ORANGE);
			paine.add(rbdesc[4]);
			rbdesc[4].setBounds(200, 440, 150, 30);
			rbdesc[4].setBackground(Color.ORANGE);
			paine.add(rbdesc[5]);
			rbdesc[5].setBounds(200, 460, 150, 30);
			rbdesc[5].setBackground(Color.ORANGE);
			paine.add(rbdesc[6]);
			rbdesc[6].setBounds(350, 420, 160, 30);
			rbdesc[6].setBackground(Color.ORANGE);
			
			paine.add(prof);
			prof.setBounds(20, 490, 230, 30);
			gprof.add(rdpro[0]);						gprof.add(rdpro[7]);				gprof.add(rdpro[14]);
			gprof.add(rdpro[1]);						gprof.add(rdpro[8]);				gprof.add(rdpro[15]);
			gprof.add(rdpro[2]);						gprof.add(rdpro[9]);	
			gprof.add(rdpro[3]);						gprof.add(rdpro[10]);
			gprof.add(rdpro[4]);						gprof.add(rdpro[11]);
			gprof.add(rdpro[5]);						gprof.add(rdpro[12]);
			gprof.add(rdpro[6]);						gprof.add(rdpro[13]);
			paine.add(rdpro[0]);
			rdpro[0].setBounds(20, 520, 170, 30);
			rdpro[0].setBackground(Color.ORANGE);
			paine.add(rdpro[1]);
			rdpro[1].setBounds(20, 540, 170, 30);
			rdpro[1].setBackground(Color.ORANGE);
			paine.add(rdpro[2]);
			rdpro[2].setBounds(20, 560, 170, 30);
			rdpro[2].setBackground(Color.ORANGE);
			paine.add(rdpro[3]);
			rdpro[3].setBounds(20, 580, 190, 30);
			rdpro[3].setBackground(Color.ORANGE);
			paine.add(rdpro[4]);
			rdpro[4].setBounds(20, 600, 190, 30);
			rdpro[4].setBackground(Color.ORANGE);
			paine.add(rdpro[5]);
			rdpro[5].setBounds(230, 520, 190, 30);
			rdpro[5].setBackground(Color.ORANGE);
			paine.add(rdpro[6]);
			rdpro[6].setBounds(230, 540, 170, 30);
			rdpro[6].setBackground(Color.ORANGE);
			paine.add(rdpro[8]);
			rdpro[8].setBounds(230, 560, 190, 30);
			rdpro[8].setBackground(Color.ORANGE);
			paine.add(rdpro[9]);
			rdpro[9].setBounds(230, 580, 190, 30);
			rdpro[9].setBackground(Color.ORANGE);
			paine.add(rdpro[10]);
			rdpro[10].setBounds(230, 600, 190, 30);
			rdpro[10].setBackground(Color.ORANGE);
			paine.add(rdpro[11]);
			rdpro[11].setBounds(430, 520, 190, 30);
			rdpro[11].setBackground(Color.ORANGE);
			paine.add(rdpro[12]);
			rdpro[12].setBounds(430, 540, 190, 30);
			rdpro[12].setBackground(Color.ORANGE);
			paine.add(rdpro[13]);
			rdpro[13].setBounds(430, 560, 190, 30);
			rdpro[13].setBackground(Color.ORANGE);
			paine.add(rdpro[14]);
			rdpro[14].setBounds(430, 580, 200, 30);
			rdpro[14].setBackground(Color.ORANGE);
			paine.add(rdpro[15]);
			rdpro[15].setBounds(430, 600, 190, 30);
			rdpro[15].setBackground(Color.ORANGE);
			
			paine.add(tel);
			tel.setBounds(20, 640, 70, 30);
			paine.add(tel2);
			try {
				masctel = new MaskFormatter("( ## ) #### - ####");
				tel2 = new JFormattedTextField(masctel);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			paine.add(tel2);
			tel2.setBounds(90, 640, 120, 30);
			
			paine.add(btn);
			btn.setBounds(620, 640, 85, 40);
			
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(800, 1000);
		this.setJMenuBar(getJMenuBar( ));
		this.getContentPane().setBackground(Color.ORANGE);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		}
	}
		
	public static void main(String[] args) {
			new Tela(); 
	}

}
