## Initialization

`init` method initializes the UserIQSDK

> public static void init(Activity activity, String apiKey)

#### Parameters
* `this` - Instance of Context (usually the current activity)
* `apiKey` - API key of the app, can be found in setting section of the UserIQ dashboard. 

#### Example
```java
UserIQSDK.init(this, "bdhaioht5834658658648jfshusp");
```

## Setting User

Until user is set, SDK will work in passive mode and does not send any data. UserIQSDK analytics only works when the `user` is set to the SDK.

If `setUser` is called multiple times, then the current user will be updated by the new user. 

If the SDK is initialized with `init` method and no user is set, then the analytics data won't reflect in the dashbaord. 
Add any custom attributes about the user in the addParams(String key, String value)

#### Parameters
 * `this` - Instance of Context (usually the current activity where `init` is called)
 * `user` - created using the `UserIQSDK.UserBuilder`

    - `userId` - userid of the user
    - `name` - name of the user
    - `email` - email of the user
    - `accId` - account of the user
    - `accName` - account name of the user
    - `signupDate` - signup date of the user
    - `parameters` - additional parameters as key-value pairs relevant to user
     
```java
UserIQSDK.User user = new UserIQSDK.UserBuilder()
                .setId("1")
                .setAccountId("Acc1")
                .setAccountName("Employees")
                .setName("Jon wick")
                .setEmail("jonw@gmail.com")
                .addParams("location", "Atlanta")
                .build();
UserIQSDK.setUser(this, user);
```

##### Note
> Resetting/Changing user details - To change the existing user info, this API can be called again with the new user info.

## Showing Contexual Help

Contextual help can be shown by calling `UserIQSDK.showCtxHelp(this)`. Contextual help will only be shown when the current screen is tagged. If the current screen is not tagged then the above API will return false

#### Parameters
 * `this` - Instance of Context (usually the current activity)

```java
boolean isCtxHelpShown = UserIQSDK.showCtxHelp(this);
```

## Showing Helpcenter

Helpcenter can be programatically invoked by calling `UserIQSDK.showHelpCenter(this)`. When Modal window or popup is active, helpcenter can't be shown. In those cases, above API will return false

#### Parameters
 * `this` - Instance of Context (usually the current activity)

```java
boolean isHelpCenterShown = UserIQSDK.showHelpCenter(this);
```

## Disable Fab

Floating Action Button (FAB) can be permanently disabled by calling the disableFAB() from the sdk. This can be called anytime before or after initializing the SDK. Once invoked, it will hide the FAB & also overrides the enableFAB sent from the dashboard. (ie) if this method is called on the SDK, this will take precendence over configuration from dashboard!

```java
UserIQSDK.disableFAB();
```

