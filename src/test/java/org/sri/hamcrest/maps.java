package org.sri.hamcrest;

import org.junit.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.junit.Assert.assertThat;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class maps {

    Map<String, String> data1 = new HashMap<String, String>();

    @Test
    public void hasEntry_test() {
        data1.put("a1", "b1");
        data1.put("a2", "b2");
        data1.put("a3", "b3");
        data1.put("a4", "b4");
        assertThat(data1, hasEntry("a1", "b1"));
    }

    @Test
    public void hasEntry_matcher_test() {
        data1.put("a1", "b1");
        data1.put("a2", "b2");
        data1.put("a3", "b3");
        data1.put("a4", "b4");
        assertThat(data1, hasEntry(containsString("1"), startsWith("b")));
    }

    @Test
    public void hasKey_test() {
        data1.put("a1", "b1");
        data1.put("a2", "b2");
        data1.put("a3", "b3");
        data1.put("a4", "b4");
        assertThat(data1, hasKey("a3"));
    }

    @Test
    public void hasKey_matcher_test() {
        data1.put("a1", "b1");
        data1.put("a2", "b2");
        data1.put("a3", "b3");
        data1.put("a4", "b4");
        assertThat(data1, hasKey(startsWith("a")));
    }

    @Test
    public void hasValue_test() {
        data1.put("a1", "b1");
        data1.put("a2", "b2");
        data1.put("a3", "b3");
        data1.put("a4", "b4");
        assertThat(data1, hasValue("b3"));
    }

    @Test
    public void hasValue_matcher_test() {
        data1.put("a1", "b1");
        data1.put("a2", "b2");
        data1.put("a3", "b3");
        data1.put("a4", "b4");
        assertThat(data1, hasValue(startsWith("b")));
    }


}
