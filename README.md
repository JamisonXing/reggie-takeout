# reggie-takeout
## 遇见的问题以及如何解决的：
1. js只能处理精确显示16位long类型，如果超过16位会出现精度丢失。

    - 解决方案：扩展mvc消息转换器，将java对象转换为json，long会变成string