package decorator;

public class Challenge extends Item {

	public Challenge(KPI kpi) {
		super(kpi);
	}

	@Override
	public String getOpinion() {
		return kpi.getOpinion() + ", �ɹ���ս��������";
	}

	@Override
	public double source() {
		return kpi.source() + 10;
	}

}
