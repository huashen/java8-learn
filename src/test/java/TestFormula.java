import com.lhs.learn.Formula;
import org.junit.Test;

/**
 * TestFormula
 *
 * @author longhuashen
 * @since 16/10/12
 */
public class TestFormula {

    @Test
    public void test01() {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        System.out.println(formula.calculate(10));
        System.out.println(formula.sqrt(16));
    }
}
