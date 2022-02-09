package edu.escuelaing.arep;

import spark.Request;
import spark.Response;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        port(getPort());
        get("/Index", (req, res) -> inputDataPage(req, res));
        get("/toCelsius", (req, res) -> ToCelsius(req, res));
        get("/toFahrenheit", (req, res) -> ToFahrenheit(req, res));
    }

    public static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>Temperature</h2>"
                + "<form action=\"/toCelsius\">"
                + "  From Fahrenheit:<br>"
                + "  <input type=\"number\" name=\"temperature\" value=\"0\">"
                + "  <br>"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<form action=\"/toFahrenheit\">"
                + "  From Celsius:<br>"
                + "  <input type=\"number\" name=\"temperature\" value=\"0\">"
                + "  <br>"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String ToCelsius(Request req, Response res) {
        System.out.println(req);
        System.out.println(req.queryParams("temperature"));
        return (Float.parseFloat(req.queryParams("temperature")) - 32) * 5 / 9+ "";
    }

    private static String ToFahrenheit(Request req, Response res) {
        System.out.println(req.queryParams("temperature"));
        return (Float.parseFloat(req.queryParams("temperature")) * 9 / 5) + 32 + "";
    }

}
