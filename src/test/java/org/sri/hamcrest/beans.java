package org.sri.hamcrest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.EasyMock2Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;
import static org.junit.Assert.assertThat;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class beans {

    class Truck {

        private String model;
        private String make;
        private int year;

        public Truck(String model, String make, int year) {
            super();
            this.model = model;
            this.make = make;
            this.year = year;
        }

    }


    @Test
    public void hasProperty_test() {
        Truck pickupTruck = new Truck("Ram", "Dodge", 1965);
        assertThat(pickupTruck, hasProperty("model"));
    }

    @Test
    public void object_has_property_with_value () {
        Truck pickupTruck = new Truck("Big 10", "Chevy", 1976);
        assertThat(pickupTruck, hasProperty("model", is(equalTo("Big 10"))));
    }

    @Test
    public void object_has_property_values_as () {
        Truck pickupTruck1 = new Truck("Big 10", "Chevy", 1976);
        Truck pickupTruck2 = new Truck("Big 10", "Chevy", 1976);
        assertThat(pickupTruck1, samePropertyValuesAs(pickupTruck2));
    }
}
