package org.sri.hamcrest.TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.sri.hamcrest.*;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */

@RunWith(Suite.class)
@SuiteClasses({
        general.class,
        machersMix.class,
        strings.class,
        numbers.class,
        comparables.class,
        arrays.class,
        maps.class,
        classes.class,
        iterables.class,
        collections.class,
        beans.class,
        xml.class
})
public class TestRunner {
}
