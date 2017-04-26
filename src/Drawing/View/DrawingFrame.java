package Drawing.View;

import javax.swing.*;
import Drawing.Controller.DrawingController;
import java.awt.Dimension;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel DrawingPanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		this.DrawingPanel = new DrawingPanel(baseController);
	}
	
	private void setupFrame()
	{
		this.setContentPane(DrawingPanel);
		this.setSize(new Dimension(600,600));
		this.setTitle("HI");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
