package structureType.proxyPattern;

public class Math implements IMath {

	@Override
	public double Add(double x, double y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public double Sub(double x, double y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public double Mul(double x, double y) {
		// TODO Auto-generated method stub
		return  x*y;
	}

	@Override
	public double Dev(double x, double y) {
		// TODO Auto-generated method stub
		return (double)(x/y);
	}

}
