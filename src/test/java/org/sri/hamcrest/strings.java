package org.sri.hamcrest;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.isIn;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class strings {

    String data = new String("test");

    /**
     * hasToString(String)
     */
    @Test
    public void hasToString_Object() {
        Assert.assertThat("test", hasToString(data));
    }




}
