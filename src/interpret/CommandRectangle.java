package interpret;

import java.awt.Component;
import java.awt.event.MouseEvent;

import graphics.shapes.ui.ShapesController;

public class CommandRectangle extends Command {

	public CommandRectangle() {
		super.setName("rectangle");
	}

	@Override
	public void execute(Processor p) {
		ShapesController c =((ShapesController) p.getController());
		MouseEvent e = new MouseEvent(((Component) c.getView()),MouseEvent.MOUSE_CLICKED, System.currentTimeMillis(), 0, 100, 100, 1, false);
		c.rectangle(e);
	}

}