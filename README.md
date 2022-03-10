[![](https://jitpack.io/v/flyingV805/AspectRatioLayout.svg)](https://jitpack.io/#flyingV805/AspectRatioLayout)

# AspectRatioLayout
FrameLayout with aspect ratio parameter


## Install

### Jitpack

Add Jitpack to your build file's list of repositories.

```groovy
repositories {
   maven { url 'https://jitpack.io' }
}
```

to use the Jitpack.IO Repository

```groovy
dependencies {
    ...
    implementation 'com.github.flyingV805:ExpandableLinearLayout:${version}'
    ...
}
```
replacing ${version} with the version you wish to use

## Usage

Add AspectRatioLayout to your xml view

    <kz.flyingv.aspectratiolayout.AspectRatioLayout
        android:layout_width="wrap_content"
        android:layout_height="200dp"
        android:background="#FF00EE"
        android:padding="4dp"
        app:direction="vertical"
        app:ratio="1:1">
        
        <!--child views-->
        
    </kz.flyingv.aspectratiolayout.AspectRatioLayout>
    
Then just specify the desired aspect ratio using `app:ratio="1:1"` and set the leading for calculation `app:direction="vertical"` or `app:direction="horizontal"`    
