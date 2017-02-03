package org.sri.hamcrest;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class general {

    List<String> alph1 = Arrays.asList("a", "b", "c", "d");
    List<String> alph2 = Arrays.asList("a", "b", "c", "d");
    List<String> alph3 = Arrays.asList("a", "b", "c", "d", "e");
    String empty = null;


    /**
     * equalTo - test object equality using Object.equals
     */
    @Test
    public void euqalTo_test() {
        assertThat(22, equalTo(22));
        assertThat("sri", equalTo("sri"));
        assertThat("sri", equalTo(new String("sri")));

        /**
         * is - decorator to improve readability - see "Sugar", below
         */
        assertThat(22, is(equalTo(22)));
        assertThat(alph1, is(equalTo(alph2)));

        /** not  */
        assertThat("sri", is(not("madhu")));

        /** anything - always matches, useful if you don't care what the object under test is */
        assertThat(22, anything());
        assertThat(22, is(anything()));

    }

    /** any(Class<T>)
     * instanceOf(Class<?>)
     * isA(Class<T>)
     */
    @Test
    public void InstanceCheck_test(){
        assertThat(22, any(Integer.class));
        assertThat(22, instanceOf(Integer.class));
        assertThat("sri", isA(String.class));
        Map<Integer, String> map = new HashMap<Integer, String>();
        assertThat(map, isA(Map.class));
    }

    /**
     nullValue()	 :	Matcher<Object>
     nullValue(Class<T>)	 :	Matcher<T>
     notNullValue()	 :	Matcher<Object>
     notNullValue(Class<T>)	 :	Matcher<T>
     */
    @Test
    public void nullCheck_test(){
        assertThat(null, is(nullValue()));
        assertThat(empty, is(nullValue(String.class)));
        assertThat(22, notNullValue());
        assertThat(22, notNullValue(Integer.class));
    }

    /**
     sameInstance(T)
     theInstance(T)	 :	Matcher<T>
     */
    @Test
    public void sameIntance_test(){
        assertThat(empty, sameInstance(null));
        String s1 = "test";
        String s2 = "test";
        assertThat(s1, sameInstance(s2));
        assertThat(77, theInstance(77));
    }


}
