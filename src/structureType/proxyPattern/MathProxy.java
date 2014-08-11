package structureType.proxyPattern;

public class MathProxy implements IMath {

	private Math math = new Math();
	@Override
	public double Add(double x, double y) {
		// TODO Auto-generated method stub
		return math.Add(x, y);
	}

	@Override
	public double Sub(double x, double y) {
		// TODO Auto-generated method stub
		return math.Sub(x, y);
	}

	@Override
	public double Mul(double x, double y) {
		// TODO Auto-generated method stub
		return math.Mul(x, y);
	}

	@Override
	public double Dev(double x, double y) {
		// TODO Auto-generated method stub
		return math.Dev(x, y);
	}

}
