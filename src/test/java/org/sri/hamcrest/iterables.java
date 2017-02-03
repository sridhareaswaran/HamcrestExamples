package org.sri.hamcrest;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.core.Every.everyItem;
import static org.junit.Assert.assertThat;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class iterables {

    @Test
    public void hamcrest_core_every () {
        List<Integer> ages = Lists.newArrayList(21, 25, 30, 18);
        assertThat(ages, everyItem(greaterThanOrEqualTo(18)));
        assertThat(ages, everyItem(instanceOf(Integer)));
    }
}
