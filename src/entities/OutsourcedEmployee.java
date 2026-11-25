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
		this.additionalCharge = additionalCharge * 1.1;
	}
	
	@Override
	public double payment() {
		setAdditionalCharge(additionalCharge);
		return super.getValuePerHour() * super.getHours() + getAdditionalCharge();
	}
	
	@Override
	public String toString() {
		return super.getName() + " \t- $ " + String.format("%.2f", this.payment());
	}
	
}
