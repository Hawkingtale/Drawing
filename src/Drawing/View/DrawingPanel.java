package Drawing.View;

import Drawing.Controller.DrawingController;
import javax.swing.*;
public class DrawingPanel extends JPanel
{
	JButton button;
	ShapePanel shapePanel;
	SpringLayout baseLayout;
	DrawingController BaseController;
	
	public DrawingPanel(DrawingController baseController)
	{
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public ShapePanel(DrawingController baseController)
	{
		
	}
	
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout();
	{
		
	}
	
	private void setupListeners();
	{
		
	}
}
