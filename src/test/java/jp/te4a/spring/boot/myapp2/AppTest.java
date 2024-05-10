package jp.te4a.spring.boot.myapp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void greetTaro()
    {
        var expected = "Taro desu!";

        var taro = new GreetingTaro();
        var actual = taro.index();

        assertEquals(expected, actual);
    }
}
