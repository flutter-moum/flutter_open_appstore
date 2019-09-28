#import "OpenAppstorePlugin.h"
#import <open_appstore/open_appstore-Swift.h>

@implementation OpenAppstorePlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftOpenAppstorePlugin registerWithRegistrar:registrar];
}
@end
