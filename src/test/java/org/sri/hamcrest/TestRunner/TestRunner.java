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
        arrays.class,
        general.class,
        strings.class,
        machersMix.class,
        iterables.class,
        collections.class
})
public class TestRunner {
}
