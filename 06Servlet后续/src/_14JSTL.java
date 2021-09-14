import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class _14JSTL extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        _14stu xu=new _14stu("20","徐广宸");
        _14stu cai = new _14stu("21","蔡徐坤");
        List list = new ArrayList();
        list.add(xu);
        list.add(cai);
        HttpSession session = req.getSession();
        req.setAttribute("stu",list);
        req.getRequestDispatcher("ELJSTL.jsp").forward(req,resp);

    }
}
