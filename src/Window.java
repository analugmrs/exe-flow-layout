import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.WindowConstants;
import javax.swing.JButton;


public class Window extends JFrame{

	private FlowLayout layout = null;
	
	public Window() {
		super("Teste FlowLayout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(400,200));
		
		layout = new FlowLayout();
		setLayout(layout);
		
		layout.setAlignment(FlowLayout.CENTER);
		
		add(new JButton("Botão - 0"));
		add(new JButton("Botão - 0"));
		add(new JButton("Botão - 0"));
		add(new JButton("Botão - 0"));
		add(new JButton("Botão - 0"));
		add(new JButton("Botão - 0"));
		
		pack();
		
	}
	
}
