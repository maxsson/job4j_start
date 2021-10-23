package ru.java;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class AppTest {

    @Test
    public void whenCheck() {
        App ap = new App();
        assertThat(ap.check(4), is(8));
    }
}
 