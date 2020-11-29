package Module8;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.traversal.NodeFilter;

import javax.swing.text.html.parser.Parser;

public class Pars {
    public static void main(String[] args) {
        try {
            Parser parser = new Parser("http://www.alliance-bags.ru/catalog.php?tov=576");
            parser.setEncoding("windows-1251");

            NodeFilter atrb1 = new TagNameFilter("IMG");
            NodeList nodeList = parser.parse(atrb1);

            for(int i=0; i<nodeList.size(); i++) {
                Node node = nodeList.elementAt(i);
                System.out.println(node.toHtml());
            }

        } catch (ParserException e) {
            e.printStackTrace();
        }
    }
}
