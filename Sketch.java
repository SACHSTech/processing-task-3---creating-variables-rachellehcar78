import processing.core.PApplet;

public class Sketch extends PApplet {

    float scale = random (0, 500);

    float petalX = scale/1;
    float petalY = (float)(scale);
    float petalSize = random(5, 200);
    float petalDistance = petalSize/2;

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() 
  {
    background(94, 218, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Petal #1
    fill(255, 122, 235);
    ellipse(petalX-petalDistance, petalY-petalDistance, petalSize, petalSize);

    // Petal #2
    fill(255, 122, 235);
    ellipse(petalX + petalDistance, petalY - petalDistance, petalSize, petalSize);

    // Petal #3
    fill(255, 122, 235);
    ellipse(petalX + petalDistance, petalY + petalDistance, petalSize, petalSize);

    // Petal #4
    fill(255, 122, 235);
    ellipse(petalX - petalDistance, petalY + petalDistance, petalSize, petalSize);

    // Middle Part
    fill(255, 238, 56);
    ellipse(petalX, petalY, petalSize, petalSize);}
  }
