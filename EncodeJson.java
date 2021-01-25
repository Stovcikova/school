package sk.kosickaakademia.regex.json;

import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class EncodeJson {
    public static void main(String[] args) {
        JSONObject obj=new JSONObject();
        JSONArray jsonArray = new JSONArray();
        obj.put("age",32);
        obj.put("name","Milan");
        obj.put("sport","hockey");
        obj.put("active",true);

        System.out.println(obj);
    }
}
