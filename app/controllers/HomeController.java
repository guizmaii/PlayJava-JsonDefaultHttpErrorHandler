package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.*;

public class HomeController extends Controller {

    public Result index() {
        ObjectNode result = Json.newObject();
        result.put("answer", "Hello World !");
        return ok(result);
    }

    public Result exception() {
        throw new RuntimeException("This is an error message");
    }

}
