package decorator;

/**
 * �����ʦ
 * @author shenfeng
 *
 */
public class SeniorEngineer extends KPI {

	public SeniorEngineer() {
		opinion = "�߼�����ʦ";
	}

	@Override
	public double source() {
		return 65;
	}

}
