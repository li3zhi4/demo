# java.time
jdk1.8 增加了 java.time 包
## LocalData
## LocalTime
## LocalDataTime
    
## DateTimeFormatter
``` java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
LocalDateTime time = LocalDateTime.from(formatter.parse("202010102020"));
LocalDateTime time = LocalDateTime.parse("202010102020",formatter);
String str = time.format(formatter)
```
