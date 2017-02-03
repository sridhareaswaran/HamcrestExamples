package org.sri.hamcrest;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class iterables {

    List<String> regionalBreweries = Lists.newArrayList(
            "Capital Brewery",
            "City Brewing Company ",
            "Jacob Leinenkugel Brewing Company",
            "Lakefront Brewery",
            "New Glarus Brewing Company",
            "Stevens Point Brewery");

    @Test
    public void hamcrest_core_every() {
        List<Integer> ages = Lists.newArrayList(21, 25, 30, 18);
        assertThat(ages, everyItem(greaterThanOrEqualTo(18)));
        assertThat(ages, everyItem(instanceOf(Integer.class)));
    }

    @Test
    public void hamcrest_core_hasItems() {

        List<String> regionalBreweries = Lists.newArrayList(
                "Capital Brewery",
                "City Brewing Company ",
                "Jacob Leinenkugel Brewing Company",
                "Lakefront Brewery, Inc.",
                "New Glarus Brewing Company",
                "Stevens Point Brewery");

        assertThat(regionalBreweries, hasItems(
                "Lakefront Brewery, Inc.",
                "Capital Brewery",
                "Jacob Leinenkugel Brewing Company",
                "Stevens Point Brewery"));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void hamcrest_core_hasItems_matchers() {

        List<String> regionalBreweries = Lists.newArrayList(
                "Capital Brewery",
                "City Brewing Company ",
                "Jacob Leinenkugel Brewing Company",
                "Lakefront Brewery",
                "New Glarus Brewing Company",
                "Stevens Point Brewery");

        assertThat(regionalBreweries, hasItems(
                containsString("Brew"),
                endsWith("y")));
    }

    @Test
    public void hamcrest_core_contains() {
        /** Order of items are also checked */
        assertThat(Arrays.asList("foo", "bar"), contains("foo", "bar"));
    }

    @Test
    public void hamcrest_core_containsInAnyOrder() {
        /** Order of items doesn't matter, given all items are present */
        assertThat(Arrays.asList("foo", "bar"), containsInAnyOrder("bar", "foo"));
    }

    @Test
    public void iterableWithSize_test() {
        assertThat(Arrays.asList("foo", "bar"), iterableWithSize(2));
        assertThat(regionalBreweries, iterableWithSize(regionalBreweries.size()));
    }
}
