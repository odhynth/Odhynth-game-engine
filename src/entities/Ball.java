package entities;

import org.lwjgl.util.vector.Vector3f;

import models.RawModel;
import models.TexturedModel;
import terrains.Terrain;
import textures.ModelTexture;

public class Ball extends Entity{

	
	public Ball(TexturedModel model, Vector3f position, float rotX, float rotY, float rotZ, float scale) {		
		super(model, position, rotX, rotY, rotZ, scale);
	
	}
	
	public void move(Terrain t)
	{
		float h= this.getPosition().y - t.getHeightOfTerrain(this.getPosition().getX(), this.getPosition().getY());
		this.setPosition(new Vector3f(this.getPosition().x,this.getPosition().y + h,this.getPosition().z));
	}
	
}
