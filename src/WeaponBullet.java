
public class WeaponBullet extends Weapon {
	
	public static final int BASE_COOLDOWN = 300;
	public static final double BULLET_SPEED = 1;
	public static final double DAMAGE = 15;
	
	public WeaponBullet() {
		super(BASE_COOLDOWN);
	}
	
	@Override
	public void shoot(Physicsable shooter) {
		super.shoot(shooter);
		FMath.playSound("Laser_Shoot0");
		ProjectileBullet bullet = new ProjectileBullet(shooter.position.clone(), FMath.circlePoint(BULLET_SPEED / 10, shooter.rotation), DAMAGE, this);
		Flatscape.drawables.add(bullet);
		Flatscape.physicsAddition.put(bullet, true);
	}

}