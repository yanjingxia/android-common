![Trinea](http://farm8.staticflickr.com/7426/9456847893_053161c7a4_o.png)android-common-lib
-------------
> 关于我，欢迎关注  
> 微博：<a title="Android 技术及移动互联网分享" href="http://weibo.com/trinea?s=6cm7D0" target="_blank">Trinea</a>&nbsp;&nbsp;&nbsp;&nbsp;主页：<a title="关注于 Android、Java、性能优化、开源项目" href="http://www.trinea.cn/" target="_blank">trinea.cn</a>&nbsp;&nbsp;&nbsp;&nbsp;邮箱：<a title="欢迎邮件与我交流" href="mailto:trinea.cn@gmail.com" target="_blank">trinea.cn#gmail.com</a>&nbsp;&nbsp;&nbsp;&nbsp;QQ：<a title="欢迎 Q 我" href="http://wpa.qq.com/msgrd?v=3&amp;uin=717763774&amp;site=qq&amp;menu=yes" target="_blank">717763774</a>  

**主要包括**：<strong>缓存</strong>(图片缓存、预取缓存、网络缓存)、<strong>公共View</strong>(下拉及底部加载更多ListView、底部加载更多ScrollView、滑动一页Gallery)及<strong>Android常用工具类</strong>(网络、下载、Android资源操作、shell、文件、Json、随机数、Collection等等)。    
示例源码：[TrineaAndroidDemo](https://github.com/Trinea/AndroidDemo)。  
使&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;用：拉取代码导入IDE，右击你的工程->properties->Android，在library中选择TrineaAndroidCommon。  
Api Guide：[TrineaAndroidCommon API Guide](http://trinea.github.io/doc/trinea_android_common/index.html)。  

####示例APK:  
<a href="https://play.google.com/store/apps/details?id=cn.trinea.android.demo" target="_blank" title="从Google Play下载"><img src="http://www.android.com/images/brand/get_it_on_play_logo_small.png" title="从Google Play下载"/></a>
    <a href="http://as.baidu.com/a/item?docid=5499464" target="_blank" title="从Baidu手机助手下载"><img src="http://farm3.staticflickr.com/2826/11928623406_b9e8d39bd7_o.png" title="从Baidu手机助手下载"/></a>
    <a href="http://zhushou.360.cn/detail/index/soft_id/994107" target="_blank" title="从360手机助手下载"><img src="http://farm4.staticflickr.com/3775/11983355756_f8548f4c17_o.png" title="从360手机助手下载"/></a>
    <a href="http://app.xiaomi.com/detail/54761" target="_blank" title="从小米应用商店下载"><img src="http://farm8.staticflickr.com/7380/11982503045_b0538df5f5_o.png" title="从小米应用商店下载"/></a>
    <a href="http://trinea.github.com/apk/trinea-android-demo.apk" target="_blank" title="二维码扫描下载"><img src="https://farm3.staticflickr.com/2930/14017948972_bafb6df1b5_o.png" title="二维码扫描下载"/></a>
    <a href="http://trinea.github.com/apk/trinea-android-demo.apk" target="_blank" title="点击下载到本地">本地下载</a>  
####一. 缓存类
主要特性：(1).使用简单 (2).轻松获取及预取取新图片 (3).包含二级缓存 (4).可选择多种缓存算法(FIFO、LIFO、LRU、MRU、LFU、MFU等13种)或自定义缓存算法 (5).可方便的保存及初始化恢复数据 (6).省流量性能佳(有且仅有一个线程获取图片) (7).支持http请求header设置及不同类型网络处理(8).可根据系统配置初始化缓存 (9).扩展性强 (10).支持等待队列 (11)包含map的大多数接口。
#####1. 图片缓存
使用见：[图片缓存的使用](http://www.trinea.cn/android/android-imagecache/)  
适用：获取图片较多且图片使用频繁的应用，包含二级缓存，如新浪微博、twitter、微信头像、美丽说、蘑菇街、花瓣、淘宝等等。效果图如下：  
![ImageCahe](http://farm4.staticflickr.com/3710/9312163125_81f1c1997b_o.jpg)
  

#####2. 图片SD卡缓存
使用见：[图片SD卡缓存的使用](http://www.trinea.cn/android/android-imagesdcardcache/)  
适用：应用中获取图片较多且图片较大的情况。需要二级缓存及ListView或GridView图片加载推荐使用上面的[ImageCache](http://www.trinea.cn/android/android-imagecache/)。效果图如下：  
![ImageSDCardCache](http://farm3.staticflickr.com/2834/9314949798_ea69bdb5e8_o.jpg)
  
  
#####3.  网络缓存  
使用见：[Android网络缓存](http://www.trinea.cn/android/android-http-cache)  
适用：网络获取内容不大的应用，尤其是api接口数据，如新浪微博、twitter的timeline、微信公众账号发送的内容等等。效果图如下：  
![HttpCache](http://farm3.staticflickr.com/2843/12566457534_2cfa4297a1_o.jpg)  


#####4. 预取数据缓存
使用见：[预取数据缓存](http://www.trinea.cn/android/preloaddatacache/)  
缓存类关系图如下：其中HttpCache为后续计划的http缓存 
![Image Cache](https://farm8.staticflickr.com/7336/13991252450_f1e154012d_o.png)  

####二. 公用的view
#####1. 下拉刷新及滚动到底部加载更多的Listview
使用: [下拉刷新及滚动到底部加载更多listview的使用](http://www.trinea.cn/android/dropdown-to-refresh-and-bottom-load-more-listview/)  
实现原理: [http://trinea.iteye.com/blog/1562281](http://trinea.iteye.com/blog/1562281)。效果图如下：  
![DropDownListView](http://farm8.staticflickr.com/7376/9312162951_74b597ebaa_o.jpg)
  

#####2. 滑动一页(一个Item)的Gallery
使用及实现原理：[滑动一页(一个Item)的Gallery的使用](http://www.trinea.cn/android/gallery-scroll-one-page/)。效果图如下：  
![ViewPager1](http://farm8.staticflickr.com/7330/9321381014_fb404e2430_o.jpg)
![ViewPager2](http://farm3.staticflickr.com/2827/9321380982_d8619d1601_o.jpg)
  

#####3. 滑动到底部或顶部响应的ScrollView
使用及实现原理: [滚动到底部或顶部响应的ScrollView使用](http://www.trinea.cn/android/on-bottom-load-more-scrollview/)。效果图如下：  
![ScrollView](http://farm4.staticflickr.com/3669/9459686814_1a523ceeb6_o.jpg)


####三. 工具类
具体介绍可见：[Android常用工具类](http://www.trinea.cn/android/android-common-utils/)  
目前包括HttpUtils、[DownloadManagerPro](http://www.trinea.cn/android/android-downloadmanager/)、[ShellUtils](http://www.trinea.cn/android/android-java-execute-shell-commands/)、[PackageUtils](http://www.trinea.cn/android/android-silent-install/)、PreferencesUtils、JSONUtils、FileUtils、ResourceUtils、StringUtils、ParcelUtils、RandomUtils、ArrayUtils、ImageUtils、ListUtils、MapUtils、ObjectUtils、SerializeUtils、SystemUtils、TimeUtils。  
<br/>
#####1. Android系统下载管理DownloadManager使用
使用示例：[Android系统下载管理DownloadManager功能介绍及使用示例](http://www.trinea.cn/android/android-downloadmanager/)  
功能扩展：[Android下载管理DownloadManager功能扩展和bug修改](http://www.trinea.cn/android/android-downloadmanager-pro/)
效果图如下：  
![downloadManagerDemo](http://www.trinea.cn/wp-content/uploads/2013/05/downloadDemo2.gif)  
  
#####2. Android APK root权限静默安装
使用示例：[Android APK root权限静默安装](http://www.trinea.cn/android/android-silent-install/)
  
#####3. Android root权限
直接调用[ShellUtils.execCommand](https://github.com/Trinea/AndroidCommon/blob/master/src/cn/trinea/android/common/util/ShellUtils.java#LC43)方法
  
#####4. 图片工具类
(1)Drawable、Bitmap、byte数组相互转换; (2)根据url获得InputStream、Drawable、Bitmap  
更多工具类介绍见[Android常用工具类](http://www.trinea.cn/android/android-common-utils/)

####5.新增加库部分
(1)cn.pedant.SweetAlert [Android版的SweetAlert，清新文艺，快意灵动的甜心弹框]    (https://github.com/pedant/sweet-alert-dialog/blob/master/README.zh.md)

(2)com.dd.circular-progress-button [Android上圆形的进度条按钮]
(https://github.com/dmytrodanylyk/circular-progress-button)

(3)com.jfeinstein.jazzyviewpager [支持各种切换动画的ViewPager]
(https://github.com/jfeinstein10/JazzyViewPager)

(4)com.liulishuo.share [支持第三方登录和分享]
(https://github.com/lingochamp/ShareLoginLib)

(5)com.nineoldandroids.animation [Android属性动画，支持到3.0以前的版本]
(https://github.com/JakeWharton/NineOldAndroids)

(6)com.pnikosis.materialishprogress [Material Design风格的进度条]
(https://github.com/pnikosis/materialish-progress)

(7)com.viewpagerindicator [ViewPage的各种指示器]
(https://github.com/JakeWharton/ViewPagerIndicator)

(8)me.drakeet.library [仿IOS风格支持按下效果和背景定制的Button、ImageView]
(https://github.com/drakeet/AndroidUIView)

(9)se.emilsjolander.stickylistheaders [固定头部的listview]
(https://github.com/emilsjolander/StickyListHeaders)

(10)uk.co.senab.photoview [支持缩放的ImageView]
(https://github.com/chrisbanes/PhotoView)

####6 新增加自定义view
(1)BorderScrollView [支持滚动到顶部和底部回调的scrollview]
(2)ChangeColorIconWithText [仿微信底部导航栏支持颜色渐变的view]  
(3)CustomButton [自定义普通按钮，支持正常和按下背景颜色的定制]
(4)CustomEditText [自定义文本输入框，增加清空按钮]
(5)CustomImageButton [自定义图片按钮，支持正常和按下背景图片的定制]
(6)CustomRippleButton [自定义Ripple按钮]
(7)DropDownListView [支持下来刷新和底部加载更多的listview]
(8)FlowLayout [浮动布局，例如各种热门标签的排列]
(9)HackyViewPager[修复触摸bug导致崩溃的viewpager]
(10)HorizontalListView [水平滚动的listview]
(11)RoundedImageView [支持圆角或圆形边框的ImageView]
(12)SideBar [仿通讯录右边的字母导航栏]
(13)SlideOnePageGallery [支持滑动页的Gallery，已废弃] 
   
### Proguard
``` xml
-keep class cn.trinea.android.** { *; }
-keepclassmembers class cn.trinea.android.** { *; }
-dontwarn cn.trinea.android.**
```

### Download
Maven:
``` xml
<dependency>
    <groupId>cn.trinea.android.common</groupId>
    <artifactId>trinea-android-common</artifactId>
    <version>4.2.15</version>
</dependency>
```

## License

    Copyright 2013 trinea.cn

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

