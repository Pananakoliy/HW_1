import java.io.*;

import javax.servlet.*;

import javax.servlet.http.*;


public class Servlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("title", "D-/r-ach");
        request.setAttribute("hint1", "Put the 'Kapacik' in the login");
        request.setAttribute("hint2", " (And in the password too)");

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = request.getReader();
        String line = "";

        while ((line = reader.readLine()) != null) {
            builder.append(line);
        }
        String data = builder.toString();

        String[] userData = data.split("&");
        String[] fieldData = null;
        String userName = "";
        String userPassword = "";

        for (String field : userData) {
            fieldData = field.split("=");

            switch (fieldData[0]) {
                case "userName":
                    if (fieldData.length == 2) {
                        userName = fieldData[1];
                    }
                    break;
                case "userPassword":
                    if (fieldData.length == 2) {
                        userPassword = fieldData[1];
                    }
                    break;
            }
        }

        if (userName.equals("Kapacik") && userPassword.equals("Kapacik")) {
            request.getRequestDispatcher("enterTheSite.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("notTodayEnterTheSite.jsp").forward(request, response);
        }
    }
}