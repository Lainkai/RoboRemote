package net.bak3dnet.RoboRemote.customNodes.Input;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class VariableInput extends Region {

	private Arc variArc = new Arc();
	private int inputVal=0;
	
	public VariableInput() {
		
		this.setPrefSize(300, 300);
		
		drawArc();
		
	}
	
	private void drawArc() {
		this.getChildren().clear();
		
		variArc.setCenterX(250);
		variArc.setCenterY(250);
		variArc.setStartAngle(90);
		variArc.setLength(percentDegrees());
		variArc.setType(ArcType.ROUND);
		variArc.setRadiusX(100);
		variArc.setRadiusY(100);
		
		variArc.setFill(Color.rgb(255, 25, 155));
		
		this.getChildren().add(variArc);
		
	}

	public void setPercentage(int byteVal) {
		
		inputVal = byteVal;
		drawArc();
		
	}
	
	private int percentDegrees() {
		
		int result = 0-((inputVal/255)*360);
		System.out.println(result);
		return result;
		
	}
		
}
