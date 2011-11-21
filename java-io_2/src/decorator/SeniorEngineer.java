package decorator;

/**
 * 资深工程师
 * @author shenfeng
 *
 */
public class SeniorEngineer extends KPI {

	public SeniorEngineer() {
		opinion = "高级工程师";
	}

	@Override
	public double source() {
		return 65;
	}

}
