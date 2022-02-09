package edu.escuelaing.arep;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test(threadPoolSize = 10, invocationCount = 15, timeOut = 1000)
        public void toFahrenheitShouldAnswerWithTrue()
    {
        try {
            Double expected = 32.0;
            URL url = new URL("http://localhost:4567/toFahrenheit?temperature=0");
            URLConnection urlConnection= url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            assertTrue(Math.abs(new Double(reader.readLine())-expected)==0);

        } catch (Exception e) {
            assertTrue( false );
        }
    }

    @Test(threadPoolSize = 10, timeOut = 1000)
    public void ToCelsiusShouldAnswerWithTrue()
    {
        try {
            Double expected = 0.0;
            URL url = new URL("http://localhost:4567/toCelsius?temperature=32");
            URLConnection urlConnection= url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            assertTrue(Math.abs(new Double(reader.readLine())-expected)==0);

        } catch (Exception e) {
            assertTrue( false );
        }
    }
}
