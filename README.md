# test4
# PreferenceFragment

# 首先打开主界面，包含多种功能的Preference。创建一个preference XML文件，然后创建一个PreferenceFragment类来加载XML文件，最后在Activity类中通过创建事务来加载pereference

## 第一个是Pereference的Checkbox控件。

![Alt Text](https://github.com/chenlong1232014/PreferenceFragment/raw/master/app/src/main/res/image/1.png?raw=true)

## 第二个是Pereferemce的EditText控件。通过点击可以响应EditText窗口
![Alt Text](https://github.com/chenlong1232014/PreferenceFragment/raw/master/app/src/main/res/image/2.png?raw=true)

## 第三个是ListPreferenc控件。通过绑定String Xml文件中的Array数据完成适配。
![Alt Text](https://github.com/chenlong1232014/PreferenceFragment/raw/master/app/src/main/res/image/3.png?raw=true)

## 第四个是通过intent跳转到新的Activity，在新的Activit加载新的PrefenceFragment。从而实现跳转另一个Preference。

![Alt Text](https://github.com/chenlong1232014/PreferenceFragment/raw/master/app/src/main/res/image/4.png?raw=true)

## 第五个intent通过设置action和Data属性实现在浏览器打开指定网页窗口。

![Alt Text](https://github.com/chenlong1232014/PreferenceFragment/raw/master/app/src/main/res/image/5.png?raw=true)

## 第六个Parent Checkbox设置disableDependentsState为false时，即check属性为true是才显示。Child Checkbox dependency属性为Parent的key值
![Alt Text](https://github.com/chenlong1232014/PreferenceFragment/raw/master/app/src/main/res/image/6.png?raw=true)



