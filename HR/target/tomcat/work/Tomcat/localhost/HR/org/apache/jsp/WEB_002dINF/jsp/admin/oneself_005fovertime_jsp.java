/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-08-08 06:10:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.wls.entity.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.wls.util.MTimeUtil;
import com.wls.entity.Overtime;

public final class oneself_005fovertime_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 String path = request.getContextPath(); 
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<title>HR医院 - 加班列表</title>\n");
      out.write("\t<meta name=\"keywords\" content=\"\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\t<link href=\"");
      out.print(path );
      out.write("/css/bootstrap.min.css?v=3.3.6\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"");
      out.print(path );
      out.write("/css/font-awesome.css?v=4.4.0\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\t<!-- Data Tables -->\n");
      out.write("\t<link href=\"");
      out.print(path );
      out.write("/css/plugins/dataTables/dataTables.bootstrap.css\"\n");
      out.write("\t\trel=\"stylesheet\">\n");
      out.write("\t<link href=\"");
      out.print(path );
      out.write("/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("\t<link href=\"");
      out.print(path );
      out.write("/css/style.css?v=4.1.0\" rel=\"stylesheet\">\n");
      out.write("\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path );
      out.write("/dist/sweetalert.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"gray-bg\">\n");
      out.write("\t<div class=\"wrapper wrapper-content animated fadeInRight\">\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t<div class=\"ibox float-e-margins\">\n");
      out.write("\t\t\t\t\t<div class=\"ibox-title\">\n");
      out.write("\t\t\t\t\t\t<h5>加班列表</h5>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"ibox-content\">\n");
      out.write("\t\t\t\t\t\t<div style=\"margin-bottom: 8px\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"");
      out.print(path );
      out.write("/overtime/toAdd.do\" class=\"btn btn-success\">安排加班</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<table class=\"table table-striped table-bordered table-hover dataTables-example\">\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>序号</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>部门</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>加班人员</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th>日期</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t");

								Page<Overtime> pe=(Page<Overtime>)request.getAttribute("page");
	                            if(null != pe && null != pe.getRecords() && pe.getRecords().size()>0){
	                            	List<Overtime> list = pe.getRecords();
	                            	int index=1;
	                            	for(Overtime overtime : list){
                            
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<tr class=\"gradeA\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(index++ );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(overtime.getDepartment().getName() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(overtime.getEmployee().getName() );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t");

									String day = MTimeUtil.dateFormat(overtime.getDay());
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(day );
      out.write("</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t");

                            		}
                           		 }
                             
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<span style=\"float: left; padding: 5px\">\n");
      out.write("\t\t\t\t\t\t\t\t当前&nbsp;<span style=\"color: red;\">");
      out.print(pe.getCurrent() );
      out.write("</span>&nbsp;/&nbsp;<b>");
      out.print(pe.getPages() );
      out.write("</b>&nbsp;页&nbsp;&nbsp;\n");
      out.write("\t\t\t\t\t\t\t\t总共&nbsp;<b>");
      out.print(pe.getTotal() );
      out.write("</b>&nbsp;条</span>\n");
      out.write("\t\t\t\t\t\t\t<nav aria-label=\"Page navigation\" style=\"margin: 0 auto; width: 240px\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"pagination\" style=\"margin: 0;\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"");
      out.print(path );
      out.write("/overtime/listPage.do?pageNo=");
      out.print(pe.getCurrent()-1>1?pe.getCurrent()-1:1 );
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-label=\"Previous\"> <span aria-hidden=\"true\">前一页</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t");

	 								for(int i=1;i<=pe.getPages();i++){
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/overtime/listPage.do?pageNo=");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i );
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t");

	 								 }
								
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"");
      out.print(path );
      out.write("/overtime/listPage.do?pageNo=");
      out.print(pe.getCurrent()+1<pe.getPages()?pe.getCurrent()+1:pe.getPages() );
      out.write("\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\taria-label=\"Next\"> <span aria-hidden=\"true\">后一页</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</nav>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- 全局js -->\n");
      out.write("\t<script src=\"");
      out.print(path );
      out.write("/js/jquery.min.js?v=2.1.4\"></script>\n");
      out.write("\t<script src=\"");
      out.print(path );
      out.write("/js/bootstrap.min.js?v=3.3.6\"></script>\n");
      out.write("\t<script src=\"");
      out.print(path );
      out.write("/js/plugins/jeditable/jquery.jeditable.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Data Tables -->\n");
      out.write("\t<script src=\"");
      out.print(path );
      out.write("/js/plugins/dataTables/jquery.dataTables.js\"></script>\n");
      out.write("\t<script src=\"");
      out.print(path );
      out.write("/js/plugins/dataTables/dataTables.bootstrap.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- 自定义js -->\n");
      out.write("\t<script src=\"");
      out.print(path );
      out.write("/js/content.js?v=1.0.0\"></script>\n");
      out.write("\n");
      out.write(" \t<!-- layer javascript -->\n");
      out.write("    <script src=\"js/plugins/layer/layer.min.js\"></script>\n");
      out.write("    \n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\tfunction del(id){\n");
      out.write("\t\tparent.layer.confirm('确认删除？', {\n");
      out.write("\t\t    btn: ['确认','取消'], //按钮\n");
      out.write("\t\t    shade: false //不显示遮罩\n");
      out.write("\t\t}, function(){\n");
      out.write("\t\t    parent.layer.msg('删除成功！', {icon: 1});\n");
      out.write("\t\t    location.href=\"./\"+ id +\"/delete.do\";\n");
      out.write("\t\t});\n");
      out.write("\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}