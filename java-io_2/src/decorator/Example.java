package decorator;

public class Example {

	public static void main(String[] args) {
		KPI kpi = new Engineer();
		System.out.println("评价：" + kpi.getOpinion());
		System.out.println("分数：" + kpi.source());

		KPI kpi2 = new NoBug(new Engineer());
		System.out.println("评价：" + kpi2.getOpinion());
		System.out.println("分数：" + kpi2.source());

		KPI kpi3 = new NoAccident(new Challenge(new SeniorEngineer()));
		System.out.println("评价：" + kpi3.getOpinion());
		System.out.println("分数：" + kpi3.source());
	}

}
