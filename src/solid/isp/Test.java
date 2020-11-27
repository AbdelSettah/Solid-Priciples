package solid.isp;

public class Test {
	
	public static void main(String[] args) {
		SwimmingAthlete p = new JohnDoe();
		p.compete();
		p.swim();	
		JumpingAthlete p2 = new JohnDoe2();
		p2.compete();
		p2.highJump();
		p2.longJump();
	}
}
