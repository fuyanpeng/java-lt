package designpattern.singleinstance;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/*
1、饿汉式、不支持延迟加载
 */

//public class IDGenerator {
//    private AtomicLong id = new AtomicLong(0);
//    public static final IDGenerator instance = new IDGenerator();
//
//    private IDGenerator(){}
//    public static IDGenerator getInstance(){
//        return instance;
//    }
//    public Long getId(){
//        return id.incrementAndGet();
//    }
//}
//long id = IDGenerator.getInstance().getId();


/*
2、懒汉式，支持延迟加载， 加锁产生性能问题；
 */

//public class IDGenerator {
//    private AtomicLong id = new AtomicLong(0);
//    private static IDGenerator instance;
//    private IDGenerator(){}
//    public static synchronized IDGenerator getInstance() {
//        if (instance == null){
//            instance = new IDGenerator();
//        }
//        return instance;
//    }
//
//    public Long getId(){
//        return id.incrementAndGet();
//    }
//
//}

/*
3、双重校验、类级别加锁， 进实例化时候锁一次；
 */
//public class IDGenerator {
//    private AtomicLong id = new AtomicLong(0);
//    private static IDGenerator instance;
//    private IDGenerator() {};
//    public static IDGenerator getInstance(){
//        if (instance == null){
//            synchronized (IDGenerator.class){
//                if(instance == null){
//                    instance = new IDGenerator();
//                }
//            }
//        }
//        return instance;
//    }
//    public Long getId(){
//        return id.incrementAndGet();
//    }
//}

/*
4、静态内部类， 类似饿汉式，可实现延迟加载；
 */

//public class IDGenerator {
//    private AtomicLong id = new AtomicLong(0);
//    private static IDGenerator instance;
//
//    private static class SingletonHolder {
//        private static final IDGenerator instance = new IDGenerator();
//    }
//
//    private static IDGenerator getInstance(){
//        return SingletonHolder.instance;
//    }
//
//    public Long getId(){
//        return id.incrementAndGet();
//
//    }
//
//}

/*
 5、最简单的方式， 通过枚举类实现
 */
//public enum IDGenerator {
//    INSTANCE;
//    private AtomicLong id = new AtomicLong(0);
//
//    public Long getId(){
//        return id.incrementAndGet();
//    }
//}


/*
    单例模式一般讲的是进程间的单例， 如何实现线程间的单例模式呢？ 可以引入一个map
 */

public class IDGenerator{
    private AtomicLong id = new AtomicLong(0);

    private static final ConcurrentHashMap<Long, IDGenerator> instances = new ConcurrentHashMap<>();

    private IDGenerator(){}

    private static IDGenerator getInstance() {
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IDGenerator());
        return instances.get(currentThreadId);
    }

    public Long getId(){
        return id.incrementAndGet();
    }

}
