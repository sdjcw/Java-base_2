package decorator;

public class NoAccident extends Item {

	public NoAccident(KPI kpi) {
		super(kpi);
	}

	@Override
	public String getOpinion() {
		return kpi.getOpinion() + ", 无线上事故";
	}

	@Override
	public double source() {
		return kpi.source() + 3;
	}

}
