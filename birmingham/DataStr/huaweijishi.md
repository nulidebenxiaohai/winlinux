

# Java 集合框架

## Java ArrayList

ArrayList类是一个可以动态修改的数组，与普通数组的区别就是它没有固定大小的限制，我们可以添加或者删除元素。

ArrayList继承了AbstractList，并实现列List接口。

ArrayList是一个数组队列，提供了相关的添加，删除，修改，遍历等功能。

### 添加元素

ArrayList类提供了很多有用的方法，添加元素到ArrayList可以使用add()方法：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
    }
}
```

以上的实例，执行输出结果为：

> ```java
> [Google, Runoob, Taobao, Weibo]
> ```

### 访问元素

访问ArrayList中的元素可以使用get()方法：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.get(1));  // 访问第二个元素
    }
}
```

**注意：**数组的索引值从0开始。

以上实例，执行输出结果为：

> ```java
> Runoob
> ```

### 修改元素

如果要修改ArrayList中的元素可以使用set()方法：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(2, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        System.out.println(sites);
    }
}
```

以上实例，输出结果为：

> ```java
> [Google, Runoob, Wiki, Weibo]
> ```

### 删除元素

如果要删除ArrayList中的元素可以使用remove()方法：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.remove(3); // 删除第四个元素
        System.out.println(sites);
    }
}
```

以上实例，输出结果为：

> ```java
> [Google, Runoob, Taobao]
> ```

### 计算大小

如果要计算ArrayList中的元素数量可以使用size()方法：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.size());
    }
}
```

以上实例，输出结果为：

> 4

### 迭代数组列表

我们可以使用for来迭代数组列表中的元素：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }
    }
}
```

以上实例，输出结果为：

> ```java
> Google
> Runoob
> Taobao
> Weibo
> ```

我们也可以使用for-each来迭代元素：

```java
import java.util.ArrayList;

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
```

输出结果为：

```
Google
Runoob
Taobao
Weibo
```

### ArrayList排序

Collections类是一个非常有用的类，位于java.util包中，提供的sort()方法可以对字符或者数组列表进行排序。

```java
import java.util.ArrayList;
import java.util.Collections;  // 引入 Collections 类

public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Taobao");
        sites.add("Wiki");
        sites.add("Runoob");
        sites.add("Weibo");
        sites.add("Google");
        Collections.sort(sites);  // 字母排序
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
```

输出结果为：

> ```java
> Google
> Runoob
> Taobao
> Weibo
> Wiki
> ```

### ArrayList方法常用列表

![image-20220204000625690](huaweijishi.assets/image-20220204000625690.png)

![image-20220204000703454](huaweijishi.assets/image-20220204000703454.png)

## Java LinkedList

链表（Linked List）是一种常见的基础数据结构，是一种线性表，但是并不会按照线性的顺序存储结构，而是再每一个节点里存到下一个节点的地址。

链表可分为单项链表和双向链表。

![image-20220204001006960](huaweijishi.assets/image-20220204001006960.png)

与ArrayList相比，LinkedList的增加和删除的操作效率更高，而查找和修改的操作效率较低。

**以下情况使用ArrayList：**

- 频繁访问列表中的某一个元素
- 只需要在列表末尾进行添加和删除元素操作

**以下情况使用LinkedList：**

- 你需要通过循环迭代来访问列表中的某些元素
- 需要频繁的在列表开头，中间，末尾等位置进行添加和删除元素操作

LinkedList 继承了 AbstractSequentialList 类。

LinkedList 实现了 Queue 接口，可作为队列使用。

LinkedList 实现了 List 接口，可进行列表的相关操作。

LinkedList 实现了 Deque 接口，可作为队列使用。

LinkedList 实现了 Cloneable 接口，可实现克隆。

LinkedList 实现了 java.io.Serializable 接口，即可支持序列化，能通过序列化去传输。

### 增删改

| add()         | 添加于是怒     |
| ------------- | -------------- |
| addFirst()    | 在头部添加元素 |
| addLast()     | 在尾部添加元素 |
| removeFirst() | 移除头部元素   |
| removeLast()  | 移除尾部元素   |
| getFirst()    | 获取头部元素   |
| getLast()     | 获取尾部元素   |

### 迭代元素

我们可以使用for配合size()方法来迭代列表中的元素：

```java
// 引入 LinkedList 类
import java.util.LinkedList;

public class RunoobTest {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (int size = sites.size(), i = 0; i < size; i++) {
            System.out.println(sites.get(i));
        }
    }
}
```

size()方法用于计算链表的大小

输出结果为：

> ```java
> Google
> Runoob
> Taobao
> Weibo
> ```

也可以使用for-each来迭代元素

```java
// 引入 LinkedList 类
import java.util.LinkedList;

public class RunoobTest {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
```

### LinkedList方法常用列表

![image-20220204002414004](huaweijishi.assets/image-20220204002414004.png)

