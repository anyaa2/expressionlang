package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ELRelationalOperator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<body>\n");
      out.write("\n");
      out.write("<h2>Relational Operator</h2>\n");
      out.write("10.0==10: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${10.0==10}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("10.0 eq 10: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${10.0 eq 10}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("((20*10)!= 200): ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${((20*10)!= 200)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("3 ne 3: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${3 ne 3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("3.2>=2: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${3.2>=2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("3.2 ge 2: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${3.2 ge 2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("2<3: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${2<3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("4 lt 6: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${4 lt 6}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("2 <= 4: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${2 <= 4}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("4 le 2: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${4 le 2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("</body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
