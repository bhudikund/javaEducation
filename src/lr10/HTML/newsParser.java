package lr10.HTML;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class newsParser {
    public static void main(String[] args) {
        Node test;
        JSONObject testt = new JSONObject();
        Node test2;
        try{
            Document doc = Jsoup.connect("http://fat.urfu.ru/").get();
            Elements newParent = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");
            for (int i = 3; i < 20; i++){
                if (!(i % 2 == 0)){
                    List<Node> nodes= newParent.get(0).childNodes();
                    /*System.out.println("Тема : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));*/
                    test = ((Element) nodes.get(i))
                            .getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0);
                    test2 = ((Element) nodes.get(i))
                            .getElementsByClass("blockdate")
                            .get(0).childNodes().get(0);
                    testt.put(test2.toString(),test.toString());
                    //System.out.println(test.toString());
                    /*System.out.println("Дата: " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) +
                            "\n");*/
                    try(FileWriter file = new FileWriter("G:\\Labs\\labs\\src\\lr10\\HTML\\test.json")){
                        file.write(testt.toJSONString());
                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            }
        }catch ( IOException e){
            e.printStackTrace();
        }
    }
}
