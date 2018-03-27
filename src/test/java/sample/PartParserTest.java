package sample;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Created by lv-wei on 2018-03-26.
 */
public class PartParserTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getThreeModel() throws Exception {

        PartParser pp = new PartParser(
                "c:\\Program1\\COINV\\DASP11\\ModalExample\\悬索桥模型4#1.xyz",
                "c:\\Program1\\COINV\\DASP11\\ModalExample\\悬索桥模型4#.pcl",
                1,
                1,
                143,
                524
        );

        String threeJson = pp.getThreeModel();

        File file = new File("c:\\projects\\angular\\three-partice2\\src\\assets\\scene\\square.json");

        FileUtils.writeStringToFile(file, threeJson);

        System.out.println("Have been wrote to file.");

    }

}