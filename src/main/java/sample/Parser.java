package sample;

import java.io.File;
import java.nio.file.Paths;

/**
 * Created by lv-wei on 2018-03-19.
 */
public class Parser {
    private String path = "C:\\lvwei\\coinv\\软件研发\\项目\\CTS\\开发资料\\模态例子";
    private String modelName = "电路板声模态1";

    private File xyzFile;
    private File pclFile;



    public void init() {
        xyzFile = new File(Paths.get(path, modelName).toString() + "#.xyz");
        pclFile = new File(Paths.get(path, modelName).toString() + "#.pcl");
    }

    public void createGeneral() {

    }

}
