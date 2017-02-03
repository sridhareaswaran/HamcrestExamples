package org.sri.hamcrest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class numbers {
    @Test
    public void number_close_to_number () {
        assertThat(200.24, is(closeTo(200, 1)));
    }

    @Test
    public void bigdecimal_is_close_to_bigdecimal () {
        Integer seniorCitizen = new Integer(65);
        Integer Citizen = new Integer(60);
        // is close to retirement
        assertThat(Citizen, is(closeTo(seniorCitizen, new Integer(5))));
    }


}
