import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet(name = "FileUpServlet")
public class FileUpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //手工接收上传文件
        InputStream in = request.getInputStream();
        PrintWriter pw = response.getWriter();
        int i=-1;
        byte bytes[] = new byte[1024];
        while ((i=in.read(bytes))!=-1){
            String a = new String(bytes,0,i);
            pw.print(a);
        }
        in.close();
    }
}
