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
         �ھ�̬���� words �У�����ʹ�ö�ά������������������Ҫ�Ĳ����б�����ÿ�������е�Ԫ�صķ���˳��û��ʲôҪ��
         ֻҪ�͹��캯���е�˳�򱣳�һ�¾Ϳ����ˡ��������������һ�ֲ��������ֻ��Ҫ�ھ�̬���� words �������Ӧ�����鼴�ɣ�
         ������Ҫ����ճ����һ���µķ��������ˡ���������Ĳ��ԣ��������@Parametersע�����εķ�������һ��Collection��Ȼ�������ͬ������ѭ����
    */
}