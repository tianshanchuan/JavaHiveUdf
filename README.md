# JavaHiveUdf

作用: 过滤数组内容

使用方法： 1、使用maven clean package 打包udf项目jar包，然后把jar包上传到odps资源，资源命名为ArrayFilter.jar

2、注册udf函数，函数名为filter_array,使用ArrayFilter类

CREATE FUNCTION filter_array as 'com.company.hive.udf.ArrayFilter' USING 'ArrayFilter.jar';

3、SELECT filter_array(ARRAY(1,2,3, '', 4), '');
