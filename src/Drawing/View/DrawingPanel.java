package Drawing.View;

import Drawing.Controller.DrawingController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class DrawingPanel extends JPanel
{
	private JButton rectangleButton;
	private ShapePanel shapePanel;
	private SpringLayout baseLayout;
	private DrawingController BaseController;
	
	public DrawingPanel(DrawingController baseController)
	{
		super();
		this.BaseController = baseController;
		
		shapePanel = new ShapePanel(baseController);
		this.baseLayout = new springLayout;
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public ShapePanel(DrawingController baseController)
	{
		
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.setMinimumSize(new Dimension(600,600));
		
		this.add(rectangleButton);
		this.add(shapePanel);
	}
	
	private void setupLayout();
	{
		
	}
	
	private void setupListeners();
	{
		rectangleButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					shapePanel.addRectangles();
				}
			})
	}
}
