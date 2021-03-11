import 'dart:async';

import 'package:flutter/services.dart';

class OpenAppstore {
  static const MethodChannel _channel =
      const MethodChannel('flutter.moum.open_appstore');

  static Future<String?> get platformVersion async {
    final String? version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }

  static void launch({String? androidAppId, String? iOSAppId}) async {
    await _channel.invokeMethod(
        'openappstore', {'android_id': androidAppId, 'ios_id':iOSAppId});
  }
}
