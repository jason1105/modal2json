package sample.model;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.Arrays;

/**
 * Created by lv-wei on 2018-03-19.
 */
public class JSONModelFormat3Test {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void addVertex() throws Exception {
        Float[] vertices = {0.655695f, -0.182568f, -1.28599f, 0.655695f, -0.182568f, 0.714006f, -1.34431f, -0.182568f, 0.714006f, -1.3443f, -0.182568f, -1.28599f, 0.655695f, 1.81743f, -1.28599f, 0.655694f, 1.81743f, 0.714007f, -1.34431f, 1.81743f, 0.714005f, -1.34431f, 1.81743f, -1.28599f, 0.655695f, -0.182568f, -1.28599f, 0.655695f, -0.182568f, -1.28599f, 0.655695f, -0.182568f, 0.714006f, 0.655695f, -0.182568f, 0.714006f, -1.3443f, -0.182568f, -1.28599f, -1.3443f, -0.182568f, -1.28599f, 0.655695f, 1.81743f, -1.28599f, 0.655695f, 1.81743f, -1.28599f, -1.34431f, -0.182568f, 0.714006f, -1.34431f, -0.182568f, 0.714006f, 0.655694f, 1.81743f, 0.714007f, 0.655694f, 1.81743f, 0.714007f, -1.34431f, 1.81743f, 0.714005f, -1.34431f, 1.81743f, 0.714005f, -1.34431f, 1.81743f, -1.28599f, -1.34431f, 1.81743f, -1.28599f};
        Float[] morph1 = new Float[]{0.655695f, -0.182568f, -1.28599f, 0.655695f, -0.182568f, 0.714006f, -1.34431f, -0.182568f, 0.714006f, -1.3443f, -0.182568f, -1.28599f, 0.655695f, 1.81743f, -1.28599f, 0.655694f, 1.81743f, 0.714007f, -1.34431f, 1.81743f, 0.714005f, -1.34431f, 1.81743f, -1.28599f, 0.655695f, -0.182568f, -1.28599f, 0.655695f, -0.182568f, -1.28599f, 0.655695f, -0.182568f, 0.714006f, 0.655695f, -0.182568f, 0.714006f, -1.3443f, -0.182568f, -1.28599f, -1.3443f, -0.182568f, -1.28599f, 0.655695f, 1.81743f, -1.28599f, 0.655695f, 1.81743f, -1.28599f, -1.34431f, -0.182568f, 0.714006f, -1.34431f, -0.182568f, 0.714006f, 0.655694f, 1.81743f, 0.714007f, 0.655694f, 1.81743f, 0.714007f, -1.34431f, 1.81743f, 0.714005f, -1.34431f, 1.81743f, 0.714005f, -1.34431f, 1.81743f, -1.28599f, -1.34431f, 1.81743f, -1.28599f};
        Float[] morph2 = {0.655695f, -0.182568f, -1.28599f, 0.655695f, -0.182568f, 0.714006f, -1.34431f, -0.182568f, 0.714006f, -1.3443f, -0.182568f, -1.28599f, -0.15158f, 1.05227f, -0.639117f, 0.655694f, 1.81743f, 0.714007f, -1.34431f, 1.81743f, 0.714005f, -1.34431f, 1.81743f, -1.28599f, 0.655695f, -0.182568f, -1.28599f, 0.655695f, -0.182568f, -1.28599f, 0.655695f, -0.182568f, 0.714006f, 0.655695f, -0.182568f, 0.714006f, -1.3443f, -0.182568f, -1.28599f, -1.3443f, -0.182568f, -1.28599f, -0.15158f, 1.05227f, -0.639117f, -0.15158f, 1.05227f, -0.639117f, -1.34431f, -0.182568f, 0.714006f, -1.34431f, -0.182568f, 0.714006f, 0.655694f, 1.81743f, 0.714007f, 0.655694f, 1.81743f, 0.714007f, -1.34431f, 1.81743f, 0.714005f, -1.34431f, 1.81743f, 0.714005f, -1.34431f, 1.81743f, -1.28599f, -1.34431f, 1.81743f, -1.28599f};


        JSONModelFormat3 model = new JSONModelFormat3();

        for (int i = 0; i < vertices.length; i++) {
            model.addVertex(vertices[i]);
        }

        MorphTarget morphTarget1 = new MorphTarget();
        morphTarget1.vertices = Arrays.asList(morph1);
        morphTarget1.name = "morph01";

        MorphTarget morphTarget2 = new MorphTarget();
        morphTarget2.vertices = Arrays.asList(morph2);
        morphTarget2.name = "morph02";

        model.addMorphTarget(morphTarget1).addMorphTarget(morphTarget2);

        model.addFace4(new Face4(131, 8, 10, 16, 12, 0, 0, 0, 0, 0));
        model.addFace4(new Face4(131, 15, 23, 21, 19, 0, 0, 0, 0, 0));
        model.addFace4(new Face4(131, 9, 14, 18, 11, 0, 0, 0, 0, 0));
        model.addFace4(new Face4(131, 1, 5, 20, 17, 0, 0, 0, 0, 0));
        model.addFace4(new Face4( 131, 2, 6, 22, 13, 0, 0, 0, 0, 0));
        model.addFace4(new Face4(131, 4, 0, 3, 7, 0, 0, 0, 0, 0));

        model.addColor(0,255,0);

        Metadata meta = new Metadata();
        meta.type = "Geometry";
        meta.morphTargets = 2;
        meta.version = 3;
        meta.vertices= 24;
        meta.materials = 0;
        meta.colors = 1;
        meta.faces = 6;

        model.setMeatdata(meta);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("student.json"), model);
    }

    @Test
    public void plate() {
        File xyz = new File("C:\\projects\\angular\\three-partice2\\src\\assets\\model\\circuit-board\\电路板声模态1#1.xyz");
        File pcl = new File("C:\\projects\\angular\\three-partice2\\src\\assets\\model\\circuit-board\\电路板声模态1#.pcl");
    }

}