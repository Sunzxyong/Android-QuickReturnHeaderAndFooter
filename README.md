# Android-QuickReturnHeaderAndFooter
The effect of a quick return, use a custom CoordinatorLayout.Behavior

---
##Effect
![](http://img.my.csdn.net/uploads/201508/23/1440303929_8040.gif)

##Usage
Using `CoordinatorLayout` as the root layout, and use custom behaviour in footer
```xml
<android.support.design.widget.CoordinatorLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <!- child view->
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@color/pink"
        android:layout_gravity="bottom"
        android:padding="15dp"
        app:layout_behavior="com.sunzxyong.android_quickreturnheaderandfooter.QuickReturnFooterBehavior">
      <!- child view->
    </RelativeLayout>
</android.support.design.widget.CoordinatorLayout>
```
