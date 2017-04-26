package Drawing.Controller;


import Drawing.View.DrawingPanel;
public class DrawingController
{

	DrawingPanel drawingPanel;
	
	public DrawingController()
	{
		this.drawingPanel = new DrawingPanel(this);
	}
	
	public void start()
	{
		
	}
}
