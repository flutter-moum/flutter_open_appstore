import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:open_appstore/open_appstore.dart';

void main() {
  const MethodChannel channel = MethodChannel('open_appstore');

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await OpenAppstore.platformVersion, '42');
  });
}
