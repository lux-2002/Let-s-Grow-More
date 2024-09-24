import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.*;
import javax.servlet.http.*;

import org.json.*;

public class CurrencyConverterServlet extends HttpServlet {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fromCurrency = request.getParameter("from");
        String toCurrency = request.getParameter("to");
        double amount = Double.parseDouble(request.getParameter("amount"));

        // Fetch exchange rate
        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);

        // Calculate converted amount
        double convertedAmount = amount * exchangeRate;

        // Send back the result as JSON
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.print("{\"convertedAmount\": " + convertedAmount + "}");
        out.flush();
    }

    private double getExchangeRate(String from, String to) throws IOException {
        URL url = new URL(API_URL + from);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        // Parse JSON response
        JSONObject json = new JSONObject(content.toString());
        return json.getJSONObject("rates").getDouble(to);
    }
}