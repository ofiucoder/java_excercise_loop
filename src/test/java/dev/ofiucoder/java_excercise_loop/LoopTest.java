package dev.ofiucoder.java_excercise_loop;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class LoopTest {

    @Test
    public void printMultiplicationTableTest_positiveNumber() {
        int number = 5;
        String expectedOutput = "Tabla de Multiplicar del " + number + "\n" +
                                "5 x 1 = 5\n" +
                                "5 x 2 = 10\n" +
                                "5 x 3 = 15\n" +
                                "5 x 4 = 20\n" +
                                "5 x 5 = 25\n" +
                                "5 x 6 = 30\n" +
                                "5 x 7 = 35\n" +
                                "5 x 8 = 40\n" +
                                "5 x 9 = 45\n" +
                                "5 x 10 = 50";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setOut(System.out); 

        String actualOutput = outContent.toString();

        assertThat(actualOutput, equalTo(expectedOutput));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -5})
    public void printMultiplicationTableTest_nonPositiveNumber(int number) {
        String expectedOutput = "Tabla de Multiplicar del " + number + "\n";

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setOut(System.out); 

        String actualOutput = outContent.toString();

        assertThat(actualOutput, equalTo(expectedOutput));
    }
}