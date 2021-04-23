package lab2wclient;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.InvalidParameterException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

@WebServlet(name = "MessageKeeperClient", urlPatterns = {"/MessageKeeperClient"})
public class MessageKeeperClient extends HttpServlet {
    
    @WebServiceRef(wsdlLocation="http://localhost:8080/Lab3J210A-war/IDemo?WSDL")
    private IDemo service;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        IDemoImpl port = service.getIDemoImplPort();
        
        String addMsg = request.getParameter("addMsg");
        String getMsg = request.getParameter("getMsg");
        String allMsg = request.getParameter("allMsg");
        
        if(addMsg != null){
            String user = request.getParameter("user");
            String msg = request.getParameter("msg");
            port.add(user, msg);
            request.setAttribute("answer", "INFO: message has been added for user " + user);
        }
        
        if(getMsg != null){
            String user = request.getParameter("user");
            String idx = request.getParameter("idx");
            try{
                int index = Integer.parseInt(idx);
                String message = null;
                try{
                    message = port.getMessage(user, index);
                }catch(InvalidParameterException e){
                    request.setAttribute("answer", "ERROR: no such user or invalid index.");
                    e.printStackTrace();
                }
                request.setAttribute("answer", "INFO: message number " + index + " for user " + user + " : \"" + message + "\"");
            }
            catch(NumberFormatException e){
                System.out.println("Введенный индекс не может быть преобразован к числу");
                request.setAttribute("answer", "ERROR: wrong number format for index.");
            }
        }
        
        if(allMsg != null){
            String user = request.getParameter("user");
            List<String> allUsersMessages = port.getAllMessage(user);
            if(allUsersMessages != null){
                StringBuilder sb = new StringBuilder();
                sb.append("<ul>");
                for(String message : allUsersMessages){
                    sb.append("<li>");
                    sb.append(message);
                    sb.append("</li>");
                }
                sb.append("</ul>");
                request.setAttribute("answer", sb.toString());
            }else{
                request.setAttribute("answer", "ERROR: messages list for user" + user + " == null.");
            }
        }
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MessageKeeperClient</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MessageKeeperClient at " + request.getContextPath() + "</h1>");
            
            //out.println("<h1>service = " + service + "</h1>");
            
            
            List<String> ms = port.getAllMessage("uuu");
            out.println("Список :" + ms);
            for (int i = 0; i < ms.size(); i++) {
                out.println(" Пользователь uuu, сообщение " + i + " : " + ms.get(i));
            }
            
            //out.println("<h1>port = " + port + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
