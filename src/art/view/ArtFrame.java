package art.view;

import javax.swing.JFrame;

public class ArtFrame extends JFrame
{
	public ArtFrame()
	{
		super();
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1200, 700);
		this.setContentPane(panel);
		this.setTitle("Creating modern art in Java");
		this.setVisible(true);
	}
	
	private ArtPanel panel;
}
