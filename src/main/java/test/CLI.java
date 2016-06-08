package test;

import com.beust.jcommander.Parameter;
import java.util.ArrayList;
import java.util.List;

public class CLI {
    @Parameter
    List<String> parameters = new ArrayList<>();

    @Parameter(names = "--name", description = "Yoour name")
    String name = "World";


    @Parameter(names = "--debug", description = "Debug mode")
    boolean debug = false;
}
