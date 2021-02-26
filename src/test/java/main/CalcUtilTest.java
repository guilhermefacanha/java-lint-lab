package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalcUtilTest {

    @Order(1)@Test
    void testSumEmpty() {assertEquals(0, CalcUtil.sum(), "when no numbers passed it should be returned zero!"); 
    }
    @Order(2)@Test
    void testSum() {assertEquals(15, CalcUtil.sum(1,2,3,4,5), "the sum should be 15!"); 
    }
    @Order(3)@Test
    void testSubEmpty() {assertEquals(0, CalcUtil.sub(), "when no numbers passed it should be returned zero!");;  
    }
    @Order(4)@Test
    void testSub() {assertEquals(2, CalcUtil.sub(5,3), "the sub should be 2!"); 
    }
    @Order(4)@Test
    void testSubSingle() {assertEquals(5, CalcUtil.sub(5), "the sub should be 5!"); 
    }

}
