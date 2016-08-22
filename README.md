MultiDex探究

## 方法数为：77365


```java
UNEXPECTED TOP-LEVEL EXCEPTION: java.lang.IllegalArgumentException: method ID not in [0, 0xffff]: 65536 
    at com.android.dx.merge.DexMerger$6.updateIndex(DexMerger.java:501) 
    at com.android.dx.merge.DexMerger$IdMerger.mergeSorted(DexMerger.java:276) 
    at com.android.dx.merge.DexMerger.mergeMethodIds(DexMerger.java:490) 
    at com.android.dx.merge.DexMerger.mergeDexes(DexMerger.java:167) 
    at com.android.dx.merge.DexMerger.merge(DexMerger.java:188) 
    at com.android.dx.command.dexer.Main.mergeLibraryDexBuffers(Main.java:439) 
    at com.android.dx.command.dexer.Main.runMonoDex(Main.java:287) 
    at com.android.dx.command.dexer.Main.run(Main.java:230) 
    at com.android.dx.command.dexer.Main.main(Main.java:199) 
    at com.android.dx.command.Main.main(Main.java:103):Derp:dexDerpDebug FAILED
```


## 后记

## 参考文献

- []()



