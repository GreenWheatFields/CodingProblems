package com.company;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class XO{
/*
Check to see if a string has the same amount of 'x's and 'o's.
 The method must return a boolean and be case insensitive. The string can contain any char.
 */

    public static boolean getXO (String str) {
        char[]a = str.toLowerCase().toCharArray();
        var xCount = 0;
        var oCount = 0;
        for (int i =0; i <a.length; i++){
            if(a[i] == 'x'){
                xCount++;
            }else if (a[i] == 'o'){
                oCount++;
            }
        }
        return xCount == oCount;
    }

    public static void main(String[] args) {
        SolutionTest st = new SolutionTest();
        st.testSomething1();
        st.testSomething2();
        st.testSomething3();
        st.testSomething4();
        st.testSomething5();
        st.testSomething6();
        st.testSomething7();
        st.testSomething8();

    }



    public static class SolutionTest {
        @Test
        public void testSomething1() {
            assertEquals(true, XO.getXO("xxxooo"));
        }

        @Test
        public void testSomething2() {
            assertEquals(true, XO.getXO("xxxXooOo"));
        }

        @Test
        public void testSomething3() {
            assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
        }

        @Test
        public void testSomething4() {
            assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
        }

        @Test
        public void testSomething5() {
            assertEquals(false, XO.getXO("XxxxooO"));
        }

        @Test
        public void testSomething6() {
            assertEquals(true, XO.getXO("zssddd"));
        }

        @Test
        public void testSomething7() {
            assertEquals(false, XO.getXO("Xxxxertr34"));
        }
        @Test
        public void testSomething8(){
            assertEquals(false, XO.getXO("XOXOXOXOXOOOOOOOOOOOOOxxxxxxxxxxx645646546513213516465"));
        }
}
}