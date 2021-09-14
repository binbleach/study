import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class _03sendRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //重定向，打在浏览器的地址栏上的所以肯定是get请求，重定向至少发送两次请求而只有其中一次是用户发的，状态码是302就是重定向发送的请求
        resp.sendRedirect("/myweb/Welcome");  //指向01Welcome
        //或者resp.sendRedirect("Welcome"); 没有斜杠
    }
}
