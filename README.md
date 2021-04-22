# AspectRatioLayout

Library for Android, which allows you to create containers for views with the necessary aspect ratio

Setup
===========
*Work in progress*


Usage
===========
``` 
<kz.flyingv.aspectratiolayout.AspectRatioLayout  
  android:layout_width="match_parent"  
  android:layout_height="wrap_content"  
  android:padding="4dp"  
  app:direction="horizontal"  
  app:ratio="3:1" />
```

 - app:direction="horizontal | vertical"
	Sets the base direction from which the aspect ratio is calculated
	
 - app:ratio="1:1"
	Aspect ratio value, in "width: height" format
