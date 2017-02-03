package org.sri.hamcrest;

import org.junit.Test;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.ByteArrayInputStream;

import static org.hamcrest.EasyMock2Matchers.equalTo;
import static org.hamcrest.xml.HasXPath.hasXPath;
import static org.junit.Assert.assertThat;

/**
 * Created by sridhar.easwaran on 2/2/2017.
 */
public class xml {

    @Test
    public void test_xml_path () throws Exception {

        String aListApartXML = "<daily-values> " +
                "  <total-fat units=\"g\">65</total-fat> " +
                "  <saturated-fat units=\"g\">20</saturated-fat> " +
                "  <cholesterol units=\"mg\">300</cholesterol> " +
                "  <sodium units=\"mg\">2400</sodium> " +
                "  <carb units=\"g\">300</carb> " +
                "  <fiber units=\"g\">25</fiber> " +
                "  <protein units=\"g\">50</protein> " +
                "</daily-values> ";

        Document xml = parse(aListApartXML);

        assertThat(xml, hasXPath("/daily-values/saturated-fat", equalTo("20")));
    }

    private static Document parse(String xml) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setNamespaceAware(false);
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        return documentBuilder.parse(new ByteArrayInputStream(xml.getBytes()));
    }
}
