package org.sri.hamcrest;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;


/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class collections {

    List<String> alph1 = Arrays.asList("a", "b", "c", "d");
    List<String> alph2 = Arrays.asList("a", "b", "c", "d");
    List<String> alph3 = Arrays.asList("a", "b", "c", "d", "e");

    int[] intArray = {1, 2, 3, 4, 5};


    /**
     * isIn(Collection<T>)
     * isIn(T[])
     * isOneOf(T...)
     */

    @Test
    public void isIn_collection() {
        assertThat("a", isIn(alph1));
    }

    @Test
    public void isIn_Array() {
        Integer[] res = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
        assertThat(5, isIn(res));
    }

    @Test
    public void isOneOf_collection() {
        assertThat("a", isOneOf("a", "ab", "abc"));
    }

    @Test
    public void hasSize_collection() {
        assertThat(alph1, hasSize(4));
    }

    @Test
    public void empty_collection() {
        List<String> data = new ArrayList<>();
        assertThat(data, is(empty()));
        assertThat(data, is(emptyCollectionOf(String.class)));
    }
}
