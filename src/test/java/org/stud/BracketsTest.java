package org.stud;

import static org.junit.Assert.*;

public class BracketsTest {

    @org.junit.Test
    public void checkBrackets1() {
        boolean r = Brackets.checkBrackets("(1+1)=(3-(2+2-2))",'(', ')');
        assertEquals(true,r);
    }

    @org.junit.Test
    public void checkBrackets2() {
        boolean r = Brackets.checkBrackets("(1+1))=(3-2)",'(', ')');
        assertEquals(false,r);
    }
    @org.junit.Test
    public void checkBrackets3() {
        boolean r = Brackets.checkBrackets("))(((1+1))=(3-2)",'(', ')');
        assertEquals(false,r);
    }
}