package decorator;

public class Example {

	public static void main(String[] args) {
		KPI kpi = new Engineer();
		System.out.println("���ۣ�" + kpi.getOpinion());
		System.out.println("������" + kpi.source());

		KPI kpi2 = new NoBug(new Engineer());
		System.out.println("���ۣ�" + kpi2.getOpinion());
		System.out.println("������" + kpi2.source());

		KPI kpi3 = new NoAccident(new Challenge(new SeniorEngineer()));
		System.out.println("���ۣ�" + kpi3.getOpinion());
		System.out.println("������" + kpi3.source());
	}

}
