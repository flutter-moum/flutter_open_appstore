package flutter.moum.open_appstore;

import android.content.Intent;
import android.net.Uri;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/** OpenAppstorePlugin */
public class OpenAppstorePlugin implements MethodCallHandler {
  /** Plugin registration. */
  private final Registrar mRegistrar;

  private OpenAppstorePlugin(Registrar registrar){
    this.mRegistrar = registrar;
  }

  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "open_appstore");
    channel.setMethodCallHandler(new OpenAppstorePlugin(registrar));
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    if (call.method.equals("getPlatformVersion")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);
    }
    else if (call.method.equals("openappstore")) {
      result.success("Android " + android.os.Build.VERSION.RELEASE);	      String android_id = call.argument("android_id");
      try {
        mRegistrar.activity().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + android_id)));
      } catch (android.content.ActivityNotFoundException e) {
        mRegistrar.activity().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + android_id)));
      }
      result.success(null);
    }
    else {
      result.notImplemented();
    }
  }
}
