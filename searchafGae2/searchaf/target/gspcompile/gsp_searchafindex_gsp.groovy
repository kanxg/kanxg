import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_searchafindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer codecOut = getCodecOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("keywords"),'content':("ebuybot 电子购物机器人 Amazon 亚马逊 价格监视")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(3)
createTagBody(2, {->
invokeTag('captureTitle','sitemesh',7,[:],-1)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',32,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
out.print(request.getContextPath())
printHtmlPart(7)
out.print(request.getContextPath())
printHtmlPart(8)
})
invokeTag('captureBody','sitemesh',255,[:],1)
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1384611524000L
public static final String DEFAULT_CODEC = null
}