![image-20220204002436958](huaweijishi.assets/image-20220204002436958.png)

![image-20220204002506395](huaweijishi.assets/image-20220204002506395.png)

## Java HashSet

HashSet基于HashMap来实现的，是一个不允许有重复元素的集合。

HashSet允许有null值。

HashSet是无序的，即不会记录插入的顺序

HashSet不是线程安全的，如果多个线程尝试同时修改HashSet，则最终结果是不确定的。您必须在多线程访问时显式同步对HashSet的并发访问。

HashSet实现列Set接口。

### 添加元素

HashSet类提供类很多有用的方法，添加元素可以使用add()方法：

```java
// 引入 HashSet 类      
import java.util.HashSet;

public class RunoobTest {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);
    }
}
```

以上代码输出结果为：

> ```java
> [Google, Runoob, Zhihu, Taobao]
> ```

上面的实例中，Runoob被添加了两次，它在集合中也只会出现一次，因为集合中的每个元素都必须是唯一的。

### 判断元素是否存在

我们可以使用contains()方法来判断元素是否存在于集合当中：

```java
// 引入 HashSet 类      
import java.util.HashSet;

public class RunoobTest {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites.contains("Taobao"));
    }
}
```

输出结果为：

> true

### 删除元素

我们可以使用remove()方法来删除集合中的元素

```java
// 引入 HashSet 类      
import java.util.HashSet;

public class RunoobTest {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        sites.remove("Taobao");  // 删除元素，删除成功返回 true，否则为 false
        System.out.println(sites);
    }
}
```

输出结果为：

> ```java
> [Google, Runoob, Zhihu]
> ```

删除集合中所有元素可以使用clear方法：

```java
// 引入 HashSet 类      
import java.util.HashSet;

public class RunoobTest {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        sites.clear();  
        System.out.println(sites);
    }
}
```

输出结果为：

> []

### 计算大小

如果要计算HashSet的元素数量可以使用size()方法

```java
// 引入 HashSet 类      
import java.util.HashSet;

public class RunoobTest {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        System.out.println(sites.size());  
    }
}
```

输出结果为：

> 4

### 迭代HashSet

可以使用for-each来迭代HashSet中的元素

```java
// 引入 HashSet 类      
import java.util.HashSet;

public class RunoobTest {
    public static void main(String[] args) {
    HashSet<String> sites = new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");     // 重复的元素不会被添加
        for (String i : sites) {
            System.out.println(i);
        }
    }
}
```

输出结果为：

> ```java
> Google
> Runoob
> Zhihu
> Taobao
> ```

## Java HashMap

HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。

HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。

HashMap 是无序的，即不会记录插入的顺序。

HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。

### 添加元素

HashMap类提供了很多有用的方法，添加键值对(key - value)可以使用put()方法：

```java
// 引入 HashMap 类      
import java.util.HashMap;

public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
    }
}
```

以上输出结果为：

> ```java
> {1=Google, 2=Runoob, 3=Taobao, 4=Zhihu}
> ```

### 访问元素

我们可以使用get(key)方法来获得key对应的value：

```java
// 引入 HashMap 类      
import java.util.HashMap;

public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites.get(3));
    }
}
```

输出结果为：

> Taobao

### 删除元素

我们可以使用remove(key)方法来删除key对应的键值对(key - value):

```java
// 引入 HashMap 类      
import java.util.HashMap;

public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        Sites.remove(4);
        System.out.println(Sites);
    }
}
```

以上输出结果为：

> ```java
> {1=Google, 2=Runoob, 3=Taobao}
> ```

删除所有键值对(key-value)可以使用clear方法：

```java
// 引入 HashMap 类      
import java.util.HashMap;

public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        Sites.clear();
        System.out.println(Sites);
    }
}
```

输出结果为：

> ```java
> {}
> ```

### 计算大小

使用size()方法

### 迭代HashMap

可以使用for-each来迭代HashMap中的元素

如果只想获取key，可以使用keySet()方法，然后通过get(key)获取对应的value，如果你只想获取value，可以使用value()方法。

```java
// 引入 HashMap 类      
import java.util.HashMap;

public class RunoobTest {
    public static void main(String[] args) {
        // 创建 HashMap 对象 Sites
        HashMap<Integer, String> Sites = new HashMap<Integer, String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for(String value: Sites.values()) {
          // 输出每一个value
          System.out.print(value + ", ");
        }
    }
}
```

输出结果为：

> ```
> key: 1 value: Google
> key: 2 value: Runoob
> key: 3 value: Taobao
> key: 4 value: Zhihu
> Google, Runoob, Taobao, Zhihu,
> ```

### HashMap方法

![image-20220204133324868](huaweijishi.assets/image-20220204133324868.png)

![image-20220204133353174](huaweijishi.assets/image-20220204133353174.png)



# Java String 类











