package pattern.method.factory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Created by xiaoy on 2018/4/2.
 */
public class XMLUtil {

    public static Object getBean() {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            String thisPackagePath=XMLUtil.class.getResource("").toString();
            int m=thisPackagePath.indexOf("/");
            thisPackagePath=thisPackagePath.substring(m+1);
            Document document = documentBuilder.parse(new File(thisPackagePath+"config.xml"));
            NodeList nodeList = document.getElementsByTagName("className");
            String className = nodeList.item(0).getTextContent();
            Class cla = Class.forName(className);
            Object obj = cla.newInstance();
//            Logger log = (LoggerFactory) obj;
            return obj;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            return null;
        }
    }

}
