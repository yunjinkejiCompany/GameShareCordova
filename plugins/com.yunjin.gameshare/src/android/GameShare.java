package com.yunjin.gameshare;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class GameShare extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
         if (action.equals("getUserInfo")) {
            String message = args.getString(0);
//            String message = "getUserInfo";
            this.aaa(message, callbackContext);
            return true;
        }else if (action.equals("shareGame")) {
            // String message = args.getString(0);
            String message = args.getString(0);
            this.aaa(message, callbackContext);
            return true;
        }
        return false;
    }

    private void aaa(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
