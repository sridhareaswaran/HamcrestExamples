package org.sri.hamcrest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class machersMix {

    @Test
    public void describedAs_test() {
        /** anything - always matches, useful if you don't care what the object under test is */
        assertThat(22, anything());
        assertThat(22, is(anything()));

        /** describedAs - decorator to adding custom failure description */
        assertThat(22, describedAs("custom msg to appear when condition fails", is(22)));
    }

    @Test
    public void is_not() {
        assertThat("sri", is(not("madhu")));
    }

    @Test
    public void hamcrest_core_allof () {
        String microBrew = "Lake Louie Brewery Company";
        assertThat(microBrew, allOf(startsWith("Lake"), containsString("Brew")));
    }

    @Test
    public void hamcrest_core_anyOf () {
        String microBrew = "Grumpy Troll Brewery";
        assertThat(microBrew, anyOf(startsWith("brew"), containsString("Troll")));
    }

    @Test
    public void hamcrest_core_both () {
        String isLite = "Miller Lite";
        assertThat(isLite,both(containsString("Mill")).and(containsString("Lite")));
    }

    @Test
    public void hamcrest_core_either () {
        String isLite = "Miller Lite";
        assertThat(isLite,either(containsString("sri")).or(containsString("Mill")));
    }
}
