package Drawing.View;

import javax.swing.*;
import Drawing.Controller.DrawingController;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

public class DrawingFrame extends JFrame
{
	private DrawingController baseController;
	private DrawingFrame basesFrame;
	private ShapePanel shapePanel;
	private DrawingPanel DrawingPanel;
	
	public DrawingFrame(DrawingController baseController)
	{
		super();
		this.baseController = baseController;
		this.DrawingPanel = new DrawingPanel(baseController);
		setupFrame();
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
