import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ParenthesesDiv2MediumTest {

    @Test
    public void test0() {
        String s = ")(";
        assertArrayEquals(new int[]{0, 1}, new ParenthesesDiv2Medium().correct(s));
    }

    @Test
    public void test1() {
        String s = ")))))(((((";
        assertArrayEquals(new int[]{0, 2, 4, 5, 7, 9}, new ParenthesesDiv2Medium().correct(s));
    }

    @Test
    public void test2() {
        String s = "((()";
        assertArrayEquals(new int[]{1}, new ParenthesesDiv2Medium().correct(s));
    }

    @Test
    public void test3() {
        String s = ")))(()(())))))";
        assertArrayEquals(new int[]{0, 1, 2}, new ParenthesesDiv2Medium().correct(s));
    }

    @Test
    public void test4() {
        String s = "()()()()()()()()()()()()()";
        assertArrayEquals(new int[]{}, new ParenthesesDiv2Medium().correct(s));
    }
}
