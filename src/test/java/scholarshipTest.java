import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class scholarshipTest {
    scholarship uni=new scholarship();

    @Test
    void test1(){
        assertEquals(uni.scholar(1500,6.5),70);
    }
    @Test
    void test2(){
        assertEquals(uni.scholar(1300,7.6),50);
    }
    @Test
    void test3(){
        assertEquals(uni.scholar(1300,10.0),-1);
    }
    @Test
    void test4(){
        assertEquals(uni.scholar(1800,6.5),-1);
    }
    @Test
    void test5(){
        assertEquals(uni.scholar(1300,-1),-1);
    }
    @Test
    void test6(){
        assertEquals(uni.scholar(1000,8.0),0);
    }
    @Test
    void test7(){
        assertEquals(uni.scholar(500,10.0),-1);
    }@Test
    void test8(){
        assertEquals(uni.scholar(500,-1),-1);
    }
    @Test
    void test9(){
        assertEquals(uni.scholar(-1,6.5),-1);
    }

}
