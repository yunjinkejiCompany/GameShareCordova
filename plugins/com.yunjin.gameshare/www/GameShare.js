var exec = require('cordova/exec');

exports.getUserInfo = function (content,arg,successCallback, errorCallback) {
    exec(successCallback, errorCallback, 'GameShare', 'getUserInfo', [content,arg]);
};
exports.shareGame = function (content,successCallback, errorCallback) {
    exec(successCallback, errorCallback, 'GameShare', 'shareGame', [content]);
};
