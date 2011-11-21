package decorator;

/**
 * 工程师
 * @author shenfeng
 *
 */
public class Engineer extends KPI {

	public Engineer() {
		opinion = "工程师";
	}

	@Override
	public double source() {
		return 50;
	}

}
