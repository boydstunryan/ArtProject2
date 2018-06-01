package art.controller;

import art.view.ArtFrame;
import javax.swing.JOptionPane;

public class ArtController 
{
	public ArtFrame frame;
	
	public ArtController()
	{
		this.frame = new ArtFrame();
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(frame, "Welcome to art");
	}
	
	public ArtFrame frameGetter()
	{
		return frame;
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(frame, error.getMessage());
	}
}
