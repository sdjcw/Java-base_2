package decorator;

/**
 * ����ʦ
 * @author shenfeng
 *
 */
public class Engineer extends KPI {

	public Engineer() {
		opinion = "����ʦ";
	}

	@Override
	public double source() {
		return 50;
	}

}
