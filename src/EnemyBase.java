
public class EnemyBase extends Enemy {
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillOval(x,y,32,32);
		f.setColor(200, 200, 200);
		f.fillOval(x - 16,y + 8,64,16);
		
	}
	public EnemyBase(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life = 5 + GameWorld.stage;
		score = 10;
	}
	public void move() {
		super.move();
		if (vx == 0) vx = 1;
		if(x > 300) vx= -GameWorld.stage;
		if(x < 100) vx=GameWorld.stage;
		if(Math.random() < 0.05) {
			GameWorld.enemies.add(new StraightEnemy(x,y,0,1+GameWorld.stage));
		}
		if(Math.random() < 0.05) {
			GameWorld.enemies.add(new RandomEnemy(x,y,0,1+GameWorld.stage));
		}
		if(Math.random() < 0.05) {
	        GameWorld.enemies.add(new DropEnemy(x, y,0,3+GameWorld.stage));
	    }
	    if(Math.random() < 0.05) {
	        GameWorld.enemies.add(new CurveEnemy(x, y,0,2+GameWorld.stage));
	    }
	    if(Math.random() < 0.05) {
			GameWorld.enemies.add(new tuikaEnemy(x,y,0,2+GameWorld.stage));
		}
	}

}
