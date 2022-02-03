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

    private static String ToFahrenheit(Request req, Response res) {
        System.out.println(req);
        System.out.println(req.queryParams("temperature"));
        return String.valueOf((Float.parseFloat(req.queryParams("temperature")) - 32) * 5 / 9)+ "";
    }

    private static String ToCelsius(Request req, Response res) {
        System.out.println(req.queryParams("temperature"));
        return String.valueOf((Float.parseFloat(req.queryParams("temperature")) * 9 / 5) + 32)+ "";
    }
    /*public static void main(String[] args) {
        port(getPort());
        get("/inputdata", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }

    private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                + "<body>"
                + "<h2>HTML Forms</h2>"
                + "<form action=\"/results\">"
                + "  First name:<br>"
                + "  <input type=\"text\" name=\"firstname\" value=\"Mickey\">"
                + "  <br>"
                + "  Last name:<br>"
                + "  <input type=\"text\" name=\"lastname\" value=\"Mouse\">"
                + "  <br><br>"
                + "  <input type=\"submit\" value=\"Submit\">"
                + "</form>"
                + "<p>If you click the \"Submit\" button, the form-data will be sent to a page called \"/results\".</p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }

    private static String resultsPage(Request req, Response res) {
        return req.queryParams("firstname") + " " +
                req.queryParams("lastname");
    }*/
}
