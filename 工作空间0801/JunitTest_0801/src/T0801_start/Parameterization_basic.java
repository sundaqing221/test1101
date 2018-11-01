package T0801_start;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Parameterization_basic {
    Sum cal;
    private int expected;
    private int input1;
    private int input2;

    @Parameters
    public static Collection<Object[]> paraData() {
        Object[][] object = { { 5, 2, 3 }, { 12, 8, 4 }, { 6, 4, 2 }, { 9, 0, 9 }, { 0, 0, 0 } };
        return Arrays.asList(object);
    }

    @Before
    public void setUp() throws Exception {
        cal = new Sum();
    }

    public Parameterization_basic(int expected, int input1, int input2) {
        this.expected = expected;

        this.input1 = input1;

        this.input2 = input2;
    }

    @Test
    public void testSub() {
        assertEquals(expected, cal.twoSum(input1, input2));
    }    
    /* 
         在静态方法 words 中，我们使用二维数组来构建测试所需要的参数列表，其中每个数组中的元素的放置顺序并没有什么要求，
         只要和构造函数中的顺序保持一致就可以了。现在如果再增加一种测试情况，只需要在静态方法 words 中添加相应的数组即可，
         不再需要复制粘贴出一个新的方法出来了。运行上面的测试，将会根据@Parameters注解修饰的方法返回一个Collection，然后进行相同次数的循环。
    */
}