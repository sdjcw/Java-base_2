package decorator;

public class NoBug extends Item {

	public NoBug(KPI kpi) {
		super(kpi);
	}

	@Override
	public String getOpinion() {
		return kpi.getOpinion() + ", ��BUG";
	}

	@Override
	public double source() {
		return kpi.source() + 8;
	}

}
