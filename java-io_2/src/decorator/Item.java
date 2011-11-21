package decorator;

public abstract class Item extends KPI {

	protected KPI kpi;

	public Item(KPI kpi) {
		this.kpi = kpi;
	}

	@Override
	public abstract String getOpinion();

}
