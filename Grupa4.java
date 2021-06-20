package new_load;


import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.print.attribute.AttributeSet;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import com.toedter.calendar.JDateChooser;

public class Grupa4 {

	  private JFrame frame;
	  private JButton adminButton;
	  private JButton userButton;
	  private JFrame frame_left;
	  private JFrame frame_right;
	  private JButton button_back1;
	  private JButton button_back2;
	  private JPasswordField password_field;
	  private JTextField text_field_username = new JTextField();
	  private JLabel [] new_label_array = new JLabel[2];
	  private static int velocity_x = 0;
	  private static int velocity_y = 0;
	  private JCheckBox check_box_password;
	  private JButton login_button;
	  private JButton reset_button;
	  private JLabel image_label;
	  private String zile = "";
	  private JCheckBox discount1;
	  private JCheckBox discount2;
	  private JFrame frame_display;
	  private static final int len = 15;
	  private JLabel image_label_plane;
	  private JButton button_back_admin;
	  private JRadioButton tur;
	  private JRadioButton retur;
	  private static int count_vertices = 0;
	  private static int count_edges = 0;
	  private Statement sql;
	  private ResultSet rs;
	  private Connection con;
	  
	  private JLabel [] label_array_row_up = new JLabel[120];
	  private JLabel [] label_array_row_down = new JLabel[120];
	  private JLabel [] label_array_column_left = new JLabel[140/2];
	  private JLabel [] label_array_column_right = new JLabel[140/2];
	  static int var = 0;
	  
	  private JLabel image_label2;
	  private JDateChooser dateChooser2;
	  private JLabel label_destination;
	  private JTextField text_field_source;
	  private JTextField text_field_destionation;
	  private JLabel label_timp_sosire;
	  private JLabel label_timp_destinatie;
	  private JDateChooser dateChooser;
	  private JLabel label_source;
	  private JLabel label_categories;
	  private JLabel label_company;
	  private  JTextField textField_company;
	  private JButton button_delete_from_database;
	  
	  private static boolean happened = false;
	  
	  private String [][] matrix_locations = new String [len][len];
	  private String [] array_locations = new String [len];
	  
	  private JLabel label_codCursa;
	  private JTextField text_field_codCursa;
	  private JLabel label_tipAvion;
	  private JTextField text_field_tipAvion;
	  private JLabel label_numarLocuri;
	  private JTextField text_field_numarLocuri;
	  private JLabel label_preturiAfterente;
	  private JTextField text_field_preturiAfterente;
	  private JLabel label_traseu_complet;
	  private JTextField text_field_traseu;
	  private JLabel label_oraPlecare;
	  private JLabel label_oraSosire;
	  private JTextField text_field_orePlecare;
	  private JTextField text_field_oreSosire;
	  private JCheckBox checkbox_luni;
	  private JCheckBox checkbox_marti;
	  private JCheckBox checkbox_miercuri;
	  private JCheckBox checkbox_joi;
	  private JCheckBox checkbox_vineri; 
	  private JCheckBox checkbox_sambata;
	  private JCheckBox checkbox_duminica;
	  private JButton button_add_to_database;
	  private JLabel jbutton_adulti;
	  private JLabel jbutton_copii;
	  private JLabel jbutton_infanti;
	  private ButtonGroup group_checkBoxes;
	  private JCheckBox check_economic;
	  private JCheckBox check_buisness;
	  private JButton add_flight;
	  private JLabel time_plecare;
	  private JLabel time_destinatie;
	  private JTextField text_time_plecare;
	  private JTextField text_time_sosire;
	  private JTextField textField_adulti;
	  private JTextField textField_copii;
	  private JTextField textField_infanti;
	  private JLabel label_return;
	  private JTextField textField_return;
	  private JButton button_reset;
	  
	  private DefaultTableModel new_TabelModel;
	  private String[] table_array;
	  private JScrollPane scrollPane;
	  private JTable tabel;
	  private JLabel label_text_up;
	  
	  private JFrame frame_formular;
	  private JFrame frame_info_flight;
	  
	  private static int code_zbor = -1;
	  private JLabel info_label;
	  private JButton button_click_tabel;
	  
	  private static boolean found_var = false;
	  private static int global_count = 0;
	  
