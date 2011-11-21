package decorator;

/**
 * 初级工程师
 * @author shenfeng
 *
 */
public class PrimaryEngineer extends KPI {

	public PrimaryEngineer() {
		opinion = "初级工程师";
	}

	@Override
	public double source() {
		return 35;
	}

}
