package org.eustrosoft;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class SimServlet extends HttpServlet {

    @Inject
    private ExampleBean bean;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        resp.getWriter().append("Login:" + bean.getLogin());
        resp.getWriter().append("Password:" + bean.getPassword());
    }

}
