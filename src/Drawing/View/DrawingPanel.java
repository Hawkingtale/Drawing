package Drawing.View;

import javax.swing.*;
import Drawing.Controller.DrawingController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;



public class DrawingPanel extends JPanel
{	
	private DrawingController BaseController;
	private ShapePanel shapePanel;
	private DrawingFrame baseFrame;
	private SpringLayout baseLayout;
	private JButton rectangleButton;
	private JButton circleButton;
	private JButton ellipseButton;
	private JButton polygonButton;
	private JButton resetButton;
	private JButton triangleButton;

	public DrawingPanel(DrawingController baseController)
	{
		super();
		this.BaseController = baseController;
		
		this.shapePanel = new ShapePanel(baseController);
		this.baseLayout = new SpringLayout();


		rectangleButton = new JButton("Draw Rectangles");
		circleButton = new JButton("Draw Circles");
		ellipseButton = new JButton("Draw Ellipses");		
		polygonButton = new JButton("Draw POLYGONS");
		triangleButton = new JButton("Draw Triangles");
		resetButton = new JButton("RESET");
		
			
		setupPanel();
		setupLayout();
		setupListeners();
	}

	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.setMinimumSize(new Dimension(600,600));
		
		this.add(rectangleButton);
		this.add(shapePanel);
		this.add(circleButton);
		this.add(ellipseButton);
		this.add(triangleButton);
		this.add(polygonButton);
		this.add(resetButton);
	}
	
	private void setupLayout()
	{
		
		baseLayout.putConstraint(SpringLayout.NORTH, rectangleButton, 79, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, rectangleButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, circleButton, 5, SpringLayout.SOUTH, rectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, circleButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, ellipseButton, 6, SpringLayout.SOUTH, circleButton);
		baseLayout.putConstraint(SpringLayout.WEST, ellipseButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, resetButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, resetButton, -7, SpringLayout.NORTH, rectangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, polygonButton, 6, SpringLayout.SOUTH, triangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, triangleButton, 6, SpringLayout.SOUTH, ellipseButton);
		baseLayout.putConstraint(SpringLayout.WEST, triangleButton, 0, SpringLayout.WEST, rectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, polygonButton, 0, SpringLayout.WEST, rectangleButton);	
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, 421, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 187, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, 300, SpringLayout.NORTH, this);
	}
	
	private void setupListeners()
	{
		rectangleButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					shapePanel.addRectangles();
				}
			});
		circleButton.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent click)
				{
					shapePanel.addCircles();		
				}
				});
		ellipseButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					shapePanel.addCircles();			
				}
			});
		polygonButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					shapePanel.addPolygons();			
				}
			});
		resetButton.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent click)
				{
					shapePanel.reset();			
				}
			});
		triangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addTriangles();			
			}
		});
	}
}
