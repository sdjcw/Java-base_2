package decorator;

public abstract class KPI {

	String opinion = "还没有评价。";

	public String getOpinion() {
		return opinion;
	}

	public abstract double source();

}
