package decorator;

public class Challenge extends Item {

	public Challenge(KPI kpi) {
		super(kpi);
	}

	@Override
	public String getOpinion() {
		return kpi.getOpinion() + ", 成功挑战技术难题";
	}

	@Override
	public double source() {
		return kpi.source() + 10;
	}

}
