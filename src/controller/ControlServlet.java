package controller;

import domain.Category;
import service.BusinessService;
import serviceImpl.BusinessServiceImpl;
import util.FillBeanUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by 83731 on 2017/11/26.
 */

public class ControlServlet extends HttpServlet {
    private BusinessService s = new BusinessServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String op = req.getParameter("op");
        if ("addCategory".equals(op)) {
            addCategory(req, resp);
        }
    }

    private void addCategory(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Category category = FillBeanUtil.fillBean(req, Category.class);
        category.setId("dfasdfasfd");
        s.addCategory(category);
        req.setAttribute("msg", "保存成功!");
        req.getRequestDispatcher("/manage/message.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
