package entities;

public class OutsourcedEmployee extends Employee{
	
	public Double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + this.additionalCharge * 1.1;
	}
	
	@Override
	public String toString() {
		return super.getName() + " \t- $ " + String.format("%.2f", this.payment());
	}
	
}
