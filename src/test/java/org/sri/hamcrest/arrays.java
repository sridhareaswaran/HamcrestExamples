package org.sri.hamcrest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.collection.IsArray.array;
import static org.junit.Assert.assertThat;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class arrays {

    Integer[] intData1 = new Integer[]{1, 2, 3, 4, 5};
    Integer[] intData2 = new Integer[]{1, 2, 3, 4, 5};

    @Test
    public void array_test() {
        //assertThat(intData1, array());
    }

    @Test
    public void hasItemInArray_test() {
        //assertThat(intData1, hasItemInArray(new Integer[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void arrayContaining_test() {
        assertThat(intData1, arrayContaining(intData2));
    }

    @Test
    public void arrayContainingInAnyOrder_test() {
        Integer[] intData3 = new Integer[]{1, 3, 5, 2, 4};
        assertThat(intData1, arrayContainingInAnyOrder(intData3));
    }

    @Test
    public void arrayWithSize_test() {
        assertThat(intData1, arrayWithSize(5));
    }

    @Test
    public void emptyArray_test() {
        Integer[] intData3 = new Integer[]{};
        assertThat(intData3, emptyArray());
    }
}
