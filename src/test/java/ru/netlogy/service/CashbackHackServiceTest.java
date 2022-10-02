package ru.netlogy.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {
   @Test
 public void remain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
    @Test
    public void amountEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

}