	  private JLabel label_photo;
	  private ImageIcon image_main_frame;
	  private static String path = "-1";
	  private static int count_adulti = 0;
	  private static int count_copii = 0; 
	  private static int count_infainti = 0;
	  private static String convert_final_price;
	  private static float price_ = 0;
	  
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grupa4 window = new Grupa4();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Grupa4() throws SQLException {
		initialize();
	}
	
	
	protected class Passagers {
		private String name;
		private String surename;
		private String address;
		private int age;
		private String email;
		private String phone;
		public Passagers(String name, String surename, String address, int age, String email, String phone) {
			this.name = name;
			this.surename = surename;
			this.address = address;
			this.age = age;
			this.email = email;
			this.phone = phone;
		}
		public String getName() {
			return name;
		}
		public String getSurename() {
			return surename;
		}
		public String getAddress() {
			return address;
		}
		public int getAge() {
			return age;
		}
		public String getEmail() {
			return email;
		}
		public String getPhone() {
			return phone;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSurename(String surename) {
			this.surename = surename;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
	}
	@SuppressWarnings("hiding")
	protected class Flight {
		private ArrayList <String> company;
		private int number_flight;
		private String status_flight;
		private ArrayList <Passagers> passagers;
		public Flight(String status_flight, int number_flight) {
			company = new ArrayList<String>();
			this.status_flight = status_flight;
			this.number_flight = number_flight;
			passagers = new ArrayList<Passagers>();
		}
		public Flight() {
			company = new ArrayList<String>();
			passagers = new ArrayList<Passagers>();
		}
		public int getFlight() {
			return number_flight;
		}
		public void add_company(String flight) {
			company.add(flight);
		}
		public void add_passagers(Passagers passager) {
			passagers.add(passager);
		}
		public String getStatus_flight() {
			return status_flight;
		}
		public String get(int i) {
			return company.get(i);
		}
		public void setFlight(int number_flight) {
			this.number_flight = number_flight;
		}
		public void setStatus(String status_flight) {
			this.status_flight = status_flight;
		}
		public int size_company () {
			return company.size();
		}
		public int size_passagers() {
			return passagers.size();
		}
	}
	protected class Bank {
		private String name; 
		private String address;
		private String IBAN;
		private String PIN;
		private int cash;
		public Bank(String name, String address, String IBAN, String PIN, int cash) {
			this.name = name;
			this.address = address;
			this.IBAN = IBAN;
			this.PIN = PIN;
			this.cash = cash;
		}
		public String getName() {
			return name;
		}
		public String getAddress() {
			return address;
		}
		public String getIBAN() {
			return IBAN;
		}
		public String getPIN() {
			return PIN;
		}
		public int getCash() {
			return cash;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void setIBAN(String IBAN) {
			this.IBAN = IBAN;
		}
		public void setPIN(String PIN) {
			this.PIN = PIN;
		}
		public void setCash(int cash) {
			this.cash = cash;
		}
	}
	
	 //For the locations between the nodes in the database system
	protected class Graph_locations {
		public Graph_locations() {
			super();
		}
		public void init() {
			Arrays.fill(array_locations, "-1");
			int len = matrix_locations.length;
			for(int i=0;i<len;++i) {
				for(int j=0;j<len;++j) {
					matrix_locations[i][j] = "0";
				}
			}
		}
		public boolean check_full() {
			int length = array_locations.length;
			if(count_vertices == length) {
				return true; 
			} if(count_edges == (length*length)) {
				return true;
			}
			return false;
		}
		public void add_locations(String vertex) {
			for(int i=0;i<len;++i) { 
				if(vertex == array_locations[i]) {
					JOptionPane.showMessageDialog(null, "Found a duplicate in the array!","ERROR 404", JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
			array_locations[count_vertices] = vertex;
			count_vertices += 1;
		}
		public void add_link_and_weight(String vertexA, String vertexB, boolean choice) {
			int position_vertexA = -1;
			int position_vertexB = -1;
			boolean flag1 = false;
			boolean flag2 = false;
			
			for(int i=0;i<count_vertices;++i) { 
				if(array_locations[i] == vertexA) {
					position_vertexA = i;
					flag1 = true;
					break;
				}
				continue;
			}
			for(int i=0;i<count_vertices;++i) {
				if(array_locations[i] == vertexB) {
					position_vertexB = i;
					flag2 = true;
					break;
				}
				continue;
			}
			if((flag1 == false || flag2 == false) || (flag1 == false && flag2 == false)) {
				JOptionPane.showMessageDialog(null, "No bueno (1)!","ERROR 404", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if((position_vertexA == -1 || position_vertexB == -1) && (position_vertexA == -1 && position_vertexB == -1)) {
				JOptionPane.showMessageDialog(null, "No bueno (2)!","ERROR 404", JOptionPane.ERROR_MESSAGE);
				return;
			} else if(position_vertexA != -1 && position_vertexB != -1 && choice == true) {
				matrix_locations[position_vertexA][position_vertexB] = vertexA +"-"+ vertexB;
				matrix_locations[position_vertexB][position_vertexA] = vertexB +"-"+ vertexA;
				count_edges += 2;
			} else if(position_vertexA != -1 && position_vertexB != -1 && choice == false) {
				matrix_locations[position_vertexA][position_vertexB] = vertexA +"-"+ vertexB;
				count_edges += 1;
			} 
		}
	}
	

	protected class SLEEP {
		int miliseconds = 0;
		public SLEEP(int miliseconds) {
			super();
			this.miliseconds = miliseconds;
		}
		public void sleep() {
			try {
				Thread.sleep(miliseconds);
			} catch(Exception new_exception) {
				JOptionPane.showMessageDialog(null, "Some error occured","ERROR 404", JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
	}
	
	public void INIT_LABELS_AND_TEXT_FIELDS() throws SQLException {
		label_codCursa = new JLabel("Cod Zbor");
		text_field_codCursa = new JTextField();
		
		label_tipAvion = new JLabel("Tip Avion");
		text_field_tipAvion = new JTextField();
		
		label_numarLocuri = new JLabel("Numar Locuri");
		text_field_numarLocuri = new JTextField();
		
		label_preturiAfterente = new JLabel("Preturi Aferente");
		text_field_preturiAfterente = new JTextField();
		
		label_traseu_complet = new JLabel("Traseu Complet");
		text_field_traseu = new JTextField();
		
		label_oraPlecare = new JLabel("Ora plecare");
		label_oraSosire = new JLabel("Ora sosire");
		
		text_field_orePlecare = new JTextField();
		text_field_oreSosire = new JTextField();
		
	    checkbox_luni = new JCheckBox("Luni", false);  
	    checkbox_marti = new JCheckBox("Marti", false);  
	    checkbox_miercuri = new JCheckBox("Miercuri", false);  
	    checkbox_joi = new JCheckBox("Joi", false);  
	    checkbox_vineri = new JCheckBox("Vineri", false);  
	    checkbox_sambata = new JCheckBox("Sambata", false);  
	    checkbox_duminica = new JCheckBox("Duminica", false);  
	    
	    button_add_to_database = new JButton("Adauga in baza de date");
	    button_add_to_database.setBorderPainted(false);
	    button_add_to_database.setOpaque(true);
	    button_add_to_database.setBackground(new Color(59, 89, 182));
	    button_add_to_database.setForeground(Color.WHITE);
	    button_add_to_database.setFocusPainted(false);
	    
	    button_delete_from_database = new JButton("Sterge din baza de date");
	    button_delete_from_database.setBorderPainted(false);
	    button_delete_from_database.setOpaque(true);
	    button_delete_from_database.setBackground(new Color(59, 89, 182));
	    button_delete_from_database.setForeground(Color.WHITE);
	    button_delete_from_database.setFocusPainted(false);
	   
	    discount1 = new JCheckBox("Discount 1");
	    discount2 = new JCheckBox("Discount 2");
	    
	    discount1.setBounds(200,5,120,20);
	    discount1.setForeground(Color.blue);
	    discount1.setFocusable(false);
	    frame_display.getContentPane().add(discount1);
	    
	    discount2.setBounds(200,35,120,20);
	    discount2.setForeground(Color.blue);
	    discount2.setFocusable(false);
	    frame_display.getContentPane().add(discount2);
	  
	    
	    label_codCursa.setBounds(5,5,120,20);
	    label_codCursa.setForeground(Color.blue);
	    frame_display.getContentPane().add(label_codCursa);
	    text_field_codCursa.setBounds(100,5,60,20);
	    frame_display.getContentPane().add(text_field_codCursa);
	    
	    label_tipAvion.setBounds(5,30,120,20);
	    label_tipAvion.setForeground(Color.blue);
	    frame_display.getContentPane().add(label_tipAvion);
	    text_field_tipAvion.setBounds(100,30,60,20);
	    frame_display.getContentPane().add(text_field_tipAvion);
	    
	    label_numarLocuri.setBounds(5,55,120,20);
	    label_numarLocuri.setForeground(Color.blue);
	    frame_display.getContentPane().add(label_numarLocuri);
	    text_field_numarLocuri.setBounds(100,55,60,20);
	    frame_display.getContentPane().add(text_field_numarLocuri);
	    
	    label_preturiAfterente.setBounds(5,80,120,20);
	    label_preturiAfterente.setForeground(Color.blue);
	    frame_display.getContentPane().add(label_preturiAfterente);
	    text_field_preturiAfterente.setBounds(100,80,60,20);
	    frame_display.getContentPane().add(text_field_preturiAfterente);
	    
	    label_traseu_complet.setBounds(5,130,120,20);
	    label_traseu_complet.setForeground(Color.blue);
	    frame_display.getContentPane().add(label_traseu_complet);
	    text_field_traseu.setBounds(100,130,120,20);
	    frame_display.getContentPane().add(text_field_traseu);
	    

	    label_oraPlecare.setBounds(5,180-3,100,20);
	    label_oraPlecare.setForeground(Color.blue);
	    frame_display.getContentPane().add(label_oraPlecare);
	    text_field_orePlecare.setBounds(100,180,100,20);
	    frame_display.getContentPane().add(text_field_orePlecare);
	    
	    label_oraSosire.setBounds(5,230-3,100,20);
	    label_oraSosire.setForeground(Color.blue);
	    frame_display.getContentPane().add(label_oraSosire);
	    text_field_oreSosire.setBounds(100,230,100,20);
	    frame_display.getContentPane().add(text_field_oreSosire);
	    
	    label_company = new JLabel("Compania? ");
	    textField_company = new JTextField();
	    label_company.setFont(new Font("Tahoma", Font.BOLD, 20));
	    label_company.setBounds(350-5,20,150,30);
	    textField_company.setBounds(350,60,100,20);
	    frame_display.getContentPane().add(label_company);
	    frame_display.getContentPane().add(textField_company);
	    
	    label_company.setForeground(Color.blue);
	    frame_display.getContentPane().add(label_oraPlecare);
	    
	    tur = new JRadioButton("tur");
	    tur.setBounds(15, 120+180-15, 90,25);
	    tur.setForeground(Color.blue);
	    tur.setFocusable(false);
	    frame_display.getContentPane().add(tur);
	    
	    retur = new JRadioButton("retur");
	    retur.setBounds(15,120+20+180, 90,25);
	    retur.setForeground(Color.blue);
	    retur.setFocusable(false);
	    frame_display.getContentPane().add(retur);
	    
	    ButtonGroup group = new ButtonGroup();
	    group.add(tur);
	    group.add(retur);

	    checkbox_luni.setBounds(5+70+50-55,120+60+60+60+60,75,25);
	    checkbox_luni.setForeground(Color.blue);
	    checkbox_marti.setBounds(95+70+50-55,120+60+60+60+60,75,25);
	    checkbox_marti.setForeground(Color.blue);
	    checkbox_miercuri.setBounds(5+70+50-55,170+60+60+60+60,75,25);
	    checkbox_miercuri.setForeground(Color.blue);
	    checkbox_joi.setBounds(95+70+50-55,170+60+60+60+60,75,25);
	    checkbox_joi.setForeground(Color.blue);
	    checkbox_vineri.setBounds(5+70+50-55,220+60+60+60+60,75,25);
	    checkbox_vineri.setForeground(Color.blue);
	    checkbox_sambata.setBounds(95+70+50-55,220+60+60+60+60,75,25);
	    checkbox_sambata.setForeground(Color.blue);
	    checkbox_duminica.setBounds(5+70+50-55,270+60+60+60+60,75+20,25);
	    checkbox_duminica.setForeground(Color.blue);
	    
	    checkbox_luni.setFocusable(false);
	    checkbox_marti.setFocusable(false);
	    checkbox_miercuri.setFocusable(false);
	    checkbox_joi.setFocusable(false);
	    checkbox_vineri.setFocusable(false);
	    checkbox_sambata.setFocusable(false);
	    checkbox_duminica.setFocusable(false);
	    
	    frame_display.getContentPane().add(checkbox_luni);
	    frame_display.getContentPane().add(checkbox_marti);
	    frame_display.getContentPane().add(checkbox_miercuri);
	    frame_display.getContentPane().add(checkbox_joi);
	    frame_display.getContentPane().add(checkbox_vineri);
	    frame_display.getContentPane().add(checkbox_sambata);
	    frame_display.getContentPane().add(checkbox_duminica);
	    
	    button_add_to_database.setBounds(800/2-90,600-100-20, 160+50,60+30);
	    button_add_to_database.setFont(new Font("Tahoma", Font.BOLD, 14));
	    frame_display.getContentPane().add(button_add_to_database);
	    button_add_to_database.setFocusable(false);
	    
	    button_delete_from_database.setBounds(800/2-90,600-100-20-70, 160+50,60+30);
	    button_delete_from_database.setFont(new Font("Tahoma", Font.BOLD, 14));
	    frame_display.getContentPane().add(button_delete_from_database);
	    button_delete_from_database.setFocusable(false);
	    
	    ImageIcon imageIcon_plane = new ImageIcon("plane_gif.gif");
		image_label_plane = new JLabel(imageIcon_plane);
		image_label_plane.setBounds(220, 10, 900, 220);
		frame_display.getContentPane().add(image_label_plane);
	
		
		button_delete_from_database.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
		        String string_codZbor = text_field_codCursa.getText();
		        
	    		int int_codZbor = Integer.parseInt(string_codZbor);
	    		String string_tipAvion = text_field_tipAvion.getText();
	    		
	    		String string_numarLocuri = text_field_numarLocuri.getText();
	    		int int_numarLocuri = Integer.parseInt(string_numarLocuri);
	    		
	    		String string_preturi_aferente = text_field_preturiAfterente.getText();
	    		float int_preturi_Aferente = Float.parseFloat(string_preturi_aferente);
	    		
	    		String string_traseu_complet = text_field_traseu.getText();
	    		
	    		String string_ore_plecare = text_field_orePlecare.getText();
	    		
	    		String string_ore_Sosire = text_field_oreSosire.getText();
	    		
	    		String string_tur_or_retur = tur.getText();
	    		String string_tur_or_retur2 = retur.getText();
	    		
	    		String string_company = textField_company.getText();
	    		
	    		if (checkbox_luni.isSelected()) {
	    			zile += checkbox_luni.getText() + ", ";
	    		}
	    		if (checkbox_marti.isSelected()) {
	    			zile += checkbox_marti.getText() + ", ";
	    		}
	    		if (checkbox_miercuri.isSelected()) {
	    			zile += checkbox_miercuri.getText() + ", ";
	    		}
	    		if (checkbox_joi.isSelected()) {
	    			zile += checkbox_joi.getText() + ", ";
	    		}
	    		if (checkbox_vineri.isSelected()) {
	    			zile += checkbox_vineri.getText() + ", ";
	    		}
	    		if (checkbox_sambata.isSelected()) {
	    			zile += checkbox_sambata.getText() + ", ";
	    		}
	    		if (checkbox_duminica.isSelected())  {
	    			zile += checkbox_duminica.getText()+ ", ";
	    		}
	    		zile = zile.substring(0, zile.length() - 2);
	    		
	   
	    		boolean flag = false;
	    		try {
	    			rs.first();
		    		rs.previous();
		    		while(rs.next() == true) {
		    			int cod_zbor =rs.getInt("cod_zbor");
		    			String companie =rs.getString("companie");
		    			String tip_avion =rs.getString("tip_avion");
		    			int numar_locuri =rs.getInt("numar_locuri");
		    			float preturi_aferente =rs.getInt("preturi_aferente");
		    			String traseu_complet =rs.getString("traseu_complet");
		    			String ora_plecare = rs.getString("ora_plecare");
		    			String ora_sosire = rs.getString("ora_sosire");
		    			String tur_or_retur = rs.getString("tur/retur");
		    			String zile_zbor = rs.getString("zile_zbor");
		    			
		    			if(int_codZbor == cod_zbor && companie.equals(string_company) && tip_avion.equals(string_tipAvion) && numar_locuri == int_numarLocuri
		    			&& preturi_aferente == int_preturi_Aferente && traseu_complet.equals(string_traseu_complet) && ora_plecare.equals(string_ore_plecare)
		    			&& ora_sosire.equals(string_ore_Sosire) && zile_zbor.equals(zile)) {
		    				flag = true;
							String query = "DELETE FROM admin WHERE cod_zbor = "+int_codZbor;
							PreparedStatement preparedStmt = con.prepareStatement(query);
							preparedStmt.execute();
							text_field_codCursa.setText("");
							text_field_tipAvion.setText("");
							text_field_numarLocuri.setText("");
							text_field_preturiAfterente.setText("");
							text_field_traseu.setText("");
							text_field_orePlecare.setText("");
							text_field_oreSosire.setText("");
							textField_company.setText("");
							checkbox_luni.setSelected(false);
							checkbox_marti.setSelected(false);
							checkbox_miercuri.setSelected(false);
							checkbox_joi.setSelected(false);
							checkbox_vineri.setSelected(false);
							checkbox_sambata.setSelected(false);
							checkbox_duminica.setSelected(false);
							tur.setSelected(false);
							retur.setSelected(false);
							discount1.setSelected(false);
							discount2.setSelected(false);
							JOptionPane.showMessageDialog(null, "Am sters cu success din baza de date","Succes", JOptionPane.NO_OPTION);
							break;
		    			}
		    		}
		    		if(flag == false) {
		    			JOptionPane.showMessageDialog(null, "Nu am putut sa stergem din baza de date","Succes", JOptionPane.NO_OPTION);
		    			text_field_codCursa.setText("");
						text_field_tipAvion.setText("");
						text_field_numarLocuri.setText("");
						text_field_preturiAfterente.setText("");
						text_field_traseu.setText("");
						text_field_orePlecare.setText("");
						text_field_oreSosire.setText("");
						textField_company.setText("");
						checkbox_luni.setSelected(false);
						checkbox_marti.setSelected(false);
						checkbox_miercuri.setSelected(false);
						checkbox_joi.setSelected(false);
						checkbox_vineri.setSelected(false);
						checkbox_sambata.setSelected(false);
						checkbox_duminica.setSelected(false);
						tur.setSelected(false);
						retur.setSelected(false);
						discount1.setSelected(false);
						discount2.setSelected(false);
		    		}
		    		rs.first();
		    		rs.previous();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
	    //ADD IN DATABASE BUTTON
	    button_add_to_database.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent event) {
	    		try {
					rs.moveToInsertRow();
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    		String string_codZbor = text_field_codCursa.getText();
	    		int int_codZbor = Integer.parseInt(string_codZbor);
	    		
	    		String string_tipAvion = text_field_tipAvion.getText();
	    		
	    		String string_numarLocuri = text_field_numarLocuri.getText();
	    		int int_age = Integer.parseInt(string_numarLocuri);
	    		
	    		String string_preturi_aferente = text_field_preturiAfterente.getText();
	    		float int_preturi_Aferente = Float.parseFloat(string_preturi_aferente);
	    		
	    		String string_traseu_complet = text_field_traseu.getText();
	    		
	    		String string_ore_plecare = text_field_orePlecare.getText();
	    		
	    		String string_ore_Sosire = text_field_oreSosire.getText();
	    		
	    		String string_tur = tur.getText();
	    		
	    		String string_retur = retur.getText();
	    		
	    		String string_company = textField_company.getText();
	    		
	    		if (checkbox_luni.isSelected()) {
	    			zile += checkbox_luni.getText() + ", ";
	    		}
	    		if (checkbox_marti.isSelected()) {
	    			zile += checkbox_marti.getText() + ", ";
	    		}
	    		if (checkbox_miercuri.isSelected()) {
	    			zile += checkbox_miercuri.getText() + ", ";
	    		}
	    		if (checkbox_joi.isSelected()) {
	    			zile += checkbox_joi.getText() + ", ";
	    		}
	    		if (checkbox_vineri.isSelected()) {
	    			zile += checkbox_vineri.getText() + ", ";
	    		}
	    		if (checkbox_sambata.isSelected()) {
	    			zile += checkbox_sambata.getText() + ", ";
	    		}
	    		if (checkbox_duminica.isSelected())  {
	    			zile += checkbox_duminica.getText()+ ", ";
	    		}
	    		zile = zile.substring(0, zile.length() - 2);
	    		
	    		Graph_locations graph = new Graph_locations();
	    		graph.init();
	    		if(graph.check_full() == true) {
	    			JOptionPane.showMessageDialog(null, "Graph full","Fail", JOptionPane.NO_OPTION);
	    		}
	    		String [] token_splitter;
	    		String source = "NONE", intermediar = "NONE", destination = "NONE";
	    		try {
	    			
	    			if(tur.isSelected() == true) {
	    				rs.updateInt("cod_zbor", int_codZbor);
	    				rs.updateString("companie", string_company);
	    				rs.updateString("tip_avion", string_tipAvion);
	    				rs.updateInt("numar_locuri", int_age);
	    				rs.updateFloat("preturi_aferente", int_preturi_Aferente);
	    				rs.updateString("traseu_complet", string_traseu_complet);
	    				rs.updateString("ora_plecare", string_ore_plecare);
	    				rs.updateString("ora_sosire", string_ore_Sosire);
		    			rs.updateString("tur/retur", string_tur);
		    			rs.updateString("zile_zbor", zile);
		    			zile = "";
		    			rs.insertRow();
		    			boolean choice = false;
		    			int count_freq = 0;
		    			token_splitter = string_traseu_complet.split("-");
		    			
		    			for(int i=0;i<string_traseu_complet.length();++i) {
		    				if(string_traseu_complet.charAt(i) == '-') {
		    					count_freq += 1;
		    				}
		    			}
		    	
		    			source = token_splitter[0];
		    			intermediar = token_splitter[1];
		    			if(count_freq != 2) {
		    				for(int i=0;i<count_freq+1;++i) {
		    					if(i == 0) {
		    						graph.add_locations(source);
		    					} else if(i == 1) {
		    						graph.add_locations(intermediar);
		    					}
		    				}
		    			}
		    			
		    			if(count_freq == 2) {
		    				destination = token_splitter[2];
		    				for(int i=0;i<count_freq+1;++i) {
		    					if(i == 0) {
		    						graph.add_locations(source);
		    					} else if(i == 1) {
		    						graph.add_locations(intermediar);
		    					} else if(i == 2) {
		    						graph.add_locations(destination);
		    					}
		    				}
		    			}
		    			//find lenght of the flight
		    			if(destination.equals("NONE") && (!source.equals("NONE") || (!intermediar.equals("NONE")))) {
		    				graph.add_link_and_weight(source, intermediar, choice);
		    			} else if(!destination.equals("NONE") && (!source.equals("NONE") || (!intermediar.equals("NONE")))) {
		    				graph.add_link_and_weight(source, destination, choice);
		    			} else {
		    				return;
		    			}
		    			text_field_codCursa.setText("");
						text_field_tipAvion.setText("");
						text_field_numarLocuri.setText("");
						text_field_preturiAfterente.setText("");
						text_field_traseu.setText("");
						text_field_orePlecare.setText("");
						text_field_oreSosire.setText("");
						textField_company.setText("");
						checkbox_luni.setSelected(false);
						checkbox_marti.setSelected(false);
						checkbox_miercuri.setSelected(false);
						checkbox_joi.setSelected(false);
						checkbox_vineri.setSelected(false);
						checkbox_sambata.setSelected(false);
						checkbox_duminica.setSelected(false);
						tur.setSelected(false);
						retur.setSelected(false);
						discount1.setSelected(false);
						discount2.setSelected(false);
						JOptionPane.showMessageDialog(null, "Inserat cu succes","Succes", JOptionPane.NO_OPTION);
	    			} else if(retur.isSelected() == true) {
	    				rs.updateInt("cod_zbor", int_codZbor);
	    				rs.updateString("companie", string_company);
	    				rs.updateString("tip_avion", string_tipAvion);
	    				rs.updateInt("numar_locuri", int_age);
	    				rs.updateFloat("preturi_aferente", int_preturi_Aferente);
	    				rs.updateString("traseu_complet", string_traseu_complet);
	    				rs.updateString("ora_plecare", string_ore_plecare);
	    				rs.updateString("ora_sosire", string_ore_Sosire);
		    			rs.updateString("tur/retur", string_retur);
		    			rs.updateString("zile_zbor", zile);
		    			zile = "";
		    			rs.insertRow();
		    			boolean choice = true;
		    			int count_freq = 0;
		    			token_splitter = string_traseu_complet.split("-");
		    			
		    			for(int i=0;i<string_traseu_complet.length();++i) {
		    				if(string_traseu_complet.charAt(i) == '-') {
		    					count_freq += 1;
		    				}
		    			}
		    			
		    			source = token_splitter[0];
		    			intermediar = token_splitter[1];
		    			if(count_freq != 2) {
		    				for(int i=0;i<count_freq+1;++i) {
		    					if(i == 0) {
		    						graph.add_locations(source);
		    					} else if(i == 1) {
		    						graph.add_locations(intermediar);
		    					}
		    				}
		    			}
		    			
		    			if(count_freq == 2) {
		    				destination = token_splitter[2];
		    				for(int i=0;i<count_freq+1;++i) {
		    					if(i == 0) {
		    						graph.add_locations(source);
		    					} else if(i == 1) {
		    						graph.add_locations(intermediar);
		    					} else if(i == 2) {
		    						graph.add_locations(destination);
		    					}
		    				}
		    			}
		    			
		    			//find lenght of the flight
		    			if(destination.equals("NONE") && (!source.equals("NONE") || (!intermediar.equals("NONE")))) {
		    				graph.add_link_and_weight(source, intermediar, choice);
		    			} else if(!destination.equals("NONE") && (!source.equals("NONE") || (!intermediar.equals("NONE")))) {
		    				graph.add_link_and_weight(source, destination, choice);
		    			} else {
		    				return;
		    			}
		    			text_field_codCursa.setText("");
						text_field_tipAvion.setText("");
						text_field_numarLocuri.setText("");
						text_field_preturiAfterente.setText("");
						text_field_traseu.setText("");
						text_field_orePlecare.setText("");
						text_field_oreSosire.setText("");
						textField_company.setText("");
						checkbox_luni.setSelected(false);
						checkbox_marti.setSelected(false);
						checkbox_miercuri.setSelected(false);
						checkbox_joi.setSelected(false);
						checkbox_vineri.setSelected(false);
						checkbox_sambata.setSelected(false);
						checkbox_duminica.setSelected(false);
						tur.setSelected(false);
						retur.setSelected(false);
						discount1.setSelected(false);
						discount2.setSelected(false);
						JOptionPane.showMessageDialog(null, "Inserat cu succes","Succes", JOptionPane.NO_OPTION);
	    			}
				} catch (SQLException e) {
					e.printStackTrace();
				}
	    	}
	    });
	}
	
	public void TABEL_CLIENT_2() throws SQLException {
		label_source = new JLabel("Oras Plecare");
		label_source.setFont(new Font("Verdana", Font.PLAIN, 24));
		label_source.setForeground(Color.blue);
		label_source.setBounds(100,100-50-20,150+20,38);
		frame_left.getContentPane().add(label_source);
		
		label_destination = new JLabel("Oras Sosire");
		label_destination.setFont(new Font("Verdana", Font.PLAIN, 24));
		label_destination.setForeground(Color.blue);
		label_destination.setBounds(100,140-50-20,150,38);
		frame_left.getContentPane().add(label_destination);
		
		text_field_source = new JTextField();
		text_field_source.setBounds(130+100+40,100+15-50-20,127,19);
		frame_left.getContentPane().add(text_field_source);
		
		text_field_destionation = new JTextField();
		text_field_destionation.setBounds(130+100+40,140+15-50-20,127,19);
		frame_left.getContentPane().add(text_field_destionation);
		
		label_timp_sosire = new JLabel("Data plecare");
		label_timp_sosire.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_timp_sosire.setForeground(Color.blue);
		label_timp_sosire.setBounds(130-40+15,140+15+30+10+10-50-20,170,25);
		frame_left.getContentPane().add(label_timp_sosire);
		
		label_timp_destinatie = new JLabel("Data sosire");
		label_timp_destinatie.setFont(new Font("Verdana", Font.PLAIN, 20));
		label_timp_destinatie.setForeground(Color.blue);
		label_timp_destinatie.setBounds(130+100+20+10+30+10,140+15+30+10+10-50-20,170,25);
		frame_left.getContentPane().add(label_timp_destinatie);
		
		dateChooser = new JDateChooser();
	    dateChooser.setBounds(130-30,100+15+60+80-50-20-20,127,19);
	    frame_left.add(dateChooser);
	    
	    dateChooser2 = new JDateChooser();
	    dateChooser2.setBounds(130-30+200,100+15+60+80-50-20-20,127,19);
	    frame_left.add(dateChooser2);
	    
	    time_plecare = new JLabel("Timp Plecare");
	    time_plecare.setFont(new Font("Verdana", Font.PLAIN, 16));
	    time_plecare.setForeground(Color.blue);
	    time_plecare.setBounds(130-40+15,140+15+30+10+10-50+20+50+10-20-20,170,25);
		frame_left.getContentPane().add(time_plecare);
		
		time_destinatie = new JLabel("Timp Destinatie");
		time_destinatie.setFont(new Font("Verdana", Font.PLAIN, 16));
		time_destinatie.setForeground(Color.blue);
		time_destinatie.setBounds(130-40+15+30+30+125+10,140+15+30+10+10-50+20+50+10-20-20,170,25);
		frame_left.getContentPane().add(time_destinatie);
		
		text_time_plecare = new JTextField();
		text_time_plecare.setBounds(130-40+15+30+30+125-60-80-30-15,140+15+30+10+10-50+20+50+10+15+10+10-20-20,100,20);
		frame_left.getContentPane().add(text_time_plecare);
	
		text_time_sosire = new JTextField();
		text_time_sosire.setBounds(130-40+15+30+30+125+50-30-5,140+15+30+10+10-50+20+50+10+15+10+10-20-20+1,100,20);
		frame_left.getContentPane().add(text_time_sosire);
		
		label_return = new JLabel("tur/retur? ");
		label_return.setFont(new Font("Verdana", Font.PLAIN, 12));
		label_return.setForeground(Color.blue);
		label_return.setBounds(130-40+15+30+30+125+10+170-25-20+4,140+15+30+10+10-50+20+50+10-20-20-145,170,25);
		frame_left.getContentPane().add(label_return);
		
		textField_return = new JTextField();
		textField_return.setBounds(130-40+15+30+30+125+10+170+20-25-10-20,140+15+30+10+10-50+20+50+10-20-20+20+15-145,50,20);
		frame_left.getContentPane().add(textField_return);
		
	    label_categories = new JLabel("Cateorie: ");
	    label_categories.setFont(new Font("Verdana", Font.PLAIN, 18));
	    label_categories.setForeground(Color.blue);
	    label_categories.setBounds(130+100+20+10+30+10+20-200-20,140+15+30+10+10+30-50+30+30+40+10-20-20+1,170,25);
	    frame_left.add(label_categories);
	    
	    
	    jbutton_adulti = new JLabel("Adulti");
	    jbutton_adulti.setFocusable(false);
	    jbutton_adulti.setFont(new Font("Verdana", Font.PLAIN, 12));
	    jbutton_adulti.setForeground(Color.blue);
	    jbutton_adulti.setBounds(130+100+20+10+30+10+20+30-200-20,140+15+30+10+10+30+40+30-10+40-20-20,170,25);
	    frame_left.add(jbutton_adulti);
	    
	    textField_adulti = new JTextField();
	    textField_adulti.setBounds(130+100+20+10+30+10+20+30-200-20+30+20,140+15+30+10+10+30+40+30-10+40-20-20,80,25);
	    frame_left.add(textField_adulti);
	    
	    jbutton_copii = new JLabel("Copii");
	    jbutton_copii.setFocusable(false);
	    jbutton_copii.setFont(new Font("Verdana", Font.PLAIN, 12));
	    jbutton_copii.setForeground(Color.blue);
	    jbutton_copii.setBounds(130+100+20+10+30+10+20+30-200-20,140+15+30+10+10+30+40+40+30-10+40-20-20,170,25);
	    frame_left.add(jbutton_copii);
	    
	    textField_copii = new JTextField();
	    textField_copii.setBounds(130+100+20+10+30+10+20+30-200-20+30+20,140+15+30+10+10+30+40+40+30-10+40-20-20,80,25);
	    frame_left.add(textField_copii);
	    
	    jbutton_infanti = new JLabel("Infanti");
	    jbutton_infanti.setFocusable(false);
	    jbutton_infanti.setFont(new Font("Verdana", Font.PLAIN, 12));
	    jbutton_infanti.setForeground(Color.blue);
	    jbutton_infanti.setBounds(130+100+20+10+30+10+20+30-200-20,140+15+30+10+10+30+40+40+40+30-10+40-20-20,170,25);
	    frame_left.add(jbutton_infanti);
	    
	    textField_infanti = new JTextField();
	    textField_infanti.setBounds(130+100+20+10+30+10+20+30-200-20+30+20,140+15+30+10+10+30+40+40+40+30-10+40-20-20,80,25);
	    frame_left.add(textField_infanti);
	    
	    check_economic = new JCheckBox("Economic");
	    check_economic.setFocusable(false);
	    check_economic.setFont(new Font("Verdana", Font.PLAIN, 12));
	    check_economic.setForeground(Color.blue);
	    check_economic.setBounds(130+100+40+150-55,100+15+90+90+40-20-20,127,19);
	    frame_left.add(check_economic);
	    
	    check_buisness = new JCheckBox("Business");
	    check_buisness.setFocusable(false);
	    check_buisness.setFont(new Font("Verdana", Font.PLAIN, 12));
	    check_buisness.setForeground(Color.blue);
	    check_buisness.setBounds(130+100+40+150-55,140+15+90+90+40-20-20,127,19);
	    frame_left.add(check_buisness);
	    
	    group_checkBoxes = new ButtonGroup();
	    group_checkBoxes.add(check_economic);
	    group_checkBoxes.add(check_buisness);
	    
	    add_flight = new JButton("Cauta zbor");
	    add_flight.setBounds(500,110+50,150,80);
	    add_flight.setBackground(new Color(59, 89, 182));
	    add_flight.setForeground(Color.WHITE);
	    add_flight.setFocusPainted(false);
	    add_flight.setBorderPainted(false);
	    add_flight.setOpaque(true);
	    frame_left.add(add_flight);
	    
	    SLEEP sleep = new SLEEP(1000);
	    
	    String url2 = "jdbc:mysql://localhost:3306/fis";
		con = DriverManager.getConnection (url2, "root", "root");
	    sql = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = sql.executeQuery("select * from admin");
		
		add_flight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				sleep.sleep();
				try {
					rs.moveToInsertRow();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				   String data1 =  String.valueOf(dateChooser.getDate()); 
				   String [] split_data1;
				   
				   split_data1 = data1.split(" ");
				   String string_month = split_data1[1];
				   String string_day = split_data1[2];
				   int int_month = 0;
				   int int_day = Integer.parseInt(string_day);
				   
				   if(string_month.equals("January")) {
					   int_month = 1;
				   }
				   if(string_month.equals("February")) {
					   int_month = 2;
				   }
				   if(string_month.equals("March")) {
					   int_month = 3;
				   }
				   if(string_month.equals("April")) {
					   int_month = 4;
				   }
				   if(string_month.equals("May")) {
					   int_month = 5;
				   }
				   if(string_month.equals("June")) {
					   int_month = 6;
				   }
				   if(string_month.equals("July")) {
					   int_month = 7;
				   }
				   if(string_month.equals("August")) {
					   int_month = 8;
				   }
				   if(string_month.equals("September")) {
					   int_month = 9;
				   }
				   if(string_month.equals("October")) {
					   int_month = 10;
				   }
				   if(string_month.equals("November")) {
					   int_month = 11;
				   }
				   if(string_month.equals("December")) {
					   int_month = 12;
				   }
				   
				   String data2 =  String.valueOf(dateChooser2.getDate()); 
				   String [] split_data2;
				   
				   split_data2 = data2.split(" ");
				   String string_month2 = split_data2[1];
				   String string_day2 = split_data2[2];
				   int int_month2 = 0;
				   int int_day2 = Integer.parseInt(string_day2);
				   
				   if(string_month2.equals("January")) {
					   int_month2 = 1;
				   }
				   if(string_month2.equals("February")) {
					   int_month2 = 2;
				   }
				   if(string_month2.equals("March")) {
					   int_month2 = 3;
				   }
				   if(string_month2.equals("April")) {
					   int_month2 = 4;
				   }
				   if(string_month2.equals("May")) {
					   int_month2 = 5;
				   }
				   if(string_month2.equals("June")) {
					   int_month2 = 6;
				   }
				   if(string_month2.equals("July")) {
					   int_month2 = 7;
				   }
				   if(string_month2.equals("August")) {
					   int_month2 = 8;
				   }
				   if(string_month2.equals("September")) {
					   int_month2 = 9;
				   }
				   if(string_month2.equals("October")) {
					   int_month2 = 10;
				   }
				   if(string_month2.equals("November")) {
					   int_month2 = 11;
				   }
				   if(string_month2.equals("December")) {
					   int_month2 = 12;
				   }
				   if(int_month == int_month2) {
					   if(int_day > int_day2 || int_day == int_day2) {
						   JOptionPane.showMessageDialog(null, "Error!","Error", JOptionPane.NO_OPTION);
						   return;
					   }
				   }
				   Date date = Calendar.getInstance().getTime();
				   DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				   String strDate = dateFormat.format(date);
				   String [] current_date;
				   current_date = strDate.split("/");
				   String current_day = current_date[1];
				   String current_month = current_date[0];
				   int int_current_day = Integer.parseInt(current_day);
				   int int_current_month = Integer.parseInt(current_month);
				   
				   if((int_current_day > int_day) && ((int_current_month > int_month) ||  (int_current_month == int_month))) {
					   JOptionPane.showMessageDialog(null, "Error!","Error", JOptionPane.NO_OPTION);
					   return;
				   }
				   
				   if((int_current_day > int_day2) && ((int_current_month > int_month2) ||  (int_current_month == int_month2))) {
					   JOptionPane.showMessageDialog(null, "Error!","Error", JOptionPane.NO_OPTION);
					   return;
				   }
				   
				String string_source = text_field_source.getText();
				String string_destination = text_field_destionation.getText();
				String string_text_time_plecare = text_time_plecare.getText();
				String string_text_time_sosire = text_time_sosire.getText();
				
				DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
	    		String string_data_plecare = df1.format(dateChooser.getDate());
	    		DateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
	    		String string_data_Sosire = df2.format(dateChooser2.getDate());
	    		String string_check = "";
	    		
	    		String string_retur = textField_return.getText();
	    		
	    		String string_text_field_adulti = textField_adulti.getText();
	    		String string_text_filed_copii = textField_copii.getText();
	    		String string_text_filed_infanti = textField_infanti.getText();
	    		
	    		count_adulti = Integer.parseInt(string_text_field_adulti);
	    		count_copii = Integer.parseInt(string_text_filed_copii);
	    		count_infainti = Integer.parseInt(string_text_filed_infanti);
	    		
	    		int total = count_adulti + count_copii + count_infainti;
	    		
	    		boolean bool_business = false;
	    		
	    		if(check_economic.isSelected() == false && check_buisness.isSelected() == false) {
	    			JOptionPane.showMessageDialog(null, "Eror 404!","Eror", JOptionPane.NO_OPTION);
	    			return;
	    		}
	    		
	    		if(check_economic.isSelected() == true) {
	    			string_check += "economic";
	    		} else if(check_buisness.isSelected() == true) {
	    			string_check += "buisness";
	    			bool_business = true;
	    		}
	    		String [] token_splitter;
	    		boolean flag = false;
	    		try {
					while(rs.next() == true) {
						String string_source_clone = "-1";
						String string_destination_clone = "-1";
						String string_all_routes = rs.getString("traseu_complet");
						token_splitter = string_all_routes.split("-");
						int count_split = 0;
						for(int i=0;i<string_all_routes.length();++i) {
							if(string_all_routes.charAt(i) == '-') {
								count_split += 1;
		    				}
						}
						if(count_split < 2) {
							string_source_clone = token_splitter[0];
							string_destination_clone = token_splitter[1];
						} else if(count_split == 2) {
							string_source_clone = token_splitter[0];
							string_destination_clone = token_splitter[2];
						}
						
						String string_time_plecare_clone = rs.getString("ora_plecare");
						String string_time_sosire_clone = rs.getString("ora_sosire");
						String string_categorie_clone = rs.getString("numar_locuri"); //numar locuri dorite
						int integer_categorie_clone = Integer.parseInt(string_categorie_clone);
						String string_tur_or_retur = rs.getString("tur/retur");
						
						if(string_source_clone.equals(string_source) && string_destination_clone.equals(string_destination) &&
								(total < integer_categorie_clone) && string_time_plecare_clone.equals(string_text_time_plecare) &&
								string_text_time_sosire.equals(string_time_sosire_clone) && string_retur.equals(string_tur_or_retur)) {
								flag = true;
								JOptionPane.showMessageDialog(null, "Gasit cu succes!","Succes", JOptionPane.NO_OPTION);
								
								dateChooser2.setVisible(false);
			    				label_destination.setVisible(false);
			    				label_source.setVisible(false);
			    				text_field_source.setVisible(false);
			    				text_field_destionation.setVisible(false);
			    			 	label_timp_sosire.setVisible(false);
			    			 	label_timp_destinatie.setVisible(false);
			    			 	dateChooser.setVisible(false);
			    			 	label_categories.setVisible(false);
			    			 	jbutton_adulti.setVisible(false);
			    			 	jbutton_copii.setVisible(false);
			    			 	jbutton_infanti.setVisible(false);
			    			 	check_economic.setVisible(false);
			    			 	check_buisness.setVisible(false);
			    			 	add_flight.setVisible(false);
			    			 	time_plecare.setVisible(false);
			    			 	time_destinatie.setVisible(false);
			    			 	text_time_plecare.setVisible(false);
			    			 	text_time_sosire.setVisible(false);
			    			 	label_return.setVisible(false);
			    			 	textField_return.setVisible(false);
			    			 	textField_adulti.setVisible(false);
			    				textField_copii.setVisible(false);
			    				textField_infanti.setVisible(false);
								
								button_reset = new JButton("Intoarcere");
								button_reset.setBounds(230-35,300,125,66);
								button_reset.setFocusable(false);
								button_reset.setForeground(Color.white);
								button_reset.setBorderPainted(false);
								button_reset.setOpaque(true);
								button_reset.setBackground(new Color(59, 89, 182));
								frame_left.add(button_reset);
								
								button_reset.addActionListener(new ActionListener() {
						    		public void actionPerformed(ActionEvent e) {
						    			dateChooser2.setVisible(true);
					    				label_destination.setVisible(true);
					    				label_source.setVisible(true);
					    				text_field_source.setVisible(true);
					    				text_field_destionation.setVisible(true);
					    			 	label_timp_sosire.setVisible(true);
					    			 	label_timp_destinatie.setVisible(true);
					    			 	dateChooser.setVisible(true);
					    			 	label_categories.setVisible(true);
					    			 	jbutton_adulti.setVisible(true);
					    			 	jbutton_copii.setVisible(true);
					    			 	jbutton_infanti.setVisible(true);
					    			 	check_economic.setVisible(true);
					    			 	check_buisness.setVisible(true);
					    			 	add_flight.setVisible(true);
					    			 	time_plecare.setVisible(true);
					    			 	time_destinatie.setVisible(true);
					    			 	text_time_plecare.setVisible(true);
					    			 	text_time_sosire.setVisible(true);
					    			 	label_return.setVisible(true);
					    			 	textField_return.setVisible(true);
					    			 	textField_adulti.setVisible(true);
					    				textField_copii.setVisible(true);
					    				textField_infanti.setVisible(true);
					    				button_reset.setVisible(false);
					    				scrollPane.setVisible(false);
					    				tabel.setVisible(false);
					    				label_text_up.setVisible(false);
						    		}
						    	});
								    new_TabelModel = new DefaultTableModel(0,0);
								    table_array = new String [] {"Compania", "Cod Zbor","Zile","Ore de plecare", "Ore de sosire", "Pret", "Economic/Business"};
								    new_TabelModel.setColumnIdentifiers(table_array);
									scrollPane = new JScrollPane();
									scrollPane.setBounds(38, 100, 595, 89);
									frame_left.getContentPane().add(scrollPane);
									tabel = new JTable(null,table_array);
									tabel.setBounds(0,150,500,89);
									tabel.setModel(new_TabelModel);
									scrollPane.setViewportView(tabel);
									found_var = true;
									
									label_text_up = new JLabel("Rezervari");
									label_text_up.setFont(new Font("Tahoma", Font.BOLD, 32));
									label_text_up.setForeground(Color.blue);
									label_text_up.setBounds(250,30,160,30);
									frame_left.getContentPane().add(label_text_up);
									
									String new_source = "-1";
									String new_destination = "-1";
									int new_count = 0;
									String [] new_token_splitter; 
									boolean sql_posiition = false;
									
									while(rs.next()) {
										if(sql_posiition == false) {
											rs.first();
											sql_posiition = true;
										}
										String hold_string = rs.getString("traseu_complet");
										new_token_splitter = hold_string.split("-");
										for(int i=0;i<hold_string.length();++i) {
											if(hold_string.charAt(i) == '-') {
												new_count += 1;
						    				}
										}
										if(new_count < 2) {
											new_source = new_token_splitter[0];
											new_destination = new_token_splitter[1];
										} else if(new_count == 2) {
											new_source = new_token_splitter[0];
											new_destination = new_token_splitter[2];
										}
										if(string_source_clone.equals(new_source) && string_destination_clone.equals(new_destination)) {
											String company = rs.getString("companie");
											String code_flight = rs.getString("cod_zbor");
											String days = rs.getString("zile_zbor");
											String time_source = rs.getString("ora_plecare");
											String time_destination = rs.getString("ora_sosire");
											String price = rs.getString("preturi_aferente");
											float int_price = Float.parseFloat(price);
										
											
											if(count_adulti >= 1) {
												int_price = int_price * (float) count_adulti;
											}
											//discount de 15% pentru copii
											if(count_copii >= 1) {
												float s = 100 - 15;
												int_price += ((s*int_price)/100) * count_copii;
											} 
											//discount de 20% pentru infanti
											if(count_infainti >= 1) {
												float s = 100 - 20;
												int_price += ((s*int_price)/100) * count_infainti;
											}
											
											if(bool_business == true) {
												int_price += int_price * 3;
											}
											
											
											if(string_source_clone.equals(new_source) && string_destination_clone.equals(new_destination) 
											&& string_text_time_plecare.equals(time_source) && string_text_time_sosire.equals(time_destination)) {
												code_zbor = rs.getInt("cod_zbor");
											}
											convert_final_price = String.valueOf(int_price);
											new_TabelModel.addRow(new Object[] {company, code_flight, days, time_source, time_destination,convert_final_price, string_check});
										}
										new_count = 0;
									}
								
									found_var = true;
									button_click_tabel = new JButton("Rezervare zbor");
									button_click_tabel.setFocusable(false);
									button_click_tabel.setForeground(Color.white);
									button_click_tabel.setBounds(320,300,125,66);
									button_click_tabel.setBorderPainted(false);
									button_click_tabel.setOpaque(true);
									button_click_tabel.setBackground(new Color(59, 89, 182));
									frame_left.getContentPane().add(button_click_tabel);
									
									button_click_tabel.addActionListener(new ActionListener() {
										public void actionPerformed(ActionEvent e) {
											SLEEP new_sleep = new SLEEP(1000);
											new_sleep.sleep();
											int column = 1;
											int row = tabel.getSelectedRow();
											String selected_id = tabel.getModel().getValueAt(row, column).toString();
											frame_formular = new JFrame("Formular");
											frame_info_flight = new JFrame("Infromatii zbor");
											frame_formular.setVisible(false);
											frame_info_flight.setVisible(true);
											frame_formular.setResizable(false);
											frame_info_flight.setResizable(false);
											frame_formular.getContentPane().setLayout(null);
											frame_info_flight.getContentPane().setLayout(null);
											frame_left.setVisible(false);
											frame_formular.setBounds(100, 200, 700, 500);
											frame_info_flight.setBounds(300, 200, 700, 525);
											frame_formular.setBackground(Color.white);
											frame_info_flight.setBackground(Color.white);
											ImageIcon image_info_frame = new ImageIcon("resized_plane.gif");
											JLabel label_icon = new JLabel(image_info_frame);
											frame_info_flight.setContentPane(label_icon);
											info_label = new JLabel("Informatii zbor");
											info_label.setFont(new Font("Verdana", Font.PLAIN, 30));
											info_label.setForeground(Color.blue);
											info_label.setBounds(250,15,250,30);
											frame_info_flight.add(info_label);
											int code_flight;
											try {
												boolean flag_first = false;
												rs.first();
												rs.previous();
											    while(rs.next() == true) {
											    	code_flight = rs.getInt("cod_zbor");
													if(flag_first == false) {
														rs.first();
														flag_first = true;
													}
													if((Integer.parseInt(selected_id) == code_flight) && (code_zbor != -1)) {
														String info_cod_zbor = rs.getString("cod_zbor");
														String info_companie = rs.getString("companie");
														String info_tip_avion = rs.getString("tip_avion");
														String info_numar_locuri = rs.getString("numar_locuri");
														String info_preturi_aferente = rs.getString("preturi_aferente");
														String info_traseu_complet = rs.getString("traseu_complet");
														String info_ora_plecare = rs.getString("ora_plecare");
														String info_ora_sosire = rs.getString("ora_sosire");
														String info_tur_or_retur = rs.getString("tur/retur");
														String info_zile_zbor = rs.getString("zile_zbor");
														float preturi_aferente = Float.parseFloat(info_preturi_aferente);
														if(count_adulti >= 1) {
															preturi_aferente = preturi_aferente * (float) count_adulti;
														}
														//discount de 15% pentru copii
														if(count_copii >= 1) {
															float s = 100 - 15;
															preturi_aferente += ((s*preturi_aferente)/100) * count_copii;
														} 
														//discount de 20% pentru infanti
														if(count_infainti >= 1) {
															float s = 100 - 20;
															preturi_aferente += ((s*preturi_aferente)/100) * count_infainti;
														}
														price_ = preturi_aferente;
														if(check_buisness.isSelected() == true) {
															preturi_aferente  = preturi_aferente * 3;
											    		}
														
														Date date = Calendar.getInstance().getTime();
														DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
														String strDate = dateFormat.format(date);
														
														Date date2 = Calendar.getInstance().getTime();
														DateFormat dateFormat2 = new SimpleDateFormat("E");
														String strDate2 = dateFormat2.format(date2);
														
														String [] token_split_date;
														String [] token_split_days;
														token_split_date = strDate.split("/");
														token_split_days = info_zile_zbor.split(", ");
														
														int day = Integer.parseInt(token_split_date[1]);
														int month = Integer.parseInt(token_split_date[0]);
														int year = Integer.parseInt(token_split_date[2]);
															
														String luni = "Luni";
														String marti = "Marti";
														String miercuri = "Miercuri";
														String joi = "Joi";
														String vineri = "Vineri";
														String sambata = "Sambata";
														String duminica = "Duminica";
														
														boolean luni_found = false;
														boolean marti_found = false;
														boolean miercuri_found = false;
														boolean joi_found = false;
														boolean vineri_found = false;
														boolean sambata_found = false;
														boolean duminica_found = false;
														
														
														int count_days = 0;
														
														int position = -1;
														if(info_zile_zbor.contains(luni)) {
															luni_found = true;
															for(int i=0;i<token_split_days.length;++i) {
																if(luni.equals(token_split_days[i])) {
																	position = i;
																	break;
																}
															}
															luni = token_split_days[position];
															count_days += 1;
														}
														
														position = -1;
														if(info_zile_zbor.contains(marti)) {
																marti_found = true;
																for(int i=0;i<token_split_days.length;++i) {
																	if(marti.equals(token_split_days[i])) {
																		position = i;
																		break;
																	}
																}
															marti = token_split_days[position];
															count_days += 1;
														}
														
														position = -1;
														if(info_zile_zbor.contains(miercuri)) {
															miercuri_found = true;
															for(int i=0;i<token_split_days.length;++i) {
																if(miercuri.equals(token_split_days[i])) {
																	position = i;
																	break;
																}
															}
															miercuri = token_split_days[position];
															count_days += 1;
														}
														
														position = -1;
														if(info_zile_zbor.contains(joi)) {
															joi_found = true;
															for(int i=0;i<token_split_days.length;++i) {
																if(joi.equals(token_split_days[i])) {
																	position = i;
																	break;
																}
															}
															joi = token_split_days[position];
															count_days += 1;
														}
														
														position = -1;
														if(info_zile_zbor.contains(vineri)) {
															vineri_found = true;
															for(int i=0;i<token_split_days.length;++i) {
																if(vineri.equals(token_split_days[i])) {
																	position = i;
																	break;
																}
															}
															vineri = token_split_days[position];
															count_days += 1;
														}
														
														position = -1;
														if(info_zile_zbor.contains(sambata)) {
															sambata_found = true;
															for(int i=0;i<token_split_days.length;++i) {
																if(sambata.equals(token_split_days[i])) {
																	position = i;
																	break;
																}
															}
															sambata = token_split_days[position];
															count_days += 1;
														}
														if(info_zile_zbor.contains(duminica)) {
															duminica_found = true;
															for(int i=0;i<token_split_days.length;++i) {
																if(duminica.equals(token_split_days[i])) {
																	position = i;
																	break;
																}
															}
															duminica = token_split_days[position];
															count_days += 1;
														}
														
														int int_monday = 0;
														int int_tuesday = 1;
														int int_wednesday = 2;
														int int_thursday = 3;
														int int_friday = 4;
														int int_saturday = 5;
														int int_sunday = 6;
														
														if(strDate2.equals("Mon")) {
															if(luni_found == true) {
																int_monday = 0 + day;
															} if(marti_found == true) {
																int_tuesday = 1 + day;
															} if(miercuri_found == true) {
																int_wednesday = 2 + day;
															} if(joi_found == true) { 
																int_thursday = 3 + day;
															} if(vineri_found == true) {
																int_friday = 4 + day;
															} if(sambata_found == true) {
																int_saturday = 5 + day;
															} if(duminica_found == true) {
																int_sunday = 6 + day;
															}
														}
														if(strDate2.equals("Tue")) {
															if(marti_found == true) {
																int_tuesday = 0 + day;
															} if(miercuri_found == true) {
																int_wednesday = 1 + day;
															} if(joi_found == true) {
																int_thursday = 2 + day;
															} if(vineri_found == true) {
																int_friday = 3 + day;
															} if(sambata_found == true) {
																int_saturday = 4 + day;
															} if(duminica_found == true) {
																int_sunday = 5 + day;
															  if(luni_found == true) {
																int_monday = 6 + day;
																}
															}
														}
														if(strDate2.equals("Wed")) {
															if(miercuri_found == true) {
																int_wednesday = 0 + day;
															} if(joi_found == true) {
																int_thursday = 1 + day;
															} if(vineri_found == true) {
																int_friday =  2 + day;
															} if(sambata_found == true) {
																int_saturday = 3 + day;
															} if(duminica_found == true) {
																int_sunday = 4 + day;
															} if(luni_found == true) {
																int_monday = 5 + day;
															} if(marti_found == true) {
																int_tuesday = 6 + day;
															}
														}
														if(strDate2.equals("Thu")) {
															if(joi_found == true) {
																int_thursday = 0 + day;
															} if(vineri_found == true) {
																int_friday = 1 + day;
															} if(sambata_found == true) {
																int_saturday = 2 + day;
															} if(duminica_found == true) {
																int_sunday = 3 + day;
															} if(luni_found == true) {
																int_monday = 4 + day;
															} if(marti_found == true) {
																int_tuesday = 5 + day;
															} if(miercuri_found == true) {
																int_wednesday = 6 + day;
															}
														}
														if(strDate2.equals("Fri")) {
														  if(vineri_found == true) {
															int_friday = 0 + day;
														} if(sambata_found == true) {
															int_saturday = 1 + day;
														} if(duminica_found == true) {
															int_sunday = 2 + day;
														} if(luni_found == true) {
															int_monday = 3 + day;
														} if(marti_found == true) {
															int_tuesday = 4 + day;
														} if(miercuri_found == true) {
															int_wednesday = 5 + day;
														} if(joi_found == true) {
															int_thursday = 6 + day;
														}
													  }
														if(strDate2.equals("Sat")) {
															if(sambata_found == true) {
																int_saturday = 0 + day;
															} if(duminica_found == true) {
																int_sunday = 1 + day;
															} if(luni_found == true) {
																int_monday = 2 + day;
															} if(marti_found == true) {
																int_tuesday = 3 + day;
															} if(miercuri_found == true) {
																int_wednesday = 4 + day;
															} if(joi_found == true) {
																int_thursday = 5 + day;
															} if(vineri_found == true) {
																int_friday = 6 + day;
															}
														}
														if(strDate2.equals("Sun")) {
															if(duminica_found == true) {
																int_sunday = 0 + day;
															} if(luni_found == true) {
																int_monday = 1 + day;
															} if(marti_found == true) {
																int_tuesday = 2 + day;
															} if(miercuri_found == true) {
																int_wednesday = 3 + day;
															} if(joi_found == true) {
																int_thursday = 4 + day;
															} if(vineri_found == true) {
																int_friday = 5 + day;
															} if(sambata_found == true) {
																int_saturday = 6 + day;
															}
														}
														String [] array_hold_days = new String [count_days];
														int iter = 0;
														Arrays.fill(array_hold_days, "-1");
														boolean flag_found = false;
														for(int i=0;(i<array_hold_days.length) && (flag_found == false);++i) {
															if(luni_found == true) {
																array_hold_days[iter++] = String.valueOf(int_monday);
															} if(marti_found == true) {
																array_hold_days[iter++] = String.valueOf(int_tuesday);
															} if(miercuri_found == true) {
																array_hold_days[iter++] = String.valueOf(int_wednesday);
															} if(joi_found == true) {
																array_hold_days[iter++] = String.valueOf(int_thursday);
															} if(vineri_found == true) {
																array_hold_days[iter++] = String.valueOf(int_friday);
															} if(sambata_found == true) {
																array_hold_days[iter++] = String.valueOf(int_saturday);
															} if(duminica_found == true) {
																array_hold_days[iter++] = String.valueOf(int_sunday);
															}
															flag_found = true;
														}
														
														//Pentru informatii legat de zbor
														String [] array_full_date = new String [count_days];
														for(int i=0;i<array_full_date.length;++i) {
															array_full_date[i] = array_hold_days[i] +"/"+ month +"/"+ year;
														}
														
														JLabel label_days = new JLabel("Zboruri disponibile: ");
														label_days.setFont(new Font("Tahoma", Font.ITALIC, 14));
														int increase_x = 30;
														int increase_y = 70;
														label_days.setBounds(increase_x,increase_y+220-20,130,24);
														label_days.setForeground(Color.blue);
														frame_info_flight.add(label_days);
														
														@SuppressWarnings({ "rawtypes", "unchecked" })
														JComboBox combo_box_array_days = new JComboBox(array_full_date);
														combo_box_array_days.setForeground(Color.blue);
														combo_box_array_days.setBounds(increase_x,increase_y+250-20,120,20);
														frame_info_flight.add(combo_box_array_days);
														
														JLabel label_cod_zbor = new JLabel("Cod zbor: ");
														label_cod_zbor.setFont(new Font("Tahoma", Font.ITALIC, 14));
														label_cod_zbor.setBounds(increase_x,increase_y+60-20,120,20);
														label_cod_zbor.setForeground(Color.blue);
														frame_info_flight.add(label_cod_zbor);
														
														JLabel label_cod_zbor2 = new JLabel(info_cod_zbor);
														label_cod_zbor2.setFont(new Font("Tahoma", Font.BOLD, 14));
														label_cod_zbor2.setBounds(increase_x+67,increase_y+60-20,120,20);
														label_cod_zbor2.setForeground(Color.blue);
														frame_info_flight.add(label_cod_zbor2);
														
														JLabel label_companie = new JLabel("Compania: ");
														label_companie.setFont(new Font("Tahoma", Font.ITALIC, 14));
														label_companie.setBounds(increase_x,increase_y+80-20,120,20);
														label_companie.setForeground(Color.blue);
														frame_info_flight.add(label_companie);
														
														JLabel label_companie2 = new JLabel(info_companie);
														label_companie2.setFont(new Font("Tahoma", Font.BOLD, 14));
														label_companie2.setBounds(increase_x+70,increase_y+80-20,120,20);
														label_companie2.setForeground(Color.blue);
														frame_info_flight.add(label_companie2);
														
														JLabel label_tip_avion = new JLabel("Tip avion: ");
														label_tip_avion.setFont(new Font("Tahoma", Font.ITALIC, 14));
														label_tip_avion.setBounds(increase_x,increase_y+100-20,120,20);
														label_tip_avion.setForeground(Color.blue);
														frame_info_flight.add(label_tip_avion);
														
														JLabel label_tip_avion2 = new JLabel(info_tip_avion);
														label_tip_avion2.setFont(new Font("Tahoma", Font.BOLD, 14));
														label_tip_avion2.setBounds(increase_x+70,increase_y+100-20,120,20);
														label_tip_avion2.setForeground(Color.blue);
														frame_info_flight.add(label_tip_avion2);
														
														JLabel label_numar_locuri = new JLabel("Numar locuri: ");
														label_numar_locuri.setFont(new Font("Tahoma", Font.ITALIC, 14));
														label_numar_locuri.setBounds(increase_x,increase_y+120-20,120,20);
														label_numar_locuri.setForeground(Color.blue);
														frame_info_flight.add(label_numar_locuri);
														
														JLabel label_numar_locuri2 = new JLabel(info_numar_locuri);
														label_numar_locuri2.setFont(new Font("Tahoma", Font.BOLD, 14));
														label_numar_locuri2.setBounds(increase_x+90,increase_y+120-20,120,20);
														label_numar_locuri2.setForeground(Color.blue);
														frame_info_flight.add(label_numar_locuri2);
														
														JLabel label_preturi_aferente = new JLabel("Preturi total: ");
														label_preturi_aferente.setFont(new Font("Tahoma", Font.ITALIC, 14));
														label_preturi_aferente.setBounds(increase_x,increase_y+140-20,120,20);
														label_preturi_aferente.setForeground(Color.blue);
														frame_info_flight.add(label_preturi_aferente);
														
														JLabel label_preturi_aferente2 = new JLabel(String.valueOf(preturi_aferente));
														price_ = preturi_aferente;
														label_preturi_aferente2.setFont(new Font("Tahoma", Font.BOLD, 14));
														label_preturi_aferente2.setBounds(increase_x+84,increase_y+140-20,120,20);
														label_preturi_aferente2.setForeground(Color.blue);
														frame_info_flight.add(label_preturi_aferente2);
														
														JLabel label_ora_plecare = new JLabel("Ora plecare: ");
														label_ora_plecare.setFont(new Font("Tahoma", Font.ITALIC, 14));
														label_ora_plecare.setBounds(increase_x,increase_y+160-20,120,20);
														label_ora_plecare.setForeground(Color.blue);
														frame_info_flight.add(label_ora_plecare);
														
														JLabel label_ora_plecare2 = new JLabel(info_ora_plecare);
														label_ora_plecare2.setFont(new Font("Tahoma", Font.BOLD, 14));
														label_ora_plecare2.setBounds(increase_x+78,increase_y+160-20,120,20);
														label_ora_plecare2.setForeground(Color.blue);
														frame_info_flight.add(label_ora_plecare2);
														
														JLabel label_ora_sosire = new JLabel("Ora sosire: ");
														label_ora_sosire.setFont(new Font("Tahoma", Font.ITALIC, 14));
														label_ora_sosire.setBounds(increase_x,increase_y+180-20,120,20);
														label_ora_sosire.setForeground(Color.blue);
														frame_info_flight.add(label_ora_sosire);
														
														JLabel label_ora_sosire2 = new JLabel(info_ora_sosire);
														label_ora_sosire2.setFont(new Font("Tahoma", Font.BOLD, 14));
														label_ora_sosire2.setBounds(increase_x+70,increase_y+180-20,120,20);
														label_ora_sosire2.setForeground(Color.blue);
														frame_info_flight.add(label_ora_sosire2);
														
														JLabel label_tur_or_retur = new JLabel("Tur/retur: ");
														label_tur_or_retur.setFont(new Font("Tahoma", Font.ITALIC, 14));
														label_tur_or_retur.setBounds(increase_x,increase_y+200-20,120,20);
														label_tur_or_retur.setForeground(Color.blue);
														frame_info_flight.add(label_tur_or_retur);
														
														JLabel label_tur_or_retur2 = new JLabel(info_tur_or_retur);
														label_tur_or_retur2.setFont(new Font("Tahoma", Font.BOLD, 14));
														label_tur_or_retur2.setBounds(increase_x+65,increase_y+200-20,120,20);
														label_tur_or_retur2.setForeground(Color.blue);
														frame_info_flight.add(label_tur_or_retur2);
														
														JLabel label_traseu_complet = new JLabel("Traseu complet: ");
														label_traseu_complet.setFont(new Font("Tahoma", Font.ITALIC, 16));
														label_traseu_complet.setBounds(increase_x+210,increase_y+352-15,140,20);
														label_traseu_complet.setForeground(Color.blue);
														frame_info_flight.add(label_traseu_complet);
														
														JLabel label_traseu_complet2 = new JLabel(info_traseu_complet);
														label_traseu_complet2.setFont(new Font("Tahoma", Font.BOLD, 18));
														label_traseu_complet2.setBounds(increase_x+200,increase_y+379-15,270,30);
														label_traseu_complet2.setForeground(Color.blue);
														frame_info_flight.add(label_traseu_complet2);
														
														JButton button_book_ticket = new JButton("Rezervare");
														button_book_ticket.setFocusable(false);
														button_book_ticket.setForeground(Color.white);
														button_book_ticket.setBounds(240+10-10,70,100,50);
														button_book_ticket.setBorderPainted(false);
														button_book_ticket.setOpaque(true);
														button_book_ticket.setBackground(new Color(59, 89, 182));
														frame_info_flight.getContentPane().add(button_book_ticket);
														
														
														JButton button_createAccount = new JButton("Adauga account bancar");
														button_createAccount.setFocusable(false);
														button_createAccount.setForeground(Color.white);
														button_createAccount.setBounds(325+10+40-35-10,70,170,50);
														button_createAccount.setBorderPainted(false);
														button_createAccount.setOpaque(true);
														button_createAccount.setBackground(new Color(59, 89, 182));
														frame_info_flight.getContentPane().add(button_createAccount);
														
														
														button_book_ticket.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																sleep.sleep();
																frame_formular.setVisible(true);
																frame_info_flight.setVisible(false);
																ImageIcon image = new ImageIcon("money_rain.gif");
																JLabel label_image = new JLabel(image);
																frame_formular.setContentPane(label_image);
																frame_formular.setBackground(Color.white);
																frame_formular.setResizable(false);
																frame_formular.getContentPane().setLayout(null);
																frame_formular.setVisible(true);
																
																JButton button_back2 = new JButton("Inapoi");
																button_back2.setFocusable(false);
																button_back2.setForeground(Color.white);
																button_back2.setBounds(580,410,100,50);
																button_back2.setBorderPainted(false);
																button_back2.setOpaque(true);
																button_back2.setBackground(new Color(59, 89, 182));
																frame_formular.getContentPane().add(button_back1);
																
																button_back1.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		frame.setVisible(true);
																		frame_formular.setVisible(false);
																		frame_info_flight.setVisible(false);
																		frame_left.setVisible(false);
																		frame_right.setVisible(false);
																	}
																});
																
																JTextField textField_name2 = new JTextField(10);
																textField_name2.setDocument(new JTextFieldLimit(10));
																textField_name2.setForeground(Color.gray);
																textField_name2.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_name2.setText("Nume");
																textField_name2.setBounds(190,125-30,160,40);
																frame_formular.add(textField_name2);
																
																JTextField textField_surename2 = new JTextField(10);
																textField_surename2.setDocument(new JTextFieldLimit(10));
																textField_surename2.setForeground(Color.gray);
																textField_surename2.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_surename2.setText("Prenume");
																textField_surename2.setBounds(360,125-30,160,40);
																frame_formular.add(textField_surename2);
																
																JTextField textField_tara2 = new JTextField(10);
																textField_tara2.setDocument(new JTextFieldLimit(14));
																textField_tara2.setForeground(Color.gray);
																textField_tara2.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_tara2.setText("Tara");
																textField_tara2.setBounds(190,175-30,160,40);
																frame_formular.add(textField_tara2);
																
																JTextField textField_oras2 = new JTextField(10);
																textField_oras2.setDocument(new JTextFieldLimit(14));
																textField_oras2.setForeground(Color.gray);
																textField_oras2.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_oras2.setText("Oras");
																textField_oras2.setBounds(360,175-30,160,40);
																frame_formular.add(textField_oras2);
																
																JTextField textField_card2 = new JTextField(10);
																textField_card2.setDocument(new JTextFieldLimit(16));
																textField_card2.setForeground(Color.gray);
																textField_card2.setFont(new Font("Tahoma", Font.ITALIC, 10));
																textField_card2.setText("xxxxxxxxxxxxxxxx");
																textField_card2.setBounds(190,205-10,160,30);
																frame_formular.add(textField_card2);
																
																textField_card2.addKeyListener(new KeyAdapter() {
															            public void keyTyped(KeyEvent e) {
															                char caracter = e.getKeyChar();
															                if (((caracter < '0') || (caracter > '9'))
															                        && (caracter != '\b')) {
															                    e.consume();
															                }
															            }
															        });
																
																ImageIcon debitCard2 = new ImageIcon("debitcard_photo.jpeg");
																JLabel label_debitCard2 = new JLabel(debitCard2);
																label_debitCard2.setBounds(330-40,205-10,160,30);
																label_debitCard2.setBackground(Color.black);
																frame_formular.getContentPane().add(label_debitCard2);
																
																ImageIcon masterCard2 = new ImageIcon("mastercard_photo.png");
																JLabel label_masterCard2 = new JLabel(masterCard2);
																label_masterCard2.setBounds(360-40,205-10,160,30);
																label_masterCard2.setBackground(Color.black);
																frame_formular.getContentPane().add(label_masterCard2);
																
																JTextField textField_valid_account2 = new JTextField(10);
																textField_valid_account2.setDocument(new JTextFieldLimit(10));
																textField_valid_account2.setForeground(Color.gray);
																textField_valid_account2.setFont(new Font("Tahoma", Font.ITALIC, 10));
																textField_valid_account2.setText("valid");
																textField_valid_account2.setBounds(450-10,205-10,80,30);
																frame_formular.add(textField_valid_account2);
																
																JTextField texField_cvv2 = new JTextField(10);
																texField_cvv2.setDocument(new JTextFieldLimit(3));
																texField_cvv2.setForeground(Color.gray);
																texField_cvv2.setFont(new Font("Tahoma", Font.ITALIC, 10));
																texField_cvv2.setText("cvv");
																texField_cvv2.setBounds(450-10,205-10+30,80,30);
																frame_formular.add(texField_cvv2);
																
																JButton button_create_account2 = new JButton("Plateste");
																button_create_account2.setBounds(325,205-10+30+50,100,50);
																button_create_account2.setFocusable(false);
																button_create_account2.setForeground(Color.white);
																button_create_account2.setBorderPainted(false);
																button_create_account2.setOpaque(true);
																button_create_account2.setBackground(new Color(59, 89, 182));
																frame_formular.getContentPane().add(button_create_account2);
																
																
																
																button_create_account2.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		float final_price = price_;
																		String name_ = textField_name2.getText();
																		String surename_ = textField_surename2.getText();
																		String country_ = textField_tara2.getText();
																		String city_ = textField_oras2.getText();
																		String card_ = textField_card2.getText();
																		String valid_ = textField_valid_account2.getText();
																		String cvv_ = texField_cvv2.getText();
																		
																		try {
																			String url = "jdbc:mysql://localhost:3306/fis";
																			con = DriverManager.getConnection (url, "root", "root");
																			sql = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
																			rs = sql.executeQuery("select * from bank_account");
																			int int_price_costumer = -1;
																			rs.first();
																			rs.previous();
																			while(rs.next() == true) {
																				String name__ = rs.getString("Nume");
														    					String surename__ = rs.getString("Prenume");
														    					String country__ = rs.getString("Tara");
														    					String oras__ = rs.getString("Oras");
														    					String card__ = rs.getString("Card");
															    				String valid__ = rs.getString("Timp_validare");
															    				String cvv__ = rs.getString("Cvv");
															    				if(name__.equals(name_) && surename__.equals(surename_) && country__.equals(country_) &&
															    				oras__.equals(city_) && card__.equals(card_) && valid__.equals(valid_) && cvv__.equals(cvv_)) { 
															    					String price_customer = rs.getString("Suma_bani");
																					int_price_costumer = Integer.parseInt(price_customer);
																					if(final_price > int_price_costumer && int_price_costumer != -1) {
																						JOptionPane.showMessageDialog(null, "Insuficienti bani in cont","Eroare", JOptionPane.NO_OPTION);
																						return;
																					} else {
																						String result_string = String.valueOf(final_price);
																						rs.updateString("Suma_bani", result_string);
																						rs.updateRow();
																					}
																					break;
															    				}
																			}
																			if(final_price > int_price_costumer && int_price_costumer != -1) {
																				JOptionPane.showMessageDialog(null, "Insuficienti bani in cont","Eroare", JOptionPane.NO_OPTION);
																				return;
																			} else {
																				String url3 = "jdbc:mysql://localhost:3306/fis";
																				con = DriverManager.getConnection (url3, "root", "root");
																				sql = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
																				rs = sql.executeQuery("select * from bank_account");
																				float result = (int_price_costumer-final_price);
																				rs.first();
																				rs.previous();
																				while(rs.next() == true) {
																					String name___ = rs.getString("Nume");
															    					String surename___ = rs.getString("Prenume");
															    					String country___ = rs.getString("Tara");
															    					String oras___ = rs.getString("Oras");
															    					String card___ = rs.getString("Card");
																    				String valid___ = rs.getString("Timp_validare");
																    				String cvv___ = rs.getString("Cvv");
																    				if(name___.equals(name_) && surename___.equals(surename_) && country___.equals(country_) &&
																    						oras___.equals(city_) && card___.equals(card_) && valid___.equals(valid_) && cvv___.equals(cvv_)) {
																								break;
																		    			}
																				}
																				JOptionPane.showMessageDialog(null, "Tranzactia era facuta cu succes","Succes", JOptionPane.NO_OPTION);
																				String url2 = "jdbc:mysql://localhost:3306/fis";
																				con = DriverManager.getConnection (url2, "root", "root");
																				sql = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
																				rs = sql.executeQuery("select * from ticket_holders");
																				rs.first();
																				rs.previous();
																				rs.moveToInsertRow();
																				rs.updateString("Nume", name_);
														    					rs.updateString("Prenume", surename_);
														    					rs.updateString("Tara", country_);
														    					rs.updateString("Oras", city_);
														    					rs.updateString("Card", card_);
															    				rs.updateString("Timp_validare", valid_);
															    				rs.updateString("Cvv", cvv_);
															    				rs.insertRow();
															    				
															    				textField_name2.setText("");
																    			textField_surename2.setText("");
																    			textField_tara2.setText("");
																    			textField_oras2.setText("");
																    			textField_card2.setText("");
																    			textField_valid_account2.setText("");
																    			texField_cvv2.setText("");
																			}
																		} catch (SQLException e1) {
																			e1.printStackTrace();
																		}
																	}
																});
																
																texField_cvv2.addKeyListener(new KeyAdapter() {
														            public void keyTyped(KeyEvent e) {
														                char caracter = e.getKeyChar();
														                if ((( caracter < '0') || (caracter > '9'))
														                        && (caracter != '\b')) {
														                    e.consume();
														                }
														            }
														        });
																
																textField_name2.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_name2.setText("");
																		textField_name2.setForeground(Color.blue);
																		textField_name2.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_surename2.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_surename2.setText("");
																		textField_surename2.setForeground(Color.blue);
																		textField_surename2.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_tara2.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_tara2.setText("");
																		textField_tara2.setForeground(Color.blue);
																		textField_tara2.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_oras2.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_oras2.setText("");
																		textField_oras2.setForeground(Color.blue);
																		textField_oras2.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_card2.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_card2.setText("");
																		textField_card2.setForeground(Color.blue);
																		textField_card2.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_valid_account2.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_valid_account2.setText("");
																		textField_valid_account2.setForeground(Color.blue);
																		textField_valid_account2.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																texField_cvv2.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		texField_cvv2.setText("");
																		texField_cvv2.setForeground(Color.blue);
																		texField_cvv2.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
															}
														});
														
														button_createAccount.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																JFrame frame_account = new JFrame("Creaza account");
																frame_account.setSize(700,500);
																frame_account.setLocation(700/2,500/2);
																ImageIcon image = new ImageIcon("money_rain.gif");
																JLabel label_image = new JLabel(image);
																frame_account.setContentPane(label_image);
																frame_account.setBackground(Color.white);
																frame_account.setResizable(false);
																frame_info_flight.setVisible(false);
																frame_account.getContentPane().setLayout(null);
																frame_account.setVisible(true);
																
																
																JButton button_back1 = new JButton("Inapoi");
																button_back1.setFocusable(false);
																button_back1.setForeground(Color.white);
																button_back1.setBounds(580,410,100,50);
																button_back1.setBorderPainted(false);
																button_back1.setOpaque(true);
																button_back1.setBackground(new Color(59, 89, 182));
																frame_account.getContentPane().add(button_back1);
																
																button_back1.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		frame.setVisible(true);
																		frame_account.setVisible(false);
																		frame_info_flight.setVisible(false);
																		frame_left.setVisible(false);
																		frame_right.setVisible(false);
																	}
																});
														        
																
																image_main_frame = new ImageIcon("image_insert_image.png");
																label_photo = new JLabel(image_main_frame);
																label_photo.setBounds(290,10,100,100);
																label_photo.setBackground(Color.black);
																frame_account.getContentPane().add(label_photo);
																	
																JButton button_image = new JButton("add");
																button_image.setBounds(400,35,40,40);
																button_image.setFocusable(false);
																button_image.setForeground(Color.blue);
																button_image.setBorderPainted(false);
																button_image.setOpaque(true);
																button_back1.setBackground(new Color(59, 89, 182));
																frame_account.getContentPane().add(button_image);
																
																  
																button_image.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		JFileChooser file = new JFileChooser();
																         file.setCurrentDirectory(new File(System.getProperty("user.home")));
																         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg","gif","png");
																         file.addChoosableFileFilter(filter);
																         int result = file.showSaveDialog(null);
																         if(result == JFileChooser.APPROVE_OPTION){
																             File selectedFile = file.getSelectedFile();
																             path = selectedFile.getAbsolutePath();
																             label_photo.setIcon(ResizeImage(path));
																         } else if(result == JFileChooser.CANCEL_OPTION) {
																             return;
																         }
																	}
																});
																
																JTextField textField_name = new JTextField(10);
																textField_name.setDocument(new JTextFieldLimit(10));
																textField_name.setForeground(Color.gray);
																textField_name.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_name.setText("Nume");
																textField_name.setBounds(190,125,160,40);
																frame_account.add(textField_name);
																
																JTextField textField_surename = new JTextField(10);
																textField_surename.setDocument(new JTextFieldLimit(10));
																textField_surename.setForeground(Color.gray);
																textField_surename.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_surename.setText("Prenume");
																textField_surename.setBounds(360,125,160,40);
																frame_account.add(textField_surename);
																
																JTextField textField_tara = new JTextField(10);
																textField_tara.setDocument(new JTextFieldLimit(14));
																textField_tara.setForeground(Color.gray);
																textField_tara.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_tara.setText("Tara");
																textField_tara.setBounds(190,175,160,40);
																frame_account.add(textField_tara);
																
																JTextField textField_oras = new JTextField(10);
																textField_oras.setDocument(new JTextFieldLimit(14));
																textField_oras.setForeground(Color.gray);
																textField_oras.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_oras.setText("Oras");
																textField_oras.setBounds(360,175,160,40);
																frame_account.add(textField_oras);
																
																JTextField textField_varsta = new JTextField(10);
																textField_varsta.setDocument(new JTextFieldLimit(7));
																textField_varsta.setForeground(Color.gray);
																textField_varsta.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_varsta.setText("Varsta");
																textField_varsta.setBounds(190,225,160,40);
																frame_account.add(textField_varsta);
																
																JTextField textField_suma_introdusa = new JTextField(10);
																textField_suma_introdusa.setDocument(new JTextFieldLimit(10));
																textField_suma_introdusa.setForeground(Color.gray);
																textField_suma_introdusa.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_suma_introdusa.setText("Suma bani");
																textField_suma_introdusa.setBounds(360,225,160,40);
																frame_account.add(textField_suma_introdusa);
																
																JTextField textField_email = new JTextField(10);
																textField_email.setDocument(new JTextFieldLimit(30));
																textField_email.setForeground(Color.gray);
																textField_email.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_email.setText("E-mail");
																textField_email.setBounds(190,275,330,30);
																frame_account.add(textField_email);
																
																JTextField textField_password = new JTextField(10);
																textField_password.setDocument(new JTextFieldLimit(9));
																textField_password.setForeground(Color.gray);
																textField_password.setFont(new Font("Tahoma", Font.ITALIC, 12));
																textField_password.setText("Password");
																textField_password.setBounds(190,315,330,30);
																frame_account.add(textField_password);
																
																JTextField textField_card = new JTextField(10);
																textField_card.setDocument(new JTextFieldLimit(16));
																textField_card.setForeground(Color.gray);
																textField_card.setFont(new Font("Tahoma", Font.ITALIC, 10));
																textField_card.setText("xxxxxxxxxxxxxxxx");
																textField_card.setBounds(190,355,160,30);
																frame_account.add(textField_card);
																
																textField_card.addKeyListener(new KeyAdapter() {
															            public void keyTyped(KeyEvent e) {
															                char caracter = e.getKeyChar();
															                if (((caracter < '0') || (caracter > '9'))
															                        && (caracter != '\b')) {
															                    e.consume();
															                }
															            }
															        });
												
																ImageIcon debitCard = new ImageIcon("debitcard_photo.jpeg");
																JLabel label_debitCard = new JLabel(debitCard);
																label_debitCard.setBounds(360,345,30,50);
																label_debitCard.setBackground(Color.black);
																frame_account.getContentPane().add(label_debitCard);
																
																ImageIcon masterCard = new ImageIcon("mastercard_photo.png");
																JLabel label_masterCard = new JLabel(masterCard);
																label_masterCard.setBounds(390,345,30,50);
																label_masterCard.setBackground(Color.black);
																frame_account.getContentPane().add(label_masterCard);
																
																JTextField textField_valid_account = new JTextField(10);
																textField_valid_account.setDocument(new JTextFieldLimit(10));
																textField_valid_account.setForeground(Color.gray);
																textField_valid_account.setFont(new Font("Tahoma", Font.ITALIC, 10));
																textField_valid_account.setText("valid");
																textField_valid_account.setBounds(450-10,345+10,80,30);
																frame_account.add(textField_valid_account);
																
																
																JTextField texField_cvv = new JTextField(10);
																texField_cvv.setDocument(new JTextFieldLimit(3));
																texField_cvv.setForeground(Color.gray);
																texField_cvv.setFont(new Font("Tahoma", Font.ITALIC, 10));
																texField_cvv.setText("cvv");
																texField_cvv.setBounds(450-10,395,80,30);
																frame_account.add(texField_cvv);
																
																texField_cvv.addKeyListener(new KeyAdapter() {
														            public void keyTyped(KeyEvent e) {
														                char caracter = e.getKeyChar();
														                if (((caracter < '0') || (caracter > '9'))
														                        && (caracter != '\b')) {
														                    e.consume();
														                }
														            }
														        });
																
																JButton button_create_account = new JButton("Adauga");
																button_create_account.setBounds(10,410,100,50);
																button_create_account.setFocusable(false);
																button_create_account.setForeground(Color.white);
																button_create_account.setBorderPainted(false);
																button_create_account.setOpaque(true);
																button_create_account.setBackground(new Color(59, 89, 182));
																frame_account.getContentPane().add(button_create_account);
																
																button_create_account.addActionListener(new ActionListener() {
																	public void actionPerformed(ActionEvent e) {
																		String string_age = String.valueOf(textField_varsta.getText());
																		int int_age = Integer.parseInt(string_age);
																		if(int_age < 18) {
																			JOptionPane.showMessageDialog(null, "Nu poti sa ai cont ca esti prea mic","Eroare", JOptionPane.NO_OPTION);
																			return;
																		}
																		String string_password = String.valueOf(textField_password);
																		if(string_password.length() < 6) {
																			JOptionPane.showMessageDialog(null, "Password-ul ii prea slab","Eroare", JOptionPane.NO_OPTION);
																			return;
																		}
																		sleep.sleep();
																		try {
																			rs.moveToInsertRow();
																		} catch (SQLException excep) {
																			excep.printStackTrace();
																		}
																		
																		String name = String.valueOf(textField_name.getText());
																		String surename = String.valueOf(textField_surename.getText());
																		String country = String.valueOf(textField_tara.getText());
																		String city = String.valueOf(textField_oras.getText());
																		String age = String.valueOf(textField_varsta.getText());
																		String sum = String.valueOf(textField_suma_introdusa.getText());
																		String email = String.valueOf(textField_email.getText());
																		String password = String.valueOf(textField_password.getText());
																		String card = String.valueOf(textField_card.getText());
																		String valid = String.valueOf(textField_valid_account.getText());
																		String cvv = String.valueOf(texField_cvv.getText());
																		String url = "jdbc:mysql://localhost:3306/fis";
																		try {
																			con = DriverManager.getConnection (url, "root", "root");
																			sql = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
																			rs = sql.executeQuery("select * from bank_account");
																		} catch (SQLException e1) {
																			e1.printStackTrace();
																		}
																		try {
																			rs.first();
																			rs.previous();
																			rs.moveToInsertRow();
																			if(!path.equals("-1")) {
																				rs.updateString("link", path);
																				rs.updateString("Nume", name);
														    					rs.updateString("Prenume", surename);
														    					rs.updateString("Tara", country);
														    					rs.updateString("Oras", city);
														    					rs.updateString("Varsta", age);
														    					rs.updateString("Suma_bani", sum);
														    					rs.updateString("E_mail", email);
														    					rs.updateString("Password", password);
														    					rs.updateString("Card", card);
															    				rs.updateString("Timp_validare", valid);
															    				rs.updateString("Cvv", cvv);
															    				rs.insertRow();
																			} else {
																				JOptionPane.showMessageDialog(null, "Nu ati pus o poza!", "Va rog puneti si o poza", JOptionPane.NO_OPTION);
																				return;
																			}
															    			JOptionPane.showMessageDialog(null, "Creat cu success account-ul!","Success", JOptionPane.NO_OPTION);
															    			textField_name.setText("");
															    			textField_surename.setText("");
															    			textField_tara.setText("");
															    			textField_oras.setText("");
															    			textField_varsta.setText("");
															    			textField_suma_introdusa.setText("");
															    			textField_email.setText("");
															    			textField_password.setText("");
															    			textField_card.setText("");
															    			textField_valid_account.setText("");
															    			texField_cvv.setText("");
																		}catch (SQLException ex) {
																			ex.printStackTrace();
																		}
																	}
																});
														
																textField_name.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_name.setText("");
																		textField_name.setForeground(Color.blue);
																		textField_name.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_surename.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_surename.setText("");
																		textField_surename.setForeground(Color.blue);
																		textField_surename.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_tara.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_tara.setText("");
																		textField_tara.setForeground(Color.blue);
																		textField_tara.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_oras.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_oras.setText("");
																		textField_oras.setForeground(Color.blue);
																		textField_oras.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_varsta.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_varsta.setText("");
																		textField_varsta.setForeground(Color.blue);
																		textField_varsta.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_suma_introdusa.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_suma_introdusa.setText("");
																		textField_suma_introdusa.setForeground(Color.blue);
																		textField_suma_introdusa.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_email.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_email.setText("");
																		textField_email.setForeground(Color.blue);
																		textField_email.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_password.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_password.setText("");
																		textField_password.setForeground(Color.blue);
																		textField_password.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_card.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_card.setText("");
																		textField_card.setForeground(Color.blue);
																		textField_card.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_valid_account.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		textField_valid_account.setText("");
																		textField_valid_account.setForeground(Color.blue);
																		textField_valid_account.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																texField_cvv.addMouseListener(new MouseListener() {
																	public void mouseClicked(MouseEvent e) {
																		texField_cvv.setText("");
																		texField_cvv.setForeground(Color.blue);
																		texField_cvv.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	}
																	public void mousePressed(MouseEvent e) {}
																	public void mouseReleased(MouseEvent e) {}
																	public void mouseEntered(MouseEvent e) {}
																	public void mouseExited(MouseEvent e) {}
																});
																
																textField_name.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_name = textField_name.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_name.equals("Nume")) {  
																			textField_name.setText("");
																			textField_name.setForeground(Color.blue);
																			textField_name.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																
																textField_surename.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_surename = textField_surename.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_surename.equals("Prenume")) {  
																			textField_surename.setText("");
																			textField_surename.setForeground(Color.blue);
																			textField_surename.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																
																textField_tara.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_tara = textField_tara.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_tara.equals("Tara")) {  
																			textField_tara.setText("");
																			textField_tara.setForeground(Color.blue);
																			textField_tara.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																
																textField_oras.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_oras = textField_oras.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_oras.equals("Oras")) {  
																			textField_oras.setText("");
																			textField_oras.setForeground(Color.blue);
																			textField_oras.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																
																textField_varsta.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_varsta = textField_varsta.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_varsta.equals("Varsta")) {  
																			textField_varsta.setText("");
																			textField_varsta.setForeground(Color.blue);
																			textField_varsta.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																
																textField_suma_introdusa.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_suma = textField_suma_introdusa.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_suma.equals("Suma bani")) {  
																			textField_suma_introdusa.setText("");
																			textField_suma_introdusa.setForeground(Color.blue);
																			textField_suma_introdusa.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																
																textField_email.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_email = textField_suma_introdusa.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_email.equals("E-mail")) {  
																			textField_email.setText("");
																			textField_email.setForeground(Color.blue);
																			textField_email.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																
																textField_password.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_password = textField_suma_introdusa.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_password.equals("Password")) {  
																			textField_password.setText("");
																			textField_password.setForeground(Color.blue);
																			textField_password.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																textField_card.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_card = textField_suma_introdusa.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_card.equals("xxxx-xxxx-xxxx-xxxx")) {  
																			textField_password.setText("");
																			textField_password.setForeground(Color.blue);
																			textField_password.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																textField_valid_account.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_validation = textField_suma_introdusa.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_validation.equals("valid")) {  
																			textField_valid_account.setText("");
																			textField_valid_account.setForeground(Color.blue);
																			textField_valid_account.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
																texField_cvv.addKeyListener(new KeyListener() {
																	public void keyPressed(KeyEvent k) {
																		String text_cvv = textField_suma_introdusa.getText();
																		if(k.getKeyCode() == KeyEvent.VK_BACK_SPACE && text_cvv.equals("cvv")) {  
																			texField_cvv.setText("");
																			texField_cvv.setForeground(Color.blue);
																			texField_cvv.setFont(new Font("Tahoma", Font.PLAIN, 12));
																	    } 
																	 }
																	public void keyTyped(KeyEvent k) {}
																	public void keyReleased(KeyEvent k) {}
																});
															}
														});
													}
											    }
											} catch (SQLException e1) {
												e1.printStackTrace();
											}
										}
									});   
								} 
							}
					rs.first();
					if(flag == false) {
						JOptionPane.showMessageDialog(null, "Nu am putut sa gasim zborul!","Vedeti daca exista alt zbor", JOptionPane.NO_OPTION);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	class JTextFieldLimit extends PlainDocument {
		   private int limit;
		   JTextFieldLimit(int limit) {
		      super();
		      this.limit = limit;
		   }
		   JTextFieldLimit(int limit, boolean upper) {
		      super();
		      this.limit = limit;
		   }
		   public void insertString(int offset, String str, javax.swing.text.AttributeSet attr) throws BadLocationException {
		      if (str == null)
		         return;
		      if ((getLength() + str.length()) <= limit) {
		         super.insertString(offset, str, attr);
		      }
		   }
		}
	
	public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon MyImage = new ImageIcon(ImagePath);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(label_photo.getWidth(), label_photo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
	
	private void initialize() throws SQLException {
		frame = new JFrame("Project FIS");
		frame.setResizable(false);
		String url = "jdbc:mysql://localhost:3306/fis";
		con = DriverManager.getConnection (url, "root", "root");
		sql = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		rs = sql.executeQuery("select * from admin");
    	frame.setBounds(250, 180, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image_main_frame = new ImageIcon("plane_main_frame.gif");
		JLabel label_icon = new JLabel(image_main_frame);
		frame.getContentPane().add(label_icon);
		frame.getContentPane().setLayout(null);
		label_icon.setSize(700, 500);
        
        
        frame_left = new JFrame("User autentification");
		frame_left.setSize(700, 500);
		frame_left.setLocation(250,180);
		frame_left.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame_left.getContentPane().setLayout(null);
		frame_left.getContentPane().setBackground(Color.white);
		frame_left.setVisible(false);
		
		button_back1 = new JButton("Inapoi");
		button_back1.setFocusable(false);
		button_back1.setForeground(Color.white);
		button_back1.setBounds(580,410,100,50);
		button_back1.setBorderPainted(false);
		button_back1.setOpaque(true);
		button_back1.setBackground(new Color(59, 89, 182));
		frame_left.getContentPane().add(button_back1);
        
    	userButton = new JButton("User");
    	userButton.setFocusable(false);
    	userButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			frame_left.setVisible(true);
    			frame.setVisible(false);
    			if(global_count % 2 == 1) {
    				found_var = true;
    			}
    			global_count += 1;
    			if(found_var == true) {
    				button_click_tabel.setVisible(false);
    				tabel.setVisible(false);
    				scrollPane.setVisible(false);
    				button_reset.setVisible(false);
    				label_text_up.setVisible(false);
    				found_var = false;
    			}
    			JButton show_button = new JButton("Informatii");
    			show_button.setBounds(200+10+20,250,100*2,100);
    			show_button.setFocusable(false);
    			show_button.setForeground(Color.white);
    			show_button.setBorderPainted(false);
    			show_button.setOpaque(true);
    			show_button.setBackground(new Color(59, 89, 182));
    			frame_left.getContentPane().add(show_button);
				
				var = 0;
				for(int i=0;i<label_array_row_up.length;++i) { 
					var += 5;
					label_array_row_up[i] = new JLabel("_");
					label_array_row_up[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
					label_array_row_up[i].setBounds(30+var, 20, 221, 21);
					label_array_row_up[i].setForeground(Color.blue);
					frame_left.getContentPane().add(label_array_row_up[i]);
				}
				
				var = 0;
				for(int i=0;i<label_array_row_down.length;++i) { 
					var += 5;
					label_array_row_down[i] = new JLabel("_");
					label_array_row_down[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
					label_array_row_down[i].setBounds(30+var, 382, 221, 21);
					label_array_row_down[i].setForeground(Color.blue);
					frame_left.getContentPane().add(label_array_row_down[i]);
				}
				
				var = 0;
				for(int i=0;i<label_array_column_left.length;++i) { 
					var += 5;
					label_array_column_left[i] = new JLabel("|");
					label_array_column_left[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
					label_array_column_left[i].setBounds(31, 30+var, 221, 21);
					label_array_column_left[i].setForeground(Color.blue);
					frame_left.getContentPane().add(label_array_column_left[i]);
				}
    			
				var = 0;
				for(int i=0;i<label_array_column_right.length;++i) { 
					var += 5;
					label_array_column_right[i] = new JLabel("|");
					label_array_column_right[i].setFont(new Font("Tahoma", Font.PLAIN, 14));
					label_array_column_right[i].setBounds(31+600, 30+var, 221, 21);
					label_array_column_right[i].setForeground(Color.blue);
					frame_left.getContentPane().add(label_array_column_right[i]);
				}
				
				ImageIcon imageIcon = new ImageIcon("user_for_gif.gif");
    			image_label = new JLabel(imageIcon);
    			image_label.setBounds(220+4, 5, 200, 260);
    			frame_left.getContentPane().add(image_label);
    		
    			if(happened == true) {
    				dateChooser2.setVisible(false);
    				label_destination.setVisible(false);
    				label_source.setVisible(false);
    				text_field_source.setVisible(false);
    				text_field_destionation.setVisible(false);
    			 	label_timp_sosire.setVisible(false);
    			 	label_timp_destinatie.setVisible(false);
    			 	dateChooser.setVisible(false);
    			 	label_categories.setVisible(false);
    			 	jbutton_adulti.setVisible(false);
    			 	jbutton_copii.setVisible(false);
    			 	jbutton_infanti.setVisible(false);
    			 	check_economic.setVisible(false);
    			 	check_buisness.setVisible(false);
    			 	add_flight.setVisible(false);
    			 	time_plecare.setVisible(false);
    			 	time_destinatie.setVisible(false);
    			 	text_time_plecare.setVisible(false);
    			 	text_time_sosire.setVisible(false);
    			 	label_return.setVisible(false);
    			 	textField_return.setVisible(false);
    			 	textField_adulti.setVisible(false);
    				textField_copii.setVisible(false);
    				textField_infanti.setVisible(false);
    			}
    			show_button.addActionListener(new ActionListener() {
    					public void actionPerformed(ActionEvent e) {
    						show_button.setVisible(false);
    						image_label.setVisible(false);
    						for(int i=0;i<label_array_row_up.length;++i) {
    							label_array_row_up[i].setVisible(false);
    							label_array_row_down[i].setVisible(false);
    						}
    						for(int i=0;i<label_array_column_left.length;++i) {
    							label_array_column_left[i].setVisible(false);
    							label_array_column_right[i].setVisible(false);
    						}
    						frame_left.getContentPane().setLayout(null);
    						try {
								TABEL_CLIENT_2();
							} catch (SQLException e1) {
								e1.printStackTrace();
							}
    						happened = true;
    					}
    			});
    			
    			button_back1.addActionListener(new ActionListener() {
    	    		public void actionPerformed(ActionEvent e) {
    	    			frame.setVisible(true);
    	    			frame_left.setVisible(false);
    	    			frame_right.setVisible(false);
    	    		}
    	    	});
    		}
    	});
    	
    	userButton.setBackground(new Color(59, 89, 182));
    	userButton.setForeground(Color.WHITE);
    	userButton.setFocusPainted(false);
    	userButton.setBorderPainted(false);
    	userButton.setOpaque(true);
    	userButton.setBounds(209+35, 400, 104, 40);
    	label_icon.add(userButton);
        
 
        frame_right = new JFrame("Admin");
		frame_right.setSize(700, 500);
		frame_right.setLocation(250,180);
		frame_right.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame_right.getContentPane().setLayout(null);
		frame_right.getContentPane().setBackground(Color.white);
		
		button_back2 = new JButton("Inapoi");
		button_back2.setForeground(Color.blue);
		button_back2.setFocusable(false);
		button_back2.setBounds(580,410,100,50);
		frame_right.getContentPane().add(button_back2);
        
        adminButton = new JButton("Admin");
    	adminButton.setFocusable(false);
    	adminButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			frame_right.setVisible(true);
    			frame.setVisible(false);
    
    			velocity_x = 0;
    			velocity_y = 0;
    			
    			for(int i=0;i<new_label_array.length;++i) {
    				new_label_array[i] = new JLabel("Username");
    				if(i == 0) {
    					new_label_array[i].setBounds(velocity_x+100, velocity_y+100, 80, 20);
    					new_label_array[i].setFocusable(false);
    					new_label_array[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
    					new_label_array[i].setForeground(Color.blue);
    				} else if(i == 1) {
    					new_label_array[i] = new JLabel("Password");
    					new_label_array[i].setBounds(velocity_x+100, velocity_y+100, 80, 20);
    					new_label_array[i].setFocusable(false);
    					new_label_array[i].setFont(new Font("Tahoma", Font.PLAIN, 16));
    					new_label_array[i].setForeground(Color.blue);
    				}
    				velocity_y += 71;
    			}
    			
    			for(int i=0;i<new_label_array.length;++i) {
    				frame_right.getContentPane().add(new_label_array[i]);
    			}
    			
    			velocity_x = 0;
    			velocity_y = 0;
    			
    			text_field_username.setBounds(velocity_x+200, velocity_y+103, 150, 20);
    			text_field_username.setBackground(Color.white);
    			int var_x = (velocity_x+200);
    			int var_y = (velocity_y+103);
    			velocity_y += 70;
    			frame_right.getContentPane().add(text_field_username);
    			text_field_username.setColumns(10);
    			
    			password_field = new JPasswordField();
    			password_field.setBounds(var_x, var_y+70, 150, 20);
    			frame_right.getContentPane().add(password_field);
    			password_field.setColumns(10);
    			
    			check_box_password = new JCheckBox("Show password");
    			check_box_password.setForeground(Color.blue);
    			check_box_password.setFocusable(false);
    			check_box_password.setBounds(var_x-20, var_y+30+70, 120, 20);
    			frame_right.getContentPane().add(check_box_password);
    			
    			login_button = new JButton("Login");
    			login_button.setForeground(Color.blue);
    			login_button.setFocusable(false);
    			login_button.setBounds(140,(140+30+100+40+10),100,50);
    			frame_right.getContentPane().add(login_button);
    			
    			reset_button = new JButton("Reset");
    			reset_button.setForeground(Color.blue);
    			reset_button.setFocusable(false);
    			reset_button.setBounds(140-20+70+45,(140+30+100+40+10),100,50);
    			frame_right.getContentPane().add(reset_button);
    				
    			ImageIcon imageIcon = new ImageIcon("gif_login_plane_please_work.gif");
    			image_label = new JLabel(imageIcon);
    			image_label.setBounds(350, -40, 360, 480);
    			frame_right.getContentPane().add(image_label);
    			
    			ImageIcon imageIcon2 = new ImageIcon("plane_login_gif.gif");
    			image_label2 = new JLabel(imageIcon2);
    			image_label2.setBounds(65, 170, 360, 480);
    			frame_right.getContentPane().add(image_label2);
    			
    			check_box_password.addActionListener(new ActionListener() {
    				public void actionPerformed(ActionEvent e) {
    					if(check_box_password.isSelected()) {
    						password_field.setEchoChar((char) 0);
    					} else {
    						password_field.setEchoChar('*');
    					}
    				}
    			});
    			
    			login_button.setBorderPainted(false);
     		    login_button.setOpaque(true);
     		    login_button.setBackground(new Color(59, 89, 182));
     		    login_button.setForeground(Color.WHITE);
     		    login_button.setFocusPainted(false);
    		    login_button.addActionListener(new ActionListener() {
    		    	public void actionPerformed(ActionEvent e) {
    		    		if (e.getSource() == login_button) {
    		    			String username = "-404";
    		    			String password = "-404";
    		    			username = text_field_username.getText();
    		    			password = String.valueOf(password_field.getPassword());
    		    			if((username.equals("admin") && password.equals("admin")) || (username.equals("ADMIN") && password.equals("ADMIN"))) {
    		    				JOptionPane.showMessageDialog(null, "You successfully have logged in!","Success", JOptionPane.NO_OPTION);
    		    				SLEEP new_sleep = new SLEEP(1500);
    		    				new_sleep.sleep();
    		    				frame_display = new JFrame("Introducere zbor");
    		    				frame_display.setSize(700+100, 500+100);
    		    				frame_display.setLocation(250, 180);
    		    				frame_display.setVisible(true);
    		    				frame_display.getContentPane().setLayout(null);
    		    				
    		    				button_back_admin = new JButton("Inapoi");
    	    	    			button_back_admin.setFocusable(false);
    	    	    			button_back_admin.setForeground(Color.blue);
    	    	    			button_back_admin.setBounds(680,507,100+3,50+3);
    	    	    			button_back_admin.setBorderPainted(false);
    	    	    			button_back_admin.setOpaque(true);
    	    	    			button_back_admin.setBackground(new Color(59, 89, 182));
    	    	    			button_back_admin.setForeground(Color.WHITE);
    	    	    			button_back_admin.setFocusPainted(false);
    	    	    			frame_display.getContentPane().add(button_back_admin);
    	    	    			
    	    	    			button_back_admin.addActionListener(new ActionListener() {
    	    	    	    		public void actionPerformed(ActionEvent e) {
    	    	    	    			frame_right.setVisible(true);
    	    	    	    			frame.setVisible(false);
    	    	    	    			frame_left.setVisible(false);
    	    	    	    			frame_display.setVisible(false);
    	    	    	    			text_field_username.setText("");
    	    	    	    			password_field.setText("");
    	    	    	    			check_box_password.setSelected(false);
    	    	    	    			frame_display.dispatchEvent(new WindowEvent(frame_display, WindowEvent.WINDOW_CLOSING));
    	    	    	    		}
    	    	    			});
    		    				frame.setVisible(false);
    	    	    			frame_left.setVisible(false);
    	    	    			frame_right.setVisible(false);
    	    	    			try {
									INIT_LABELS_AND_TEXT_FIELDS();
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
    		    			} else {
    		    				JOptionPane.showMessageDialog(null, "Wrong Password or username!","Error", JOptionPane.ERROR_MESSAGE);
    		    				text_field_username.setText("");
    		    				password_field.setText("");
    		    				}
    		    			}
    		    		}
    		    });
    	    	
    		    reset_button.setBorderPainted(false);
    		    reset_button.setOpaque(true);
    		    reset_button.setBackground(new Color(59, 89, 182));
    		    reset_button.setForeground(Color.WHITE);
    		    reset_button.setFocusPainted(false);
    		    reset_button.addActionListener(new ActionListener() {
    	    		public void actionPerformed(ActionEvent e) {
    	    			text_field_username.setText("");
    					password_field.setText("");
    	    		}
    	    	});
    			
    		    button_back2.setBorderPainted(false);
    		    button_back2.setOpaque(true);
    		    button_back2.setBackground(new Color(59, 89, 182));
    		    button_back2.setForeground(Color.WHITE);
    		    button_back2.setFocusPainted(false);
    			button_back2.addActionListener(new ActionListener() {
    	    		public void actionPerformed(ActionEvent e) {
    	    			frame.setVisible(true);
    	    			frame_left.setVisible(false);
    	    			frame_right.setVisible(false);
    	    		}
    	    	});
    		}
    	});
    	adminButton.setBorderPainted(false);
    	adminButton.setOpaque(true);
    	adminButton.setBackground(new Color(59, 89, 182));
    	adminButton.setForeground(Color.WHITE);
    	adminButton.setFocusPainted(false);
        adminButton.setBounds(381-35, 400, 104, 40);
        label_icon.add(adminButton);
    }
}


