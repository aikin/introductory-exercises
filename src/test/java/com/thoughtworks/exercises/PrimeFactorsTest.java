package com.thoughtworks.exercises;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class PrimeFactorsTest {

    @Test
    public void should_generate_empty_list_when_input_1() {
        assertThat(PrimeFactors.generate(1).isEmpty(), is(true));
    }

    @Test
    public void should_generate_correct_factors_when_input_an_integer_greater_than_1() {
        List<Integer> expectedFactorsOfThirty = Arrays.asList(2, 3, 5);
        List<Integer> unexpectedFactorsOfThirty = Arrays.asList(2, 5, 3);
        List<Integer> expectedFactorsOfHundred = Arrays.asList(2, 5, 10);
        List<Integer> expectedFactorsOfThirteen = Collections.singletonList(13);
        List<Integer> expectedFactorsOfSixtyThousand = Arrays.asList(2, 3, 4, 5, 10, 25);

        assertThat(PrimeFactors.generate(30), equalTo(expectedFactorsOfThirty));
        assertThat(PrimeFactors.generate(30), not(equalTo(unexpectedFactorsOfThirty)));
        assertThat(PrimeFactors.generate(100), equalTo(expectedFactorsOfHundred));
        assertThat(PrimeFactors.generate(13), equalTo(expectedFactorsOfThirteen));
        assertThat(PrimeFactors.generate(60000), equalTo(expectedFactorsOfSixtyThousand));
    }
}
