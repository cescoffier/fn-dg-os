package fn.dg.os.fnc;

import com.google.gson.JsonObject;

public class CalculateScoresAction {

   public static JsonObject main(JsonObject args) {
      System.out.printf("Received score: %s%n", args);

      JsonObject response = new JsonObject();
      response.add("score", args);
      return response;
   }

}
