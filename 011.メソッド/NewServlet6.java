/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author geust1Day
 */
public class NewServlet6 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //　３人分のプロフィール情報を，それぞれ配列で作成してください（プロフィール情報の項目は，課題「引数、戻り値1」と同様です）。
    // ただし，そのうちの１人については，住所 の値を null にしてください。
　  //そして，引数で受け取った文字列と ID の値が一致する人物について，そのプロフィール情報の配列を戻り値としてください。
　  //メソッドを作成したら，このメソッドを適宜呼び出し，３人分のプロフィール情報をすべて画面に表示してください。
    //ただし，値が null なデータについては continue; を利用して画面表示をスキップしてください
         
        String A(String X) {
     return "a" + X;
    }
        String B(String X) {
     return "b" + X;
    }
        String C(String X) {
     return "c" + X; 
    }
      
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
   for (int i=0; i<1;i++){
    String profile1[] = {"111111111","1994年11月22日","埼玉県川越市"};
    out.print(A(profile1[0] + "<br>"));
    out.print(A((profile1[1] == null) + "<br>"));
    out.print(A(profile1[2] + "<br>"));
    out.print("<br>");
    
    String profile2[] = {"222222222","1994年11月23日","埼玉県狭山市"};
    out.print(B(profile2[0] + "<br>"));
    out.print(B(profile2[1] + "<br>"));
    out.print(B(profile2[2] + "<br>"));
    out.print("<br>");
    
    String profile3[] = {"333333333","1994年11月24日","埼玉県所沢市"};
    out.print(C(profile3[0] + "<br>"));
    out.print(C(profile3[1] + "<br>"));
    out.print(C(profile3[2] + "<br>"));
    continue;
   }
    return;
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
