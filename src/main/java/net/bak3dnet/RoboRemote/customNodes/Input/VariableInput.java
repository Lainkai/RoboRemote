package net.bak3dnet.RoboRemote.customNodes.Input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.scene.effect.DropShadow;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class VariableInput extends Region {

	private Arc variArc = new Arc();
	private int inputVal=0;
	final Logger logger = LoggerFactory.getLogger(VariableInput.class);
	
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
		
		Circle circ = new Circle(85, Color.WHITE);
		circ.setCenterX(250);
		circ.setCenterY(250);
		circ.setEffect(new DropShadow());
		
		this.getChildren().addAll(variArc, circ);

		
	}

	public void setPercentage(int byteVal) {
		
		if(byteVal>=0 && byteVal<=255) {
			inputVal = byteVal;
		}
		
		drawArc();
		
	}
	
	private double percentDegrees() {
		
		double result = -(inputVal/255D)*360D;
		return result;
		
	}
		
}
