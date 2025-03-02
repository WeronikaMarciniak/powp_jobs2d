package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;


/**
 * driver adapter to drawer with several bugs.
 */
public class DrawAdapter extends DrawPanelController implements Job2dDriver {
	private int startX = 0, startY = 0;
	private final DrawerFeature linesDrawer;
	public DrawAdapter() {
		super();
		this.linesDrawer = new DrawerFeature();
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		setPosition(x,y); //improved functionality to draw rectangle shape
		drawLine(line);
		linesDrawer.drawLines(line); //display shape in main app window
	}

	@Override
	public String toString() {
		return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
