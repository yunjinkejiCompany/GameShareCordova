cordova.define('cordova/plugin_list', function(require, exports, module) {
  module.exports = [
    {
      "id": "com.yunjin.gameshare.GameShare",
      "file": "plugins/com.yunjin.gameshare/www/GameShare.js",
      "pluginId": "com.yunjin.gameshare",
      "clobbers": [
        "JSBridge"
      ]
    }
  ];
  module.exports.metadata = {
    "cordova-plugin-whitelist": "1.3.4",
    "com.yunjin.gameshare": "1.0.0"
  };
});