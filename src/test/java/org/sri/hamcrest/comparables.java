package org.sri.hamcrest;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.hamcrest.number.OrderingComparison.lessThanOrEqualTo;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class comparables {

    @Test
    public void number_greaterthan () {
        assertThat(20, greaterThan(18));
    }

    @Test
    public void everyitem_in_list_greaterthan_number () {

        List<Integer> ages = Lists.newArrayList(21, 25, 30);
        assertThat(ages, everyItem(greaterThan(18)));
    }

    @Test
    public void everyitem_in_list_greaterthan_or_equal_to_number () {

        List<Integer> ages = Lists.newArrayList(21, 25, 30, 18);
        assertThat(ages, everyItem(greaterThanOrEqualTo(18)));
    }

    @Test
    public void everyitem_in_list_lessthan_number() {

        List<Integer> ages = Lists.newArrayList(21, 25, 30);
        assertThat(ages, everyItem(lessThan(31)));
    }

    @Test
    public void everyitem_in_list_lessthan_or_equal_to_number () {

        List<Integer> ages = Lists.newArrayList(21, 25, 30, 18);
        assertThat(ages, everyItem(lessThanOrEqualTo(30)));
    }
}
