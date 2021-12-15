package com.bilibili.xmlDemo;

import com.bilibili.annotation.OneAnnotation_;
import com.bilibili.enumDemo.Color;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.ArrayList;
import java.util.List;

public class resolveXml {
    public static void main(String[] args) throws DocumentException {

        ArrayList<music> list = new ArrayList<>();

        //SAXReader creates a DOM4J tree from SAX parsing events
        SAXReader sr = new SAXReader();
        Document document = sr.read("Day-20211211/xml/audio.xml");
        Element element = document.getRootElement();
        List<Element> musics = element.elements("music");

        for (Element music : musics) {
            Attribute idAttr = music.attribute("id");
            String id = idAttr.getValue();

            Element nameElem = music.element("name");
            String name = nameElem.getText();

            Element singerElem = music.element("singer");
            String singer = singerElem.getText();

            list.add(new music(id, name, singer));
        }

        for (music music : list) {
            System.out.println(music);
        }
    }
}

class music{
    private String musClass;
    private String musName;
    private String singer;

    public music() {
    }

    public music(String musClass, String musName, String singer) {
        this.musClass = musClass;
        this.musName = musName;
        this.singer = singer;
    }

    public String getMusClass() {
        return musClass;
    }

    public void setMusClass(String musClass) {
        this.musClass = musClass;
    }

    public String getMusName() {
        return musName;
    }

    public void setMusName(String musName) {
        this.musName = musName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "music{" +
                "musClass='" + musClass + '\'' +
                ", musName='" + musName + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}