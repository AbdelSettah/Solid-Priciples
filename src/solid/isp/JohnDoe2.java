package solid.isp;

public class JohnDoe2 implements JumpingAthlete {
	@Override
	public void compete() {
		System.out.println("John Doe 2 started competing");
	}

	@Override
	public void highJump() {
		System.out.println("John started high jumping");
	}

	@Override
	public void longJump() {
		System.out.println("John started long jumping");
	}
}
