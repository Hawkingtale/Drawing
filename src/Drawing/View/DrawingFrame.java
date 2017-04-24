package Drawing.View;

import javax.swing.*;
import Drawing.Controller.DrawingController;
import java.awt.Dimension;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingPanel appPanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new DrawingPanel(baseController);
	}
	
	private void setupFrame()
	{
		
	}
}
