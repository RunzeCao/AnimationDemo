# AnimationDemo
[VIEW动画](http://blog.csdn.net/yanbober/article/details/46481171)  
[Android属性动画完全解析(上)，初识属性动画的基本用法](http://blog.csdn.net/sinyu890807/article/details/43536355)  
[Android属性动画完全解析(中)，ValueAnimator和ObjectAnimator的高级用法](http://blog.csdn.net/guolin_blog/article/details/43816093)  
[Android属性动画完全解析(下)，Interpolator和ViewPropertyAnimator的用法](http://blog.csdn.net/guolin_blog/article/details/44171115)  


视图动画只能作用于View，而且视图动画改变的只是View的绘制效果，View真正的属性并没有改变。比如，一个按钮做平移的动画，
虽然按钮的确做了平移，但按钮可点击的区域并没随着平移而改变，还是在原来的位置。而属性动画则可以改变真正的属性，
从而实现按钮平移时点击区域也跟着平移。通俗点说，属性动画其实就是在一定时间内，按照一定规律来改变对象的属性，从而使对象展现出动画效果。