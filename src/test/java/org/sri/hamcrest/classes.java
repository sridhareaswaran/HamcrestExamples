package org.sri.hamcrest;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.object.IsCompatibleType.typeCompatibleWith;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class classes {

    @Test
    public void typecheck() {
        assertThat(Integer.class, typeCompatibleWith(Number.class));
    }
}
