
public class tuikaEnemy extends Enemy {
public tuikaEnemy(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame f) {
	   f.setColor(180, 180, 230); 
	   f.fillOval(x,y,30,30);
	}
}
