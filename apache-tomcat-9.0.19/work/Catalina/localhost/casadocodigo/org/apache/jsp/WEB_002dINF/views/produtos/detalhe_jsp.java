/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2019-05-15 13:00:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.produtos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detalhe_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/Danilo/eclipse-workspace/apache-tomcat-9.0.19/wtpwebapps/casadocodigo/WEB-INF/lib/spring-webmvc-5.1.7.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1557423488000L));
    _jspx_dependants.put("jar:file:/C:/Users/Danilo/eclipse-workspace/apache-tomcat-9.0.19/wtpwebapps/casadocodigo/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/c.tld", Long.valueOf(1308137770000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.1.7.RELEASE.jar", Long.valueOf(1557521036556L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl-1.2.jar", Long.valueOf(1557435456007L));
    _jspx_dependants.put("jar:file:/C:/Users/Danilo/eclipse-workspace/apache-tomcat-9.0.19/wtpwebapps/casadocodigo/WEB-INF/lib/jstl-impl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1308137770000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\r\n");
      out.write("<link rel=\"icon\" href=\"//cdn.shopify.com/s/files/1/0155/7645/t/177/assets/favicon.ico?11981592617154272979\" type=\"image/ico\" />\r\n");
      out.write("<link href=\"https://plus.googlecom/108540024862647200608\" rel=\"publisher\" />\r\n");
      out.write("<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.titulo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" - Casa do Código</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/cssbase-min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Droid+Sans:400,700' rel='stylesheet' />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/fonts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/fontello-ie7.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/fontello-embedded.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/fontello.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/layout-colors.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/responsive-style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/guia-do-programador-style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("resources/css/produtos.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"canonical\" href=\"http://www.casadocodigo.com.br/\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"produto\">\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"layout-header\">\r\n");
      out.write("\t\t<div class=\"clearfix container\">\r\n");
      out.write("\t\t\t<a href=\"/\" id=\"logo\"> </a>\r\n");
      out.write("\t\t\t<div id=\"header-content\">\r\n");
      out.write("\t\t\t\t<nav id=\"main-nav\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/carrinho\" rel=\"nofollow\">Carrinho(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${carrinhoCompras.quantidade}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(")</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/pages/sobre-a-casa-do-codigo\" rel=\"nofollow\">Sobre\r\n");
      out.write("\t\t\t\t\t\t\t\tNós</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/pages/perguntas-frequentes\" rel=\"nofollow\">Perguntas\r\n");
      out.write("\t\t\t\t\t\t\t\tFrequentes</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<nav class=\"categories-nav\">\r\n");
      out.write("\t\t<ul class=\"container\">\r\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"http://www.casadocodigo.com.br\">Home</a></li>\r\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-agile\">\r\n");
      out.write("\t\t\t\t\tAgile </a></li>\r\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-front-end\">\r\n");
      out.write("\t\t\t\t\tFront End </a></li>\r\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-games\">\r\n");
      out.write("\t\t\t\t\tGames </a></li>\r\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-java\">\r\n");
      out.write("\t\t\t\t\tJava </a></li>\r\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/livros-de-mobile\">\r\n");
      out.write("\t\t\t\t\tMobile </a></li>\r\n");
      out.write("\t\t\t<li class=\"category\"><a\r\n");
      out.write("\t\t\t\thref=\"/collections/livros-desenvolvimento-web\"> Web </a></li>\r\n");
      out.write("\t\t\t<li class=\"category\"><a href=\"/collections/outros\"> Outros </a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<article id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t<header id=\"product-highlight\" class=\"clearfix\">\r\n");
      out.write("\t\t\t<div id=\"product-overview\" class=\"container\">\r\n");
      out.write("\t\t\t\t<img width=\"280px\" height=\"395px\"\r\n");
      out.write("\t\t\t\t\tsrc=\"http://cdn.shopify.com/s/files/1/0155/7645/products/css-eficiente-featured_large.png?v=1435245145\"\r\n");
      out.write("\t\t\t\t\tclass=\"product-featured-image\" />\r\n");
      out.write("\t\t\t\t<h1 class=\"product-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.titulo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("\t\t\t\t<p class=\"product-author\">\r\n");
      out.write("\t\t\t\t\t<span class=\"product-author-link\"> </span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p class=\"book-description\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.descricao}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<section class=\"buy-options clearfix\">\r\n");
      out.write("\t\t\t<form action='");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("' method=\"post\" class=\"container\">\r\n");
      out.write("\t\t\t\t<ul id=\"variants\" class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"produtoId\" />\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<button type=\"submit\" class=\"submit-image icon-basket-alt\"\r\n");
      out.write("\t\t\t\t\talt=\"Compre Agora\" title=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.titulo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></button>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<section class=\"summary\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><h3>\r\n");
      out.write("\t\t\t\t\t\t\tE muito mais... <a href='/pages/sumario-java8'>veja o sumário</a>.\r\n");
      out.write("\t\t\t\t\t\t</h3></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<section class=\"data product-detail\">\r\n");
      out.write("\t\t\t\t<h2 class=\"section-title\">Dados do livro:</h2>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tNúmero de páginas: <span itempro=\"numberOfPages\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.paginas}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t<p>Data de publicação: ");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("</p>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tEncontrou um erro? <a href='/submissao-errata' target='_blank'>Submeta\r\n");
      out.write("\t\t\t\t\t\tuma errata</a>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</section>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</article>\r\n");
      out.write("\r\n");
      out.write("\t<footer id=\"layout-footer\">\r\n");
      out.write("\t\t<div class=\"clearfix container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"collections-footer\">\r\n");
      out.write("\t\t\t\t<!-- cdc-footer -->\r\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Coleções de Programação</p>\r\n");
      out.write("\t\t\t\t<ul class=\"footer-text-links\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-java\">Java</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-desenvolvimento-web\">Desenvolvimento\r\n");
      out.write("\t\t\t\t\t\t\tWeb</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-mobile\">Mobile</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/games\">Games</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-front-end\">Front End</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Outros Assuntos</p>\r\n");
      out.write("\t\t\t\t<ul class=\"footer-text-links\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/livros-de-agile\">Agile</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/collections/outros\">e outros...</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"social-footer\">\r\n");
      out.write("\t\t\t\t<!-- books-footer -->\r\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Links da Casa do Código</p>\r\n");
      out.write("\t\t\t\t<ul class=\"footer-text-links\">\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://livros.casadocodigo.com.br\" rel=\"nofollow\">Meus\r\n");
      out.write("\t\t\t\t\t\t\tE-books</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/pages/sobre-a-casa-do-codigo\">Sobre a Casa\r\n");
      out.write("\t\t\t\t\t\t\tdo Código</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"/pages/perguntas-frequentes\">Perguntas\r\n");
      out.write("\t\t\t\t\t\t\tFrequentes</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"https://www.caelum.com.br\">Caelum - Ensino e\r\n");
      out.write("\t\t\t\t\t\t\tInovação</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"http://www.codecrushing.com/\" rel=\"nofollow\">Code\r\n");
      out.write("\t\t\t\t\t\t\tCrushing</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\thref=\"http://www.casadocodigo.com.br/pages/politica-de-privacidade\"\r\n");
      out.write("\t\t\t\t\t\trel=\"nofollow\">Política de Privacidade</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Redes Sociais</p>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li class=\"social-links\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"http://www.twitter.com/casadocodigo\" target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\tid=\"twitter\" rel=\"nofollow\">Facebook</a> <a\r\n");
      out.write("\t\t\t\t\t\thref=\"http://www.facebook.com/casadocodigo\" target=\"_blank\"\r\n");
      out.write("\t\t\t\t\t\tid=\"facebook\" rel=\"nofollow\">Twitter</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"newsletter-footer\">\r\n");
      out.write("\t\t\t\t<!-- social-footer -->\r\n");
      out.write("\t\t\t\t<p class=\"footer-title\">Receba as Novidades e Lançamentos</p>\r\n");
      out.write("\t\t\t\t<div id=\"form-newsletter\">\r\n");
      out.write("\t\t\t\t\t<form action=\"\" method=\"POST\" id=\"ss-form\" class=\"form-newsletter\">\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><input type=\"hidden\" name=\"pageNumber\" value=\"0\" /><input\r\n");
      out.write("\t\t\t\t\t\t\t\ttype=\"hidden\" name=\"backupCache\" value=\"\" /><input type=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"entry.0.single\" value=\"\" class=\"ss-q-short\" id=\"entry_0\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"seu@email.com\" /></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><input type=\"submit\" name=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"Quero Receber!\" id=\"submit-newsletter\" /></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"ie8\"><a href=\"\" rel=\"nofollow\">Receba as\r\n");
      out.write("\t\t\t\t\t\t\t\tNovidades e Lançamentos</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<ul class=\"footer-payments\">\r\n");
      out.write("\t\t\t\t\t<li></li>\r\n");
      out.write("\t\t\t\t\t<li></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/produtos/detalhe.jsp(11,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/");
      // /WEB-INF/views/produtos/detalhe.jsp(11,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("contextPath");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/produtos/detalhe.jsp(85,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/carrinho/add");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/produtos/detalhe.jsp(88,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/produtos/detalhe.jsp(88,5) '${produto.precos}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${produto.precos}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/produtos/detalhe.jsp(88,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("preco");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<li class=\"buy-option\"><input type=\"radio\" name=\"tipo\"\r\n");
            out.write("\t\t\t\t\t\t\tclass=\"variant-radio\" id=\"tipo\"\r\n");
            out.write("\t\t\t\t\t\t\tvalue=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preco.tipo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" checked=\"checked\" /> <label\r\n");
            out.write("\t\t\t\t\t\t\tclass=\"variant-label\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preco.tipo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</label> \r\n");
            out.write("\t\t\t\t\t\t\t<small class=\"compare-at-price\">R$ 39,90</small>\r\n");
            out.write("\t\t\t\t\t\t\t<p class=\"variant-price\" itempro=\"price\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${preco.valor}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</p></li>\r\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /WEB-INF/views/produtos/detalhe.jsp(118,27) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("dd/MM/yyyy");
      // /WEB-INF/views/produtos/detalhe.jsp(118,27) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.dataLancamento.time}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }
}
